package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Input;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AkamaiNetStorageInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AkamaiNetStorageInput.class)
public class AkamaiNetStorageInput extends Input {
  @JsonProperty("host")
  private String host;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;


  /**
   * Host to use for Akamai NetStorage transfers (required)
   * @return host
   */
  public String getHost() {
    return host;
  }

  /**
   * Host to use for Akamai NetStorage transfers (required)
   *
   * @param host
   *        Host to use for Akamai NetStorage transfers (required)
   */
  public void setHost(String host) {
    this.host = host;
  }


  /**
   * Your Akamai NetStorage Username (required)
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Your Akamai NetStorage Username (required)
   *
   * @param username
   *        Your Akamai NetStorage Username (required)
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Your Akamai NetStorage password (required)
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Your Akamai NetStorage password (required)
   *
   * @param password
   *        Your Akamai NetStorage password (required)
   */
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AkamaiNetStorageInput akamaiNetStorageInput = (AkamaiNetStorageInput) o;
    return Objects.equals(this.host, akamaiNetStorageInput.host) &&
        Objects.equals(this.username, akamaiNetStorageInput.username) &&
        Objects.equals(this.password, akamaiNetStorageInput.password) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, username, password, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AkamaiNetStorageInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

