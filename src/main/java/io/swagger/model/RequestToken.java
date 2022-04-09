package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestToken
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class RequestToken   {
  @JsonProperty("APIPassword")
  private String apIPassword = null;

  public RequestToken apIPassword(String apIPassword) {
    this.apIPassword = apIPassword;
    return this;
  }

  /**
   * APIパスワード
   * @return apIPassword
   **/
  @Schema(example = "xxxxxx", required = true, description = "APIパスワード")
      @NotNull

    public String getApIPassword() {
    return apIPassword;
  }

  public void setApIPassword(String apIPassword) {
    this.apIPassword = apIPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestToken requestToken = (RequestToken) o;
    return Objects.equals(this.apIPassword, requestToken.apIPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apIPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestToken {\n");
    
    sb.append("    apIPassword: ").append(toIndentedString(apIPassword)).append("\n");
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
