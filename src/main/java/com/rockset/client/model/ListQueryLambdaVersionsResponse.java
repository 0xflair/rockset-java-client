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
import com.rockset.client.model.QueryLambdaVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListQueryLambdaVersionsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-16T12:14:16.934-04:00")
public class ListQueryLambdaVersionsResponse {
  @SerializedName("data")
  private List<QueryLambdaVersion> data = null;

  public ListQueryLambdaVersionsResponse data(List<QueryLambdaVersion> data) {
    this.data = data;
    return this;
  }

  public ListQueryLambdaVersionsResponse addDataItem(QueryLambdaVersion dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<QueryLambdaVersion>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * list of all versions for a particular Query Lambda
   * @return data
  **/

@JsonProperty("data")
@ApiModelProperty(value = "list of all versions for a particular Query Lambda")
  public List<QueryLambdaVersion> getData() {
    return data;
  }

  public void setData(List<QueryLambdaVersion> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListQueryLambdaVersionsResponse listQueryLambdaVersionsResponse = (ListQueryLambdaVersionsResponse) o;
    return Objects.equals(this.data, listQueryLambdaVersionsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListQueryLambdaVersionsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

