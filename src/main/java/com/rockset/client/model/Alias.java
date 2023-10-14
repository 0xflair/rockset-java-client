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
 * Alias
 */
// @javax.annotation.Generated(value =
// "io.swagger.codegen.languages.JavaClientCodegen", date =
// "2023-09-19T15:55:29.974-07:00")
public class Alias {
  @SerializedName("collections")
  private List<String> collections = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("created_by_apikey_name")
  private String createdByApikeyName = null;

  @SerializedName("creator_email")
  private String creatorEmail = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("modified_at")
  private String modifiedAt = null;

  @SerializedName("name")
  private String name = null;

  /**
   * State of the alias.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    CREATED("CREATED"),

    DELETED("DELETED");

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

    @com.fasterxml.jackson.annotation.JsonCreator
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

  @SerializedName("workspace")
  private String workspace = null;

  public Alias collections(List<String> collections) {
    this.collections = collections;
    return this;
  }

  public Alias addCollectionsItem(String collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<String>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

  /**
   * List of fully qualified collection names referenced by alias.
   * 
   * @return collections
   **/

  @JsonProperty("collections")
  @ApiModelProperty(example = "\"[\\\"commons.foo\\\", \\\"prod.demo\\\"]\"", value = "List of fully qualified collection names referenced by alias.")
  public List<String> getCollections() {
    return collections;
  }

  public void setCollections(List<String> collections) {
    this.collections = collections;
  }

  public Alias createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * ISO-8601 date.
   * 
   * @return createdAt
   **/

  @JsonProperty("created_at")
  @ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Alias createdByApikeyName(String createdByApikeyName) {
    this.createdByApikeyName = createdByApikeyName;
    return this;
  }

  /**
   * Name of the API key that was used to create this object if one was used.
   * 
   * @return createdByApikeyName
   **/

  @JsonProperty("created_by_apikey_name")
  @ApiModelProperty(value = "Name of the API key that was used to create this object if one was used.")
  public String getCreatedByApikeyName() {
    return createdByApikeyName;
  }

  public void setCreatedByApikeyName(String createdByApikeyName) {
    this.createdByApikeyName = createdByApikeyName;
  }

  public Alias creatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
    return this;
  }

  /**
   * Email of the creator.
   * 
   * @return creatorEmail
   **/

  @JsonProperty("creator_email")
  @ApiModelProperty(example = "xyz@rockset.com", value = "Email of the creator.")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  public Alias description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Alias description.
   * 
   * @return description
   **/

  @JsonProperty("description")
  @ApiModelProperty(example = "alias referencing collection in workspace", value = "Alias description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Alias modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * ISO-8601 date.
   * 
   * @return modifiedAt
   **/

  @JsonProperty("modified_at")
  @ApiModelProperty(example = "2001-08-28T00:23:42Z", value = "ISO-8601 date.")
  public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public Alias name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the alias.
   * 
   * @return name
   **/

  @JsonProperty("name")
  @ApiModelProperty(example = "demo", value = "Name of the alias.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Alias state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * State of the alias.
   * 
   * @return state
   **/

  @JsonProperty("state")
  @ApiModelProperty(example = "CREATED", value = "State of the alias.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Alias workspace(String workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Name of the workspace.
   * 
   * @return workspace
   **/

  @JsonProperty("workspace")
  @ApiModelProperty(example = "commons", value = "Name of the workspace.")
  public String getWorkspace() {
    return workspace;
  }

  public void setWorkspace(String workspace) {
    this.workspace = workspace;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alias alias = (Alias) o;
    return Objects.equals(this.collections, alias.collections) &&
        Objects.equals(this.createdAt, alias.createdAt) &&
        Objects.equals(this.createdByApikeyName, alias.createdByApikeyName) &&
        Objects.equals(this.creatorEmail, alias.creatorEmail) &&
        Objects.equals(this.description, alias.description) &&
        Objects.equals(this.modifiedAt, alias.modifiedAt) &&
        Objects.equals(this.name, alias.name) &&
        Objects.equals(this.state, alias.state) &&
        Objects.equals(this.workspace, alias.workspace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections, createdAt, createdByApikeyName, creatorEmail, description, modifiedAt, name, state,
        workspace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alias {\n");

    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByApikeyName: ").append(toIndentedString(createdByApikeyName)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
