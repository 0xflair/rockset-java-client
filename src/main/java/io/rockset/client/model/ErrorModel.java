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


package io.rockset.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.rockset.client.model.ErrorModelContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes details about an error
 */
@ApiModel(description = "Describes details about an error")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-27T21:04:28.359Z")
public class ErrorModel {
  @SerializedName("code")
  private Integer code = null;

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
    
    PROTOCOLERROR("PROTOCOLERROR"),
    
    RESOURCEEXCEEDED("RESOURCEEXCEEDED"),
    
    RESOURCENAMETOOLONG("RESOURCENAMETOOLONG"),
    
    ALREADYEXISTS("ALREADYEXISTS"),
    
    NOTFOUND("NOTFOUND"),
    
    DEPENDENTRESOURCES("DEPENDENTRESOURCES"),
    
    PAUSED("PAUSED"),
    
    QUERY_ERROR("QUERY_ERROR"),
    
    QUERY_PARSE_ERROR("QUERY_PARSE_ERROR"),
    
    NOT_READY("NOT_READY");

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

  @SerializedName("context")
  private ErrorModelContext context = null;

  public ErrorModel code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * HTTP status code
   * @return code
  **/
  @ApiModelProperty(example = "404", value = "HTTP status code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ErrorModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * descriptive message about the error
   * @return message
  **/
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
  @ApiModelProperty(example = "InvalidInput", value = "category of the error")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ErrorModel context(ErrorModelContext context) {
    this.context = context;
    return this;
  }

   /**
   * additional error information
   * @return context
  **/
  @ApiModelProperty(value = "additional error information")
  public ErrorModelContext getContext() {
    return context;
  }

  public void setContext(ErrorModelContext context) {
    this.context = context;
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
    return Objects.equals(this.code, errorModel.code) &&
        Objects.equals(this.message, errorModel.message) &&
        Objects.equals(this.type, errorModel.type) &&
        Objects.equals(this.context, errorModel.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, type, context);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

