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
import com.rockset.client.model.Privilege;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-15T14:59:14.000-04:00")
public class Role {
  @SerializedName("role_name")
  private String roleName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("owner_email")
  private String ownerEmail = null;

  @SerializedName("created_by")
  private String createdBy = null;

  @SerializedName("privileges")
  private List<Privilege> privileges = null;

  @SerializedName("created_at")
  private String createdAt = null;

  public Role roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Unique identifier for the role.
   * @return roleName
  **/

@JsonProperty("role_name")
@ApiModelProperty(example = "read_write", value = "Unique identifier for the role.")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public Role description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for the role.
   * @return description
  **/

@JsonProperty("description")
@ApiModelProperty(example = "Role with read and write privileges to all collections.", value = "Description for the role.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Role ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

   /**
   * Email of the user who currently owns the role.
   * @return ownerEmail
  **/

@JsonProperty("owner_email")
@ApiModelProperty(example = "hello@rockset.com", value = "Email of the user who currently owns the role.")
  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public Role createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Email of the user who created the role.
   * @return createdBy
  **/

@JsonProperty("created_by")
@ApiModelProperty(example = "hello@rockset.com", value = "Email of the user who created the role.")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Role privileges(List<Privilege> privileges) {
    this.privileges = privileges;
    return this;
  }

  public Role addPrivilegesItem(Privilege privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<Privilege>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * List of privileges associated with the role.
   * @return privileges
  **/

@JsonProperty("privileges")
@ApiModelProperty(value = "List of privileges associated with the role.")
  public List<Privilege> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<Privilege> privileges) {
    this.privileges = privileges;
  }

  public Role createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO-8601 date of when the role was created.
   * @return createdAt
  **/

@JsonProperty("created_at")
@ApiModelProperty(example = "2001-08-28T00:23:41Z", value = "ISO-8601 date of when the role was created.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.roleName, role.roleName) &&
        Objects.equals(this.description, role.description) &&
        Objects.equals(this.ownerEmail, role.ownerEmail) &&
        Objects.equals(this.createdBy, role.createdBy) &&
        Objects.equals(this.privileges, role.privileges) &&
        Objects.equals(this.createdAt, role.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, description, ownerEmail, createdBy, privileges, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

