package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PrimaryExchangeResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class PrimaryExchangeResponse   {
  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("PrimaryExchange")
  private Integer primaryExchange = null;

  public PrimaryExchangeResponse symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * 銘柄コード<br>※対象商品は、株式のみ
   * @return symbol
   **/
  @Schema(description = "銘柄コード<br>※対象商品は、株式のみ")
  
    public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public PrimaryExchangeResponse primaryExchange(Integer primaryExchange) {
    this.primaryExchange = primaryExchange;
    return this;
  }

  /**
   * 優先市場 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>   </tbody> </table>
   * @return primaryExchange
   **/
  @Schema(description = "優先市場 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>   </tbody> </table>")
  
    public Integer getPrimaryExchange() {
    return primaryExchange;
  }

  public void setPrimaryExchange(Integer primaryExchange) {
    this.primaryExchange = primaryExchange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaryExchangeResponse primaryExchangeResponse = (PrimaryExchangeResponse) o;
    return Objects.equals(this.symbol, primaryExchangeResponse.symbol) &&
        Objects.equals(this.primaryExchange, primaryExchangeResponse.primaryExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, primaryExchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrimaryExchangeResponse {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    primaryExchange: ").append(toIndentedString(primaryExchange)).append("\n");
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
