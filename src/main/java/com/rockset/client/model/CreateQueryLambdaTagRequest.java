/*
 * REST API
 * Rockset's REST API allows for creating and managing all resources in Rockset. Each supported endpoint is documented below.  All requests must be authorized with a Rockset API key, which can be created in the [Rockset console](https://console.rockset.com). The API key must be provided as `ApiKey <api_key>` in the `Authorization` request header. For example: ``` Authorization: ApiKey aB35kDjg93J5nsf4GjwMeErAVd832F7ad4vhsW1S02kfZiab42sTsfW5Sxt25asT ```  All endpoints are only accessible via https.  Build something awesome!
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rockset.client.model;

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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateQueryLambdaTagRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-15T14:59:14.000-04:00")
public class CreateQueryLambdaTagRequest {
  @SerializedName("tag_name")
  private String tagName = null;

  @SerializedName("version")
  private String version = null;

  public CreateQueryLambdaTagRequest tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * name of Query Lambda tag
   * @return tagName
  **/

@JsonProperty("tag_name")
@ApiModelProperty(example = "production", required = true, value = "name of Query Lambda tag")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public CreateQueryLambdaTagRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * hash identifying a Query Lambda tag
   * @return version
  **/

@JsonProperty("version")
@ApiModelProperty(example = "123ABC", required = true, value = "hash identifying a Query Lambda tag")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateQueryLambdaTagRequest createQueryLambdaTagRequest = (CreateQueryLambdaTagRequest) o;
    return Objects.equals(this.tagName, createQueryLambdaTagRequest.tagName) &&
        Objects.equals(this.version, createQueryLambdaTagRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagName, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQueryLambdaTagRequest {\n");
    
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

