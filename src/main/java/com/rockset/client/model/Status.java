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
 * Status
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-15T14:59:14.000-04:00")
public class Status {
  /**
   * Status of the Source&#39;s ingestion, one of: INITIALIZING, WATCHING, PROCESSING, COMPLETED, ERROR
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INITIALIZING("INITIALIZING"),
    
    WATCHING("WATCHING"),
    
    PROCESSING("PROCESSING"),
    
    COMPLETED("COMPLETED"),
    
    ERROR("ERROR");

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

  @SerializedName("message")
  private String message = null;

  @SerializedName("last_processed_at")
  private String lastProcessedAt = null;

  @SerializedName("last_processed_item")
  private String lastProcessedItem = null;

  @SerializedName("total_processed_items")
  private Long totalProcessedItems = null;

  public Status state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Status of the Source&#39;s ingestion, one of: INITIALIZING, WATCHING, PROCESSING, COMPLETED, ERROR
   * @return state
  **/

@JsonProperty("state")
@ApiModelProperty(example = "INITIALIZING", value = "Status of the Source's ingestion, one of: INITIALIZING, WATCHING, PROCESSING, COMPLETED, ERROR")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Status message(String message) {
    this.message = message;
    return this;
  }

   /**
   * state message
   * @return message
  **/

@JsonProperty("message")
@ApiModelProperty(example = "error 403 forbidden", value = "state message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Status lastProcessedAt(String lastProcessedAt) {
    this.lastProcessedAt = lastProcessedAt;
    return this;
  }

   /**
   * ISO-8601 date when source was last processed
   * @return lastProcessedAt
  **/

@JsonProperty("last_processed_at")
@ApiModelProperty(example = "2019-01-15T21:48:23Z", value = "ISO-8601 date when source was last processed")
  public String getLastProcessedAt() {
    return lastProcessedAt;
  }

  public void setLastProcessedAt(String lastProcessedAt) {
    this.lastProcessedAt = lastProcessedAt;
  }

  public Status lastProcessedItem(String lastProcessedItem) {
    this.lastProcessedItem = lastProcessedItem;
    return this;
  }

   /**
   * last source item processed by ingester
   * @return lastProcessedItem
  **/

@JsonProperty("last_processed_item")
@ApiModelProperty(example = "/path/to/some/object", value = "last source item processed by ingester")
  public String getLastProcessedItem() {
    return lastProcessedItem;
  }

  public void setLastProcessedItem(String lastProcessedItem) {
    this.lastProcessedItem = lastProcessedItem;
  }

  public Status totalProcessedItems(Long totalProcessedItems) {
    this.totalProcessedItems = totalProcessedItems;
    return this;
  }

   /**
   * Total items processed of source
   * @return totalProcessedItems
  **/

@JsonProperty("total_processed_items")
@ApiModelProperty(example = "32849023", value = "Total items processed of source")
  public Long getTotalProcessedItems() {
    return totalProcessedItems;
  }

  public void setTotalProcessedItems(Long totalProcessedItems) {
    this.totalProcessedItems = totalProcessedItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.state, status.state) &&
        Objects.equals(this.message, status.message) &&
        Objects.equals(this.lastProcessedAt, status.lastProcessedAt) &&
        Objects.equals(this.lastProcessedItem, status.lastProcessedItem) &&
        Objects.equals(this.totalProcessedItems, status.totalProcessedItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, message, lastProcessedAt, lastProcessedItem, totalProcessedItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    lastProcessedAt: ").append(toIndentedString(lastProcessedAt)).append("\n");
    sb.append("    lastProcessedItem: ").append(toIndentedString(lastProcessedItem)).append("\n");
    sb.append("    totalProcessedItems: ").append(toIndentedString(totalProcessedItems)).append("\n");
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

