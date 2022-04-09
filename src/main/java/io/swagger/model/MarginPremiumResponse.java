package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MarginPremiumResponseDayTrade;
import io.swagger.model.MarginPremiumResponseGeneralMargin;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MarginPremiumResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class MarginPremiumResponse   {
  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("GeneralMargin")
  private MarginPremiumResponseGeneralMargin generalMargin = null;

  @JsonProperty("DayTrade")
  private MarginPremiumResponseDayTrade dayTrade = null;

  public MarginPremiumResponse symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * 銘柄コード
   * @return symbol
   **/
  @Schema(description = "銘柄コード")
  
    public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public MarginPremiumResponse generalMargin(MarginPremiumResponseGeneralMargin generalMargin) {
    this.generalMargin = generalMargin;
    return this;
  }

  /**
   * Get generalMargin
   * @return generalMargin
   **/
  @Schema(description = "")
  
    @Valid
    public MarginPremiumResponseGeneralMargin getGeneralMargin() {
    return generalMargin;
  }

  public void setGeneralMargin(MarginPremiumResponseGeneralMargin generalMargin) {
    this.generalMargin = generalMargin;
  }

  public MarginPremiumResponse dayTrade(MarginPremiumResponseDayTrade dayTrade) {
    this.dayTrade = dayTrade;
    return this;
  }

  /**
   * Get dayTrade
   * @return dayTrade
   **/
  @Schema(description = "")
  
    @Valid
    public MarginPremiumResponseDayTrade getDayTrade() {
    return dayTrade;
  }

  public void setDayTrade(MarginPremiumResponseDayTrade dayTrade) {
    this.dayTrade = dayTrade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginPremiumResponse marginPremiumResponse = (MarginPremiumResponse) o;
    return Objects.equals(this.symbol, marginPremiumResponse.symbol) &&
        Objects.equals(this.generalMargin, marginPremiumResponse.generalMargin) &&
        Objects.equals(this.dayTrade, marginPremiumResponse.dayTrade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, generalMargin, dayTrade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginPremiumResponse {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    generalMargin: ").append(toIndentedString(generalMargin)).append("\n");
    sb.append("    dayTrade: ").append(toIndentedString(dayTrade)).append("\n");
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
