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
import org.openapitools.client.model.BaseComment;
import org.openapitools.client.model.CommentAddObjectAllOf;

/**
 * CommentAddObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-25T23:38:52.614487+05:00[Asia/Tashkent]")
public class CommentAddObject {
  public static final String SERIALIZED_NAME_COMPOSITION_ID = "composition-id";
  @SerializedName(SERIALIZED_NAME_COMPOSITION_ID)
  private String compositionId;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private BaseComment comment;

  public static final String SERIALIZED_NAME_LOCK = "lock";
  @SerializedName(SERIALIZED_NAME_LOCK)
  private String lock;


  public CommentAddObject compositionId(String compositionId) {
    
    this.compositionId = compositionId;
    return this;
  }

   /**
   * Music composition id
   * @return compositionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Music composition id")

  public String getCompositionId() {
    return compositionId;
  }


  public void setCompositionId(String compositionId) {
    this.compositionId = compositionId;
  }


  public CommentAddObject comment(BaseComment comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BaseComment getComment() {
    return comment;
  }


  public void setComment(BaseComment comment) {
    this.comment = comment;
  }


  public CommentAddObject lock(String lock) {
    
    this.lock = lock;
    return this;
  }

   /**
   * Version of optimistic lock
   * @return lock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of optimistic lock")

  public String getLock() {
    return lock;
  }


  public void setLock(String lock) {
    this.lock = lock;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentAddObject commentAddObject = (CommentAddObject) o;
    return Objects.equals(this.compositionId, commentAddObject.compositionId) &&
        Objects.equals(this.comment, commentAddObject.comment) &&
        Objects.equals(this.lock, commentAddObject.lock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositionId, comment, lock);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentAddObject {\n");
    sb.append("    compositionId: ").append(toIndentedString(compositionId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    lock: ").append(toIndentedString(lock)).append("\n");
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
