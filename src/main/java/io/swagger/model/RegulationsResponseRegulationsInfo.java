package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegulationsResponseRegulationsInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class RegulationsResponseRegulationsInfo   {
  @JsonProperty("Exchange")
  private Integer exchange = null;

  @JsonProperty("Product")
  private Integer product = null;

  @JsonProperty("Side")
  private String side = null;

  @JsonProperty("Reason")
  private String reason = null;

  @JsonProperty("LimitStartDay")
  private String limitStartDay = null;

  @JsonProperty("LimitEndDay")
  private String limitEndDay = null;

  @JsonProperty("Level")
  private Integer level = null;

  public RegulationsResponseRegulationsInfo exchange(Integer exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * 規制市場 <table>   <thead>     <tr>       <th>定義値</th>       <th>内容</th>     </tr>   </thead>   <tbody>     <tr>       <td>0</td>       <td>全対象</td>     </tr>     <tr>       <td>1</td>       <td>東証</td>     </tr>     <tr>       <td>3</td>       <td>名証</td>     </tr>     <tr>       <td>5</td>       <td>福証</td>     </tr>     <tr>       <td>6</td>       <td>札証</td>     </tr>     <tr>       <td>9</td>       <td>SOR</td>     </tr>     <tr>       <td>10</td>       <td>CXJ</td>     </tr>     <tr>       <td>21</td>       <td>JNX</td>     </tr>   </tbody> </table>
   * @return exchange
   **/
  @Schema(description = "規制市場 <table>   <thead>     <tr>       <th>定義値</th>       <th>内容</th>     </tr>   </thead>   <tbody>     <tr>       <td>0</td>       <td>全対象</td>     </tr>     <tr>       <td>1</td>       <td>東証</td>     </tr>     <tr>       <td>3</td>       <td>名証</td>     </tr>     <tr>       <td>5</td>       <td>福証</td>     </tr>     <tr>       <td>6</td>       <td>札証</td>     </tr>     <tr>       <td>9</td>       <td>SOR</td>     </tr>     <tr>       <td>10</td>       <td>CXJ</td>     </tr>     <tr>       <td>21</td>       <td>JNX</td>     </tr>   </tbody> </table>")
  
    public Integer getExchange() {
    return exchange;
  }

  public void setExchange(Integer exchange) {
    this.exchange = exchange;
  }

  public RegulationsResponseRegulationsInfo product(Integer product) {
    this.product = product;
    return this;
  }

  /**
   * 規制取引区分<br> ※空売り規制の場合、「4：新規」 <table>   <thead>     <tr>       <th>定義値</th>       <th>内容</th>     </tr>   </thead>   <tbody>     <tr>       <td>0</td>       <td>全対象</td>     </tr>     <tr>       <td>1</td>       <td>現物</td>     </tr>     <tr>       <td>2</td>       <td>信用新規（制度）</td>     </tr>     <tr>       <td>3</td>       <td>信用新規（一般）</td>     </tr>     <tr>       <td>4</td>       <td>新規</td>     </tr>     <tr>       <td>5</td>       <td>信用返済（制度）</td>     </tr>     <tr>       <td>6</td>       <td>信用返済（一般）</td>     </tr>     <tr>       <td>7</td>       <td>返済</td>     </tr>     <tr>       <td>8</td>       <td>品受</td>     </tr>     <tr>       <td>9</td>       <td>品渡</td>     </tr>   </tbody> </table>
   * @return product
   **/
  @Schema(description = "規制取引区分<br> ※空売り規制の場合、「4：新規」 <table>   <thead>     <tr>       <th>定義値</th>       <th>内容</th>     </tr>   </thead>   <tbody>     <tr>       <td>0</td>       <td>全対象</td>     </tr>     <tr>       <td>1</td>       <td>現物</td>     </tr>     <tr>       <td>2</td>       <td>信用新規（制度）</td>     </tr>     <tr>       <td>3</td>       <td>信用新規（一般）</td>     </tr>     <tr>       <td>4</td>       <td>新規</td>     </tr>     <tr>       <td>5</td>       <td>信用返済（制度）</td>     </tr>     <tr>       <td>6</td>       <td>信用返済（一般）</td>     </tr>     <tr>       <td>7</td>       <td>返済</td>     </tr>     <tr>       <td>8</td>       <td>品受</td>     </tr>     <tr>       <td>9</td>       <td>品渡</td>     </tr>   </tbody> </table>")
  
    public Integer getProduct() {
    return product;
  }

  public void setProduct(Integer product) {
    this.product = product;
  }

  public RegulationsResponseRegulationsInfo side(String side) {
    this.side = side;
    return this;
  }

  /**
   * 規制売買<br> ※空売り規制の場合、「1：売」 <table>   <thead>     <tr>       <th>定義値</th>       <th>内容</th>     </tr>   </thead>   <tbody>     <tr>       <td>0</td>       <td>全対象</td>     </tr>     <tr>       <td>1</td>       <td>売</td>     </tr>     <tr>       <td>2</td>       <td>買</td>     </tr>   </tbody> </table>
   * @return side
   **/
  @Schema(description = "規制売買<br> ※空売り規制の場合、「1：売」 <table>   <thead>     <tr>       <th>定義値</th>       <th>内容</th>     </tr>   </thead>   <tbody>     <tr>       <td>0</td>       <td>全対象</td>     </tr>     <tr>       <td>1</td>       <td>売</td>     </tr>     <tr>       <td>2</td>       <td>買</td>     </tr>   </tbody> </table>")
  
    public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public RegulationsResponseRegulationsInfo reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * 理由<br>※空売り規制の場合、「空売り規制」
   * @return reason
   **/
  @Schema(description = "理由<br>※空売り規制の場合、「空売り規制」")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public RegulationsResponseRegulationsInfo limitStartDay(String limitStartDay) {
    this.limitStartDay = limitStartDay;
    return this;
  }

  /**
   * 制限開始日<br>yyyy/MM/dd HH:mm形式  <br>※空売り規制の場合、null
   * @return limitStartDay
   **/
  @Schema(description = "制限開始日<br>yyyy/MM/dd HH:mm形式  <br>※空売り規制の場合、null")
  
    public String getLimitStartDay() {
    return limitStartDay;
  }

  public void setLimitStartDay(String limitStartDay) {
    this.limitStartDay = limitStartDay;
  }

  public RegulationsResponseRegulationsInfo limitEndDay(String limitEndDay) {
    this.limitEndDay = limitEndDay;
    return this;
  }

  /**
   * 制限終了日<br>yyyy/MM/dd HH:mm形式  <br>※空売り規制の場合、null
   * @return limitEndDay
   **/
  @Schema(description = "制限終了日<br>yyyy/MM/dd HH:mm形式  <br>※空売り規制の場合、null")
  
    public String getLimitEndDay() {
    return limitEndDay;
  }

  public void setLimitEndDay(String limitEndDay) {
    this.limitEndDay = limitEndDay;
  }

  public RegulationsResponseRegulationsInfo level(Integer level) {
    this.level = level;
    return this;
  }

  /**
   * コンプライアンスレベル<br> ※空売り規制の場合、null <table>   <thead>     <tr>       <th>定義値</th>       <th>内容</th>     </tr>   </thead>   <tbody>     <tr>       <td>０</td>       <td>規制無し</td>     </tr>     <tr>       <td>１</td>       <td>ワーニング</td>     </tr>     <tr>       <td>２</td>       <td>エラー</td>     </tr>   </tbody> </table>
   * @return level
   **/
  @Schema(description = "コンプライアンスレベル<br> ※空売り規制の場合、null <table>   <thead>     <tr>       <th>定義値</th>       <th>内容</th>     </tr>   </thead>   <tbody>     <tr>       <td>０</td>       <td>規制無し</td>     </tr>     <tr>       <td>１</td>       <td>ワーニング</td>     </tr>     <tr>       <td>２</td>       <td>エラー</td>     </tr>   </tbody> </table>")
  
    public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulationsResponseRegulationsInfo regulationsResponseRegulationsInfo = (RegulationsResponseRegulationsInfo) o;
    return Objects.equals(this.exchange, regulationsResponseRegulationsInfo.exchange) &&
        Objects.equals(this.product, regulationsResponseRegulationsInfo.product) &&
        Objects.equals(this.side, regulationsResponseRegulationsInfo.side) &&
        Objects.equals(this.reason, regulationsResponseRegulationsInfo.reason) &&
        Objects.equals(this.limitStartDay, regulationsResponseRegulationsInfo.limitStartDay) &&
        Objects.equals(this.limitEndDay, regulationsResponseRegulationsInfo.limitEndDay) &&
        Objects.equals(this.level, regulationsResponseRegulationsInfo.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchange, product, side, reason, limitStartDay, limitEndDay, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulationsResponseRegulationsInfo {\n");
    
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    limitStartDay: ").append(toIndentedString(limitStartDay)).append("\n");
    sb.append("    limitEndDay: ").append(toIndentedString(limitEndDay)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
