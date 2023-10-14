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
import com.rockset.client.model.SourceGcsSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceGcs
 */
// @javax.annotation.Generated(value =
// "io.swagger.codegen.languages.JavaClientCodegen", date =
// "2023-09-19T15:55:29.974-07:00")
public class SourceGcs {
  @SerializedName("bucket")
  private String bucket = null;

  @SerializedName("object_bytes_downloaded")
  private Long objectBytesDownloaded = null;

  @SerializedName("object_bytes_total")
  private Long objectBytesTotal = null;

  @SerializedName("object_count_downloaded")
  private Long objectCountDownloaded = null;

  @SerializedName("object_count_total")
  private Long objectCountTotal = null;

  @SerializedName("pattern")
  private String pattern = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("settings")
  private SourceGcsSettings settings = null;

  public SourceGcs bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Name of GCS bucket you want to ingest from.
   * 
   * @return bucket
   **/

  @JsonProperty("bucket")
  @ApiModelProperty(example = "server-logs", value = "Name of GCS bucket you want to ingest from.")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  /**
   * Get objectBytesDownloaded
   * 
   * @return objectBytesDownloaded
   **/

  @JsonProperty("object_bytes_downloaded")
  @ApiModelProperty(value = "")
  public Long getObjectBytesDownloaded() {
    return objectBytesDownloaded;
  }

  /**
   * Get objectBytesTotal
   * 
   * @return objectBytesTotal
   **/

  @JsonProperty("object_bytes_total")
  @ApiModelProperty(value = "")
  public Long getObjectBytesTotal() {
    return objectBytesTotal;
  }

  /**
   * Get objectCountDownloaded
   * 
   * @return objectCountDownloaded
   **/

  @JsonProperty("object_count_downloaded")
  @ApiModelProperty(value = "")
  public Long getObjectCountDownloaded() {
    return objectCountDownloaded;
  }

  /**
   * Get objectCountTotal
   * 
   * @return objectCountTotal
   **/

  @JsonProperty("object_count_total")
  @ApiModelProperty(value = "")
  public Long getObjectCountTotal() {
    return objectCountTotal;
  }

  public SourceGcs pattern(String pattern) {
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

  public SourceGcs prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Prefix that selects keys to ingest.
   * 
   * @return prefix
   **/

  @JsonProperty("prefix")
  @ApiModelProperty(example = "prefix/to/keys", value = "Prefix that selects keys to ingest.")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public SourceGcs settings(SourceGcsSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * custom settings for Google cloud Storage source
   * 
   * @return settings
   **/

  @JsonProperty("settings")
  @ApiModelProperty(value = "custom settings for Google cloud Storage source")
  public SourceGcsSettings getSettings() {
    return settings;
  }

  public void setSettings(SourceGcsSettings settings) {
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
    SourceGcs sourceGcs = (SourceGcs) o;
    return Objects.equals(this.bucket, sourceGcs.bucket) &&
        Objects.equals(this.objectBytesDownloaded, sourceGcs.objectBytesDownloaded) &&
        Objects.equals(this.objectBytesTotal, sourceGcs.objectBytesTotal) &&
        Objects.equals(this.objectCountDownloaded, sourceGcs.objectCountDownloaded) &&
        Objects.equals(this.objectCountTotal, sourceGcs.objectCountTotal) &&
        Objects.equals(this.pattern, sourceGcs.pattern) &&
        Objects.equals(this.prefix, sourceGcs.prefix) &&
        Objects.equals(this.settings, sourceGcs.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, objectBytesDownloaded, objectBytesTotal, objectCountDownloaded, objectCountTotal,
        pattern, prefix, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceGcs {\n");

    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    objectBytesDownloaded: ").append(toIndentedString(objectBytesDownloaded)).append("\n");
    sb.append("    objectBytesTotal: ").append(toIndentedString(objectBytesTotal)).append("\n");
    sb.append("    objectCountDownloaded: ").append(toIndentedString(objectCountDownloaded)).append("\n");
    sb.append("    objectCountTotal: ").append(toIndentedString(objectCountTotal)).append("\n");
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
