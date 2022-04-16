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
 * Describes details about an error
 */

@ApiModel(description = "Describes details about an error")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-16T12:14:16.934-04:00")
public class ErrorModel {
  @SerializedName("message")
  private String message = null;

  /**
   * category of the error
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AUTHEXCEPTION("AUTHEXCEPTION"),
    
    VERSIONEXCEPTION("VERSIONEXCEPTION"),
    
    INTERNALERROR("INTERNALERROR"),
    
    INVALIDINPUT("INVALIDINPUT"),
    
    NOTIMPLEMENTEDYET("NOTIMPLEMENTEDYET"),
    
    RESOURCEEXCEEDED("RESOURCEEXCEEDED"),
    
    ALREADYEXISTS("ALREADYEXISTS"),
    
    NOTALLOWED("NOTALLOWED"),
    
    NOTACCEPTABLE("NOTACCEPTABLE"),
    
    NOTSUPPORTED("NOTSUPPORTED"),
    
    NOTFOUND("NOTFOUND"),
    
    DEPENDENTRESOURCES("DEPENDENTRESOURCES"),
    
    QUERY_ERROR("QUERYERROR"),
    
    NOT_READY("NOTREADY"),
    
    FORBIDDEN("FORBIDDEN"),
    
    QUERY_TIMEOUT("QUERYTIMEOUT"),
    
    ROLE_NOT_FOUND("ROLENOTFOUND"),
    
    CONNECTION_ERROR("CONNECTIONERROR"),
    
    CREATING("CREATING"),
    
    BADREQUEST("BADREQUEST"),
    
    SERVICEUNAVAILABLE("SERVICEUNAVAILABLE"),
    
    RATELIMITEXCEEDED("RATELIMITEXCEEDED"),
    
    QUERY_CANCELLED("QUERYCANCELLED"),
    
    CLIENT_CONNECTION_ERROR("CLIENTCONNECTIONERROR");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("line")
  private Integer line = null;

  @SerializedName("column")
  private Integer column = null;

  @SerializedName("trace_id")
  private String traceId = null;

  @SerializedName("error_id")
  private String errorId = null;

  @SerializedName("query_id")
  private String queryId = null;

  public ErrorModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * descriptive message about the error
   * @return message
  **/

@JsonProperty("message")
@ApiModelProperty(example = "collection not found", value = "descriptive message about the error")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorModel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * category of the error
   * @return type
  **/

@JsonProperty("type")
@ApiModelProperty(example = "InvalidInput", value = "category of the error")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorModel line(Integer line) {
    this.line = line;
    return this;
  }

   /**
   * Line where the error happened (if applicable)
   * @return line
  **/

@JsonProperty("line")
@ApiModelProperty(value = "Line where the error happened (if applicable)")
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public ErrorModel column(Integer column) {
    this.column = column;
    return this;
  }

   /**
   * Column where the error happened (if applicable)
   * @return column
  **/

@JsonProperty("column")
@ApiModelProperty(value = "Column where the error happened (if applicable)")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public ErrorModel traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

   /**
   * Internal trace ID to help with debugging
   * @return traceId
  **/

@JsonProperty("trace_id")
@ApiModelProperty(value = "Internal trace ID to help with debugging")
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public ErrorModel errorId(String errorId) {
    this.errorId = errorId;
    return this;
  }

   /**
   * ID of the error
   * @return errorId
  **/

@JsonProperty("error_id")
@ApiModelProperty(value = "ID of the error")
  public String getErrorId() {
    return errorId;
  }

  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  public ErrorModel queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

   /**
   * ID of the query (if applicable)
   * @return queryId
  **/

@JsonProperty("query_id")
@ApiModelProperty(value = "ID of the query (if applicable)")
  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.message, errorModel.message) &&
        Objects.equals(this.type, errorModel.type) &&
        Objects.equals(this.line, errorModel.line) &&
        Objects.equals(this.column, errorModel.column) &&
        Objects.equals(this.traceId, errorModel.traceId) &&
        Objects.equals(this.errorId, errorModel.errorId) &&
        Objects.equals(this.queryId, errorModel.queryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, type, line, column, traceId, errorId, queryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
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

