package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TokenSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class TokenSuccess   {
  @JsonProperty("ResultCode")
  private Integer resultCode = null;

  @JsonProperty("Token")
  private String token = null;

  public TokenSuccess resultCode(Integer resultCode) {
    this.resultCode = resultCode;
    return this;
  }

  /**
   * 結果コード<br>0が成功。それ以外はエラーコード。
   * @return resultCode
   **/
  @Schema(example = "0", description = "結果コード<br>0が成功。それ以外はエラーコード。")
  
    public Integer getResultCode() {
    return resultCode;
  }

  public void setResultCode(Integer resultCode) {
    this.resultCode = resultCode;
  }

  public TokenSuccess token(String token) {
    this.token = token;
    return this;
  }

  /**
   * APIトークン
   * @return token
   **/
  @Schema(example = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", description = "APIトークン")
  
    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenSuccess tokenSuccess = (TokenSuccess) o;
    return Objects.equals(this.resultCode, tokenSuccess.resultCode) &&
        Objects.equals(this.token, tokenSuccess.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultCode, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenSuccess {\n");
    
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
