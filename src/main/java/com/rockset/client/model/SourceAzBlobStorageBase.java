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
import com.rockset.client.model.SourceAzBlobStorageSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAzBlobStorageBase
 */
// @javax.annotation.Generated(value =
// "io.swagger.codegen.languages.JavaClientCodegen", date =
// "2023-09-19T15:55:29.974-07:00")
public class SourceAzBlobStorageBase {
  @SerializedName("settings")
  private SourceAzBlobStorageSettings settings = null;

  public SourceAzBlobStorageBase settings(SourceAzBlobStorageSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * custom settings for Azure blob Storage source
   * 
   * @return settings
   **/

  @JsonProperty("settings")
  @ApiModelProperty(value = "custom settings for Azure blob Storage source")
  public SourceAzBlobStorageSettings getSettings() {
    return settings;
  }

  public void setSettings(SourceAzBlobStorageSettings settings) {
    this.settings = settings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceAzBlobStorageBase sourceAzBlobStorageBase = (SourceAzBlobStorageBase) o;
    return Objects.equals(this.settings, sourceAzBlobStorageBase.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceAzBlobStorageBase {\n");

    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
