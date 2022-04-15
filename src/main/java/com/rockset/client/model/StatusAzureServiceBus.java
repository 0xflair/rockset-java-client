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
import com.rockset.client.model.StatusAzureServiceBusSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusAzureServiceBus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-15T14:59:14.000-04:00")
public class StatusAzureServiceBus {
  @SerializedName("first_processed_at")
  private OffsetDateTime firstProcessedAt = null;

  @SerializedName("records_processed")
  private Long recordsProcessed = null;

  @SerializedName("sessions")
  private Map<String, StatusAzureServiceBusSession> sessions = null;

  public StatusAzureServiceBus firstProcessedAt(OffsetDateTime firstProcessedAt) {
    this.firstProcessedAt = firstProcessedAt;
    return this;
  }

   /**
   * Service Bus first message processed time in ISO-8601 format
   * @return firstProcessedAt
  **/

@JsonProperty("first_processed_at")
@ApiModelProperty(example = "2021-08-28T00:23:41Z", value = "Service Bus first message processed time in ISO-8601 format")
  public OffsetDateTime getFirstProcessedAt() {
    return firstProcessedAt;
  }

  public void setFirstProcessedAt(OffsetDateTime firstProcessedAt) {
    this.firstProcessedAt = firstProcessedAt;
  }

  public StatusAzureServiceBus recordsProcessed(Long recordsProcessed) {
    this.recordsProcessed = recordsProcessed;
    return this;
  }

   /**
   * Number of records processed
   * @return recordsProcessed
  **/

@JsonProperty("records_processed")
@ApiModelProperty(example = "1000", value = "Number of records processed")
  public Long getRecordsProcessed() {
    return recordsProcessed;
  }

  public void setRecordsProcessed(Long recordsProcessed) {
    this.recordsProcessed = recordsProcessed;
  }

  public StatusAzureServiceBus sessions(Map<String, StatusAzureServiceBusSession> sessions) {
    this.sessions = sessions;
    return this;
  }

  public StatusAzureServiceBus putSessionsItem(String key, StatusAzureServiceBusSession sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new HashMap<String, StatusAzureServiceBusSession>();
    }
    this.sessions.put(key, sessionsItem);
    return this;
  }

   /**
   * Sessions processed
   * @return sessions
  **/

@JsonProperty("sessions")
@ApiModelProperty(value = "Sessions processed")
  public Map<String, StatusAzureServiceBusSession> getSessions() {
    return sessions;
  }

  public void setSessions(Map<String, StatusAzureServiceBusSession> sessions) {
    this.sessions = sessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusAzureServiceBus statusAzureServiceBus = (StatusAzureServiceBus) o;
    return Objects.equals(this.firstProcessedAt, statusAzureServiceBus.firstProcessedAt) &&
        Objects.equals(this.recordsProcessed, statusAzureServiceBus.recordsProcessed) &&
        Objects.equals(this.sessions, statusAzureServiceBus.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstProcessedAt, recordsProcessed, sessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusAzureServiceBus {\n");
    
    sb.append("    firstProcessedAt: ").append(toIndentedString(firstProcessedAt)).append("\n");
    sb.append("    recordsProcessed: ").append(toIndentedString(recordsProcessed)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

