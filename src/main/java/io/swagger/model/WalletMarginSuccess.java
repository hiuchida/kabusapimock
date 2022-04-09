package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WalletMarginSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class WalletMarginSuccess   {
  @JsonProperty("MarginAccountWallet")
  private Double marginAccountWallet = null;

  @JsonProperty("DepositkeepRate")
  private Double depositkeepRate = null;

  @JsonProperty("ConsignmentDepositRate")
  private Double consignmentDepositRate = null;

  @JsonProperty("CashOfConsignmentDepositRate")
  private Double cashOfConsignmentDepositRate = null;

  public WalletMarginSuccess marginAccountWallet(Double marginAccountWallet) {
    this.marginAccountWallet = marginAccountWallet;
    return this;
  }

  /**
   * 信用新規可能額
   * @return marginAccountWallet
   **/
  @Schema(description = "信用新規可能額")
  
    public Double getMarginAccountWallet() {
    return marginAccountWallet;
  }

  public void setMarginAccountWallet(Double marginAccountWallet) {
    this.marginAccountWallet = marginAccountWallet;
  }

  public WalletMarginSuccess depositkeepRate(Double depositkeepRate) {
    this.depositkeepRate = depositkeepRate;
    return this;
  }

  /**
   * 保証金維持率<br>※銘柄指定の場合のみ<br>※銘柄が指定されなかった場合、0.0を返す。
   * @return depositkeepRate
   **/
  @Schema(description = "保証金維持率<br>※銘柄指定の場合のみ<br>※銘柄が指定されなかった場合、0.0を返す。")
  
    public Double getDepositkeepRate() {
    return depositkeepRate;
  }

  public void setDepositkeepRate(Double depositkeepRate) {
    this.depositkeepRate = depositkeepRate;
  }

  public WalletMarginSuccess consignmentDepositRate(Double consignmentDepositRate) {
    this.consignmentDepositRate = consignmentDepositRate;
    return this;
  }

  /**
   * 委託保証金率<br>※銘柄指定の場合のみ。<br>※銘柄が指定されなかった場合、Noneを返す。
   * @return consignmentDepositRate
   **/
  @Schema(description = "委託保証金率<br>※銘柄指定の場合のみ。<br>※銘柄が指定されなかった場合、Noneを返す。")
  
    public Double getConsignmentDepositRate() {
    return consignmentDepositRate;
  }

  public void setConsignmentDepositRate(Double consignmentDepositRate) {
    this.consignmentDepositRate = consignmentDepositRate;
  }

  public WalletMarginSuccess cashOfConsignmentDepositRate(Double cashOfConsignmentDepositRate) {
    this.cashOfConsignmentDepositRate = cashOfConsignmentDepositRate;
    return this;
  }

  /**
   * 現金委託保証金率<br>※銘柄指定の場合のみ。<br>※銘柄が指定されなかった場合、Noneを返す。
   * @return cashOfConsignmentDepositRate
   **/
  @Schema(description = "現金委託保証金率<br>※銘柄指定の場合のみ。<br>※銘柄が指定されなかった場合、Noneを返す。")
  
    public Double getCashOfConsignmentDepositRate() {
    return cashOfConsignmentDepositRate;
  }

  public void setCashOfConsignmentDepositRate(Double cashOfConsignmentDepositRate) {
    this.cashOfConsignmentDepositRate = cashOfConsignmentDepositRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletMarginSuccess walletMarginSuccess = (WalletMarginSuccess) o;
    return Objects.equals(this.marginAccountWallet, walletMarginSuccess.marginAccountWallet) &&
        Objects.equals(this.depositkeepRate, walletMarginSuccess.depositkeepRate) &&
        Objects.equals(this.consignmentDepositRate, walletMarginSuccess.consignmentDepositRate) &&
        Objects.equals(this.cashOfConsignmentDepositRate, walletMarginSuccess.cashOfConsignmentDepositRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marginAccountWallet, depositkeepRate, consignmentDepositRate, cashOfConsignmentDepositRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletMarginSuccess {\n");
    
    sb.append("    marginAccountWallet: ").append(toIndentedString(marginAccountWallet)).append("\n");
    sb.append("    depositkeepRate: ").append(toIndentedString(depositkeepRate)).append("\n");
    sb.append("    consignmentDepositRate: ").append(toIndentedString(consignmentDepositRate)).append("\n");
    sb.append("    cashOfConsignmentDepositRate: ").append(toIndentedString(cashOfConsignmentDepositRate)).append("\n");
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
