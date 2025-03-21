package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PasswordUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-04T01:38:26.979545200-05:00[America/Bogota]")
public class PasswordUpdate {

  @JsonProperty("currentPassword")
  private String currentPassword;

  @JsonProperty("newPassword")
  private String newPassword;

  public PasswordUpdate currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

  /**
   * Contraseña actual del usuario
   * @return currentPassword
  */
  @NotNull 
  @Schema(name = "currentPassword", description = "Contraseña actual del usuario", required = true)
  public String getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  public PasswordUpdate newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * Debe contener al menos un dígito, una minúscula y una mayúscula.
   * @return newPassword
  */
  @NotNull @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*$") @Size(min = 8) 
  @Schema(name = "newPassword", description = "Debe contener al menos un dígito, una minúscula y una mayúscula.", required = true)
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordUpdate passwordUpdate = (PasswordUpdate) o;
    return Objects.equals(this.currentPassword, passwordUpdate.currentPassword) &&
        Objects.equals(this.newPassword, passwordUpdate.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordUpdate {\n");
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

