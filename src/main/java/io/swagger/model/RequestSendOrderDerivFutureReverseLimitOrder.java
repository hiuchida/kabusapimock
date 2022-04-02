package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 逆指値条件&lt;br&gt; ※FrontOrderTypeで逆指値を指定した場合のみ必須。
 */
@Schema(description = "逆指値条件<br> ※FrontOrderTypeで逆指値を指定した場合のみ必須。")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class RequestSendOrderDerivFutureReverseLimitOrder   {
  @JsonProperty("TriggerPrice")
  private Double triggerPrice = null;

  @JsonProperty("UnderOver")
  private Integer underOver = null;

  @JsonProperty("AfterHitOrderType")
  private Integer afterHitOrderType = null;

  @JsonProperty("AfterHitPrice")
  private Double afterHitPrice = null;

  public RequestSendOrderDerivFutureReverseLimitOrder triggerPrice(Double triggerPrice) {
    this.triggerPrice = triggerPrice;
    return this;
  }

  /**
   * トリガ価格<br> ※未設定の場合はエラーになります。<br> ※数字以外が設定された場合はエラーになります。
   * @return triggerPrice
   **/
  @Schema(required = true, description = "トリガ価格<br> ※未設定の場合はエラーになります。<br> ※数字以外が設定された場合はエラーになります。")
      @NotNull

    public Double getTriggerPrice() {
    return triggerPrice;
  }

  public void setTriggerPrice(Double triggerPrice) {
    this.triggerPrice = triggerPrice;
  }

  public RequestSendOrderDerivFutureReverseLimitOrder underOver(Integer underOver) {
    this.underOver = underOver;
    return this;
  }

  /**
   * 以上／以下<br> ※未設定の場合はエラーになります。<br> ※1、2以外が指定された場合はエラーになります。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>     <tr>       <td>1</td>       <td>以下</td>     </tr>     <tr>       <td>2</td>       <td>以上</td>     </tr>   </tbody> </table>
   * @return underOver
   **/
  @Schema(required = true, description = "以上／以下<br> ※未設定の場合はエラーになります。<br> ※1、2以外が指定された場合はエラーになります。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>     <tr>       <td>1</td>       <td>以下</td>     </tr>     <tr>       <td>2</td>       <td>以上</td>     </tr>   </tbody> </table>")
      @NotNull

    public Integer getUnderOver() {
    return underOver;
  }

  public void setUnderOver(Integer underOver) {
    this.underOver = underOver;
  }

  public RequestSendOrderDerivFutureReverseLimitOrder afterHitOrderType(Integer afterHitOrderType) {
    this.afterHitOrderType = afterHitOrderType;
    return this;
  }

  /**
   * ヒット後執行条件<br> ※未設定の場合はエラーになります。<br> ※日通の注文で2以外が指定された場合はエラーになります。<br> ※日中、夜間の注文で1、2以外が指定された場合はエラーになります。<br> ※逆指値（成行）で有効期間条件(TimeInForce)にFAK以外を指定された場合はエラーになります。<br> ※逆指値（指値）で有効期間条件(TimeInForce)にFAS以外を指定された場合はエラーになります。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>     <tr>       <td>1</td>       <td>成行</td>     </tr>     <tr>       <td>2</td>       <td>指値</td>     </tr>   </tbody> </table>
   * @return afterHitOrderType
   **/
  @Schema(required = true, description = "ヒット後執行条件<br> ※未設定の場合はエラーになります。<br> ※日通の注文で2以外が指定された場合はエラーになります。<br> ※日中、夜間の注文で1、2以外が指定された場合はエラーになります。<br> ※逆指値（成行）で有効期間条件(TimeInForce)にFAK以外を指定された場合はエラーになります。<br> ※逆指値（指値）で有効期間条件(TimeInForce)にFAS以外を指定された場合はエラーになります。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>     <tr>       <td>1</td>       <td>成行</td>     </tr>     <tr>       <td>2</td>       <td>指値</td>     </tr>   </tbody> </table>")
      @NotNull

    public Integer getAfterHitOrderType() {
    return afterHitOrderType;
  }

  public void setAfterHitOrderType(Integer afterHitOrderType) {
    this.afterHitOrderType = afterHitOrderType;
  }

  public RequestSendOrderDerivFutureReverseLimitOrder afterHitPrice(Double afterHitPrice) {
    this.afterHitPrice = afterHitPrice;
    return this;
  }

  /**
   * ヒット後注文価格<br> ※未設定の場合はエラーになります。<br> ※数字以外が設定された場合はエラーになります。<br><br> ヒット後執行条件に従い、下記のようにヒット後注文価格を設定してください。  <table>   <thead>       <tr>           <th>ヒット後執行条件</th>           <th>設定価格</th>       </tr>   </thead>   <tbody>     <tr>       <td>成行</td>       <td>0</td>     </tr>     <tr>       <td>指値</td>       <td>指値の単価</td>     </tr>   </tbody> </table>
   * @return afterHitPrice
   **/
  @Schema(required = true, description = "ヒット後注文価格<br> ※未設定の場合はエラーになります。<br> ※数字以外が設定された場合はエラーになります。<br><br> ヒット後執行条件に従い、下記のようにヒット後注文価格を設定してください。  <table>   <thead>       <tr>           <th>ヒット後執行条件</th>           <th>設定価格</th>       </tr>   </thead>   <tbody>     <tr>       <td>成行</td>       <td>0</td>     </tr>     <tr>       <td>指値</td>       <td>指値の単価</td>     </tr>   </tbody> </table>")
      @NotNull

    public Double getAfterHitPrice() {
    return afterHitPrice;
  }

  public void setAfterHitPrice(Double afterHitPrice) {
    this.afterHitPrice = afterHitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSendOrderDerivFutureReverseLimitOrder requestSendOrderDerivFutureReverseLimitOrder = (RequestSendOrderDerivFutureReverseLimitOrder) o;
    return Objects.equals(this.triggerPrice, requestSendOrderDerivFutureReverseLimitOrder.triggerPrice) &&
        Objects.equals(this.underOver, requestSendOrderDerivFutureReverseLimitOrder.underOver) &&
        Objects.equals(this.afterHitOrderType, requestSendOrderDerivFutureReverseLimitOrder.afterHitOrderType) &&
        Objects.equals(this.afterHitPrice, requestSendOrderDerivFutureReverseLimitOrder.afterHitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerPrice, underOver, afterHitOrderType, afterHitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSendOrderDerivFutureReverseLimitOrder {\n");
    
    sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
    sb.append("    underOver: ").append(toIndentedString(underOver)).append("\n");
    sb.append("    afterHitOrderType: ").append(toIndentedString(afterHitOrderType)).append("\n");
    sb.append("    afterHitPrice: ").append(toIndentedString(afterHitPrice)).append("\n");
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
