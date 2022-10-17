package ru.otus.music.search.processor

import com.fasterxml.jackson.databind.ObjectMapper
import com.rabbitmq.client.CancelCallback
import com.rabbitmq.client.Channel
import com.rabbitmq.client.ConnectionFactory
import com.rabbitmq.client.DeliverCallback
import com.rabbitmq.client.Delivery
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import ru.otus.music.search.config.RabbitConfig
import ru.otus.music.search.config.RabbitExchangeConfiguration
import kotlin.coroutines.CoroutineContext

/**
 * bstract class for consumers processors RabbitMQ
 * @property config - connection configuration
 * @property processorConfig - exchange configuration
 */
abstract class RabbitProcessorBase(
    private val config: RabbitConfig,
    val processorConfig: RabbitExchangeConfiguration
) {
    val jacksonMapper = ObjectMapper()

    suspend fun process(dispatcher: CoroutineContext = Dispatchers.IO) {
        withContext(dispatcher) {
            ConnectionFactory().apply {
                host = config.host
                port = config.port
                username = config.user
                password = config.password
            }.newConnection().use { connection ->
                connection.createChannel().use { channel ->
                    val deliveryCallback = channel.getDeliveryCallback()
                    val cancelCallback = getCancelCallback()
                    runBlocking {
                        channel.describeAndListen(deliveryCallback, cancelCallback)
                    }
                }
            }
        }
    }

    /**
     * Callback used in delivering message to consumer
     */
    private fun Channel.getDeliveryCallback(): DeliverCallback = DeliverCallback { _, message ->
        runBlocking {
            kotlin.runCatching {
                processMessage(message)
            }.onFailure {
                onError(it)
            }
        }
    }

    /**
     * Processing message received in deliverCallback
     */
    protected abstract suspend fun Channel.processMessage(message: Delivery)

    /**
     * Error handling
     */
    protected abstract fun Channel.onError(e: Throwable)

    /**
     * Consumer cancelling callback
     */
    private fun getCancelCallback() = CancelCallback {
        println("[$it] was cancelled")
    }

    private suspend fun Channel.describeAndListen(
        deliverCallback: DeliverCallback,
        cancelCallback: CancelCallback
    ) {
        exchangeDeclare(processorConfig.exchange, processorConfig.exchangeType)
        // Объявляем очередь (не сохраняется при перезагрузке сервера; неэксклюзивна - доступна другим соединениям;
        // не удаляется, если не используется)
        queueDeclare(processorConfig.queue, false, false, false, null)
        // связываем обменник с очередью по ключу (сообщения будут поступать в данную очередь с данного обменника при совпадении ключа)
        queueBind(processorConfig.queue, processorConfig.exchange, processorConfig.keyIn)
        // запуск консьюмера с автоотправкой подтверждение при получении сообщения
        basicConsume(processorConfig.queue, true, processorConfig.consumerTag, deliverCallback, cancelCallback)
        while (isOpen) {
            kotlin.runCatching {
                delay(100)
            }.onFailure { e ->
                e.printStackTrace()
            }
        }
        println("Channel for [${processorConfig.consumerTag}] was closed.")
    }
}