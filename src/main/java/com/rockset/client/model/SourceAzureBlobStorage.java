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
 * SourceAzureBlobStorage
 */
// @javax.annotation.Generated(value =
// "io.swagger.codegen.languages.JavaClientCodegen", date =
// "2023-09-19T15:55:29.974-07:00")
public class SourceAzureBlobStorage {
  @SerializedName("blob_bytes_total")
  private Long blobBytesTotal = null;

  @SerializedName("blob_count_downloaded")
  private Long blobCountDownloaded = null;

  @SerializedName("blob_count_total")
  private Long blobCountTotal = null;

  @SerializedName("container")
  private String container = null;

  @SerializedName("pattern")
  private String pattern = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("settings")
  private SourceAzBlobStorageSettings settings = null;

  /**
   * Get blobBytesTotal
   * 
   * @return blobBytesTotal
   **/

  @JsonProperty("blob_bytes_total")
  @ApiModelProperty(value = "")
  public Long getBlobBytesTotal() {
    return blobBytesTotal;
  }

  /**
   * Get blobCountDownloaded
   * 
   * @return blobCountDownloaded
   **/

  @JsonProperty("blob_count_downloaded")
  @ApiModelProperty(value = "")
  public Long getBlobCountDownloaded() {
    return blobCountDownloaded;
  }

  /**
   * Get blobCountTotal
   * 
   * @return blobCountTotal
   **/

  @JsonProperty("blob_count_total")
  @ApiModelProperty(value = "")
  public Long getBlobCountTotal() {
    return blobCountTotal;
  }

  public SourceAzureBlobStorage container(String container) {
    this.container = container;
    return this;
  }

  /**
   * Name of Azure blob Storage container you want to ingest from.
   * 
   * @return container
   **/

  @JsonProperty("container")
  @ApiModelProperty(example = "server-logs", value = "Name of Azure blob Storage container you want to ingest from.")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public SourceAzureBlobStorage pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Glob-style pattern that selects keys to ingest. Only either prefix or pattern
   * can be specified.
   * 
   * @return pattern
   **/

  @JsonProperty("pattern")
  @ApiModelProperty(example = "prefix/to/_**_/keys/_*.format", value = "Glob-style pattern that selects keys to ingest. Only either prefix or pattern can be specified.")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public SourceAzureBlobStorage prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Prefix that selects blobs to ingest.
   * 
   * @return prefix
   **/

  @JsonProperty("prefix")
  @ApiModelProperty(example = "prefix/to/blobs", value = "Prefix that selects blobs to ingest.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public SourceAzureBlobStorage settings(SourceAzBlobStorageSettings settings) {
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
    SourceAzureBlobStorage sourceAzureBlobStorage = (SourceAzureBlobStorage) o;
    return Objects.equals(this.blobBytesTotal, sourceAzureBlobStorage.blobBytesTotal) &&
        Objects.equals(this.blobCountDownloaded, sourceAzureBlobStorage.blobCountDownloaded) &&
        Objects.equals(this.blobCountTotal, sourceAzureBlobStorage.blobCountTotal) &&
        Objects.equals(this.container, sourceAzureBlobStorage.container) &&
        Objects.equals(this.pattern, sourceAzureBlobStorage.pattern) &&
        Objects.equals(this.prefix, sourceAzureBlobStorage.prefix) &&
        Objects.equals(this.settings, sourceAzureBlobStorage.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blobBytesTotal, blobCountDownloaded, blobCountTotal, container, pattern, prefix, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceAzureBlobStorage {\n");

    sb.append("    blobBytesTotal: ").append(toIndentedString(blobBytesTotal)).append("\n");
    sb.append("    blobCountDownloaded: ").append(toIndentedString(blobCountDownloaded)).append("\n");
    sb.append("    blobCountTotal: ").append(toIndentedString(blobCountTotal)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
