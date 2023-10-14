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
import com.rockset.client.model.StatusAzureEventHubs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAzureEventHubs
 */
// @javax.annotation.Generated(value =
// "io.swagger.codegen.languages.JavaClientCodegen", date =
// "2023-09-19T15:55:29.974-07:00")
public class SourceAzureEventHubs {
  @SerializedName("hub_id")
  private String hubId = null;

  /**
   * The offset reset policy.
   */
  @JsonAdapter(OffsetResetPolicyEnum.Adapter.class)
  public enum OffsetResetPolicyEnum {
    LATEST("LATEST"),

    EARLIEST("EARLIEST");

    private String value;

    OffsetResetPolicyEnum(String value) {
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
    public static OffsetResetPolicyEnum fromValue(String text) {
      for (OffsetResetPolicyEnum b : OffsetResetPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OffsetResetPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OffsetResetPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OffsetResetPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OffsetResetPolicyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("offset_reset_policy")
  private OffsetResetPolicyEnum offsetResetPolicy = null;

  @SerializedName("status")
  private StatusAzureEventHubs status = null;

  public SourceAzureEventHubs hubId(String hubId) {
    this.hubId = hubId;
    return this;
  }

  /**
   * Name of the hub which rockset should ingest from.
   * 
   * @return hubId
   **/

  @JsonProperty("hub_id")
  @ApiModelProperty(example = "event-hub-1", value = "Name of the hub which rockset should ingest from.")
  public String getHubId() {
    return hubId;
  }

  public void setHubId(String hubId) {
    this.hubId = hubId;
  }

  public SourceAzureEventHubs offsetResetPolicy(OffsetResetPolicyEnum offsetResetPolicy) {
    this.offsetResetPolicy = offsetResetPolicy;
    return this;
  }

  /**
   * The offset reset policy.
   * 
   * @return offsetResetPolicy
   **/

  @JsonProperty("offset_reset_policy")
  @ApiModelProperty(example = "EARLIEST", value = "The offset reset policy.")
  public OffsetResetPolicyEnum getOffsetResetPolicy() {
    return offsetResetPolicy;
  }

  public void setOffsetResetPolicy(OffsetResetPolicyEnum offsetResetPolicy) {
    this.offsetResetPolicy = offsetResetPolicy;
  }

  /**
   * Source status.
   * 
   * @return status
   **/

  @JsonProperty("status")
  @ApiModelProperty(value = "Source status.")
  public StatusAzureEventHubs getStatus() {
    return status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceAzureEventHubs sourceAzureEventHubs = (SourceAzureEventHubs) o;
    return Objects.equals(this.hubId, sourceAzureEventHubs.hubId) &&
        Objects.equals(this.offsetResetPolicy, sourceAzureEventHubs.offsetResetPolicy) &&
        Objects.equals(this.status, sourceAzureEventHubs.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hubId, offsetResetPolicy, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceAzureEventHubs {\n");

    sb.append("    hubId: ").append(toIndentedString(hubId)).append("\n");
    sb.append("    offsetResetPolicy: ").append(toIndentedString(offsetResetPolicy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
