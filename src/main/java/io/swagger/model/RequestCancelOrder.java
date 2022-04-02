package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestCancelOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class RequestCancelOrder   {
  @JsonProperty("OrderId")
  private String orderId = null;

  @JsonProperty("Password")
  private String password = null;

  public RequestCancelOrder orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * 注文番号<br>sendorderのレスポンスで受け取るOrderID。
   * @return orderId
   **/
  @Schema(example = "20200529A01N06848002", required = true, description = "注文番号<br>sendorderのレスポンスで受け取るOrderID。")
      @NotNull

    public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public RequestCancelOrder password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 注文パスワード
   * @return password
   **/
  @Schema(example = "xxxxxx", required = true, description = "注文パスワード")
      @NotNull

    public String getPassword() {
    return password;
  }

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
    RequestCancelOrder requestCancelOrder = (RequestCancelOrder) o;
    return Objects.equals(this.orderId, requestCancelOrder.orderId) &&
        Objects.equals(this.password, requestCancelOrder.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCancelOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
