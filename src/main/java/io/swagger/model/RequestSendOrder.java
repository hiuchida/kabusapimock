package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Positions;
import io.swagger.model.RequestSendOrderReverseLimitOrder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestSendOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class RequestSendOrder   {
  @JsonProperty("Password")
  private String password = null;

  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("Exchange")
  private Integer exchange = null;

  @JsonProperty("SecurityType")
  private Integer securityType = null;

  @JsonProperty("Side")
  private String side = null;

  @JsonProperty("CashMargin")
  private Integer cashMargin = null;

  @JsonProperty("MarginTradeType")
  private Integer marginTradeType = null;

  @JsonProperty("MarginPremiumUnit")
  private Double marginPremiumUnit = null;

  @JsonProperty("DelivType")
  private Integer delivType = null;

  @JsonProperty("FundType")
  private String fundType = null;

  @JsonProperty("AccountType")
  private Integer accountType = null;

  @JsonProperty("Qty")
  private Integer qty = null;

  @JsonProperty("ClosePositionOrder")
  private Integer closePositionOrder = null;

  @JsonProperty("ClosePositions")
  @Valid
  private List<Positions> closePositions = null;

  @JsonProperty("FrontOrderType")
  private Integer frontOrderType = null;

  @JsonProperty("Price")
  private Double price = null;

  @JsonProperty("ExpireDay")
  private Integer expireDay = null;

  @JsonProperty("ReverseLimitOrder")
  private RequestSendOrderReverseLimitOrder reverseLimitOrder = null;

  public RequestSendOrder password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 注文パスワード
   * @return password
   **/
  @Schema(required = true, description = "注文パスワード")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RequestSendOrder symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * 銘柄コード
   * @return symbol
   **/
  @Schema(required = true, description = "銘柄コード")
      @NotNull

    public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public RequestSendOrder exchange(Integer exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * 市場コード <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>   </tbody> </table>
   * @return exchange
   **/
  @Schema(required = true, description = "市場コード <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getExchange() {
    return exchange;
  }

  public void setExchange(Integer exchange) {
    this.exchange = exchange;
  }

  public RequestSendOrder securityType(Integer securityType) {
    this.securityType = securityType;
    return this;
  }

  /**
   * 商品種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>株式</td>       </tr>   </tbody> </table>
   * @return securityType
   **/
  @Schema(required = true, description = "商品種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>株式</td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getSecurityType() {
    return securityType;
  }

  public void setSecurityType(Integer securityType) {
    this.securityType = securityType;
  }

  public RequestSendOrder side(String side) {
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

  public RequestSendOrder cashMargin(Integer cashMargin) {
    this.cashMargin = cashMargin;
    return this;
  }

  /**
   * 信用区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>現物</td>       </tr>       <tr>           <td>2</td>           <td>新規</td>       </tr>       <tr>           <td>3</td>           <td>返済</td>       </tr>   </tbody> </table>
   * @return cashMargin
   **/
  @Schema(required = true, description = "信用区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>現物</td>       </tr>       <tr>           <td>2</td>           <td>新規</td>       </tr>       <tr>           <td>3</td>           <td>返済</td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getCashMargin() {
    return cashMargin;
  }

  public void setCashMargin(Integer cashMargin) {
    this.cashMargin = cashMargin;
  }

  public RequestSendOrder marginTradeType(Integer marginTradeType) {
    this.marginTradeType = marginTradeType;
    return this;
  }

  /**
   * 信用取引区分<br>※現物取引の場合は指定不要。<br>※信用取引の場合、必須。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>制度信用</td>       </tr>       <tr>           <td>2</td>           <td>一般信用（長期）</td>       </tr>       <tr>           <td>3</td>           <td>一般信用（デイトレ）</td>       </tr>   </tbody> </table>
   * @return marginTradeType
   **/
  @Schema(description = "信用取引区分<br>※現物取引の場合は指定不要。<br>※信用取引の場合、必須。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>制度信用</td>       </tr>       <tr>           <td>2</td>           <td>一般信用（長期）</td>       </tr>       <tr>           <td>3</td>           <td>一般信用（デイトレ）</td>       </tr>   </tbody> </table>")
  
    public Integer getMarginTradeType() {
    return marginTradeType;
  }

  public void setMarginTradeType(Integer marginTradeType) {
    this.marginTradeType = marginTradeType;
  }

  public RequestSendOrder marginPremiumUnit(Double marginPremiumUnit) {
    this.marginPremiumUnit = marginPremiumUnit;
    return this;
  }

  /**
   * １株あたりのプレミアム料(円)<br>  ※プレミアム料の刻値は、プレミアム料取得APIのレスポンスにある\"TickMarginPremium\"にてご確認ください。<br> ※入札受付中(19:30～20:30)プレミアム料入札可能銘柄の場合、「MarginPremiumUnit」は必須となります。<br> ※入札受付中(19:30～20:30)のプレミアム料入札可能銘柄以外の場合は、「MarginPremiumUnit」の記載は無視されます。<br> ※入札受付中以外の時間帯では、「MarginPremiumUnit」の記載は無視されます。
   * @return marginPremiumUnit
   **/
  @Schema(description = "１株あたりのプレミアム料(円)<br>  ※プレミアム料の刻値は、プレミアム料取得APIのレスポンスにある\"TickMarginPremium\"にてご確認ください。<br> ※入札受付中(19:30～20:30)プレミアム料入札可能銘柄の場合、「MarginPremiumUnit」は必須となります。<br> ※入札受付中(19:30～20:30)のプレミアム料入札可能銘柄以外の場合は、「MarginPremiumUnit」の記載は無視されます。<br> ※入札受付中以外の時間帯では、「MarginPremiumUnit」の記載は無視されます。")
  
    public Double getMarginPremiumUnit() {
    return marginPremiumUnit;
  }

  public void setMarginPremiumUnit(Double marginPremiumUnit) {
    this.marginPremiumUnit = marginPremiumUnit;
  }

  public RequestSendOrder delivType(Integer delivType) {
    this.delivType = delivType;
    return this;
  }

  /**
   * 受渡区分<br>※現物買は指定必須。<br>※現物売は「0(指定なし)」を設定<br>※信用新規は「0(指定なし)」を設定<br>※信用返済は指定必須 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0</td>           <td>指定なし</td>       </tr>       <tr>           <td>1</td>           <td>自動振替</td>       </tr>       <tr>           <td>2</td>           <td>お預り金</td>       </tr>   </tbody> </table>
   * @return delivType
   **/
  @Schema(required = true, description = "受渡区分<br>※現物買は指定必須。<br>※現物売は「0(指定なし)」を設定<br>※信用新規は「0(指定なし)」を設定<br>※信用返済は指定必須 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0</td>           <td>指定なし</td>       </tr>       <tr>           <td>1</td>           <td>自動振替</td>       </tr>       <tr>           <td>2</td>           <td>お預り金</td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getDelivType() {
    return delivType;
  }

  public void setDelivType(Integer delivType) {
    this.delivType = delivType;
  }

  public RequestSendOrder fundType(String fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * 資産区分（預り区分）<br>※現物買は、指定必須。<br>※現物売は、「'  '」 半角スペース2つを指定必須。<br>※信用新規と信用返済は、指定不要。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>(半角スペース2つ)</td>           <td>現物売の場合</td>       </tr>       <tr>           <td>02</td>           <td>保護</td>       </tr>       <tr>           <td>AA</td>           <td>信用代用</td>       </tr>       <tr>           <td>11</td>           <td>信用取引</td>       </tr>   </tbody> </table>
   * @return fundType
   **/
  @Schema(description = "資産区分（預り区分）<br>※現物買は、指定必須。<br>※現物売は、「'  '」 半角スペース2つを指定必須。<br>※信用新規と信用返済は、指定不要。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>(半角スペース2つ)</td>           <td>現物売の場合</td>       </tr>       <tr>           <td>02</td>           <td>保護</td>       </tr>       <tr>           <td>AA</td>           <td>信用代用</td>       </tr>       <tr>           <td>11</td>           <td>信用取引</td>       </tr>   </tbody> </table>")
  
    public String getFundType() {
    return fundType;
  }

  public void setFundType(String fundType) {
    this.fundType = fundType;
  }

  public RequestSendOrder accountType(Integer accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * 口座種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>一般</td>       </tr>       <tr>           <td>4</td>           <td>特定</td>       </tr>       <tr>           <td>12</td>           <td>法人</td>       </tr>   </tbody> </table>
   * @return accountType
   **/
  @Schema(required = true, description = "口座種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>一般</td>       </tr>       <tr>           <td>4</td>           <td>特定</td>       </tr>       <tr>           <td>12</td>           <td>法人</td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getAccountType() {
    return accountType;
  }

  public void setAccountType(Integer accountType) {
    this.accountType = accountType;
  }

  public RequestSendOrder qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * 注文数量<br>※信用一括返済の場合、返済したい合計数量を入力してください。
   * @return qty
   **/
  @Schema(required = true, description = "注文数量<br>※信用一括返済の場合、返済したい合計数量を入力してください。")
      @NotNull

    public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public RequestSendOrder closePositionOrder(Integer closePositionOrder) {
    this.closePositionOrder = closePositionOrder;
    return this;
  }

  /**
   * 決済順序<br>※信用返済の場合、必須。<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0</td>           <td>日付（古い順）、損益（高い順）</td>       </tr>       <tr>           <td>1</td>           <td>日付（古い順）、損益（低い順）</td>       </tr>       <tr>           <td>2</td>           <td>日付（新しい順）、損益（高い順）</td>       </tr>       <tr>           <td>3</td>           <td>日付（新しい順）、損益（低い順）</td>       </tr>       <tr>           <td>4</td>           <td>損益（高い順）、日付（古い順）</td>       </tr>       <tr>           <td>5</td>           <td>損益（高い順）、日付（新しい順）</td>       </tr>       <tr>           <td>6</td>           <td>損益（低い順）、日付（古い順）</td>       </tr>       <tr>           <td>7</td>           <td>損益（低い順）、日付（新しい順）</td>       </tr>   </tbody> </table>
   * @return closePositionOrder
   **/
  @Schema(description = "決済順序<br>※信用返済の場合、必須。<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0</td>           <td>日付（古い順）、損益（高い順）</td>       </tr>       <tr>           <td>1</td>           <td>日付（古い順）、損益（低い順）</td>       </tr>       <tr>           <td>2</td>           <td>日付（新しい順）、損益（高い順）</td>       </tr>       <tr>           <td>3</td>           <td>日付（新しい順）、損益（低い順）</td>       </tr>       <tr>           <td>4</td>           <td>損益（高い順）、日付（古い順）</td>       </tr>       <tr>           <td>5</td>           <td>損益（高い順）、日付（新しい順）</td>       </tr>       <tr>           <td>6</td>           <td>損益（低い順）、日付（古い順）</td>       </tr>       <tr>           <td>7</td>           <td>損益（低い順）、日付（新しい順）</td>       </tr>   </tbody> </table>")
  
    public Integer getClosePositionOrder() {
    return closePositionOrder;
  }

  public void setClosePositionOrder(Integer closePositionOrder) {
    this.closePositionOrder = closePositionOrder;
  }

  public RequestSendOrder closePositions(List<Positions> closePositions) {
    this.closePositions = closePositions;
    return this;
  }

  public RequestSendOrder addClosePositionsItem(Positions closePositionsItem) {
    if (this.closePositions == null) {
      this.closePositions = new ArrayList<Positions>();
    }
    this.closePositions.add(closePositionsItem);
    return this;
  }

  /**
   * 返済建玉指定<br>※信用返済の場合、必須。<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。<br>※信用一括返済の場合、各建玉IDと返済したい数量を入力してください。<br>※建玉IDは「E」から始まる番号です。
   * @return closePositions
   **/
  @Schema(description = "返済建玉指定<br>※信用返済の場合、必須。<br>※ClosePositionOrderとClosePositionsはどちらか一方のみ指定可能。<br>※ClosePositionOrderとClosePositionsを両方指定した場合、エラー。<br>※信用一括返済の場合、各建玉IDと返済したい数量を入力してください。<br>※建玉IDは「E」から始まる番号です。")
      @Valid
    public List<Positions> getClosePositions() {
    return closePositions;
  }

  public void setClosePositions(List<Positions> closePositions) {
    this.closePositions = closePositions;
  }

  public RequestSendOrder frontOrderType(Integer frontOrderType) {
    this.frontOrderType = frontOrderType;
    return this;
  }

  /**
   * 執行条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>           <th>”Price\"の指定</th>       </tr>   </thead>   <tbody>       <tr>           <td>10</td>           <td>成行</td>           <td>0</td>       </tr>       <tr>           <td>13</td>           <td>寄成（前場）</td>           <td>0</td>       </tr>       <tr>           <td>14</td>           <td>寄成（後場）</td>           <td>0</td>       </tr>       <tr>           <td>15</td>           <td>引成（前場）</td>           <td>0</td>       </tr>       <tr>           <td>16</td>           <td>引成（後場）</td>           <td>0</td>       </tr>       <tr>           <td>17</td>           <td>IOC成行</td>           <td>0</td>       </tr>       <tr>           <td>20</td>           <td>指値</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>21</td>           <td>寄指（前場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>22</td>           <td>寄指（後場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>23</td>           <td>引指（前場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>24</td>           <td>引指（後場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>25</td>           <td>不成（前場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>26</td>           <td>不成（後場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>27</td>           <td>IOC指値</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>30</td>           <td>逆指値</td>           <td></td>       </tr>   </tbody> </table>
   * @return frontOrderType
   **/
  @Schema(required = true, description = "執行条件 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>           <th>”Price\"の指定</th>       </tr>   </thead>   <tbody>       <tr>           <td>10</td>           <td>成行</td>           <td>0</td>       </tr>       <tr>           <td>13</td>           <td>寄成（前場）</td>           <td>0</td>       </tr>       <tr>           <td>14</td>           <td>寄成（後場）</td>           <td>0</td>       </tr>       <tr>           <td>15</td>           <td>引成（前場）</td>           <td>0</td>       </tr>       <tr>           <td>16</td>           <td>引成（後場）</td>           <td>0</td>       </tr>       <tr>           <td>17</td>           <td>IOC成行</td>           <td>0</td>       </tr>       <tr>           <td>20</td>           <td>指値</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>21</td>           <td>寄指（前場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>22</td>           <td>寄指（後場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>23</td>           <td>引指（前場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>24</td>           <td>引指（後場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>25</td>           <td>不成（前場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>26</td>           <td>不成（後場）</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>27</td>           <td>IOC指値</td>           <td>発注したい金額</td>       </tr>       <tr>           <td>30</td>           <td>逆指値</td>           <td></td>       </tr>   </tbody> </table>")
      @NotNull

    public Integer getFrontOrderType() {
    return frontOrderType;
  }

  public void setFrontOrderType(Integer frontOrderType) {
    this.frontOrderType = frontOrderType;
  }

  public RequestSendOrder price(Double price) {
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

  public RequestSendOrder expireDay(Integer expireDay) {
    this.expireDay = expireDay;
    return this;
  }

  /**
   * 注文有効期限<br> yyyyMMdd形式。<br> 「0」を指定すると、kabuステーション上の発注画面の「本日」に対応する日付として扱います。<br> 「本日」は直近の注文可能日となり、以下のように設定されます。<br> 引けまでの間 : 当日<br> 引け後       : 翌取引所営業日<br> 休前日       : 休日明けの取引所営業日<br> ※ 日替わりはkabuステーションが日付変更通知を受信したタイミングです。
   * @return expireDay
   **/
  @Schema(required = true, description = "注文有効期限<br> yyyyMMdd形式。<br> 「0」を指定すると、kabuステーション上の発注画面の「本日」に対応する日付として扱います。<br> 「本日」は直近の注文可能日となり、以下のように設定されます。<br> 引けまでの間 : 当日<br> 引け後       : 翌取引所営業日<br> 休前日       : 休日明けの取引所営業日<br> ※ 日替わりはkabuステーションが日付変更通知を受信したタイミングです。")
      @NotNull

    public Integer getExpireDay() {
    return expireDay;
  }

  public void setExpireDay(Integer expireDay) {
    this.expireDay = expireDay;
  }

  public RequestSendOrder reverseLimitOrder(RequestSendOrderReverseLimitOrder reverseLimitOrder) {
    this.reverseLimitOrder = reverseLimitOrder;
    return this;
  }

  /**
   * Get reverseLimitOrder
   * @return reverseLimitOrder
   **/
  @Schema(description = "")
  
    @Valid
    public RequestSendOrderReverseLimitOrder getReverseLimitOrder() {
    return reverseLimitOrder;
  }

  public void setReverseLimitOrder(RequestSendOrderReverseLimitOrder reverseLimitOrder) {
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
    RequestSendOrder requestSendOrder = (RequestSendOrder) o;
    return Objects.equals(this.password, requestSendOrder.password) &&
        Objects.equals(this.symbol, requestSendOrder.symbol) &&
        Objects.equals(this.exchange, requestSendOrder.exchange) &&
        Objects.equals(this.securityType, requestSendOrder.securityType) &&
        Objects.equals(this.side, requestSendOrder.side) &&
        Objects.equals(this.cashMargin, requestSendOrder.cashMargin) &&
        Objects.equals(this.marginTradeType, requestSendOrder.marginTradeType) &&
        Objects.equals(this.marginPremiumUnit, requestSendOrder.marginPremiumUnit) &&
        Objects.equals(this.delivType, requestSendOrder.delivType) &&
        Objects.equals(this.fundType, requestSendOrder.fundType) &&
        Objects.equals(this.accountType, requestSendOrder.accountType) &&
        Objects.equals(this.qty, requestSendOrder.qty) &&
        Objects.equals(this.closePositionOrder, requestSendOrder.closePositionOrder) &&
        Objects.equals(this.closePositions, requestSendOrder.closePositions) &&
        Objects.equals(this.frontOrderType, requestSendOrder.frontOrderType) &&
        Objects.equals(this.price, requestSendOrder.price) &&
        Objects.equals(this.expireDay, requestSendOrder.expireDay) &&
        Objects.equals(this.reverseLimitOrder, requestSendOrder.reverseLimitOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, symbol, exchange, securityType, side, cashMargin, marginTradeType, marginPremiumUnit, delivType, fundType, accountType, qty, closePositionOrder, closePositions, frontOrderType, price, expireDay, reverseLimitOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSendOrder {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    cashMargin: ").append(toIndentedString(cashMargin)).append("\n");
    sb.append("    marginTradeType: ").append(toIndentedString(marginTradeType)).append("\n");
    sb.append("    marginPremiumUnit: ").append(toIndentedString(marginPremiumUnit)).append("\n");
    sb.append("    delivType: ").append(toIndentedString(delivType)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
