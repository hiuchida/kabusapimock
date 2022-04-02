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
 * 売気配数量1本目
 */
@Schema(description = "売気配数量1本目")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class BoardSuccessSell1   {
  @JsonProperty("Time")
  private OffsetDateTime time = null;

  @JsonProperty("Sign")
  private String sign = null;

  @JsonProperty("Price")
  private Double price = null;

  @JsonProperty("Qty")
  private Double qty = null;

  public BoardSuccessSell1 time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * 時刻<br>※株式銘柄の場合のみ
   * @return time
   **/
  @Schema(description = "時刻<br>※株式銘柄の場合のみ")
  
    @Valid
    public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public BoardSuccessSell1 sign(String sign) {
    this.sign = sign;
    return this;
  }

  /**
   * 気配フラグ<br>※株式・先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0000</td>           <td>事象なし</td>       </tr>       <tr>           <td>0101</td>           <td>一般気配</td>       </tr>       <tr>           <td>0102</td>           <td>特別気配</td>       </tr>       <tr>           <td>0103</td>           <td>注意気配</td>       </tr>       <tr>           <td>0107</td>           <td>寄前気配</td>       </tr>       <tr>           <td>0108</td>           <td>停止前特別気配</td>       </tr>       <tr>           <td>0109</td>           <td>引け後気配</td>       </tr>       <tr>           <td>0116</td>           <td>寄前気配約定成立ポイントなし</td>       </tr>       <tr>           <td>0117</td>           <td>寄前気配約定成立ポイントあり</td>       </tr>       <tr>           <td>0118</td>           <td>連続約定気配</td>       </tr>       <tr>           <td>0119</td>           <td>停止前の連続約定気配</td>       </tr>       <tr>           <td>0120</td>           <td>買い上がり売り下がり中</td>       </tr>   </tbody> </table>
   * @return sign
   **/
  @Schema(description = "気配フラグ<br>※株式・先物・オプション銘柄の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0000</td>           <td>事象なし</td>       </tr>       <tr>           <td>0101</td>           <td>一般気配</td>       </tr>       <tr>           <td>0102</td>           <td>特別気配</td>       </tr>       <tr>           <td>0103</td>           <td>注意気配</td>       </tr>       <tr>           <td>0107</td>           <td>寄前気配</td>       </tr>       <tr>           <td>0108</td>           <td>停止前特別気配</td>       </tr>       <tr>           <td>0109</td>           <td>引け後気配</td>       </tr>       <tr>           <td>0116</td>           <td>寄前気配約定成立ポイントなし</td>       </tr>       <tr>           <td>0117</td>           <td>寄前気配約定成立ポイントあり</td>       </tr>       <tr>           <td>0118</td>           <td>連続約定気配</td>       </tr>       <tr>           <td>0119</td>           <td>停止前の連続約定気配</td>       </tr>       <tr>           <td>0120</td>           <td>買い上がり売り下がり中</td>       </tr>   </tbody> </table>")
  
    public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  public BoardSuccessSell1 price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * 値段<br>※株式・先物・オプション銘柄の場合のみ
   * @return price
   **/
  @Schema(description = "値段<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public BoardSuccessSell1 qty(Double qty) {
    this.qty = qty;
    return this;
  }

  /**
   * 数量<br>※株式・先物・オプション銘柄の場合のみ
   * @return qty
   **/
  @Schema(description = "数量<br>※株式・先物・オプション銘柄の場合のみ")
  
    public Double getQty() {
    return qty;
  }

  public void setQty(Double qty) {
    this.qty = qty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardSuccessSell1 boardSuccessSell1 = (BoardSuccessSell1) o;
    return Objects.equals(this.time, boardSuccessSell1.time) &&
        Objects.equals(this.sign, boardSuccessSell1.sign) &&
        Objects.equals(this.price, boardSuccessSell1.price) &&
        Objects.equals(this.qty, boardSuccessSell1.qty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, sign, price, qty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardSuccessSell1 {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
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
