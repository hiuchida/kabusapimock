package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RankingDefaultResponseRanking
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class RankingDefaultResponseRanking   {
  @JsonProperty("No")
  private Integer no = null;

  @JsonProperty("Trend")
  private String trend = null;

  @JsonProperty("AverageRanking")
  private Double averageRanking = null;

  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("SymbolName")
  private String symbolName = null;

  @JsonProperty("CurrentPrice")
  private Double currentPrice = null;

  @JsonProperty("ChangeRatio")
  private Double changeRatio = null;

  @JsonProperty("ChangePercentage")
  private Double changePercentage = null;

  @JsonProperty("CurrentPriceTime")
  private String currentPriceTime = null;

  @JsonProperty("TradingVolume")
  private Double tradingVolume = null;

  @JsonProperty("Turnover")
  private Double turnover = null;

  @JsonProperty("ExchangeName")
  private String exchangeName = null;

  @JsonProperty("CategoryName")
  private String categoryName = null;

  public RankingDefaultResponseRanking no(Integer no) {
    this.no = no;
    return this;
  }

  /**
   * 順位<br>※ランキング内で同じ順位が返却される場合があります（10位が2件など）
   * @return no
   **/
  @Schema(description = "順位<br>※ランキング内で同じ順位が返却される場合があります（10位が2件など）")
  
    public Integer getNo() {
    return no;
  }

  public void setNo(Integer no) {
    this.no = no;
  }

  public RankingDefaultResponseRanking trend(String trend) {
    this.trend = trend;
    return this;
  }

  /**
   * トレンド <table>     <thead>         <tr>             <th>定義値</th>             <th>内容</th>         </tr>     </thead>     <tbody>         <tr>             <td>0</td>             <td>対象データ無し</td>         </tr>         <tr>             <td>1</td>             <td>過去10営業日より20位以上上昇</td>         </tr>         <tr>             <td>2</td>             <td>過去10営業日より1～19位上昇</td>         </tr>         <tr>             <td>3</td>             <td>過去10営業日と変わらず</td>         </tr>         <tr>             <td>4</td>             <td>過去10営業日より1～19位下落</td>         </tr>         <tr>             <td>5</td>             <td>過去10営業日より20位以上下落</td>         </tr>     </tbody> </table>
   * @return trend
   **/
  @Schema(description = "トレンド <table>     <thead>         <tr>             <th>定義値</th>             <th>内容</th>         </tr>     </thead>     <tbody>         <tr>             <td>0</td>             <td>対象データ無し</td>         </tr>         <tr>             <td>1</td>             <td>過去10営業日より20位以上上昇</td>         </tr>         <tr>             <td>2</td>             <td>過去10営業日より1～19位上昇</td>         </tr>         <tr>             <td>3</td>             <td>過去10営業日と変わらず</td>         </tr>         <tr>             <td>4</td>             <td>過去10営業日より1～19位下落</td>         </tr>         <tr>             <td>5</td>             <td>過去10営業日より20位以上下落</td>         </tr>     </tbody> </table>")
  
    public String getTrend() {
    return trend;
  }

  public void setTrend(String trend) {
    this.trend = trend;
  }

  public RankingDefaultResponseRanking averageRanking(Double averageRanking) {
    this.averageRanking = averageRanking;
    return this;
  }

  /**
   * 平均順位<br>※100位以下は「999」となります
   * @return averageRanking
   **/
  @Schema(description = "平均順位<br>※100位以下は「999」となります")
  
    public Double getAverageRanking() {
    return averageRanking;
  }

  public void setAverageRanking(Double averageRanking) {
    this.averageRanking = averageRanking;
  }

  public RankingDefaultResponseRanking symbol(String symbol) {
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

  public RankingDefaultResponseRanking symbolName(String symbolName) {
    this.symbolName = symbolName;
    return this;
  }

  /**
   * 銘柄名称
   * @return symbolName
   **/
  @Schema(description = "銘柄名称")
  
    public String getSymbolName() {
    return symbolName;
  }

  public void setSymbolName(String symbolName) {
    this.symbolName = symbolName;
  }

  public RankingDefaultResponseRanking currentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

  /**
   * 現在値
   * @return currentPrice
   **/
  @Schema(description = "現在値")
  
    public Double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public RankingDefaultResponseRanking changeRatio(Double changeRatio) {
    this.changeRatio = changeRatio;
    return this;
  }

  /**
   * 前日比
   * @return changeRatio
   **/
  @Schema(description = "前日比")
  
    public Double getChangeRatio() {
    return changeRatio;
  }

  public void setChangeRatio(Double changeRatio) {
    this.changeRatio = changeRatio;
  }

  public RankingDefaultResponseRanking changePercentage(Double changePercentage) {
    this.changePercentage = changePercentage;
    return this;
  }

  /**
   * 騰落率（%）
   * @return changePercentage
   **/
  @Schema(description = "騰落率（%）")
  
    public Double getChangePercentage() {
    return changePercentage;
  }

  public void setChangePercentage(Double changePercentage) {
    this.changePercentage = changePercentage;
  }

  public RankingDefaultResponseRanking currentPriceTime(String currentPriceTime) {
    this.currentPriceTime = currentPriceTime;
    return this;
  }

  /**
   * 時刻<br>HH:mm<br>※日付は返しません
   * @return currentPriceTime
   **/
  @Schema(description = "時刻<br>HH:mm<br>※日付は返しません")
  
    public String getCurrentPriceTime() {
    return currentPriceTime;
  }

  public void setCurrentPriceTime(String currentPriceTime) {
    this.currentPriceTime = currentPriceTime;
  }

  public RankingDefaultResponseRanking tradingVolume(Double tradingVolume) {
    this.tradingVolume = tradingVolume;
    return this;
  }

  /**
   * 売買高
   * @return tradingVolume
   **/
  @Schema(description = "売買高")
  
    public Double getTradingVolume() {
    return tradingVolume;
  }

  public void setTradingVolume(Double tradingVolume) {
    this.tradingVolume = tradingVolume;
  }

  public RankingDefaultResponseRanking turnover(Double turnover) {
    this.turnover = turnover;
    return this;
  }

  /**
   * 売買代金
   * @return turnover
   **/
  @Schema(description = "売買代金")
  
    public Double getTurnover() {
    return turnover;
  }

  public void setTurnover(Double turnover) {
    this.turnover = turnover;
  }

  public RankingDefaultResponseRanking exchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

  /**
   * 市場名
   * @return exchangeName
   **/
  @Schema(description = "市場名")
  
    public String getExchangeName() {
    return exchangeName;
  }

  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }

  public RankingDefaultResponseRanking categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * 業種名
   * @return categoryName
   **/
  @Schema(description = "業種名")
  
    public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingDefaultResponseRanking rankingDefaultResponseRanking = (RankingDefaultResponseRanking) o;
    return Objects.equals(this.no, rankingDefaultResponseRanking.no) &&
        Objects.equals(this.trend, rankingDefaultResponseRanking.trend) &&
        Objects.equals(this.averageRanking, rankingDefaultResponseRanking.averageRanking) &&
        Objects.equals(this.symbol, rankingDefaultResponseRanking.symbol) &&
        Objects.equals(this.symbolName, rankingDefaultResponseRanking.symbolName) &&
        Objects.equals(this.currentPrice, rankingDefaultResponseRanking.currentPrice) &&
        Objects.equals(this.changeRatio, rankingDefaultResponseRanking.changeRatio) &&
        Objects.equals(this.changePercentage, rankingDefaultResponseRanking.changePercentage) &&
        Objects.equals(this.currentPriceTime, rankingDefaultResponseRanking.currentPriceTime) &&
        Objects.equals(this.tradingVolume, rankingDefaultResponseRanking.tradingVolume) &&
        Objects.equals(this.turnover, rankingDefaultResponseRanking.turnover) &&
        Objects.equals(this.exchangeName, rankingDefaultResponseRanking.exchangeName) &&
        Objects.equals(this.categoryName, rankingDefaultResponseRanking.categoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(no, trend, averageRanking, symbol, symbolName, currentPrice, changeRatio, changePercentage, currentPriceTime, tradingVolume, turnover, exchangeName, categoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingDefaultResponseRanking {\n");
    
    sb.append("    no: ").append(toIndentedString(no)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
    sb.append("    averageRanking: ").append(toIndentedString(averageRanking)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    changeRatio: ").append(toIndentedString(changeRatio)).append("\n");
    sb.append("    changePercentage: ").append(toIndentedString(changePercentage)).append("\n");
    sb.append("    currentPriceTime: ").append(toIndentedString(currentPriceTime)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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
