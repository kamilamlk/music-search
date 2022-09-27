package ru.otus.music.search.biz.workers

import ru.otus.music.search.common.MsContext
import ru.otus.music.search.common.helpers.fail
import ru.otus.music.search.common.models.MsError
import ru.otus.music.search.common.models.MsState
import ru.otus.music.search.common.stubs.MsStub
import ru.otus.music.search.cor.ICorChainDsl
import ru.otus.music.search.cor.worker

fun ICorChainDsl<MsContext>.stubValidationBadText(title: String) =
    worker {
        this.title = title
        on { stubCase == MsStub.BAD_TEXT && state == MsState.RUNNING }
        handle {
            fail(
                MsError(
                    group = "validation",
                    code = "validation-text",
                    field = "text",
                    message = "Wrong text field"
                )
            )
        }
}
