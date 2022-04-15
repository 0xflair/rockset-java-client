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
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldPartition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-15T14:59:14.000-04:00")
public class FieldPartition {
  @SerializedName("field_name")
  private String fieldName = null;

  /**
   * The type of partitions on a field
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AUTO("AUTO");

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

  @SerializedName("keys")
  private List<String> keys = null;

  public FieldPartition fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * The name of a field, parsed as a SQL qualified name
   * @return fieldName
  **/

@JsonProperty("field_name")
@ApiModelProperty(example = "address.city.zipcode", value = "The name of a field, parsed as a SQL qualified name")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public FieldPartition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of partitions on a field
   * @return type
  **/

@JsonProperty("type")
@ApiModelProperty(example = "AUTO", value = "The type of partitions on a field")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FieldPartition keys(List<String> keys) {
    this.keys = keys;
    return this;
  }

  public FieldPartition addKeysItem(String keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<String>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * The values for partitioning of a field. Unneeded if the partition type is AUTO.
   * @return keys
  **/

@JsonProperty("keys")
@ApiModelProperty(example = "\"[\\\"value1\\\", \\\"value2\\\"]\"", value = "The values for partitioning of a field. Unneeded if the partition type is AUTO.")
  public List<String> getKeys() {
    return keys;
  }

  public void setKeys(List<String> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldPartition fieldPartition = (FieldPartition) o;
    return Objects.equals(this.fieldName, fieldPartition.fieldName) &&
        Objects.equals(this.type, fieldPartition.type) &&
        Objects.equals(this.keys, fieldPartition.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, type, keys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPartition {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

