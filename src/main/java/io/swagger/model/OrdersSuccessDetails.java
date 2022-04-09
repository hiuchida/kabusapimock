package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrdersSuccessDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class OrdersSuccessDetails   {
  @JsonProperty("SeqNum")
  private Integer seqNum = null;

  @JsonProperty("ID")
  private String ID = null;

  @JsonProperty("RecType")
  private Integer recType = null;

  @JsonProperty("ExchangeID")
  private String exchangeID = null;

  @JsonProperty("State")
  private Integer state = null;

  @JsonProperty("TransactTime")
  private String transactTime = null;

  @JsonProperty("OrdType")
  private Integer ordType = null;

  @JsonProperty("Price")
  private Double price = null;

  @JsonProperty("Qty")
  private Double qty = null;

  @JsonProperty("ExecutionID")
  private String executionID = null;

  @JsonProperty("ExecutionDay")
  private OffsetDateTime executionDay = null;

  @JsonProperty("DelivDay")
  private Integer delivDay = null;

  @JsonProperty("Commission")
  private Double commission = null;

  @JsonProperty("CommissionTax")
  private Double commissionTax = null;

  public OrdersSuccessDetails seqNum(Integer seqNum) {
    this.seqNum = seqNum;
    return this;
  }

  /**
   * ※注文明細レコードの生成順序です。<br>※通番であるとは限りませんが、大小による順序は保たれています。
   * @return seqNum
   **/
  @Schema(description = "※注文明細レコードの生成順序です。<br>※通番であるとは限りませんが、大小による順序は保たれています。")
  
    public Integer getSeqNum() {
    return seqNum;
  }

  public void setSeqNum(Integer seqNum) {
    this.seqNum = seqNum;
  }

  public OrdersSuccessDetails ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * 注文詳細番号
   * @return ID
   **/
  @Schema(description = "注文詳細番号")
  
    public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public OrdersSuccessDetails recType(Integer recType) {
    this.recType = recType;
    return this;
  }

  /**
   * 明細種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>受付</td>       </tr>       <tr>           <td>2</td>           <td>繰越</td>       </tr>       <tr>           <td>3</td>           <td>期限切れ</td>       </tr>       <tr>           <td>4</td>           <td>発注</td>       </tr>       <tr>           <td>5</td>           <td>訂正</td>       </tr>       <tr>           <td>6</td>           <td>取消</td>       </tr>       <tr>           <td>7</td>           <td>失効</td>       </tr>       <tr>           <td>8</td>           <td>約定</td>       </tr>   </tbody> </table>
   * @return recType
   **/
  @Schema(example = "1", description = "明細種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>受付</td>       </tr>       <tr>           <td>2</td>           <td>繰越</td>       </tr>       <tr>           <td>3</td>           <td>期限切れ</td>       </tr>       <tr>           <td>4</td>           <td>発注</td>       </tr>       <tr>           <td>5</td>           <td>訂正</td>       </tr>       <tr>           <td>6</td>           <td>取消</td>       </tr>       <tr>           <td>7</td>           <td>失効</td>       </tr>       <tr>           <td>8</td>           <td>約定</td>       </tr>   </tbody> </table>")
  
    public Integer getRecType() {
    return recType;
  }

  public void setRecType(Integer recType) {
    this.recType = recType;
  }

  public OrdersSuccessDetails exchangeID(String exchangeID) {
    this.exchangeID = exchangeID;
    return this;
  }

  /**
   * 取引所番号
   * @return exchangeID
   **/
  @Schema(description = "取引所番号")
  
    public String getExchangeID() {
    return exchangeID;
  }

  public void setExchangeID(String exchangeID) {
    this.exchangeID = exchangeID;
  }

  public OrdersSuccessDetails state(Integer state) {
    this.state = state;
    return this;
  }

  /**
   * 状態 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>待機（発注待機）</td>       </tr>       <tr>           <td>2</td>           <td>処理中（発注送信中・訂正送信中・取消送信中）</td>       </tr>       <tr>           <td>3</td>           <td>処理済（発注済・訂正済・取消済・全約定・期限切れ）</td>       </tr>       <tr>           <td>4</td>           <td>エラー</td>       </tr>       <tr>           <td>5</td>           <td>削除済み</td>       </tr>   </tbody> </table>
   * @return state
   **/
  @Schema(description = "状態 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>待機（発注待機）</td>       </tr>       <tr>           <td>2</td>           <td>処理中（発注送信中・訂正送信中・取消送信中）</td>       </tr>       <tr>           <td>3</td>           <td>処理済（発注済・訂正済・取消済・全約定・期限切れ）</td>       </tr>       <tr>           <td>4</td>           <td>エラー</td>       </tr>       <tr>           <td>5</td>           <td>削除済み</td>       </tr>   </tbody> </table>")
  
    public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public OrdersSuccessDetails transactTime(String transactTime) {
    this.transactTime = transactTime;
    return this;
  }

  /**
   * 処理時刻
   * @return transactTime
   **/
  @Schema(description = "処理時刻")
  
    public String getTransactTime() {
    return transactTime;
  }

  public void setTransactTime(String transactTime) {
    this.transactTime = transactTime;
  }

  public OrdersSuccessDetails ordType(Integer ordType) {
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

  public OrdersSuccessDetails price(Double price) {
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

  public OrdersSuccessDetails qty(Double qty) {
    this.qty = qty;
    return this;
  }

  /**
   * 数量
   * @return qty
   **/
  @Schema(description = "数量")
  
    public Double getQty() {
    return qty;
  }

  public void setQty(Double qty) {
    this.qty = qty;
  }

  public OrdersSuccessDetails executionID(String executionID) {
    this.executionID = executionID;
    return this;
  }

  /**
   * 約定番号
   * @return executionID
   **/
  @Schema(description = "約定番号")
  
    public String getExecutionID() {
    return executionID;
  }

  public void setExecutionID(String executionID) {
    this.executionID = executionID;
  }

  public OrdersSuccessDetails executionDay(OffsetDateTime executionDay) {
    this.executionDay = executionDay;
    return this;
  }

  /**
   * 約定日時
   * @return executionDay
   **/
  @Schema(description = "約定日時")
  
    @Valid
    public OffsetDateTime getExecutionDay() {
    return executionDay;
  }

  public void setExecutionDay(OffsetDateTime executionDay) {
    this.executionDay = executionDay;
  }

  public OrdersSuccessDetails delivDay(Integer delivDay) {
    this.delivDay = delivDay;
    return this;
  }

  /**
   * 受渡日
   * @return delivDay
   **/
  @Schema(description = "受渡日")
  
    public Integer getDelivDay() {
    return delivDay;
  }

  public void setDelivDay(Integer delivDay) {
    this.delivDay = delivDay;
  }

  public OrdersSuccessDetails commission(Double commission) {
    this.commission = commission;
    return this;
  }

  /**
   * 手数料<br>※注文詳細の明細種別が約定（RecType=8)の場合に設定。
   * @return commission
   **/
  @Schema(description = "手数料<br>※注文詳細の明細種別が約定（RecType=8)の場合に設定。")
  
    public Double getCommission() {
    return commission;
  }

  public void setCommission(Double commission) {
    this.commission = commission;
  }

  public OrdersSuccessDetails commissionTax(Double commissionTax) {
    this.commissionTax = commissionTax;
    return this;
  }

  /**
   * 手数料消費税<br>※明細種別は約定（RecType=8）の場合にのみ表示されます。
   * @return commissionTax
   **/
  @Schema(description = "手数料消費税<br>※明細種別は約定（RecType=8）の場合にのみ表示されます。")
  
    public Double getCommissionTax() {
    return commissionTax;
  }

  public void setCommissionTax(Double commissionTax) {
    this.commissionTax = commissionTax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersSuccessDetails ordersSuccessDetails = (OrdersSuccessDetails) o;
    return Objects.equals(this.seqNum, ordersSuccessDetails.seqNum) &&
        Objects.equals(this.ID, ordersSuccessDetails.ID) &&
        Objects.equals(this.recType, ordersSuccessDetails.recType) &&
        Objects.equals(this.exchangeID, ordersSuccessDetails.exchangeID) &&
        Objects.equals(this.state, ordersSuccessDetails.state) &&
        Objects.equals(this.transactTime, ordersSuccessDetails.transactTime) &&
        Objects.equals(this.ordType, ordersSuccessDetails.ordType) &&
        Objects.equals(this.price, ordersSuccessDetails.price) &&
        Objects.equals(this.qty, ordersSuccessDetails.qty) &&
        Objects.equals(this.executionID, ordersSuccessDetails.executionID) &&
        Objects.equals(this.executionDay, ordersSuccessDetails.executionDay) &&
        Objects.equals(this.delivDay, ordersSuccessDetails.delivDay) &&
        Objects.equals(this.commission, ordersSuccessDetails.commission) &&
        Objects.equals(this.commissionTax, ordersSuccessDetails.commissionTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seqNum, ID, recType, exchangeID, state, transactTime, ordType, price, qty, executionID, executionDay, delivDay, commission, commissionTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersSuccessDetails {\n");
    
    sb.append("    seqNum: ").append(toIndentedString(seqNum)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    recType: ").append(toIndentedString(recType)).append("\n");
    sb.append("    exchangeID: ").append(toIndentedString(exchangeID)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transactTime: ").append(toIndentedString(transactTime)).append("\n");
    sb.append("    ordType: ").append(toIndentedString(ordType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    executionID: ").append(toIndentedString(executionID)).append("\n");
    sb.append("    executionDay: ").append(toIndentedString(executionDay)).append("\n");
    sb.append("    delivDay: ").append(toIndentedString(delivDay)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    commissionTax: ").append(toIndentedString(commissionTax)).append("\n");
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
