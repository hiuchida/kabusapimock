package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SymbolNameSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class SymbolNameSuccess   {
  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("SymbolName")
  private String symbolName = null;

  public SymbolNameSuccess symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * 銘柄コード
   * @return symbol
   **/
  @Schema(example = "136091318", description = "銘柄コード")
  
    public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public SymbolNameSuccess symbolName(String symbolName) {
    this.symbolName = symbolName;
    return this;
  }

  /**
   * 銘柄名称
   * @return symbolName
   **/
  @Schema(example = "日経平均オプション 21/09 プット 31375", description = "銘柄名称")
  
    public String getSymbolName() {
    return symbolName;
  }

  public void setSymbolName(String symbolName) {
    this.symbolName = symbolName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolNameSuccess symbolNameSuccess = (SymbolNameSuccess) o;
    return Objects.equals(this.symbol, symbolNameSuccess.symbol) &&
        Objects.equals(this.symbolName, symbolNameSuccess.symbolName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, symbolName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymbolNameSuccess {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
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
