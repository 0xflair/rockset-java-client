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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ErrorModelContext */
// @javax.annotation.Generated(
// value = "io.swagger.codegen.languages.JavaClientCodegen",
// date = "2019-01-24T01:18:37.603Z")
public class ErrorModelContext {
  @SerializedName("lineinfo")
  private String lineinfo = null;

  public ErrorModelContext lineinfo(String lineinfo) {
    this.lineinfo = lineinfo;
    return this;
  }

  /**
   * additional error message
   *
   * @return lineinfo
   */
  @ApiModelProperty(example = "could not add documents to paused collection", value = "additional error message")
  public String getLineinfo() {
    return lineinfo;
  }

  public void setLineinfo(String lineinfo) {
    this.lineinfo = lineinfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModelContext errorModelContext = (ErrorModelContext) o;
    return Objects.equals(this.lineinfo, errorModelContext.lineinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineinfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModelContext {\n");

    sb.append("    lineinfo: ").append(toIndentedString(lineinfo)).append("\n");
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
