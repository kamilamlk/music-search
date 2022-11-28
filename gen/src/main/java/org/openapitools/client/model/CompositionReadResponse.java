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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CommentAcceptResponse;
import org.openapitools.client.model.CommentAddResponse;
import org.openapitools.client.model.CommentDeclineResponse;
import org.openapitools.client.model.CommentInfo;
import org.openapitools.client.model.CommentResponseMulti;
import org.openapitools.client.model.CompositionCreateResponse;
import org.openapitools.client.model.CompositionInfo;
import org.openapitools.client.model.CompositionInfoResponseSingle;
import org.openapitools.client.model.CompositionReadResponse;
import org.openapitools.client.model.CompositionSearchResponse;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.IResponse;
import org.openapitools.client.model.ResponseResult;

/**
 * CompositionReadResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-25T23:38:52.614487+05:00[Asia/Tashkent]")
public class CompositionReadResponse extends IResponse {
  public static final String SERIALIZED_NAME_COMPOSITION_INFO = "composition-info";
  @SerializedName(SERIALIZED_NAME_COMPOSITION_INFO)
  private CompositionInfo compositionInfo;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private List<CommentInfo> comments = null;

  public CompositionReadResponse() {
    this.responseType = this.getClass().getSimpleName();
  }

  public CompositionReadResponse compositionInfo(CompositionInfo compositionInfo) {
    
    this.compositionInfo = compositionInfo;
    return this;
  }

   /**
   * Get compositionInfo
   * @return compositionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CompositionInfo getCompositionInfo() {
    return compositionInfo;
  }


  public void setCompositionInfo(CompositionInfo compositionInfo) {
    this.compositionInfo = compositionInfo;
  }


  public CompositionReadResponse comments(List<CommentInfo> comments) {
    
    this.comments = comments;
    return this;
  }

  public CompositionReadResponse addCommentsItem(CommentInfo commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<CommentInfo>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CommentInfo> getComments() {
    return comments;
  }


  public void setComments(List<CommentInfo> comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositionReadResponse compositionReadResponse = (CompositionReadResponse) o;
    return Objects.equals(this.compositionInfo, compositionReadResponse.compositionInfo) &&
        Objects.equals(this.comments, compositionReadResponse.comments) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositionInfo, comments, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositionReadResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    compositionInfo: ").append(toIndentedString(compositionInfo)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

