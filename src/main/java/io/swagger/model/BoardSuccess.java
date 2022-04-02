package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BoardSuccessBuy1;
import io.swagger.model.BoardSuccessBuy10;
import io.swagger.model.BoardSuccessBuy2;
import io.swagger.model.BoardSuccessBuy3;
import io.swagger.model.BoardSuccessBuy4;
import io.swagger.model.BoardSuccessBuy5;
import io.swagger.model.BoardSuccessBuy6;
import io.swagger.model.BoardSuccessBuy7;
import io.swagger.model.BoardSuccessBuy8;
import io.swagger.model.BoardSuccessBuy9;
import io.swagger.model.BoardSuccessSell1;
import io.swagger.model.BoardSuccessSell10;
import io.swagger.model.BoardSuccessSell2;
import io.swagger.model.BoardSuccessSell3;
import io.swagger.model.BoardSuccessSell4;
import io.swagger.model.BoardSuccessSell5;
import io.swagger.model.BoardSuccessSell6;
import io.swagger.model.BoardSuccessSell7;
import io.swagger.model.BoardSuccessSell8;
import io.swagger.model.BoardSuccessSell9;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 下記にあるBIDとASKとは、トレーダー目線から見た場合の値であるため、BidPrice&#x3D;Sell1のPrice、AskPrice&#x3D;Buy1のPriceという数値となります。
 */
@Schema(description = "下記にあるBIDとASKとは、トレーダー目線から見た場合の値であるため、BidPrice=Sell1のPrice、AskPrice=Buy1のPriceという数値となります。")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class BoardSuccess   {
  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("SymbolName")
  private String symbolName = null;

  @JsonProperty("Exchange")
  private Integer exchange = null;

  @JsonProperty("ExchangeName")
  private String exchangeName = null;

  @JsonProperty("CurrentPrice")
  private Double currentPrice = null;

  @JsonProperty("CurrentPriceTime")
  private OffsetDateTime currentPriceTime = null;

  @JsonProperty("CurrentPriceChangeStatus")
  private String currentPriceChangeStatus = null;

  @JsonProperty("CurrentPriceStatus")
  private Integer currentPriceStatus = null;

  @JsonProperty("CalcPrice")
  private Double calcPrice = null;

  @JsonProperty("PreviousClose")
  private Double previousClose = null;

  @JsonProperty("PreviousCloseTime")
  private OffsetDateTime previousCloseTime = null;

  @JsonProperty("ChangePreviousClose")
  private Double changePreviousClose = null;

  @JsonProperty("ChangePreviousClosePer")
  private Double changePreviousClosePer = null;

  @JsonProperty("OpeningPrice")
  private Double openingPrice = null;

  @JsonProperty("OpeningPriceTime")
  private OffsetDateTime openingPriceTime = null;

  @JsonProperty("HighPrice")
  private Double highPrice = null;

  @JsonProperty("HighPriceTime")
  private OffsetDateTime highPriceTime = null;

  @JsonProperty("LowPrice")
  private Double lowPrice = null;

  @JsonProperty("LowPriceTime")
  private OffsetDateTime lowPriceTime = null;

  @JsonProperty("TradingVolume")
  private Double tradingVolume = null;

  @JsonProperty("TradingVolumeTime")
  private OffsetDateTime tradingVolumeTime = null;

  @JsonProperty("VWAP")
  private Double VWAP = null;

  @JsonProperty("TradingValue")
  private Double tradingValue = null;

  @JsonProperty("BidQty")
  private Double bidQty = null;

  @JsonProperty("BidPrice")
  private Double bidPrice = null;

  @JsonProperty("BidTime")
  private OffsetDateTime bidTime = null;

  @JsonProperty("BidSign")
  private String bidSign = null;

  @JsonProperty("MarketOrderSellQty")
  private Double marketOrderSellQty = null;

  @JsonProperty("Sell1")
  private BoardSuccessSell1 sell1 = null;

  @JsonProperty("Sell2")
  private BoardSuccessSell2 sell2 = null;

  @JsonProperty("Sell3")
  private BoardSuccessSell3 sell3 = null;

  @JsonProperty("Sell4")
  private BoardSuccessSell4 sell4 = null;

  @JsonProperty("Sell5")
  private BoardSuccessSell5 sell5 = null;

  @JsonProperty("Sell6")
  private BoardSuccessSell6 sell6 = null;

  @JsonProperty("Sell7")
  private BoardSuccessSell7 sell7 = null;

  @JsonProperty("Sell8")
  private BoardSuccessSell8 sell8 = null;

  @JsonProperty("Sell9")
  private BoardSuccessSell9 sell9 = null;

  @JsonProperty("Sell10")
  private BoardSuccessSell10 sell10 = null;

  @JsonProperty("AskQty")
  private Double askQty = null;

  @JsonProperty("AskPrice")
  private Double askPrice = null;

  @JsonProperty("AskTime")
  private OffsetDateTime askTime = null;

  @JsonProperty("AskSign")
  private String askSign = null;

  @JsonProperty("MarketOrderBuyQty")
  private Double marketOrderBuyQty = null;

  @JsonProperty("Buy1")
  private BoardSuccessBuy1 buy1 = null;

  @JsonProperty("Buy2")
  private BoardSuccessBuy2 buy2 = null;

  @JsonProperty("Buy3")
  private BoardSuccessBuy3 buy3 = null;

  @JsonProperty("Buy4")
  private BoardSuccessBuy4 buy4 = null;

  @JsonProperty("Buy5")
  private BoardSuccessBuy5 buy5 = null;

  @JsonProperty("Buy6")
  private BoardSuccessBuy6 buy6 = null;

  @JsonProperty("Buy7")
  private BoardSuccessBuy7 buy7 = null;

  @JsonProperty("Buy8")
  private BoardSuccessBuy8 buy8 = null;

  @JsonProperty("Buy9")
  private BoardSuccessBuy9 buy9 = null;

  @JsonProperty("Buy10")
  private BoardSuccessBuy10 buy10 = null;

  @JsonProperty("OverSellQty")
  private Double overSellQty = null;

  @JsonProperty("UnderBuyQty")
  private Double underBuyQty = null;

  @JsonProperty("TotalMarketValue")
  private Double totalMarketValue = null;

  @JsonProperty("ClearingPrice")
  private Double clearingPrice = null;

  @JsonProperty("IV")
  private Double IV = null;

  @JsonProperty("Gamma")
  private Double gamma = null;

  @JsonProperty("Theta")
  private Double theta = null;

  @JsonProperty("Vega")
  private Double vega = null;

  @JsonProperty("Delta")
  private Double delta = null;

  @JsonProperty("SecurityType")
  private Integer securityType = null;

  public BoardSuccess symbol(String symbol) {
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

  public BoardSuccess symbolName(String symbolName) {
    this.symbolName = symbolName;
    return this;
  }

  /**
   * 銘柄名
   * @return symbolName
   **/
  @Schema(description = "銘柄名")
  
    public String getSymbolName() {
    return symbolName;
  }

  public void setSymbolName(String symbolName) {
    this.symbolName = symbolName;
  }

  public BoardSuccess exchange(Integer exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * 市場コード<br>※株式・先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>
   * @return exchange
   **/
  @Schema(example = "1", description = "市場コード<br>※株式・先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>")
  
    public Integer getExchange() {
    return exchange;
  }

  public void setExchange(Integer exchange) {
    this.exchange = exchange;
  }

  public BoardSuccess exchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

  /**
   * 市場名称<br>※株式・先物・オプション銘柄の場合のみ
   * @return exchangeName
   **/
  @Schema(description = "市場名称<br>※株式・先物・オプション銘柄の場合のみ")
  
    public String getExchangeName() {
    return exchangeName;
  }

  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }

  public BoardSuccess currentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

  /**
   * 現値
   * @return currentPrice
   **/
  @Schema(description = "現値")
  
    public Double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public BoardSuccess currentPriceTime(OffsetDateTime currentPriceTime) {
    this.currentPriceTime = currentPriceTime;
    return this;
  }

  /**
   * 現値時刻
   * @return currentPriceTime
   **/
  @Schema(description = "現値時刻")
  
    @Valid
    public OffsetDateTime getCurrentPriceTime() {
    return currentPriceTime;
  }

  public void setCurrentPriceTime(OffsetDateTime currentPriceTime) {
    this.currentPriceTime = currentPriceTime;
  }

  public BoardSuccess currentPriceChangeStatus(String currentPriceChangeStatus) {
    this.currentPriceChangeStatus = currentPriceChangeStatus;
    return this;
  }

  /**
   * 現値前値比較 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0000</td>           <td>事象なし</td>       </tr>       <tr>           <td>0056</td>           <td>変わらず</td>       </tr>       <tr>           <td>0057</td>           <td>UP</td>       </tr>       <tr>           <td>0058</td>           <td>DOWN</td>       </tr>       <tr>           <td>0059</td>           <td>中断板寄り後の初値</td>       </tr>       <tr>           <td>0060</td>           <td>ザラバ引け</td>       </tr>       <tr>           <td>0061</td>           <td>板寄り引け</td>       </tr>       <tr>           <td>0062</td>           <td>中断引け</td>       </tr>       <tr>           <td>0063</td>           <td>ダウン引け</td>       </tr>       <tr>           <td>0064</td>           <td>逆転終値</td>       </tr>       <tr>           <td>0066</td>           <td>特別気配引け</td>       </tr>       <tr>           <td>0067</td>           <td>一時留保引け</td>       </tr>       <tr>           <td>0068</td>           <td>売買停止引け</td>       </tr>       <tr>           <td>0069</td>           <td>サーキットブレーカ引け</td>       </tr>       <tr>           <td>0431</td>           <td>ダイナミックサーキットブレーカ引け</td>       </tr>   </tbody> </table>
   * @return currentPriceChangeStatus
   **/
  @Schema(description = "現値前値比較 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0000</td>           <td>事象なし</td>       </tr>       <tr>           <td>0056</td>           <td>変わらず</td>       </tr>       <tr>           <td>0057</td>           <td>UP</td>       </tr>       <tr>           <td>0058</td>           <td>DOWN</td>       </tr>       <tr>           <td>0059</td>           <td>中断板寄り後の初値</td>       </tr>       <tr>           <td>0060</td>           <td>ザラバ引け</td>       </tr>       <tr>           <td>0061</td>           <td>板寄り引け</td>       </tr>       <tr>           <td>0062</td>           <td>中断引け</td>       </tr>       <tr>           <td>0063</td>           <td>ダウン引け</td>       </tr>       <tr>           <td>0064</td>           <td>逆転終値</td>       </tr>       <tr>           <td>0066</td>           <td>特別気配引け</td>       </tr>       <tr>           <td>0067</td>           <td>一時留保引け</td>       </tr>       <tr>           <td>0068</td>           <td>売買停止引け</td>       </tr>       <tr>           <td>0069</td>           <td>サーキットブレーカ引け</td>       </tr>       <tr>           <td>0431</td>           <td>ダイナミックサーキットブレーカ引け</td>       </tr>   </tbody> </table>")
  
    public String getCurrentPriceChangeStatus() {
    return currentPriceChangeStatus;
  }

  public void setCurrentPriceChangeStatus(String currentPriceChangeStatus) {
    this.currentPriceChangeStatus = currentPriceChangeStatus;
  }

  public BoardSuccess currentPriceStatus(Integer currentPriceStatus) {
    this.currentPriceStatus = currentPriceStatus;
    return this;
  }

  /**
   * 現値ステータス <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>現値</td>       </tr>       <tr>           <td>2</td>           <td>不連続歩み</td>       </tr>       <tr>           <td>3</td>           <td>板寄せ</td>       </tr>       <tr>           <td>4</td>           <td>システム障害</td>       </tr>       <tr>           <td>5</td>           <td>中断</td>       </tr>       <tr>           <td>6</td>           <td>売買停止</td>       </tr>       <tr>           <td>7</td>           <td>売買停止・システム停止解除</td>       </tr>       <tr>           <td>8</td>           <td>終値</td>       </tr>       <tr>           <td>9</td>           <td>システム停止</td>       </tr>       <tr>           <td>10</td>           <td>概算値</td>       </tr>       <tr>           <td>11</td>           <td>参考値</td>       </tr>       <tr>           <td>12</td>           <td>サーキットブレイク実施中</td>       </tr>       <tr>           <td>13</td>           <td>システム障害解除</td>       </tr>       <tr>           <td>14</td>           <td>サーキットブレイク解除</td>       </tr>       <tr>           <td>15</td>           <td>中断解除</td>       </tr>       <tr>           <td>16</td>           <td>一時留保中</td>       </tr>       <tr>           <td>17</td>           <td>一時留保解除</td>       </tr>       <tr>           <td>18</td>           <td>ファイル障害</td>       </tr>       <tr>           <td>19</td>           <td>ファイル障害解除</td>       </tr>       <tr>           <td>20</td>           <td>Spread/Strategy</td>       </tr>       <tr>           <td>21</td>           <td>ダイナミックサーキットブレイク発動</td>       </tr>       <tr>           <td>22</td>           <td>ダイナミックサーキットブレイク解除</td>       </tr>       <tr>           <td>23</td>           <td>板寄せ約定</td>       </tr>   </tbody> </table>
   * @return currentPriceStatus
   **/
  @Schema(description = "現値ステータス <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>現値</td>       </tr>       <tr>           <td>2</td>           <td>不連続歩み</td>       </tr>       <tr>           <td>3</td>           <td>板寄せ</td>       </tr>       <tr>           <td>4</td>           <td>システム障害</td>       </tr>       <tr>           <td>5</td>           <td>中断</td>       </tr>       <tr>           <td>6</td>           <td>売買停止</td>       </tr>       <tr>           <td>7</td>           <td>売買停止・システム停止解除</td>       </tr>       <tr>           <td>8</td>           <td>終値</td>       </tr>       <tr>           <td>9</td>           <td>システム停止</td>       </tr>       <tr>           <td>10</td>           <td>概算値</td>       </tr>       <tr>           <td>11</td>           <td>参考値</td>       </tr>       <tr>           <td>12</td>           <td>サーキットブレイク実施中</td>       </tr>       <tr>           <td>13</td>           <td>システム障害解除</td>       </tr>       <tr>           <td>14</td>           <td>サーキットブレイク解除</td>       </tr>       <tr>           <td>15</td>           <td>中断解除</td>       </tr>       <tr>           <td>16</td>           <td>一時留保中</td>       </tr>       <tr>           <td>17</td>           <td>一時留保解除</td>       </tr>       <tr>           <td>18</td>           <td>ファイル障害</td>       </tr>       <tr>           <td>19</td>           <td>ファイル障害解除</td>       </tr>       <tr>           <td>20</td>           <td>Spread/Strategy</td>       </tr>       <tr>           <td>21</td>           <td>ダイナミックサーキットブレイク発動</td>       </tr>       <tr>           <td>22</td>           <td>ダイナミックサーキットブレイク解除</td>       </tr>       <tr>           <td>23</td>           <td>板寄せ約定</td>       </tr>   </tbody> </table>")
  
    public Integer getCurrentPriceStatus() {
    return currentPriceStatus;
  }

  public void setCurrentPriceStatus(Integer currentPriceStatus) {
    this.currentPriceStatus = currentPriceStatus;
  }

  public BoardSuccess calcPrice(Double calcPrice) {
    this.calcPrice = calcPrice;
    return this;
  }

  /**
   * 計算用現値
   * @return calcPrice
   **/
  @Schema(description = "計算用現値")
  
    public Double getCalcPrice() {
    return calcPrice;
  }

  public void setCalcPrice(Double calcPrice) {
    this.calcPrice = calcPrice;
  }

  public BoardSuccess previousClose(Double previousClose) {
    this.previousClose = previousClose;
    return this;
  }

  /**
   * 前日終値
   * @return previousClose
   **/
  @Schema(description = "前日終値")
  
    public Double getPreviousClose() {
    return previousClose;
  }

  public void setPreviousClose(Double previousClose) {
    this.previousClose = previousClose;
  }

  public BoardSuccess previousCloseTime(OffsetDateTime previousCloseTime) {
    this.previousCloseTime = previousCloseTime;
    return this;
  }

  /**
   * 前日終値日付
   * @return previousCloseTime
   **/
  @Schema(description = "前日終値日付")
  
    @Valid
    public OffsetDateTime getPreviousCloseTime() {
    return previousCloseTime;
  }

  public void setPreviousCloseTime(OffsetDateTime previousCloseTime) {
    this.previousCloseTime = previousCloseTime;
  }

  public BoardSuccess changePreviousClose(Double changePreviousClose) {
    this.changePreviousClose = changePreviousClose;
    return this;
  }

  /**
   * 前日比
   * @return changePreviousClose
   **/
  @Schema(description = "前日比")
  
    public Double getChangePreviousClose() {
    return changePreviousClose;
  }

  public void setChangePreviousClose(Double changePreviousClose) {
    this.changePreviousClose = changePreviousClose;
  }

  public BoardSuccess changePreviousClosePer(Double changePreviousClosePer) {
    this.changePreviousClosePer = changePreviousClosePer;
    return this;
  }

  /**
   * 騰落率
   * @return changePreviousClosePer
   **/
  @Schema(description = "騰落率")
  
    public Double getChangePreviousClosePer() {
    return changePreviousClosePer;
  }

  public void setChangePreviousClosePer(Double changePreviousClosePer) {
    this.changePreviousClosePer = changePreviousClosePer;
  }

  public BoardSuccess openingPrice(Double openingPrice) {
    this.openingPrice = openingPrice;
    return this;
  }

  /**
   * 始値
   * @return openingPrice
   **/
  @Schema(description = "始値")
  
    public Double getOpeningPrice() {
    return openingPrice;
  }

  public void setOpeningPrice(Double openingPrice) {
    this.openingPrice = openingPrice;
  }

  public BoardSuccess openingPriceTime(OffsetDateTime openingPriceTime) {
    this.openingPriceTime = openingPriceTime;
    return this;
  }

  /**
   * 始値時刻
   * @return openingPriceTime
   **/
  @Schema(description = "始値時刻")
  
    @Valid
    public OffsetDateTime getOpeningPriceTime() {
    return openingPriceTime;
  }

  public void setOpeningPriceTime(OffsetDateTime openingPriceTime) {
    this.openingPriceTime = openingPriceTime;
  }

  public BoardSuccess highPrice(Double highPrice) {
    this.highPrice = highPrice;
    return this;
  }

  /**
   * 高値
   * @return highPrice
   **/
  @Schema(description = "高値")
  
    public Double getHighPrice() {
    return highPrice;
  }

  public void setHighPrice(Double highPrice) {
    this.highPrice = highPrice;
  }

  public BoardSuccess highPriceTime(OffsetDateTime highPriceTime) {
    this.highPriceTime = highPriceTime;
    return this;
  }

  /**
   * 高値時刻
   * @return highPriceTime
   **/
  @Schema(description = "高値時刻")
  
    @Valid
    public OffsetDateTime getHighPriceTime() {
    return highPriceTime;
  }

  public void setHighPriceTime(OffsetDateTime highPriceTime) {
    this.highPriceTime = highPriceTime;
  }

  public BoardSuccess lowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
    return this;
  }

  /**
   * 安値
   * @return lowPrice
   **/
  @Schema(description = "安値")
  
    public Double getLowPrice() {
    return lowPrice;
  }

  public void setLowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
  }

  public BoardSuccess lowPriceTime(OffsetDateTime lowPriceTime) {
    this.lowPriceTime = lowPriceTime;
    return this;
  }

  /**
   * 安値時刻
   * @return lowPriceTime
   **/
  @Schema(description = "安値時刻")
  
    @Valid
    public OffsetDateTime getLowPriceTime() {
    return lowPriceTime;
  }

  public void setLowPriceTime(OffsetDateTime lowPriceTime) {
    this.lowPriceTime = lowPriceTime;
  }

  public BoardSuccess tradingVolume(Double tradingVolume) {
    this.tradingVolume = tradingVolume;
    return this;
  }

  /**
   * 売買高<br>※株式・先物・オプション銘柄の場合のみ
   * @return tradingVolume
   **/
  @Schema(description = "売買高<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getTradingVolume() {
    return tradingVolume;
  }

  public void setTradingVolume(Double tradingVolume) {
    this.tradingVolume = tradingVolume;
  }

  public BoardSuccess tradingVolumeTime(OffsetDateTime tradingVolumeTime) {
    this.tradingVolumeTime = tradingVolumeTime;
    return this;
  }

  /**
   * 売買高時刻<br>※株式・先物・オプション銘柄の場合のみ
   * @return tradingVolumeTime
   **/
  @Schema(description = "売買高時刻<br>※株式・先物・オプション銘柄の場合のみ")
  
    @Valid
    public OffsetDateTime getTradingVolumeTime() {
    return tradingVolumeTime;
  }

  public void setTradingVolumeTime(OffsetDateTime tradingVolumeTime) {
    this.tradingVolumeTime = tradingVolumeTime;
  }

  public BoardSuccess VWAP(Double VWAP) {
    this.VWAP = VWAP;
    return this;
  }

  /**
   * 売買高加重平均価格（VWAP）<br>※株式・先物・オプション銘柄の場合のみ
   * @return VWAP
   **/
  @Schema(description = "売買高加重平均価格（VWAP）<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getVWAP() {
    return VWAP;
  }

  public void setVWAP(Double VWAP) {
    this.VWAP = VWAP;
  }

  public BoardSuccess tradingValue(Double tradingValue) {
    this.tradingValue = tradingValue;
    return this;
  }

  /**
   * 売買代金<br>※株式・先物・オプション銘柄の場合のみ
   * @return tradingValue
   **/
  @Schema(description = "売買代金<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getTradingValue() {
    return tradingValue;
  }

  public void setTradingValue(Double tradingValue) {
    this.tradingValue = tradingValue;
  }

  public BoardSuccess bidQty(Double bidQty) {
    this.bidQty = bidQty;
    return this;
  }

  /**
   * 最良売気配数量 ※①<br>※株式・先物・オプション銘柄の場合のみ
   * @return bidQty
   **/
  @Schema(description = "最良売気配数量 ※①<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getBidQty() {
    return bidQty;
  }

  public void setBidQty(Double bidQty) {
    this.bidQty = bidQty;
  }

  public BoardSuccess bidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

  /**
   * 最良売気配値段 ※①<br>※株式・先物・オプション銘柄の場合のみ
   * @return bidPrice
   **/
  @Schema(description = "最良売気配値段 ※①<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  public BoardSuccess bidTime(OffsetDateTime bidTime) {
    this.bidTime = bidTime;
    return this;
  }

  /**
   * 最良売気配時刻 ※①<br>※株式銘柄の場合のみ
   * @return bidTime
   **/
  @Schema(description = "最良売気配時刻 ※①<br>※株式銘柄の場合のみ")
  
    @Valid
    public OffsetDateTime getBidTime() {
    return bidTime;
  }

  public void setBidTime(OffsetDateTime bidTime) {
    this.bidTime = bidTime;
  }

  public BoardSuccess bidSign(String bidSign) {
    this.bidSign = bidSign;
    return this;
  }

  /**
   * 最良売気配フラグ ※①<br>※株式・先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0000</td>           <td>事象なし</td>       </tr>       <tr>           <td>0101</td>           <td>一般気配</td>       </tr>       <tr>           <td>0102</td>           <td>特別気配</td>       </tr>       <tr>           <td>0103</td>           <td>注意気配</td>       </tr>       <tr>           <td>0107</td>           <td>寄前気配</td>       </tr>       <tr>           <td>0108</td>           <td>停止前特別気配</td>       </tr>       <tr>           <td>0109</td>           <td>引け後気配</td>       </tr>       <tr>           <td>0116</td>           <td>寄前気配約定成立ポイントなし</td>       </tr>       <tr>           <td>0117</td>           <td>寄前気配約定成立ポイントあり</td>       </tr>       <tr>           <td>0118</td>           <td>連続約定気配</td>       </tr>       <tr>           <td>0119</td>           <td>停止前の連続約定気配</td>       </tr>       <tr>           <td>0120</td>           <td>買い上がり売り下がり中</td>       </tr>   </tbody> </table>
   * @return bidSign
   **/
  @Schema(description = "最良売気配フラグ ※①<br>※株式・先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0000</td>           <td>事象なし</td>       </tr>       <tr>           <td>0101</td>           <td>一般気配</td>       </tr>       <tr>           <td>0102</td>           <td>特別気配</td>       </tr>       <tr>           <td>0103</td>           <td>注意気配</td>       </tr>       <tr>           <td>0107</td>           <td>寄前気配</td>       </tr>       <tr>           <td>0108</td>           <td>停止前特別気配</td>       </tr>       <tr>           <td>0109</td>           <td>引け後気配</td>       </tr>       <tr>           <td>0116</td>           <td>寄前気配約定成立ポイントなし</td>       </tr>       <tr>           <td>0117</td>           <td>寄前気配約定成立ポイントあり</td>       </tr>       <tr>           <td>0118</td>           <td>連続約定気配</td>       </tr>       <tr>           <td>0119</td>           <td>停止前の連続約定気配</td>       </tr>       <tr>           <td>0120</td>           <td>買い上がり売り下がり中</td>       </tr>   </tbody> </table>")
  
    public String getBidSign() {
    return bidSign;
  }

  public void setBidSign(String bidSign) {
    this.bidSign = bidSign;
  }

  public BoardSuccess marketOrderSellQty(Double marketOrderSellQty) {
    this.marketOrderSellQty = marketOrderSellQty;
    return this;
  }

  /**
   * 売成行数量<br>※株式銘柄の場合のみ
   * @return marketOrderSellQty
   **/
  @Schema(description = "売成行数量<br>※株式銘柄の場合のみ")
  
    public Double getMarketOrderSellQty() {
    return marketOrderSellQty;
  }

  public void setMarketOrderSellQty(Double marketOrderSellQty) {
    this.marketOrderSellQty = marketOrderSellQty;
  }

  public BoardSuccess sell1(BoardSuccessSell1 sell1) {
    this.sell1 = sell1;
    return this;
  }

  /**
   * Get sell1
   * @return sell1
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell1 getSell1() {
    return sell1;
  }

  public void setSell1(BoardSuccessSell1 sell1) {
    this.sell1 = sell1;
  }

  public BoardSuccess sell2(BoardSuccessSell2 sell2) {
    this.sell2 = sell2;
    return this;
  }

  /**
   * Get sell2
   * @return sell2
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell2 getSell2() {
    return sell2;
  }

  public void setSell2(BoardSuccessSell2 sell2) {
    this.sell2 = sell2;
  }

  public BoardSuccess sell3(BoardSuccessSell3 sell3) {
    this.sell3 = sell3;
    return this;
  }

  /**
   * Get sell3
   * @return sell3
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell3 getSell3() {
    return sell3;
  }

  public void setSell3(BoardSuccessSell3 sell3) {
    this.sell3 = sell3;
  }

  public BoardSuccess sell4(BoardSuccessSell4 sell4) {
    this.sell4 = sell4;
    return this;
  }

  /**
   * Get sell4
   * @return sell4
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell4 getSell4() {
    return sell4;
  }

  public void setSell4(BoardSuccessSell4 sell4) {
    this.sell4 = sell4;
  }

  public BoardSuccess sell5(BoardSuccessSell5 sell5) {
    this.sell5 = sell5;
    return this;
  }

  /**
   * Get sell5
   * @return sell5
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell5 getSell5() {
    return sell5;
  }

  public void setSell5(BoardSuccessSell5 sell5) {
    this.sell5 = sell5;
  }

  public BoardSuccess sell6(BoardSuccessSell6 sell6) {
    this.sell6 = sell6;
    return this;
  }

  /**
   * Get sell6
   * @return sell6
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell6 getSell6() {
    return sell6;
  }

  public void setSell6(BoardSuccessSell6 sell6) {
    this.sell6 = sell6;
  }

  public BoardSuccess sell7(BoardSuccessSell7 sell7) {
    this.sell7 = sell7;
    return this;
  }

  /**
   * Get sell7
   * @return sell7
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell7 getSell7() {
    return sell7;
  }

  public void setSell7(BoardSuccessSell7 sell7) {
    this.sell7 = sell7;
  }

  public BoardSuccess sell8(BoardSuccessSell8 sell8) {
    this.sell8 = sell8;
    return this;
  }

  /**
   * Get sell8
   * @return sell8
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell8 getSell8() {
    return sell8;
  }

  public void setSell8(BoardSuccessSell8 sell8) {
    this.sell8 = sell8;
  }

  public BoardSuccess sell9(BoardSuccessSell9 sell9) {
    this.sell9 = sell9;
    return this;
  }

  /**
   * Get sell9
   * @return sell9
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell9 getSell9() {
    return sell9;
  }

  public void setSell9(BoardSuccessSell9 sell9) {
    this.sell9 = sell9;
  }

  public BoardSuccess sell10(BoardSuccessSell10 sell10) {
    this.sell10 = sell10;
    return this;
  }

  /**
   * Get sell10
   * @return sell10
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessSell10 getSell10() {
    return sell10;
  }

  public void setSell10(BoardSuccessSell10 sell10) {
    this.sell10 = sell10;
  }

  public BoardSuccess askQty(Double askQty) {
    this.askQty = askQty;
    return this;
  }

  /**
   * 最良買気配数量 ※①<br>※株式・先物・オプション銘柄の場合のみ
   * @return askQty
   **/
  @Schema(description = "最良買気配数量 ※①<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getAskQty() {
    return askQty;
  }

  public void setAskQty(Double askQty) {
    this.askQty = askQty;
  }

  public BoardSuccess askPrice(Double askPrice) {
    this.askPrice = askPrice;
    return this;
  }

  /**
   * 最良買気配値段 ※①<br>※株式・先物・オプション銘柄の場合のみ
   * @return askPrice
   **/
  @Schema(description = "最良買気配値段 ※①<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  public BoardSuccess askTime(OffsetDateTime askTime) {
    this.askTime = askTime;
    return this;
  }

  /**
   * 最良買気配時刻 ※①<br>※株式銘柄の場合のみ
   * @return askTime
   **/
  @Schema(description = "最良買気配時刻 ※①<br>※株式銘柄の場合のみ")
  
    @Valid
    public OffsetDateTime getAskTime() {
    return askTime;
  }

  public void setAskTime(OffsetDateTime askTime) {
    this.askTime = askTime;
  }

  public BoardSuccess askSign(String askSign) {
    this.askSign = askSign;
    return this;
  }

  /**
   * 最良買気配フラグ ※①<br>※株式・先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0000</td>           <td>事象なし</td>       </tr>       <tr>           <td>0101</td>           <td>一般気配</td>       </tr>       <tr>           <td>0102</td>           <td>特別気配</td>       </tr>       <tr>           <td>0103</td>           <td>注意気配</td>       </tr>       <tr>           <td>0107</td>           <td>寄前気配</td>       </tr>       <tr>           <td>0108</td>           <td>停止前特別気配</td>       </tr>       <tr>           <td>0109</td>           <td>引け後気配</td>       </tr>       <tr>           <td>0116</td>           <td>寄前気配約定成立ポイントなし</td>       </tr>       <tr>           <td>0117</td>           <td>寄前気配約定成立ポイントあり</td>       </tr>       <tr>           <td>0118</td>           <td>連続約定気配</td>       </tr>       <tr>           <td>0119</td>           <td>停止前の連続約定気配</td>       </tr>       <tr>           <td>0120</td>           <td>買い上がり売り下がり中</td>       </tr>   </tbody> </table>
   * @return askSign
   **/
  @Schema(description = "最良買気配フラグ ※①<br>※株式・先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0000</td>           <td>事象なし</td>       </tr>       <tr>           <td>0101</td>           <td>一般気配</td>       </tr>       <tr>           <td>0102</td>           <td>特別気配</td>       </tr>       <tr>           <td>0103</td>           <td>注意気配</td>       </tr>       <tr>           <td>0107</td>           <td>寄前気配</td>       </tr>       <tr>           <td>0108</td>           <td>停止前特別気配</td>       </tr>       <tr>           <td>0109</td>           <td>引け後気配</td>       </tr>       <tr>           <td>0116</td>           <td>寄前気配約定成立ポイントなし</td>       </tr>       <tr>           <td>0117</td>           <td>寄前気配約定成立ポイントあり</td>       </tr>       <tr>           <td>0118</td>           <td>連続約定気配</td>       </tr>       <tr>           <td>0119</td>           <td>停止前の連続約定気配</td>       </tr>       <tr>           <td>0120</td>           <td>買い上がり売り下がり中</td>       </tr>   </tbody> </table>")
  
    public String getAskSign() {
    return askSign;
  }

  public void setAskSign(String askSign) {
    this.askSign = askSign;
  }

  public BoardSuccess marketOrderBuyQty(Double marketOrderBuyQty) {
    this.marketOrderBuyQty = marketOrderBuyQty;
    return this;
  }

  /**
   * 買成行数量<br>※株式銘柄の場合のみ
   * @return marketOrderBuyQty
   **/
  @Schema(description = "買成行数量<br>※株式銘柄の場合のみ")
  
    public Double getMarketOrderBuyQty() {
    return marketOrderBuyQty;
  }

  public void setMarketOrderBuyQty(Double marketOrderBuyQty) {
    this.marketOrderBuyQty = marketOrderBuyQty;
  }

  public BoardSuccess buy1(BoardSuccessBuy1 buy1) {
    this.buy1 = buy1;
    return this;
  }

  /**
   * Get buy1
   * @return buy1
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy1 getBuy1() {
    return buy1;
  }

  public void setBuy1(BoardSuccessBuy1 buy1) {
    this.buy1 = buy1;
  }

  public BoardSuccess buy2(BoardSuccessBuy2 buy2) {
    this.buy2 = buy2;
    return this;
  }

  /**
   * Get buy2
   * @return buy2
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy2 getBuy2() {
    return buy2;
  }

  public void setBuy2(BoardSuccessBuy2 buy2) {
    this.buy2 = buy2;
  }

  public BoardSuccess buy3(BoardSuccessBuy3 buy3) {
    this.buy3 = buy3;
    return this;
  }

  /**
   * Get buy3
   * @return buy3
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy3 getBuy3() {
    return buy3;
  }

  public void setBuy3(BoardSuccessBuy3 buy3) {
    this.buy3 = buy3;
  }

  public BoardSuccess buy4(BoardSuccessBuy4 buy4) {
    this.buy4 = buy4;
    return this;
  }

  /**
   * Get buy4
   * @return buy4
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy4 getBuy4() {
    return buy4;
  }

  public void setBuy4(BoardSuccessBuy4 buy4) {
    this.buy4 = buy4;
  }

  public BoardSuccess buy5(BoardSuccessBuy5 buy5) {
    this.buy5 = buy5;
    return this;
  }

  /**
   * Get buy5
   * @return buy5
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy5 getBuy5() {
    return buy5;
  }

  public void setBuy5(BoardSuccessBuy5 buy5) {
    this.buy5 = buy5;
  }

  public BoardSuccess buy6(BoardSuccessBuy6 buy6) {
    this.buy6 = buy6;
    return this;
  }

  /**
   * Get buy6
   * @return buy6
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy6 getBuy6() {
    return buy6;
  }

  public void setBuy6(BoardSuccessBuy6 buy6) {
    this.buy6 = buy6;
  }

  public BoardSuccess buy7(BoardSuccessBuy7 buy7) {
    this.buy7 = buy7;
    return this;
  }

  /**
   * Get buy7
   * @return buy7
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy7 getBuy7() {
    return buy7;
  }

  public void setBuy7(BoardSuccessBuy7 buy7) {
    this.buy7 = buy7;
  }

  public BoardSuccess buy8(BoardSuccessBuy8 buy8) {
    this.buy8 = buy8;
    return this;
  }

  /**
   * Get buy8
   * @return buy8
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy8 getBuy8() {
    return buy8;
  }

  public void setBuy8(BoardSuccessBuy8 buy8) {
    this.buy8 = buy8;
  }

  public BoardSuccess buy9(BoardSuccessBuy9 buy9) {
    this.buy9 = buy9;
    return this;
  }

  /**
   * Get buy9
   * @return buy9
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy9 getBuy9() {
    return buy9;
  }

  public void setBuy9(BoardSuccessBuy9 buy9) {
    this.buy9 = buy9;
  }

  public BoardSuccess buy10(BoardSuccessBuy10 buy10) {
    this.buy10 = buy10;
    return this;
  }

  /**
   * Get buy10
   * @return buy10
   **/
  @Schema(description = "")
  
    @Valid
    public BoardSuccessBuy10 getBuy10() {
    return buy10;
  }

  public void setBuy10(BoardSuccessBuy10 buy10) {
    this.buy10 = buy10;
  }

  public BoardSuccess overSellQty(Double overSellQty) {
    this.overSellQty = overSellQty;
    return this;
  }

  /**
   * OVER気配数量<br>※株式銘柄の場合のみ
   * @return overSellQty
   **/
  @Schema(description = "OVER気配数量<br>※株式銘柄の場合のみ")
  
    public Double getOverSellQty() {
    return overSellQty;
  }

  public void setOverSellQty(Double overSellQty) {
    this.overSellQty = overSellQty;
  }

  public BoardSuccess underBuyQty(Double underBuyQty) {
    this.underBuyQty = underBuyQty;
    return this;
  }

  /**
   * UNDER気配数量<br>※株式銘柄の場合のみ
   * @return underBuyQty
   **/
  @Schema(description = "UNDER気配数量<br>※株式銘柄の場合のみ")
  
    public Double getUnderBuyQty() {
    return underBuyQty;
  }

  public void setUnderBuyQty(Double underBuyQty) {
    this.underBuyQty = underBuyQty;
  }

  public BoardSuccess totalMarketValue(Double totalMarketValue) {
    this.totalMarketValue = totalMarketValue;
    return this;
  }

  /**
   * 時価総額<br>※株式銘柄の場合のみ
   * @return totalMarketValue
   **/
  @Schema(description = "時価総額<br>※株式銘柄の場合のみ")
  
    public Double getTotalMarketValue() {
    return totalMarketValue;
  }

  public void setTotalMarketValue(Double totalMarketValue) {
    this.totalMarketValue = totalMarketValue;
  }

  public BoardSuccess clearingPrice(Double clearingPrice) {
    this.clearingPrice = clearingPrice;
    return this;
  }

  /**
   * 清算値<br>※先物銘柄の場合のみ
   * @return clearingPrice
   **/
  @Schema(description = "清算値<br>※先物銘柄の場合のみ")
  
    public Double getClearingPrice() {
    return clearingPrice;
  }

  public void setClearingPrice(Double clearingPrice) {
    this.clearingPrice = clearingPrice;
  }

  public BoardSuccess IV(Double IV) {
    this.IV = IV;
    return this;
  }

  /**
   * インプライド・ボラティリティ<br>※オプション銘柄かつ日通しの場合のみ
   * @return IV
   **/
  @Schema(description = "インプライド・ボラティリティ<br>※オプション銘柄かつ日通しの場合のみ")
  
    public Double getIV() {
    return IV;
  }

  public void setIV(Double IV) {
    this.IV = IV;
  }

  public BoardSuccess gamma(Double gamma) {
    this.gamma = gamma;
    return this;
  }

  /**
   * ガンマ<br>※オプション銘柄かつ日通しの場合のみ
   * @return gamma
   **/
  @Schema(description = "ガンマ<br>※オプション銘柄かつ日通しの場合のみ")
  
    public Double getGamma() {
    return gamma;
  }

  public void setGamma(Double gamma) {
    this.gamma = gamma;
  }

  public BoardSuccess theta(Double theta) {
    this.theta = theta;
    return this;
  }

  /**
   * セータ<br>※オプション銘柄かつ日通しの場合のみ
   * @return theta
   **/
  @Schema(description = "セータ<br>※オプション銘柄かつ日通しの場合のみ")
  
    public Double getTheta() {
    return theta;
  }

  public void setTheta(Double theta) {
    this.theta = theta;
  }

  public BoardSuccess vega(Double vega) {
    this.vega = vega;
    return this;
  }

  /**
   * ベガ<br>※オプション銘柄かつ日通しの場合のみ
   * @return vega
   **/
  @Schema(description = "ベガ<br>※オプション銘柄かつ日通しの場合のみ")
  
    public Double getVega() {
    return vega;
  }

  public void setVega(Double vega) {
    this.vega = vega;
  }

  public BoardSuccess delta(Double delta) {
    this.delta = delta;
    return this;
  }

  /**
   * デルタ<br>※オプション銘柄かつ日通しの場合のみ
   * @return delta
   **/
  @Schema(description = "デルタ<br>※オプション銘柄かつ日通しの場合のみ")
  
    public Double getDelta() {
    return delta;
  }

  public void setDelta(Double delta) {
    this.delta = delta;
  }

  public BoardSuccess securityType(Integer securityType) {
    this.securityType = securityType;
    return this;
  }

  /**
   * 銘柄種別 <table>   <thead>     <tr>       <th>定義値</th>       <th>説明</th>     </tr>   </thead>   <tbody>     <tr>       <td>0</td>       <td>指数</td>     </tr>     <tr>       <td>1</td>       <td>現物</td>     </tr>     <tr>       <td>101</td>       <td>日経225先物</td>     </tr>     <tr>       <td>103</td>       <td>日経225OP</td>     </tr>     <tr>       <td>107</td>       <td>TOPIX先物</td>     </tr>     <tr>       <td>121</td>       <td>JPX400先物</td>     </tr>     <tr>       <td>144</td>       <td>NYダウ</td>     </tr>     <tr>       <td>145</td>       <td>日経平均VI</td>     </tr>     <tr>       <td>154</td>       <td>東証マザーズ指数先物</td>     </tr>     <tr>       <td>155</td>       <td>TOPIX_REIT</td>     </tr>     <tr>       <td>171</td>       <td>TOPIX CORE30</td>     </tr>     <tr>       <td>901</td>       <td>日経平均225ミニ先物</td>     </tr>     <tr>       <td>907</td>       <td>TOPIXミニ先物</td>     </tr>   </tbody> </table>
   * @return securityType
   **/
  @Schema(description = "銘柄種別 <table>   <thead>     <tr>       <th>定義値</th>       <th>説明</th>     </tr>   </thead>   <tbody>     <tr>       <td>0</td>       <td>指数</td>     </tr>     <tr>       <td>1</td>       <td>現物</td>     </tr>     <tr>       <td>101</td>       <td>日経225先物</td>     </tr>     <tr>       <td>103</td>       <td>日経225OP</td>     </tr>     <tr>       <td>107</td>       <td>TOPIX先物</td>     </tr>     <tr>       <td>121</td>       <td>JPX400先物</td>     </tr>     <tr>       <td>144</td>       <td>NYダウ</td>     </tr>     <tr>       <td>145</td>       <td>日経平均VI</td>     </tr>     <tr>       <td>154</td>       <td>東証マザーズ指数先物</td>     </tr>     <tr>       <td>155</td>       <td>TOPIX_REIT</td>     </tr>     <tr>       <td>171</td>       <td>TOPIX CORE30</td>     </tr>     <tr>       <td>901</td>       <td>日経平均225ミニ先物</td>     </tr>     <tr>       <td>907</td>       <td>TOPIXミニ先物</td>     </tr>   </tbody> </table>")
  
    public Integer getSecurityType() {
    return securityType;
  }

  public void setSecurityType(Integer securityType) {
    this.securityType = securityType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardSuccess boardSuccess = (BoardSuccess) o;
    return Objects.equals(this.symbol, boardSuccess.symbol) &&
        Objects.equals(this.symbolName, boardSuccess.symbolName) &&
        Objects.equals(this.exchange, boardSuccess.exchange) &&
        Objects.equals(this.exchangeName, boardSuccess.exchangeName) &&
        Objects.equals(this.currentPrice, boardSuccess.currentPrice) &&
        Objects.equals(this.currentPriceTime, boardSuccess.currentPriceTime) &&
        Objects.equals(this.currentPriceChangeStatus, boardSuccess.currentPriceChangeStatus) &&
        Objects.equals(this.currentPriceStatus, boardSuccess.currentPriceStatus) &&
        Objects.equals(this.calcPrice, boardSuccess.calcPrice) &&
        Objects.equals(this.previousClose, boardSuccess.previousClose) &&
        Objects.equals(this.previousCloseTime, boardSuccess.previousCloseTime) &&
        Objects.equals(this.changePreviousClose, boardSuccess.changePreviousClose) &&
        Objects.equals(this.changePreviousClosePer, boardSuccess.changePreviousClosePer) &&
        Objects.equals(this.openingPrice, boardSuccess.openingPrice) &&
        Objects.equals(this.openingPriceTime, boardSuccess.openingPriceTime) &&
        Objects.equals(this.highPrice, boardSuccess.highPrice) &&
        Objects.equals(this.highPriceTime, boardSuccess.highPriceTime) &&
        Objects.equals(this.lowPrice, boardSuccess.lowPrice) &&
        Objects.equals(this.lowPriceTime, boardSuccess.lowPriceTime) &&
        Objects.equals(this.tradingVolume, boardSuccess.tradingVolume) &&
        Objects.equals(this.tradingVolumeTime, boardSuccess.tradingVolumeTime) &&
        Objects.equals(this.VWAP, boardSuccess.VWAP) &&
        Objects.equals(this.tradingValue, boardSuccess.tradingValue) &&
        Objects.equals(this.bidQty, boardSuccess.bidQty) &&
        Objects.equals(this.bidPrice, boardSuccess.bidPrice) &&
        Objects.equals(this.bidTime, boardSuccess.bidTime) &&
        Objects.equals(this.bidSign, boardSuccess.bidSign) &&
        Objects.equals(this.marketOrderSellQty, boardSuccess.marketOrderSellQty) &&
        Objects.equals(this.sell1, boardSuccess.sell1) &&
        Objects.equals(this.sell2, boardSuccess.sell2) &&
        Objects.equals(this.sell3, boardSuccess.sell3) &&
        Objects.equals(this.sell4, boardSuccess.sell4) &&
        Objects.equals(this.sell5, boardSuccess.sell5) &&
        Objects.equals(this.sell6, boardSuccess.sell6) &&
        Objects.equals(this.sell7, boardSuccess.sell7) &&
        Objects.equals(this.sell8, boardSuccess.sell8) &&
        Objects.equals(this.sell9, boardSuccess.sell9) &&
        Objects.equals(this.sell10, boardSuccess.sell10) &&
        Objects.equals(this.askQty, boardSuccess.askQty) &&
        Objects.equals(this.askPrice, boardSuccess.askPrice) &&
        Objects.equals(this.askTime, boardSuccess.askTime) &&
        Objects.equals(this.askSign, boardSuccess.askSign) &&
        Objects.equals(this.marketOrderBuyQty, boardSuccess.marketOrderBuyQty) &&
        Objects.equals(this.buy1, boardSuccess.buy1) &&
        Objects.equals(this.buy2, boardSuccess.buy2) &&
        Objects.equals(this.buy3, boardSuccess.buy3) &&
        Objects.equals(this.buy4, boardSuccess.buy4) &&
        Objects.equals(this.buy5, boardSuccess.buy5) &&
        Objects.equals(this.buy6, boardSuccess.buy6) &&
        Objects.equals(this.buy7, boardSuccess.buy7) &&
        Objects.equals(this.buy8, boardSuccess.buy8) &&
        Objects.equals(this.buy9, boardSuccess.buy9) &&
        Objects.equals(this.buy10, boardSuccess.buy10) &&
        Objects.equals(this.overSellQty, boardSuccess.overSellQty) &&
        Objects.equals(this.underBuyQty, boardSuccess.underBuyQty) &&
        Objects.equals(this.totalMarketValue, boardSuccess.totalMarketValue) &&
        Objects.equals(this.clearingPrice, boardSuccess.clearingPrice) &&
        Objects.equals(this.IV, boardSuccess.IV) &&
        Objects.equals(this.gamma, boardSuccess.gamma) &&
        Objects.equals(this.theta, boardSuccess.theta) &&
        Objects.equals(this.vega, boardSuccess.vega) &&
        Objects.equals(this.delta, boardSuccess.delta) &&
        Objects.equals(this.securityType, boardSuccess.securityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, symbolName, exchange, exchangeName, currentPrice, currentPriceTime, currentPriceChangeStatus, currentPriceStatus, calcPrice, previousClose, previousCloseTime, changePreviousClose, changePreviousClosePer, openingPrice, openingPriceTime, highPrice, highPriceTime, lowPrice, lowPriceTime, tradingVolume, tradingVolumeTime, VWAP, tradingValue, bidQty, bidPrice, bidTime, bidSign, marketOrderSellQty, sell1, sell2, sell3, sell4, sell5, sell6, sell7, sell8, sell9, sell10, askQty, askPrice, askTime, askSign, marketOrderBuyQty, buy1, buy2, buy3, buy4, buy5, buy6, buy7, buy8, buy9, buy10, overSellQty, underBuyQty, totalMarketValue, clearingPrice, IV, gamma, theta, vega, delta, securityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardSuccess {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    currentPriceTime: ").append(toIndentedString(currentPriceTime)).append("\n");
    sb.append("    currentPriceChangeStatus: ").append(toIndentedString(currentPriceChangeStatus)).append("\n");
    sb.append("    currentPriceStatus: ").append(toIndentedString(currentPriceStatus)).append("\n");
    sb.append("    calcPrice: ").append(toIndentedString(calcPrice)).append("\n");
    sb.append("    previousClose: ").append(toIndentedString(previousClose)).append("\n");
    sb.append("    previousCloseTime: ").append(toIndentedString(previousCloseTime)).append("\n");
    sb.append("    changePreviousClose: ").append(toIndentedString(changePreviousClose)).append("\n");
    sb.append("    changePreviousClosePer: ").append(toIndentedString(changePreviousClosePer)).append("\n");
    sb.append("    openingPrice: ").append(toIndentedString(openingPrice)).append("\n");
    sb.append("    openingPriceTime: ").append(toIndentedString(openingPriceTime)).append("\n");
    sb.append("    highPrice: ").append(toIndentedString(highPrice)).append("\n");
    sb.append("    highPriceTime: ").append(toIndentedString(highPriceTime)).append("\n");
    sb.append("    lowPrice: ").append(toIndentedString(lowPrice)).append("\n");
    sb.append("    lowPriceTime: ").append(toIndentedString(lowPriceTime)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
    sb.append("    tradingVolumeTime: ").append(toIndentedString(tradingVolumeTime)).append("\n");
    sb.append("    VWAP: ").append(toIndentedString(VWAP)).append("\n");
    sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
    sb.append("    bidQty: ").append(toIndentedString(bidQty)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidTime: ").append(toIndentedString(bidTime)).append("\n");
    sb.append("    bidSign: ").append(toIndentedString(bidSign)).append("\n");
    sb.append("    marketOrderSellQty: ").append(toIndentedString(marketOrderSellQty)).append("\n");
    sb.append("    sell1: ").append(toIndentedString(sell1)).append("\n");
    sb.append("    sell2: ").append(toIndentedString(sell2)).append("\n");
    sb.append("    sell3: ").append(toIndentedString(sell3)).append("\n");
    sb.append("    sell4: ").append(toIndentedString(sell4)).append("\n");
    sb.append("    sell5: ").append(toIndentedString(sell5)).append("\n");
    sb.append("    sell6: ").append(toIndentedString(sell6)).append("\n");
    sb.append("    sell7: ").append(toIndentedString(sell7)).append("\n");
    sb.append("    sell8: ").append(toIndentedString(sell8)).append("\n");
    sb.append("    sell9: ").append(toIndentedString(sell9)).append("\n");
    sb.append("    sell10: ").append(toIndentedString(sell10)).append("\n");
    sb.append("    askQty: ").append(toIndentedString(askQty)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    askTime: ").append(toIndentedString(askTime)).append("\n");
    sb.append("    askSign: ").append(toIndentedString(askSign)).append("\n");
    sb.append("    marketOrderBuyQty: ").append(toIndentedString(marketOrderBuyQty)).append("\n");
    sb.append("    buy1: ").append(toIndentedString(buy1)).append("\n");
    sb.append("    buy2: ").append(toIndentedString(buy2)).append("\n");
    sb.append("    buy3: ").append(toIndentedString(buy3)).append("\n");
    sb.append("    buy4: ").append(toIndentedString(buy4)).append("\n");
    sb.append("    buy5: ").append(toIndentedString(buy5)).append("\n");
    sb.append("    buy6: ").append(toIndentedString(buy6)).append("\n");
    sb.append("    buy7: ").append(toIndentedString(buy7)).append("\n");
    sb.append("    buy8: ").append(toIndentedString(buy8)).append("\n");
    sb.append("    buy9: ").append(toIndentedString(buy9)).append("\n");
    sb.append("    buy10: ").append(toIndentedString(buy10)).append("\n");
    sb.append("    overSellQty: ").append(toIndentedString(overSellQty)).append("\n");
    sb.append("    underBuyQty: ").append(toIndentedString(underBuyQty)).append("\n");
    sb.append("    totalMarketValue: ").append(toIndentedString(totalMarketValue)).append("\n");
    sb.append("    clearingPrice: ").append(toIndentedString(clearingPrice)).append("\n");
    sb.append("    IV: ").append(toIndentedString(IV)).append("\n");
    sb.append("    gamma: ").append(toIndentedString(gamma)).append("\n");
    sb.append("    theta: ").append(toIndentedString(theta)).append("\n");
    sb.append("    vega: ").append(toIndentedString(vega)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
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
