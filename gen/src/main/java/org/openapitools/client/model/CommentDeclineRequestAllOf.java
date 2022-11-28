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
import org.openapitools.client.model.CommentDeclineObject;

/**
 * CommentDeclineRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-25T23:38:52.614487+05:00[Asia/Tashkent]")
public class CommentDeclineRequestAllOf {
  public static final String SERIALIZED_NAME_COMPOSITION = "composition";
  @SerializedName(SERIALIZED_NAME_COMPOSITION)
  private CommentDeclineObject composition = null;


  public CommentDeclineRequestAllOf composition(CommentDeclineObject composition) {
    
    this.composition = composition;
    return this;
  }

   /**
   * Get composition
   * @return composition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommentDeclineObject getComposition() {
    return composition;
  }


  public void setComposition(CommentDeclineObject composition) {
    this.composition = composition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentDeclineRequestAllOf commentDeclineRequestAllOf = (CommentDeclineRequestAllOf) o;
    return Objects.equals(this.composition, commentDeclineRequestAllOf.composition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(composition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentDeclineRequestAllOf {\n");
    sb.append("    composition: ").append(toIndentedString(composition)).append("\n");
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

