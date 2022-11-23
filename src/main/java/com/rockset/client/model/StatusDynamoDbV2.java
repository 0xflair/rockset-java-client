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
 * StatusDynamoDbV2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-22T11:16:43.952-05:00")
public class StatusDynamoDbV2 {
  @SerializedName("initial_dump_completion_percentage")
  private Double initialDumpCompletionPercentage = null;

  /**
   * State of current ingest for this table.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INITIALIZING("INITIALIZING"),
    
    SCANNING("SCANNING"),
    
    EXPORTING_TO_S3("EXPORTINGTOS3"),
    
    DOWNLOADING_FROM_S3("DOWNLOADINGFROMS3"),
    
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

  public StatusDynamoDbV2 initialDumpCompletionPercentage(Double initialDumpCompletionPercentage) {
    this.initialDumpCompletionPercentage = initialDumpCompletionPercentage;
    return this;
  }

   /**
   * Get initialDumpCompletionPercentage
   * @return initialDumpCompletionPercentage
  **/

@JsonProperty("initial_dump_completion_percentage")
@ApiModelProperty(example = "0.73", value = "")
  public Double getInitialDumpCompletionPercentage() {
    return initialDumpCompletionPercentage;
  }

  public void setInitialDumpCompletionPercentage(Double initialDumpCompletionPercentage) {
    this.initialDumpCompletionPercentage = initialDumpCompletionPercentage;
  }

  public StatusDynamoDbV2 state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of current ingest for this table.
   * @return state
  **/

@JsonProperty("state")
@ApiModelProperty(example = "PROCESSING_STREAM", value = "State of current ingest for this table.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public StatusDynamoDbV2 streamLastProcessedAt(String streamLastProcessedAt) {
    this.streamLastProcessedAt = streamLastProcessedAt;
    return this;
  }

   /**
   * ISO-8601 date when source was last processed.
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
    StatusDynamoDbV2 statusDynamoDbV2 = (StatusDynamoDbV2) o;
    return Objects.equals(this.initialDumpCompletionPercentage, statusDynamoDbV2.initialDumpCompletionPercentage) &&
        Objects.equals(this.state, statusDynamoDbV2.state) &&
        Objects.equals(this.streamLastProcessedAt, statusDynamoDbV2.streamLastProcessedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialDumpCompletionPercentage, state, streamLastProcessedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDynamoDbV2 {\n");
    
    sb.append("    initialDumpCompletionPercentage: ").append(toIndentedString(initialDumpCompletionPercentage)).append("\n");
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

