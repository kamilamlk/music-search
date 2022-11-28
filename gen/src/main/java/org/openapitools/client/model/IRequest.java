/*
 * Music search
 * This service helps in finding music
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.CommentAcceptRequest;
import org.openapitools.client.model.CommentAddRequest;
import org.openapitools.client.model.CommentDeclineRequest;
import org.openapitools.client.model.CompositionCreateRequest;
import org.openapitools.client.model.CompositionReadRequest;
import org.openapitools.client.model.CompositionSearchRequest;

/**
 * Базовый интерфейс для всех запросов
 */
@ApiModel(description = "Базовый интерфейс для всех запросов")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-25T23:38:52.614487+05:00[Asia/Tashkent]")
public class IRequest {
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  protected String requestType;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public IRequest() {
    this.requestType = this.getClass().getSimpleName();
  }

  public IRequest requestType(String requestType) {
    
    this.requestType = requestType;
    return this;
  }

   /**
   * Поле-дескриминатор для вычисления типа запроса
   * @return requestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "create", value = "Поле-дескриминатор для вычисления типа запроса")

  public String getRequestType() {
    return requestType;
  }


  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  public IRequest requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Идентификатор запроса для отладки
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Идентификатор запроса для отладки")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IRequest irequest = (IRequest) o;
    return Objects.equals(this.requestType, irequest.requestType) &&
        Objects.equals(this.requestId, irequest.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType, requestId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IRequest {\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

