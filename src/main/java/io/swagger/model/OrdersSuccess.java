package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OrdersSuccessDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrdersSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class OrdersSuccess   {
  @JsonProperty("ID")
  private String ID = null;

  @JsonProperty("State")
  private Integer state = null;

  @JsonProperty("OrderState")
  private Integer orderState = null;

  @JsonProperty("OrdType")
  private Integer ordType = null;

  @JsonProperty("RecvTime")
  private String recvTime = null;

  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("SymbolName")
  private String symbolName = null;

  @JsonProperty("Exchange")
  private Integer exchange = null;

  @JsonProperty("ExchangeName")
  private String exchangeName = null;

  @JsonProperty("TimeInForce")
  private Integer timeInForce = null;

  @JsonProperty("Price")
  private Double price = null;

  @JsonProperty("OrderQty")
  private Double orderQty = null;

  @JsonProperty("CumQty")
  private Double cumQty = null;

  @JsonProperty("Side")
  private String side = null;

  @JsonProperty("CashMargin")
  private Integer cashMargin = null;

  @JsonProperty("AccountType")
  private Integer accountType = null;

  @JsonProperty("DelivType")
  private Integer delivType = null;

  @JsonProperty("ExpireDay")
  private Integer expireDay = null;

  @JsonProperty("MarginTradeType")
  private Integer marginTradeType = null;

  @JsonProperty("MarginPremium")
  private Double marginPremium = null;

  @JsonProperty("Details")
  @Valid
  private List<OrdersSuccessDetails> details = null;

  public OrdersSuccess ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * 注文番号
   * @return ID
   **/
  @Schema(description = "注文番号")
  
    public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public OrdersSuccess state(Integer state) {
    this.state = state;
    return this;
  }

  /**
   * 状態 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>待機（発注待機）</td>       </tr>       <tr>           <td>2</td>           <td>処理中（発注送信中）</td>       </tr>       <tr>           <td>3</td>           <td>処理済（発注済・訂正済）</td>       </tr>       <tr>           <td>4</td>           <td>訂正取消送信中</td>       </tr>       <tr>           <td>5</td>           <td>終了（発注エラー・取消済・全約定・失効・期限切れ）</td>       </tr>   </tbody> </table>
   * @return state
   **/
  @Schema(description = "状態 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>待機（発注待機）</td>       </tr>       <tr>           <td>2</td>           <td>処理中（発注送信中）</td>       </tr>       <tr>           <td>3</td>           <td>処理済（発注済・訂正済）</td>       </tr>       <tr>           <td>4</td>           <td>訂正取消送信中</td>       </tr>       <tr>           <td>5</td>           <td>終了（発注エラー・取消済・全約定・失効・期限切れ）</td>       </tr>   </tbody> </table>")
  
    public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public OrdersSuccess orderState(Integer orderState) {
    this.orderState = orderState;
    return this;
  }

  /**
   * 注文状態 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>待機（発注待機）</td>       </tr>       <tr>           <td>2</td>           <td>処理中（発注送信中）</td>       </tr>       <tr>           <td>3</td>           <td>処理済（発注済・訂正済）</td>       </tr>       <tr>           <td>4</td>           <td>訂正取消送信中</td>       </tr>       <tr>           <td>5</td>           <td>終了（発注エラー・取消済・全約定・失効・期限切れ）</td>       </tr>   </tbody> </table>
   * @return orderState
   **/
  @Schema(description = "注文状態 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>待機（発注待機）</td>       </tr>       <tr>           <td>2</td>           <td>処理中（発注送信中）</td>       </tr>       <tr>           <td>3</td>           <td>処理済（発注済・訂正済）</td>       </tr>       <tr>           <td>4</td>           <td>訂正取消送信中</td>       </tr>       <tr>           <td>5</td>           <td>終了（発注エラー・取消済・全約定・失効・期限切れ）</td>       </tr>   </tbody> </table>")
  
    public Integer getOrderState() {
    return orderState;
  }

  public void setOrderState(Integer orderState) {
    this.orderState = orderState;
  }

  public OrdersSuccess ordType(Integer ordType) {
    this.ordType = ordType;
    return this;
  }

  /**
   * 執行条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>ザラバ</td>       </tr>       <tr>           <td>2</td>           <td>寄り</td>       </tr>       <tr>           <td>3</td>           <td>引け</td>       </tr>       <tr>           <td>4</td>           <td>不成</td>       </tr>       <tr>           <td>5</td>           <td>対当指値</td>       </tr>       <tr>           <td>6</td>           <td>IOC</td>       </tr>   </tbody> </table>
   * @return ordType
   **/
  @Schema(description = "執行条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>ザラバ</td>       </tr>       <tr>           <td>2</td>           <td>寄り</td>       </tr>       <tr>           <td>3</td>           <td>引け</td>       </tr>       <tr>           <td>4</td>           <td>不成</td>       </tr>       <tr>           <td>5</td>           <td>対当指値</td>       </tr>       <tr>           <td>6</td>           <td>IOC</td>       </tr>   </tbody> </table>")
  
    public Integer getOrdType() {
    return ordType;
  }

  public void setOrdType(Integer ordType) {
    this.ordType = ordType;
  }

  public OrdersSuccess recvTime(String recvTime) {
    this.recvTime = recvTime;
    return this;
  }

  /**
   * 受注日時
   * @return recvTime
   **/
  @Schema(description = "受注日時")
  
    public String getRecvTime() {
    return recvTime;
  }

  public void setRecvTime(String recvTime) {
    this.recvTime = recvTime;
  }

  public OrdersSuccess symbol(String symbol) {
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

  public OrdersSuccess symbolName(String symbolName) {
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

  public OrdersSuccess exchange(Integer exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * 市場コード <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>       <tr>           <td>9</td>           <td>SOR</td>       </tr>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>
   * @return exchange
   **/
  @Schema(description = "市場コード <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>       <tr>           <td>9</td>           <td>SOR</td>       </tr>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>")
  
    public Integer getExchange() {
    return exchange;
  }

  public void setExchange(Integer exchange) {
    this.exchange = exchange;
  }

  public OrdersSuccess exchangeName(String exchangeName) {
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

  public OrdersSuccess timeInForce(Integer timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

  /**
   * 有効期間条件<br>※先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>FAS</td>       </tr>       <tr>           <td>2</td>           <td>FAK</td>       </tr>       <tr>           <td>3</td>           <td>FOK</td>       </tr>   </tbody> </table>
   * @return timeInForce
   **/
  @Schema(description = "有効期間条件<br>※先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>FAS</td>       </tr>       <tr>           <td>2</td>           <td>FAK</td>       </tr>       <tr>           <td>3</td>           <td>FOK</td>       </tr>   </tbody> </table>")
  
    public Integer getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(Integer timeInForce) {
    this.timeInForce = timeInForce;
  }

  public OrdersSuccess price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * 値段
   * @return price
   **/
  @Schema(description = "値段")
  
    public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public OrdersSuccess orderQty(Double orderQty) {
    this.orderQty = orderQty;
    return this;
  }

  /**
   * 発注数量<br> ※注文期限切れと失効の場合、OrderQtyはゼロになりません。<br> ※期限切れと失効の確認方法としては、DetailsのRecType（3: 期限切れ、7: 失効）にてご確認ください。
   * @return orderQty
   **/
  @Schema(description = "発注数量<br> ※注文期限切れと失効の場合、OrderQtyはゼロになりません。<br> ※期限切れと失効の確認方法としては、DetailsのRecType（3: 期限切れ、7: 失効）にてご確認ください。")
  
    public Double getOrderQty() {
    return orderQty;
  }

  public void setOrderQty(Double orderQty) {
    this.orderQty = orderQty;
  }

  public OrdersSuccess cumQty(Double cumQty) {
    this.cumQty = cumQty;
    return this;
  }

  /**
   * 約定数量
   * @return cumQty
   **/
  @Schema(description = "約定数量")
  
    public Double getCumQty() {
    return cumQty;
  }

  public void setCumQty(Double cumQty) {
    this.cumQty = cumQty;
  }

  public OrdersSuccess side(String side) {
    this.side = side;
    return this;
  }

  /**
   * 売買区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>売</td>       </tr>       <tr>           <td>2</td>           <td>買</td>       </tr>   </tbody> </table>
   * @return side
   **/
  @Schema(description = "売買区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>売</td>       </tr>       <tr>           <td>2</td>           <td>買</td>       </tr>   </tbody> </table>")
  
    public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public OrdersSuccess cashMargin(Integer cashMargin) {
    this.cashMargin = cashMargin;
    return this;
  }

  /**
   * 取引区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>新規</td>       </tr>       <tr>           <td>3</td>           <td>返済</td>       </tr>   </tbody> </table>
   * @return cashMargin
   **/
  @Schema(description = "取引区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>新規</td>       </tr>       <tr>           <td>3</td>           <td>返済</td>       </tr>   </tbody> </table>")
  
    public Integer getCashMargin() {
    return cashMargin;
  }

  public void setCashMargin(Integer cashMargin) {
    this.cashMargin = cashMargin;
  }

  public OrdersSuccess accountType(Integer accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * 口座種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>一般</td>       </tr>       <tr>           <td>4</td>           <td>特定</td>       </tr>       <tr>           <td>12</td>           <td>法人</td>       </tr>   </tbody> </table>
   * @return accountType
   **/
  @Schema(description = "口座種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>一般</td>       </tr>       <tr>           <td>4</td>           <td>特定</td>       </tr>       <tr>           <td>12</td>           <td>法人</td>       </tr>   </tbody> </table>")
  
    public Integer getAccountType() {
    return accountType;
  }

  public void setAccountType(Integer accountType) {
    this.accountType = accountType;
  }

  public OrdersSuccess delivType(Integer delivType) {
    this.delivType = delivType;
    return this;
  }

  /**
   * 受渡区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>自動振替</td>       </tr>       <tr>           <td>2</td>           <td>お預り金</td>       </tr>   </tbody> </table>
   * @return delivType
   **/
  @Schema(description = "受渡区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>自動振替</td>       </tr>       <tr>           <td>2</td>           <td>お預り金</td>       </tr>   </tbody> </table>")
  
    public Integer getDelivType() {
    return delivType;
  }

  public void setDelivType(Integer delivType) {
    this.delivType = delivType;
  }

  public OrdersSuccess expireDay(Integer expireDay) {
    this.expireDay = expireDay;
    return this;
  }

  /**
   * 注文有効期限<br>yyyyMMdd形式
   * @return expireDay
   **/
  @Schema(description = "注文有効期限<br>yyyyMMdd形式")
  
    public Integer getExpireDay() {
    return expireDay;
  }

  public void setExpireDay(Integer expireDay) {
    this.expireDay = expireDay;
  }

  public OrdersSuccess marginTradeType(Integer marginTradeType) {
    this.marginTradeType = marginTradeType;
    return this;
  }

  /**
   * 信用取引区分<br> ※信用を注文した際に表示されます。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>制度信用</td>       </tr>       <tr>           <td>2</td>           <td>一般信用（長期）</td>       </tr>       <tr>           <td>3</td>           <td>一般信用（デイトレ）</td>       </tr>   </tbody> </table>
   * @return marginTradeType
   **/
  @Schema(description = "信用取引区分<br> ※信用を注文した際に表示されます。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>制度信用</td>       </tr>       <tr>           <td>2</td>           <td>一般信用（長期）</td>       </tr>       <tr>           <td>3</td>           <td>一般信用（デイトレ）</td>       </tr>   </tbody> </table>")
  
    public Integer getMarginTradeType() {
    return marginTradeType;
  }

  public void setMarginTradeType(Integer marginTradeType) {
    this.marginTradeType = marginTradeType;
  }

  public OrdersSuccess marginPremium(Double marginPremium) {
    this.marginPremium = marginPremium;
    return this;
  }

  /**
   * プレミアム料<br> ※（注文中数量＋約定済数量）×１株あたりプレミアム料として計算されます。<br> ※信用を注文した際に表示されます。<br> ※制度信用売/買、一般（長期）買、一般（デイトレ）買の場合は、Noneと返されます。<br> 一般（長期）売、一般（デイトレ）売の場合は、プレミアム料=0の場合、0（ゼロ）と返されます。
   * @return marginPremium
   **/
  @Schema(description = "プレミアム料<br> ※（注文中数量＋約定済数量）×１株あたりプレミアム料として計算されます。<br> ※信用を注文した際に表示されます。<br> ※制度信用売/買、一般（長期）買、一般（デイトレ）買の場合は、Noneと返されます。<br> 一般（長期）売、一般（デイトレ）売の場合は、プレミアム料=0の場合、0（ゼロ）と返されます。")
  
    public Double getMarginPremium() {
    return marginPremium;
  }

  public void setMarginPremium(Double marginPremium) {
    this.marginPremium = marginPremium;
  }

  public OrdersSuccess details(List<OrdersSuccessDetails> details) {
    this.details = details;
    return this;
  }

  public OrdersSuccess addDetailsItem(OrdersSuccessDetails detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<OrdersSuccessDetails>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * 注文詳細
   * @return details
   **/
  @Schema(description = "注文詳細")
      @Valid
    public List<OrdersSuccessDetails> getDetails() {
    return details;
  }

  public void setDetails(List<OrdersSuccessDetails> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersSuccess ordersSuccess = (OrdersSuccess) o;
    return Objects.equals(this.ID, ordersSuccess.ID) &&
        Objects.equals(this.state, ordersSuccess.state) &&
        Objects.equals(this.orderState, ordersSuccess.orderState) &&
        Objects.equals(this.ordType, ordersSuccess.ordType) &&
        Objects.equals(this.recvTime, ordersSuccess.recvTime) &&
        Objects.equals(this.symbol, ordersSuccess.symbol) &&
        Objects.equals(this.symbolName, ordersSuccess.symbolName) &&
        Objects.equals(this.exchange, ordersSuccess.exchange) &&
        Objects.equals(this.exchangeName, ordersSuccess.exchangeName) &&
        Objects.equals(this.timeInForce, ordersSuccess.timeInForce) &&
        Objects.equals(this.price, ordersSuccess.price) &&
        Objects.equals(this.orderQty, ordersSuccess.orderQty) &&
        Objects.equals(this.cumQty, ordersSuccess.cumQty) &&
        Objects.equals(this.side, ordersSuccess.side) &&
        Objects.equals(this.cashMargin, ordersSuccess.cashMargin) &&
        Objects.equals(this.accountType, ordersSuccess.accountType) &&
        Objects.equals(this.delivType, ordersSuccess.delivType) &&
        Objects.equals(this.expireDay, ordersSuccess.expireDay) &&
        Objects.equals(this.marginTradeType, ordersSuccess.marginTradeType) &&
        Objects.equals(this.marginPremium, ordersSuccess.marginPremium) &&
        Objects.equals(this.details, ordersSuccess.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, state, orderState, ordType, recvTime, symbol, symbolName, exchange, exchangeName, timeInForce, price, orderQty, cumQty, side, cashMargin, accountType, delivType, expireDay, marginTradeType, marginPremium, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersSuccess {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    orderState: ").append(toIndentedString(orderState)).append("\n");
    sb.append("    ordType: ").append(toIndentedString(ordType)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    orderQty: ").append(toIndentedString(orderQty)).append("\n");
    sb.append("    cumQty: ").append(toIndentedString(cumQty)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    cashMargin: ").append(toIndentedString(cashMargin)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    delivType: ").append(toIndentedString(delivType)).append("\n");
    sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
    sb.append("    marginTradeType: ").append(toIndentedString(marginTradeType)).append("\n");
    sb.append("    marginPremium: ").append(toIndentedString(marginPremium)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
