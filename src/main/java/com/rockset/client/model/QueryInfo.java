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
import com.rockset.client.model.Pagination;
import com.rockset.client.model.QueryError;
import com.rockset.client.model.Stats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-15T14:59:14.000-04:00")
public class QueryInfo {
  @SerializedName("query_id")
  private String queryId = null;

  /**
   * Status of the query.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    RUNNING("RUNNING"),
    
    COMPLETE("COMPLETE"),
    
    ERROR("ERROR"),
    
    CANCELLED("CANCELLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("executed_by")
  private String executedBy = null;

  @SerializedName("submitted_at")
  private String submittedAt = null;

  @SerializedName("expires_at")
  private String expiresAt = null;

  @SerializedName("stats")
  private Stats stats = null;

  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("last_offset")
  private String lastOffset = null;

  @SerializedName("query_errors")
  private List<QueryError> queryErrors = null;

  public QueryInfo queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

   /**
   * Unique Query ID.
   * @return queryId
  **/

@JsonProperty("query_id")
@ApiModelProperty(example = "5b596206-c632-4a08-8343-0c560f7ef7f1", value = "Unique Query ID.")
  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public QueryInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the query.
   * @return status
  **/

@JsonProperty("status")
@ApiModelProperty(example = "RUNNING", value = "Status of the query.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public QueryInfo executedBy(String executedBy) {
    this.executedBy = executedBy;
    return this;
  }

   /**
   * User ID who executed the query
   * @return executedBy
  **/

@JsonProperty("executed_by")
@ApiModelProperty(example = "xyz@rockset.com", value = "User ID who executed the query")
  public String getExecutedBy() {
    return executedBy;
  }

  public void setExecutedBy(String executedBy) {
    this.executedBy = executedBy;
  }

  public QueryInfo submittedAt(String submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Time (UTC) the query request was first received and queued for execution.
   * @return submittedAt
  **/

@JsonProperty("submitted_at")
@ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "Time (UTC) the query request was first received and queued for execution.")
  public String getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(String submittedAt) {
    this.submittedAt = submittedAt;
  }

  public QueryInfo expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Time (UTC) that query results expire. Only populated if &#x60;status&#x60; is &#x60;COMPLETE&#x60;.
   * @return expiresAt
  **/

@JsonProperty("expires_at")
@ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "Time (UTC) that query results expire. Only populated if `status` is `COMPLETE`.")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public QueryInfo stats(Stats stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Various stats about the query&#39;s execution.
   * @return stats
  **/

@JsonProperty("stats")
@ApiModelProperty(value = "Various stats about the query's execution.")
  public Stats getStats() {
    return stats;
  }

  public void setStats(Stats stats) {
    this.stats = stats;
  }

  public QueryInfo pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Information for fetching query results pages. Only populated if &#x60;status&#x60; is &#x60;COMPLETE&#x60;.
   * @return pagination
  **/

@JsonProperty("pagination")
@ApiModelProperty(value = "Information for fetching query results pages. Only populated if `status` is `COMPLETE`.")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public QueryInfo lastOffset(String lastOffset) {
    this.lastOffset = lastOffset;
    return this;
  }

   /**
   * The log offset that query results were written to in the destination collection. Only populated for INSERT INTO queries.
   * @return lastOffset
  **/

@JsonProperty("last_offset")
@ApiModelProperty(value = "The log offset that query results were written to in the destination collection. Only populated for INSERT INTO queries.")
  public String getLastOffset() {
    return lastOffset;
  }

  public void setLastOffset(String lastOffset) {
    this.lastOffset = lastOffset;
  }

  public QueryInfo queryErrors(List<QueryError> queryErrors) {
    this.queryErrors = queryErrors;
    return this;
  }

  public QueryInfo addQueryErrorsItem(QueryError queryErrorsItem) {
    if (this.queryErrors == null) {
      this.queryErrors = new ArrayList<QueryError>();
    }
    this.queryErrors.add(queryErrorsItem);
    return this;
  }

   /**
   * Errors encountered while executing the query.
   * @return queryErrors
  **/

@JsonProperty("query_errors")
@ApiModelProperty(value = "Errors encountered while executing the query.")
  public List<QueryError> getQueryErrors() {
    return queryErrors;
  }

  public void setQueryErrors(List<QueryError> queryErrors) {
    this.queryErrors = queryErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInfo queryInfo = (QueryInfo) o;
    return Objects.equals(this.queryId, queryInfo.queryId) &&
        Objects.equals(this.status, queryInfo.status) &&
        Objects.equals(this.executedBy, queryInfo.executedBy) &&
        Objects.equals(this.submittedAt, queryInfo.submittedAt) &&
        Objects.equals(this.expiresAt, queryInfo.expiresAt) &&
        Objects.equals(this.stats, queryInfo.stats) &&
        Objects.equals(this.pagination, queryInfo.pagination) &&
        Objects.equals(this.lastOffset, queryInfo.lastOffset) &&
        Objects.equals(this.queryErrors, queryInfo.queryErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, status, executedBy, submittedAt, expiresAt, stats, pagination, lastOffset, queryErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryInfo {\n");
    
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    executedBy: ").append(toIndentedString(executedBy)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    lastOffset: ").append(toIndentedString(lastOffset)).append("\n");
    sb.append("    queryErrors: ").append(toIndentedString(queryErrors)).append("\n");
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

