package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class OrderSuccess   {
  @JsonProperty("Result")
  private Integer result = null;

  @JsonProperty("OrderId")
  private String orderId = null;

  public OrderSuccess result(Integer result) {
    this.result = result;
    return this;
  }

  /**
   * 結果コード<br>0が成功。それ以外はエラーコード。
   * @return result
   **/
  @Schema(example = "0", description = "結果コード<br>0が成功。それ以外はエラーコード。")
  
    public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public OrderSuccess orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * 受付注文番号
   * @return orderId
   **/
  @Schema(example = "20200529A01N06848002", description = "受付注文番号")
  
    public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSuccess orderSuccess = (OrderSuccess) o;
    return Objects.equals(this.result, orderSuccess.result) &&
        Objects.equals(this.orderId, orderSuccess.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, orderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSuccess {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
