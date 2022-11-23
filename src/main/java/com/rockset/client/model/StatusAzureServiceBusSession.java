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
 * StatusAzureServiceBusSession
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-22T11:16:43.952-05:00")
public class StatusAzureServiceBusSession {
  @SerializedName("sequence_number")
  private Long sequenceNumber = null;

  @SerializedName("last_processed")
  private String lastProcessed = null;

  public StatusAzureServiceBusSession sequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * The last processed sequence number within this session.
   * @return sequenceNumber
  **/

@JsonProperty("sequence_number")
@ApiModelProperty(example = "323862", value = "The last processed sequence number within this session.")
  public Long getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public StatusAzureServiceBusSession lastProcessed(String lastProcessed) {
    this.lastProcessed = lastProcessed;
    return this;
  }

   /**
   * Most recent ISO-8601 date when a message from this session was processed.
   * @return lastProcessed
  **/

@JsonProperty("last_processed")
@ApiModelProperty(example = "2022-08-23T00:13:41Z", value = "Most recent ISO-8601 date when a message from this session was processed.")
  public String getLastProcessed() {
    return lastProcessed;
  }

  public void setLastProcessed(String lastProcessed) {
    this.lastProcessed = lastProcessed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusAzureServiceBusSession statusAzureServiceBusSession = (StatusAzureServiceBusSession) o;
    return Objects.equals(this.sequenceNumber, statusAzureServiceBusSession.sequenceNumber) &&
        Objects.equals(this.lastProcessed, statusAzureServiceBusSession.lastProcessed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceNumber, lastProcessed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusAzureServiceBusSession {\n");
    
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    lastProcessed: ").append(toIndentedString(lastProcessed)).append("\n");
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

