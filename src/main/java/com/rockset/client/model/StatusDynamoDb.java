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
 * StatusDynamoDb
 */
// @javax.annotation.Generated(value =
// "io.swagger.codegen.languages.JavaClientCodegen", date =
// "2023-09-19T15:55:29.974-07:00")
public class StatusDynamoDb {
  @SerializedName("scan_end_time")
  private String scanEndTime = null;

  @SerializedName("scan_records_processed")
  private Long scanRecordsProcessed = null;

  @SerializedName("scan_start_time")
  private String scanStartTime = null;

  @SerializedName("scan_total_records")
  private Long scanTotalRecords = null;

  /**
   * State of current ingest for this table.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INITIALIZING("INITIALIZING"),

    SCANNING_TABLE("SCANNINGTABLE"),

    PROCESSING_STREAM("PROCESSINGSTREAM");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("stream_last_processed_at")
  private String streamLastProcessedAt = null;

  public StatusDynamoDb scanEndTime(String scanEndTime) {
    this.scanEndTime = scanEndTime;
    return this;
  }

  /**
   * DynamoDb scan end time.
   * 
   * @return scanEndTime
   **/

  @JsonProperty("scan_end_time")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "DynamoDb scan end time.")
  public String getScanEndTime() {
    return scanEndTime;
  }

  public void setScanEndTime(String scanEndTime) {
    this.scanEndTime = scanEndTime;
  }

  public StatusDynamoDb scanRecordsProcessed(Long scanRecordsProcessed) {
    this.scanRecordsProcessed = scanRecordsProcessed;
    return this;
  }

  /**
   * Number of records inserted using scan.
   * 
   * @return scanRecordsProcessed
   **/

  @JsonProperty("scan_records_processed")
  @ApiModelProperty(example = "1000", value = "Number of records inserted using scan.")
  public Long getScanRecordsProcessed() {
    return scanRecordsProcessed;
  }

  public void setScanRecordsProcessed(Long scanRecordsProcessed) {
    this.scanRecordsProcessed = scanRecordsProcessed;
  }

  public StatusDynamoDb scanStartTime(String scanStartTime) {
    this.scanStartTime = scanStartTime;
    return this;
  }

  /**
   * DynamoDB scan start time.
   * 
   * @return scanStartTime
   **/

  @JsonProperty("scan_start_time")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "DynamoDB scan start time.")
  public String getScanStartTime() {
    return scanStartTime;
  }

  public void setScanStartTime(String scanStartTime) {
    this.scanStartTime = scanStartTime;
  }

  public StatusDynamoDb scanTotalRecords(Long scanTotalRecords) {
    this.scanTotalRecords = scanTotalRecords;
    return this;
  }

  /**
   * Number of records in DynamoDB table at time of scan.
   * 
   * @return scanTotalRecords
   **/

  @JsonProperty("scan_total_records")
  @ApiModelProperty(example = "2000", value = "Number of records in DynamoDB table at time of scan.")
  public Long getScanTotalRecords() {
    return scanTotalRecords;
  }

  public void setScanTotalRecords(Long scanTotalRecords) {
    this.scanTotalRecords = scanTotalRecords;
  }

  public StatusDynamoDb state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * State of current ingest for this table.
   * 
   * @return state
   **/

  @JsonProperty("state")
  @ApiModelProperty(example = "SCANNING_TABLE", value = "State of current ingest for this table.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public StatusDynamoDb streamLastProcessedAt(String streamLastProcessedAt) {
    this.streamLastProcessedAt = streamLastProcessedAt;
    return this;
  }

  /**
   * ISO-8601 date when source was last processed.
   * 
   * @return streamLastProcessedAt
   **/

  @JsonProperty("stream_last_processed_at")
  @ApiModelProperty(example = "2019-01-15T21:48:23Z", value = "ISO-8601 date when source was last processed.")
  public String getStreamLastProcessedAt() {
    return streamLastProcessedAt;
  }

  public void setStreamLastProcessedAt(String streamLastProcessedAt) {
    this.streamLastProcessedAt = streamLastProcessedAt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDynamoDb statusDynamoDb = (StatusDynamoDb) o;
    return Objects.equals(this.scanEndTime, statusDynamoDb.scanEndTime) &&
        Objects.equals(this.scanRecordsProcessed, statusDynamoDb.scanRecordsProcessed) &&
        Objects.equals(this.scanStartTime, statusDynamoDb.scanStartTime) &&
        Objects.equals(this.scanTotalRecords, statusDynamoDb.scanTotalRecords) &&
        Objects.equals(this.state, statusDynamoDb.state) &&
        Objects.equals(this.streamLastProcessedAt, statusDynamoDb.streamLastProcessedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scanEndTime, scanRecordsProcessed, scanStartTime, scanTotalRecords, state,
        streamLastProcessedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDynamoDb {\n");

    sb.append("    scanEndTime: ").append(toIndentedString(scanEndTime)).append("\n");
    sb.append("    scanRecordsProcessed: ").append(toIndentedString(scanRecordsProcessed)).append("\n");
    sb.append("    scanStartTime: ").append(toIndentedString(scanStartTime)).append("\n");
    sb.append("    scanTotalRecords: ").append(toIndentedString(scanTotalRecords)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    streamLastProcessedAt: ").append(toIndentedString(streamLastProcessedAt)).append("\n");
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
