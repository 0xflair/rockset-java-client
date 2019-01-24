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

/**
 * CsvParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-24T01:18:37.603Z")
public class CsvParams {
  @SerializedName("firstLineAsColumnNames")
  private Boolean firstLineAsColumnNames = null;

  @SerializedName("separator")
  private String separator = null;

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("columnNames")
  private List<String> columnNames = null;

  /**
   * Gets or Sets columnTypes
   */
  @JsonAdapter(ColumnTypesEnum.Adapter.class)
  public enum ColumnTypesEnum {
    UNKNOWN("UNKNOWN"),
    
    BOOLEAN("BOOLEAN"),
    
    INTEGER("INTEGER"),
    
    FLOAT("FLOAT"),
    
    TIME("TIME"),
    
    DATE("DATE"),
    
    DATETIME("DATETIME"),
    
    TIMESTAMP("TIMESTAMP"),
    
    STRING("STRING");

    private String value;

    ColumnTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColumnTypesEnum fromValue(String text) {
      for (ColumnTypesEnum b : ColumnTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColumnTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColumnTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColumnTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColumnTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("columnTypes")
  private List<ColumnTypesEnum> columnTypes = null;

  public CsvParams firstLineAsColumnNames(Boolean firstLineAsColumnNames) {
    this.firstLineAsColumnNames = firstLineAsColumnNames;
    return this;
  }

   /**
   * If the first line in every object specifies the column names
   * @return firstLineAsColumnNames
  **/
  @ApiModelProperty(example = "true", value = "If the first line in every object specifies the column names")
  public Boolean isFirstLineAsColumnNames() {
    return firstLineAsColumnNames;
  }

  public void setFirstLineAsColumnNames(Boolean firstLineAsColumnNames) {
    this.firstLineAsColumnNames = firstLineAsColumnNames;
  }

  public CsvParams separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * a single character that is the column seperator
   * @return separator
  **/
  @ApiModelProperty(example = ",", value = "a single character that is the column seperator")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public CsvParams encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * can be one of: UTF-8, ISO_8859_1, UTF-16
   * @return encoding
  **/
  @ApiModelProperty(example = "UTF-8", value = "can be one of: UTF-8, ISO_8859_1, UTF-16")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public CsvParams columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }

  public CsvParams addColumnNamesItem(String columnNamesItem) {
    if (this.columnNames == null) {
      this.columnNames = new ArrayList<String>();
    }
    this.columnNames.add(columnNamesItem);
    return this;
  }

   /**
   * names of columns
   * @return columnNames
  **/
  @ApiModelProperty(example = "\"[c1, c2, c3]\"", value = "names of columns")
  public List<String> getColumnNames() {
    return columnNames;
  }

  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  public CsvParams columnTypes(List<ColumnTypesEnum> columnTypes) {
    this.columnTypes = columnTypes;
    return this;
  }

  public CsvParams addColumnTypesItem(ColumnTypesEnum columnTypesItem) {
    if (this.columnTypes == null) {
      this.columnTypes = new ArrayList<ColumnTypesEnum>();
    }
    this.columnTypes.add(columnTypesItem);
    return this;
  }

   /**
   * names of columns
   * @return columnTypes
  **/
  @ApiModelProperty(example = "\"['BOOLEAN', 'INTEGER', 'FLOAT', 'STRING']\"", value = "names of columns")
  public List<ColumnTypesEnum> getColumnTypes() {
    return columnTypes;
  }

  public void setColumnTypes(List<ColumnTypesEnum> columnTypes) {
    this.columnTypes = columnTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvParams csvParams = (CsvParams) o;
    return Objects.equals(this.firstLineAsColumnNames, csvParams.firstLineAsColumnNames) &&
        Objects.equals(this.separator, csvParams.separator) &&
        Objects.equals(this.encoding, csvParams.encoding) &&
        Objects.equals(this.columnNames, csvParams.columnNames) &&
        Objects.equals(this.columnTypes, csvParams.columnTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstLineAsColumnNames, separator, encoding, columnNames, columnTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvParams {\n");
    
    sb.append("    firstLineAsColumnNames: ").append(toIndentedString(firstLineAsColumnNames)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    columnTypes: ").append(toIndentedString(columnTypes)).append("\n");
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

