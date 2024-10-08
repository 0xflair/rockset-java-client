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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** InvertedIndexGroupEncodingOptions */
// @javax.annotation.Generated(
// value = "io.swagger.codegen.languages.JavaClientCodegen",
// date = "2021-12-09T15:56:21.038-08:00")
public class InvertedIndexGroupEncodingOptions {
  @SerializedName("format_version")
  private Long formatVersion = null;

  @SerializedName("group_size")
  private Long groupSize = null;

  @SerializedName("restart_length")
  private Long restartLength = null;

  @SerializedName("event_time_codec")
  private String eventTimeCodec = null;

  @SerializedName("doc_id_codec")
  private String docIdCodec = null;

  public InvertedIndexGroupEncodingOptions formatVersion(Long formatVersion) {
    this.formatVersion = formatVersion;
    return this;
  }

  /**
   * Get formatVersion
   *
   * @return formatVersion
   */
  @JsonProperty("format_version")
  @ApiModelProperty(value = "")
  public Long getFormatVersion() {
    return formatVersion;
  }

  public void setFormatVersion(Long formatVersion) {
    this.formatVersion = formatVersion;
  }

  public InvertedIndexGroupEncodingOptions groupSize(Long groupSize) {
    this.groupSize = groupSize;
    return this;
  }

  /**
   * Get groupSize
   *
   * @return groupSize
   */
  @JsonProperty("group_size")
  @ApiModelProperty(value = "")
  public Long getGroupSize() {
    return groupSize;
  }

  public void setGroupSize(Long groupSize) {
    this.groupSize = groupSize;
  }

  public InvertedIndexGroupEncodingOptions restartLength(Long restartLength) {
    this.restartLength = restartLength;
    return this;
  }

  /**
   * Get restartLength
   *
   * @return restartLength
   */
  @JsonProperty("restart_length")
  @ApiModelProperty(value = "")
  public Long getRestartLength() {
    return restartLength;
  }

  public void setRestartLength(Long restartLength) {
    this.restartLength = restartLength;
  }

  public InvertedIndexGroupEncodingOptions eventTimeCodec(String eventTimeCodec) {
    this.eventTimeCodec = eventTimeCodec;
    return this;
  }

  /**
   * Get eventTimeCodec
   *
   * @return eventTimeCodec
   */
  @JsonProperty("event_time_codec")
  @ApiModelProperty(value = "")
  public String getEventTimeCodec() {
    return eventTimeCodec;
  }

  public void setEventTimeCodec(String eventTimeCodec) {
    this.eventTimeCodec = eventTimeCodec;
  }

  public InvertedIndexGroupEncodingOptions docIdCodec(String docIdCodec) {
    this.docIdCodec = docIdCodec;
    return this;
  }

  /**
   * Get docIdCodec
   *
   * @return docIdCodec
   */
  @JsonProperty("doc_id_codec")
  @ApiModelProperty(value = "")
  public String getDocIdCodec() {
    return docIdCodec;
  }

  public void setDocIdCodec(String docIdCodec) {
    this.docIdCodec = docIdCodec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvertedIndexGroupEncodingOptions invertedIndexGroupEncodingOptions = (InvertedIndexGroupEncodingOptions) o;
    return Objects.equals(this.formatVersion, invertedIndexGroupEncodingOptions.formatVersion)
        && Objects.equals(this.groupSize, invertedIndexGroupEncodingOptions.groupSize)
        && Objects.equals(this.restartLength, invertedIndexGroupEncodingOptions.restartLength)
        && Objects.equals(this.eventTimeCodec, invertedIndexGroupEncodingOptions.eventTimeCodec)
        && Objects.equals(this.docIdCodec, invertedIndexGroupEncodingOptions.docIdCodec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatVersion, groupSize, restartLength, eventTimeCodec, docIdCodec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvertedIndexGroupEncodingOptions {\n");

    sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
    sb.append("    groupSize: ").append(toIndentedString(groupSize)).append("\n");
    sb.append("    restartLength: ").append(toIndentedString(restartLength)).append("\n");
    sb.append("    eventTimeCodec: ").append(toIndentedString(eventTimeCodec)).append("\n");
    sb.append("    docIdCodec: ").append(toIndentedString(docIdCodec)).append("\n");
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
