package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WalletFutureSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class WalletFutureSuccess   {
  @JsonProperty("FutureTradeLimit")
  private Double futureTradeLimit = null;

  @JsonProperty("MarginRequirement")
  private Double marginRequirement = null;

  public WalletFutureSuccess futureTradeLimit(Double futureTradeLimit) {
    this.futureTradeLimit = futureTradeLimit;
    return this;
  }

  /**
   * 新規建玉可能額
   * @return futureTradeLimit
   **/
  @Schema(description = "新規建玉可能額")
  
    public Double getFutureTradeLimit() {
    return futureTradeLimit;
  }

  public void setFutureTradeLimit(Double futureTradeLimit) {
    this.futureTradeLimit = futureTradeLimit;
  }

  public WalletFutureSuccess marginRequirement(Double marginRequirement) {
    this.marginRequirement = marginRequirement;
    return this;
  }

  /**
   * 必要証拠金額<br>※銘柄指定の場合のみ。<br>※銘柄が指定されなかった場合、空を返す。
   * @return marginRequirement
   **/
  @Schema(description = "必要証拠金額<br>※銘柄指定の場合のみ。<br>※銘柄が指定されなかった場合、空を返す。")
  
    public Double getMarginRequirement() {
    return marginRequirement;
  }

  public void setMarginRequirement(Double marginRequirement) {
    this.marginRequirement = marginRequirement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletFutureSuccess walletFutureSuccess = (WalletFutureSuccess) o;
    return Objects.equals(this.futureTradeLimit, walletFutureSuccess.futureTradeLimit) &&
        Objects.equals(this.marginRequirement, walletFutureSuccess.marginRequirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(futureTradeLimit, marginRequirement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletFutureSuccess {\n");
    
    sb.append("    futureTradeLimit: ").append(toIndentedString(futureTradeLimit)).append("\n");
    sb.append("    marginRequirement: ").append(toIndentedString(marginRequirement)).append("\n");
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
