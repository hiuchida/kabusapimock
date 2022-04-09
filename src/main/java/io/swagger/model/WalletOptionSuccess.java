package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WalletOptionSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class WalletOptionSuccess   {
  @JsonProperty("OptionBuyTradeLimit")
  private Double optionBuyTradeLimit = null;

  @JsonProperty("OptionSellTradeLimit")
  private Double optionSellTradeLimit = null;

  @JsonProperty("MarginRequirement")
  private Double marginRequirement = null;

  public WalletOptionSuccess optionBuyTradeLimit(Double optionBuyTradeLimit) {
    this.optionBuyTradeLimit = optionBuyTradeLimit;
    return this;
  }

  /**
   * 買新規建玉可能額
   * @return optionBuyTradeLimit
   **/
  @Schema(description = "買新規建玉可能額")
  
    public Double getOptionBuyTradeLimit() {
    return optionBuyTradeLimit;
  }

  public void setOptionBuyTradeLimit(Double optionBuyTradeLimit) {
    this.optionBuyTradeLimit = optionBuyTradeLimit;
  }

  public WalletOptionSuccess optionSellTradeLimit(Double optionSellTradeLimit) {
    this.optionSellTradeLimit = optionSellTradeLimit;
    return this;
  }

  /**
   * 売新規建玉可能額
   * @return optionSellTradeLimit
   **/
  @Schema(description = "売新規建玉可能額")
  
    public Double getOptionSellTradeLimit() {
    return optionSellTradeLimit;
  }

  public void setOptionSellTradeLimit(Double optionSellTradeLimit) {
    this.optionSellTradeLimit = optionSellTradeLimit;
  }

  public WalletOptionSuccess marginRequirement(Double marginRequirement) {
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
    WalletOptionSuccess walletOptionSuccess = (WalletOptionSuccess) o;
    return Objects.equals(this.optionBuyTradeLimit, walletOptionSuccess.optionBuyTradeLimit) &&
        Objects.equals(this.optionSellTradeLimit, walletOptionSuccess.optionSellTradeLimit) &&
        Objects.equals(this.marginRequirement, walletOptionSuccess.marginRequirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionBuyTradeLimit, optionSellTradeLimit, marginRequirement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletOptionSuccess {\n");
    
    sb.append("    optionBuyTradeLimit: ").append(toIndentedString(optionBuyTradeLimit)).append("\n");
    sb.append("    optionSellTradeLimit: ").append(toIndentedString(optionSellTradeLimit)).append("\n");
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
