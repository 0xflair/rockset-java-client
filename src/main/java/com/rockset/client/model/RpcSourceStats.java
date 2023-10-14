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
 * RpcSourceStats
 */
// @javax.annotation.Generated(value =
// "io.swagger.codegen.languages.JavaClientCodegen", date =
// "2022-04-15T10:38:36.284-04:00")
public class RpcSourceStats {
  @SerializedName("worker")
  private String worker = null;

  @SerializedName("fragment")
  private Long fragment = null;

  @SerializedName("task")
  private String task = null;

  @SerializedName("operator_id")
  private Long operatorId = null;

  @SerializedName("dest_operator_name")
  private String destOperatorName = null;

  @SerializedName("input_bytes")
  private Long inputBytes = null;

  @SerializedName("max_input_bytes")
  private Long maxInputBytes = null;

  @SerializedName("input_rows")
  private Long inputRows = null;

  @SerializedName("input_data_chunks")
  private Long inputDataChunks = null;

  @SerializedName("input_messages")
  private Long inputMessages = null;

  @SerializedName("processing_time_us")
  private Long processingTimeUs = null;

  public RpcSourceStats worker(String worker) {
    this.worker = worker;
    return this;
  }

  /**
   * The id of the worker this operator ran on
   * 
   * @return worker
   **/

  @JsonProperty("worker")
  @ApiModelProperty(example = "aggregator", value = "The id of the worker this operator ran on")
  public String getWorker() {
    return worker;
  }

  public void setWorker(String worker) {
    this.worker = worker;
  }

  public RpcSourceStats fragment(Long fragment) {
    this.fragment = fragment;
    return this;
  }

  /**
   * The id of the fragment this operator belonged to
   * 
   * @return fragment
   **/

  @JsonProperty("fragment")
  @ApiModelProperty(example = "13", value = "The id of the fragment this operator belonged to")
  public Long getFragment() {
    return fragment;
  }

  public void setFragment(Long fragment) {
    this.fragment = fragment;
  }

  public RpcSourceStats task(String task) {
    this.task = task;
    return this;
  }

  /**
   * The id of the task this operator belonged to
   * 
   * @return task
   **/

  @JsonProperty("task")
  @ApiModelProperty(example = "2", value = "The id of the task this operator belonged to")
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public RpcSourceStats operatorId(Long operatorId) {
    this.operatorId = operatorId;
    return this;
  }

  /**
   * The id of this operator in the task
   * 
   * @return operatorId
   **/

  @JsonProperty("operator_id")
  @ApiModelProperty(example = "3", value = "The id of this operator in the task")
  public Long getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(Long operatorId) {
    this.operatorId = operatorId;
  }

  public RpcSourceStats destOperatorName(String destOperatorName) {
    this.destOperatorName = destOperatorName;
    return this;
  }

  /**
   * The class name of downstream operator
   * 
   * @return destOperatorName
   **/

  @JsonProperty("dest_operator_name")
  @ApiModelProperty(example = "AllGather", value = "The class name of downstream operator")
  public String getDestOperatorName() {
    return destOperatorName;
  }

  public void setDestOperatorName(String destOperatorName) {
    this.destOperatorName = destOperatorName;
  }

  public RpcSourceStats inputBytes(Long inputBytes) {
    this.inputBytes = inputBytes;
    return this;
  }

  /**
   * Total bytes received from the input
   * 
   * @return inputBytes
   **/

  @JsonProperty("input_bytes")
  @ApiModelProperty(example = "48004800", value = "Total bytes received from the input")
  public Long getInputBytes() {
    return inputBytes;
  }

  public void setInputBytes(Long inputBytes) {
    this.inputBytes = inputBytes;
  }

  public RpcSourceStats maxInputBytes(Long maxInputBytes) {
    this.maxInputBytes = maxInputBytes;
    return this;
  }

  /**
   * Maximum bytes received in one data chunk
   * 
   * @return maxInputBytes
   **/

  @JsonProperty("max_input_bytes")
  @ApiModelProperty(example = "48004800", value = "Maximum bytes received in one data chunk")
  public Long getMaxInputBytes() {
    return maxInputBytes;
  }

  public void setMaxInputBytes(Long maxInputBytes) {
    this.maxInputBytes = maxInputBytes;
  }

  public RpcSourceStats inputRows(Long inputRows) {
    this.inputRows = inputRows;
    return this;
  }

  /**
   * Total rows received from the input
   * 
   * @return inputRows
   **/

  @JsonProperty("input_rows")
  @ApiModelProperty(example = "1000100", value = "Total rows received from the input")
  public Long getInputRows() {
    return inputRows;
  }

  public void setInputRows(Long inputRows) {
    this.inputRows = inputRows;
  }

  public RpcSourceStats inputDataChunks(Long inputDataChunks) {
    this.inputDataChunks = inputDataChunks;
    return this;
  }

  /**
   * Total data chunks received from the input
   * 
   * @return inputDataChunks
   **/

  @JsonProperty("input_data_chunks")
  @ApiModelProperty(example = "1000100", value = "Total data chunks received from the input")
  public Long getInputDataChunks() {
    return inputDataChunks;
  }

  public void setInputDataChunks(Long inputDataChunks) {
    this.inputDataChunks = inputDataChunks;
  }

  public RpcSourceStats inputMessages(Long inputMessages) {
    this.inputMessages = inputMessages;
    return this;
  }

  /**
   * Total messages received from the input
   * 
   * @return inputMessages
   **/

  @JsonProperty("input_messages")
  @ApiModelProperty(example = "1000100", value = "Total messages received from the input")
  public Long getInputMessages() {
    return inputMessages;
  }

  public void setInputMessages(Long inputMessages) {
    this.inputMessages = inputMessages;
  }

  public RpcSourceStats processingTimeUs(Long processingTimeUs) {
    this.processingTimeUs = processingTimeUs;
    return this;
  }

  /**
   * Total time in microseconds spent doing useful work
   * 
   * @return processingTimeUs
   **/

  @JsonProperty("processing_time_us")
  @ApiModelProperty(example = "2500", value = "Total time in microseconds spent doing useful work")
  public Long getProcessingTimeUs() {
    return processingTimeUs;
  }

  public void setProcessingTimeUs(Long processingTimeUs) {
    this.processingTimeUs = processingTimeUs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RpcSourceStats rpcSourceStats = (RpcSourceStats) o;
    return Objects.equals(this.worker, rpcSourceStats.worker) &&
        Objects.equals(this.fragment, rpcSourceStats.fragment) &&
        Objects.equals(this.task, rpcSourceStats.task) &&
        Objects.equals(this.operatorId, rpcSourceStats.operatorId) &&
        Objects.equals(this.destOperatorName, rpcSourceStats.destOperatorName) &&
        Objects.equals(this.inputBytes, rpcSourceStats.inputBytes) &&
        Objects.equals(this.maxInputBytes, rpcSourceStats.maxInputBytes) &&
        Objects.equals(this.inputRows, rpcSourceStats.inputRows) &&
        Objects.equals(this.inputDataChunks, rpcSourceStats.inputDataChunks) &&
        Objects.equals(this.inputMessages, rpcSourceStats.inputMessages) &&
        Objects.equals(this.processingTimeUs, rpcSourceStats.processingTimeUs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worker, fragment, task, operatorId, destOperatorName, inputBytes, maxInputBytes, inputRows,
        inputDataChunks, inputMessages, processingTimeUs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RpcSourceStats {\n");

    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    destOperatorName: ").append(toIndentedString(destOperatorName)).append("\n");
    sb.append("    inputBytes: ").append(toIndentedString(inputBytes)).append("\n");
    sb.append("    maxInputBytes: ").append(toIndentedString(maxInputBytes)).append("\n");
    sb.append("    inputRows: ").append(toIndentedString(inputRows)).append("\n");
    sb.append("    inputDataChunks: ").append(toIndentedString(inputDataChunks)).append("\n");
    sb.append("    inputMessages: ").append(toIndentedString(inputMessages)).append("\n");
    sb.append("    processingTimeUs: ").append(toIndentedString(processingTimeUs)).append("\n");
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
