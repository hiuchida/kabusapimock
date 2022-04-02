package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 一般信用（デイトレ）
 */
@Schema(description = "一般信用（デイトレ）")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class MarginPremiumResponseDayTrade   {
  @JsonProperty("MarginPremiumType")
  private Integer marginPremiumType = null;

  @JsonProperty("MarginPremium")
  private Double marginPremium = null;

  @JsonProperty("UpperMarginPremium")
  private Double upperMarginPremium = null;

  @JsonProperty("LowerMarginPremium")
  private Double lowerMarginPremium = null;

  @JsonProperty("TickMarginPremium")
  private Double tickMarginPremium = null;

  public MarginPremiumResponseDayTrade marginPremiumType(Integer marginPremiumType) {
    this.marginPremiumType = marginPremiumType;
    return this;
  }

  /**
   * プレミアム料入力区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>null</td>           <td>一般信用（デイトレ）非対応銘柄</td>       </tr>       <tr>           <td>0</td>           <td>プレミアム料がない銘柄</td>       </tr>       <tr>           <td>1</td>           <td>プレミアム料が固定の銘柄</td>       </tr>       <tr>           <td>2</td>           <td>プレミアム料が入札で決定する銘柄</td>       </tr>   </tbody> </table>
   * @return marginPremiumType
   **/
  @Schema(description = "プレミアム料入力区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>null</td>           <td>一般信用（デイトレ）非対応銘柄</td>       </tr>       <tr>           <td>0</td>           <td>プレミアム料がない銘柄</td>       </tr>       <tr>           <td>1</td>           <td>プレミアム料が固定の銘柄</td>       </tr>       <tr>           <td>2</td>           <td>プレミアム料が入札で決定する銘柄</td>       </tr>   </tbody> </table>")
  
    public Integer getMarginPremiumType() {
    return marginPremiumType;
  }

  public void setMarginPremiumType(Integer marginPremiumType) {
    this.marginPremiumType = marginPremiumType;
  }

  public MarginPremiumResponseDayTrade marginPremium(Double marginPremium) {
    this.marginPremium = marginPremium;
    return this;
  }

  /**
   * 確定プレミアム料<br> ※入札銘柄の場合、入札受付中は随時更新します。受付時間外は、確定したプレミアム料を返します。<br> ※非入札銘柄の場合、常に固定値を返します。<br> ※信用取引不可の場合、nullを返します。<br> ※19:30~翌営業日のプレミアム料になります。
   * @return marginPremium
   **/
  @Schema(description = "確定プレミアム料<br> ※入札銘柄の場合、入札受付中は随時更新します。受付時間外は、確定したプレミアム料を返します。<br> ※非入札銘柄の場合、常に固定値を返します。<br> ※信用取引不可の場合、nullを返します。<br> ※19:30~翌営業日のプレミアム料になります。")
  
    public Double getMarginPremium() {
    return marginPremium;
  }

  public void setMarginPremium(Double marginPremium) {
    this.marginPremium = marginPremium;
  }

  public MarginPremiumResponseDayTrade upperMarginPremium(Double upperMarginPremium) {
    this.upperMarginPremium = upperMarginPremium;
    return this;
  }

  /**
   * 上限プレミアム料<br> ※プレミアム料がない場合は、nullを返します。
   * @return upperMarginPremium
   **/
  @Schema(description = "上限プレミアム料<br> ※プレミアム料がない場合は、nullを返します。")
  
    public Double getUpperMarginPremium() {
    return upperMarginPremium;
  }

  public void setUpperMarginPremium(Double upperMarginPremium) {
    this.upperMarginPremium = upperMarginPremium;
  }

  public MarginPremiumResponseDayTrade lowerMarginPremium(Double lowerMarginPremium) {
    this.lowerMarginPremium = lowerMarginPremium;
    return this;
  }

  /**
   * 下限プレミアム料<br> ※プレミアム料がない場合は、nullを返します。
   * @return lowerMarginPremium
   **/
  @Schema(description = "下限プレミアム料<br> ※プレミアム料がない場合は、nullを返します。")
  
    public Double getLowerMarginPremium() {
    return lowerMarginPremium;
  }

  public void setLowerMarginPremium(Double lowerMarginPremium) {
    this.lowerMarginPremium = lowerMarginPremium;
  }

  public MarginPremiumResponseDayTrade tickMarginPremium(Double tickMarginPremium) {
    this.tickMarginPremium = tickMarginPremium;
    return this;
  }

  /**
   * プレミアム料刻値<br> ※入札可能銘柄以外は、nullを返します。
   * @return tickMarginPremium
   **/
  @Schema(description = "プレミアム料刻値<br> ※入札可能銘柄以外は、nullを返します。")
  
    public Double getTickMarginPremium() {
    return tickMarginPremium;
  }

  public void setTickMarginPremium(Double tickMarginPremium) {
    this.tickMarginPremium = tickMarginPremium;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginPremiumResponseDayTrade marginPremiumResponseDayTrade = (MarginPremiumResponseDayTrade) o;
    return Objects.equals(this.marginPremiumType, marginPremiumResponseDayTrade.marginPremiumType) &&
        Objects.equals(this.marginPremium, marginPremiumResponseDayTrade.marginPremium) &&
        Objects.equals(this.upperMarginPremium, marginPremiumResponseDayTrade.upperMarginPremium) &&
        Objects.equals(this.lowerMarginPremium, marginPremiumResponseDayTrade.lowerMarginPremium) &&
        Objects.equals(this.tickMarginPremium, marginPremiumResponseDayTrade.tickMarginPremium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marginPremiumType, marginPremium, upperMarginPremium, lowerMarginPremium, tickMarginPremium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginPremiumResponseDayTrade {\n");
    
    sb.append("    marginPremiumType: ").append(toIndentedString(marginPremiumType)).append("\n");
    sb.append("    marginPremium: ").append(toIndentedString(marginPremium)).append("\n");
    sb.append("    upperMarginPremium: ").append(toIndentedString(upperMarginPremium)).append("\n");
    sb.append("    lowerMarginPremium: ").append(toIndentedString(lowerMarginPremium)).append("\n");
    sb.append("    tickMarginPremium: ").append(toIndentedString(tickMarginPremium)).append("\n");
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
