package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WalletCashSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class WalletCashSuccess   {
  @JsonProperty("StockAccountWallet")
  private Double stockAccountWallet = null;

  public WalletCashSuccess stockAccountWallet(Double stockAccountWallet) {
    this.stockAccountWallet = stockAccountWallet;
    return this;
  }

  /**
   * 現物買付可能額
   * @return stockAccountWallet
   **/
  @Schema(description = "現物買付可能額")
  
    public Double getStockAccountWallet() {
    return stockAccountWallet;
  }

  public void setStockAccountWallet(Double stockAccountWallet) {
    this.stockAccountWallet = stockAccountWallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCashSuccess walletCashSuccess = (WalletCashSuccess) o;
    return Objects.equals(this.stockAccountWallet, walletCashSuccess.stockAccountWallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockAccountWallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCashSuccess {\n");
    
    sb.append("    stockAccountWallet: ").append(toIndentedString(stockAccountWallet)).append("\n");
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
