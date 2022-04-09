package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PositionsDeriv;
import io.swagger.model.RequestSendOrderDerivFutureReverseLimitOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestSendOrderDerivFuture
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class RequestSendOrderDerivFuture   {
  @JsonProperty("Password")
  private String password = null;

  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("Exchange")
  private Integer exchange = null;

  @JsonProperty("TradeType")
  private Integer tradeType = null;

  @JsonProperty("TimeInForce")
  private Integer timeInForce = null;

  @JsonProperty("Side")
  private String side = null;

  @JsonProperty("Qty")
  private Integer qty = null;

  @JsonProperty("ClosePositionOrder")
  private Integer closePositionOrder = null;

  @JsonProperty("ClosePositions")
  @Valid
  private List<PositionsDeriv> closePositions = null;

  @JsonProperty("FrontOrderType")
  private Integer frontOrderType = null;

  @JsonProperty("Price")
  private Double price = null;

  @JsonProperty("ExpireDay")
  private Integer expireDay = null;

  @JsonProperty("ReverseLimitOrder")
  private RequestSendOrderDerivFutureReverseLimitOrder reverseLimitOrder = null;

  public RequestSendOrderDerivFuture password(String password) {
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

  public RequestSendOrderDerivFuture symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * 銘柄コード<br>※取引最終日に「先物銘柄コード取得」でDerivMonthに0（直近限月）を指定した場合、日中・夜間の時間帯に関わらず、取引最終日を迎える限月の銘柄コードを返します。取引最終日を迎える銘柄の取引は日中取引をもって終了となりますので、ご注意ください。
   * @return symbol
   **/
  @Schema(example = "165120019", required = true, description = "銘柄コード<br>※取引最終日に「先物銘柄コード取得」でDerivMonthに0（直近限月）を指定した場合、日中・夜間の時間帯に関わらず、取引最終日を迎える限月の銘柄コードを返します。取引最終日を迎える銘柄の取引は日中取引をもって終了となりますので、ご注意ください。")
      @NotNull

    public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public RequestSendOrderDerivFuture exchange(Integer exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * 市場コード <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>
   * @return exchange
   **/
  @Schema(required = true, description = "市場コード <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getExchange() {
    return exchange;
  }

  public void setExchange(Integer exchange) {
    this.exchange = exchange;
  }

  public RequestSendOrderDerivFuture tradeType(Integer tradeType) {
    this.tradeType = tradeType;
    return this;
  }

  /**
   * 取引区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>新規</td>       </tr>       <tr>           <td>2</td>           <td>返済</td>       </tr>   </tbody> </table>
   * @return tradeType
   **/
  @Schema(required = true, description = "取引区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>新規</td>       </tr>       <tr>           <td>2</td>           <td>返済</td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getTradeType() {
    return tradeType;
  }

  public void setTradeType(Integer tradeType) {
    this.tradeType = tradeType;
  }

  public RequestSendOrderDerivFuture timeInForce(Integer timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

  /**
   * 有効期間条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>FAS<br>※逆指値注文以外の場合、FASを指定した場合、FrontOrderTypeは指値(20)のみ指定可能。</td>       </tr>       <tr>           <td>2</td>           <td>FAK<br>※逆指値注文以外の場合、FAKを指定した場合、Exchangeは日中(23)、夜間(24)のみ指定可能。</td>       </tr>       <tr>           <td>3</td>           <td>FOK<br>※逆指値注文以外の場合、FOKを指定した場合、Exchangeは日中(23)、夜間(24)のみ指定可能。</td>       </tr>   </tbody> </table>
   * @return timeInForce
   **/
  @Schema(required = true, description = "有効期間条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>FAS<br>※逆指値注文以外の場合、FASを指定した場合、FrontOrderTypeは指値(20)のみ指定可能。</td>       </tr>       <tr>           <td>2</td>           <td>FAK<br>※逆指値注文以外の場合、FAKを指定した場合、Exchangeは日中(23)、夜間(24)のみ指定可能。</td>       </tr>       <tr>           <td>3</td>           <td>FOK<br>※逆指値注文以外の場合、FOKを指定した場合、Exchangeは日中(23)、夜間(24)のみ指定可能。</td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(Integer timeInForce) {
    this.timeInForce = timeInForce;
  }

  public RequestSendOrderDerivFuture side(String side) {
    this.side = side;
    return this;
  }

  /**
   * 売買区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>売</td>       </tr>       <tr>           <td>2</td>           <td>買</td>       </tr>   </tbody> </table>
   * @return side
   **/
  @Schema(required = true, description = "売買区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>売</td>       </tr>       <tr>           <td>2</td>           <td>買</td>       </tr>   </tbody> </table>")
      @NotNull

    public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public RequestSendOrderDerivFuture qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * 注文数量
   * @return qty
   **/
  @Schema(required = true, description = "注文数量")
      @NotNull

    public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public RequestSendOrderDerivFuture closePositionOrder(Integer closePositionOrder) {
    this.closePositionOrder = closePositionOrder;
    return this;
  }

  /**
   * 決済順序<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0</td>           <td>日付（古い順）、損益（高い順）</td>       </tr>       <tr>           <td>1</td>           <td>日付（古い順）、損益（低い順）</td>       </tr>       <tr>           <td>2</td>           <td>日付（新しい順）、損益（高い順）</td>       </tr>       <tr>           <td>3</td>           <td>日付（新しい順）、損益（低い順）</td>       </tr>       <tr>           <td>4</td>           <td>損益（高い順）、日付（古い順）</td>       </tr>       <tr>           <td>5</td>           <td>損益（高い順）、日付（新しい順）</td>       </tr>       <tr>           <td>6</td>           <td>損益（低い順）、日付（古い順）</td>       </tr>       <tr>           <td>7</td>           <td>損益（低い順）、日付（新しい順）</td>       </tr>   </tbody> </table>
   * @return closePositionOrder
   **/
  @Schema(description = "決済順序<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0</td>           <td>日付（古い順）、損益（高い順）</td>       </tr>       <tr>           <td>1</td>           <td>日付（古い順）、損益（低い順）</td>       </tr>       <tr>           <td>2</td>           <td>日付（新しい順）、損益（高い順）</td>       </tr>       <tr>           <td>3</td>           <td>日付（新しい順）、損益（低い順）</td>       </tr>       <tr>           <td>4</td>           <td>損益（高い順）、日付（古い順）</td>       </tr>       <tr>           <td>5</td>           <td>損益（高い順）、日付（新しい順）</td>       </tr>       <tr>           <td>6</td>           <td>損益（低い順）、日付（古い順）</td>       </tr>       <tr>           <td>7</td>           <td>損益（低い順）、日付（新しい順）</td>       </tr>   </tbody> </table>")
  
    public Integer getClosePositionOrder() {
    return closePositionOrder;
  }

  public void setClosePositionOrder(Integer closePositionOrder) {
    this.closePositionOrder = closePositionOrder;
  }

  public RequestSendOrderDerivFuture closePositions(List<PositionsDeriv> closePositions) {
    this.closePositions = closePositions;
    return this;
  }

  public RequestSendOrderDerivFuture addClosePositionsItem(PositionsDeriv closePositionsItem) {
    if (this.closePositions == null) {
      this.closePositions = new ArrayList<PositionsDeriv>();
    }
    this.closePositions.add(closePositionsItem);
    return this;
  }

  /**
   * 返済建玉指定<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。
   * @return closePositions
   **/
  @Schema(description = "返済建玉指定<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。")
      @Valid
    public List<PositionsDeriv> getClosePositions() {
    return closePositions;
  }

  public void setClosePositions(List<PositionsDeriv> closePositions) {
    this.closePositions = closePositions;
  }

  public RequestSendOrderDerivFuture frontOrderType(Integer frontOrderType) {
    this.frontOrderType = frontOrderType;
    return this;
  }

  /**
   * 執行条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>           <th>”Price”の指定</th>       </tr>   </thead>   <tbody>       <tr>           <td>18</td>           <td>引成（派生）<br>※TimeInForceは、「FAK」のみ有効</td>           <td>0</td>       </tr>       <tr>           <td>20</td>           <td>指値</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>28</td>           <td>引指（派生）<br>※TimeInForceは、「FAS」のみ有効</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>30</td>           <td>逆指値</td>           <td></td>       </tr>       <tr>           <td>120</td>           <td>成行（マーケットオーダー）</td>           <td>0</td>       </tr>   </tbody> </table>
   * @return frontOrderType
   **/
  @Schema(required = true, description = "執行条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>           <th>”Price”の指定</th>       </tr>   </thead>   <tbody>       <tr>           <td>18</td>           <td>引成（派生）<br>※TimeInForceは、「FAK」のみ有効</td>           <td>0</td>       </tr>       <tr>           <td>20</td>           <td>指値</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>28</td>           <td>引指（派生）<br>※TimeInForceは、「FAS」のみ有効</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>30</td>           <td>逆指値</td>           <td></td>       </tr>       <tr>           <td>120</td>           <td>成行（マーケットオーダー）</td>           <td>0</td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getFrontOrderType() {
    return frontOrderType;
  }

  public void setFrontOrderType(Integer frontOrderType) {
    this.frontOrderType = frontOrderType;
  }

  public RequestSendOrderDerivFuture price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * 注文価格<br>※FrontOrderTypeで成行を指定した場合、0を指定する。<br>※詳細について、”FrontOrderType”をご確認ください。
   * @return price
   **/
  @Schema(required = true, description = "注文価格<br>※FrontOrderTypeで成行を指定した場合、0を指定する。<br>※詳細について、”FrontOrderType”をご確認ください。")
      @NotNull

    public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public RequestSendOrderDerivFuture expireDay(Integer expireDay) {
    this.expireDay = expireDay;
    return this;
  }

  /**
   * 注文有効期限<br> yyyyMMdd形式。<br> 「0」を指定すると、kabuステーション上の発注画面の「本日」に対応する日付として扱います。<br> 「本日」は直近の注文可能日となり、以下のように設定されます。<br> その市場の引けまでの間 : 当日<br> その市場の引け後       : 翌取引所営業日<br> その市場の休前日       : 休日明けの取引所営業日<br> ※ 日替わりはkabuステーションが日付変更通知を受信したタイミングです。<br> ※ 日通しの場合、夜間取引の引け後に日付が更新されます。
   * @return expireDay
   **/
  @Schema(required = true, description = "注文有効期限<br> yyyyMMdd形式。<br> 「0」を指定すると、kabuステーション上の発注画面の「本日」に対応する日付として扱います。<br> 「本日」は直近の注文可能日となり、以下のように設定されます。<br> その市場の引けまでの間 : 当日<br> その市場の引け後       : 翌取引所営業日<br> その市場の休前日       : 休日明けの取引所営業日<br> ※ 日替わりはkabuステーションが日付変更通知を受信したタイミングです。<br> ※ 日通しの場合、夜間取引の引け後に日付が更新されます。")
      @NotNull

    public Integer getExpireDay() {
    return expireDay;
  }

  public void setExpireDay(Integer expireDay) {
    this.expireDay = expireDay;
  }

  public RequestSendOrderDerivFuture reverseLimitOrder(RequestSendOrderDerivFutureReverseLimitOrder reverseLimitOrder) {
    this.reverseLimitOrder = reverseLimitOrder;
    return this;
  }

  /**
   * Get reverseLimitOrder
   * @return reverseLimitOrder
   **/
  @Schema(description = "")
  
    @Valid
    public RequestSendOrderDerivFutureReverseLimitOrder getReverseLimitOrder() {
    return reverseLimitOrder;
  }

  public void setReverseLimitOrder(RequestSendOrderDerivFutureReverseLimitOrder reverseLimitOrder) {
    this.reverseLimitOrder = reverseLimitOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSendOrderDerivFuture requestSendOrderDerivFuture = (RequestSendOrderDerivFuture) o;
    return Objects.equals(this.password, requestSendOrderDerivFuture.password) &&
        Objects.equals(this.symbol, requestSendOrderDerivFuture.symbol) &&
        Objects.equals(this.exchange, requestSendOrderDerivFuture.exchange) &&
        Objects.equals(this.tradeType, requestSendOrderDerivFuture.tradeType) &&
        Objects.equals(this.timeInForce, requestSendOrderDerivFuture.timeInForce) &&
        Objects.equals(this.side, requestSendOrderDerivFuture.side) &&
        Objects.equals(this.qty, requestSendOrderDerivFuture.qty) &&
        Objects.equals(this.closePositionOrder, requestSendOrderDerivFuture.closePositionOrder) &&
        Objects.equals(this.closePositions, requestSendOrderDerivFuture.closePositions) &&
        Objects.equals(this.frontOrderType, requestSendOrderDerivFuture.frontOrderType) &&
        Objects.equals(this.price, requestSendOrderDerivFuture.price) &&
        Objects.equals(this.expireDay, requestSendOrderDerivFuture.expireDay) &&
        Objects.equals(this.reverseLimitOrder, requestSendOrderDerivFuture.reverseLimitOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, symbol, exchange, tradeType, timeInForce, side, qty, closePositionOrder, closePositions, frontOrderType, price, expireDay, reverseLimitOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSendOrderDerivFuture {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    closePositionOrder: ").append(toIndentedString(closePositionOrder)).append("\n");
    sb.append("    closePositions: ").append(toIndentedString(closePositions)).append("\n");
    sb.append("    frontOrderType: ").append(toIndentedString(frontOrderType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
    sb.append("    reverseLimitOrder: ").append(toIndentedString(reverseLimitOrder)).append("\n");
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
