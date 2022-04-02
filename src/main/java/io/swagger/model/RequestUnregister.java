package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RequestRegisterSymbols;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestUnregister
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class RequestUnregister   {
  @JsonProperty("Symbols")
  @Valid
  private List<RequestRegisterSymbols> symbols = null;

  public RequestUnregister symbols(List<RequestRegisterSymbols> symbols) {
    this.symbols = symbols;
    return this;
  }

  public RequestUnregister addSymbolsItem(RequestRegisterSymbols symbolsItem) {
    if (this.symbols == null) {
      this.symbols = new ArrayList<RequestRegisterSymbols>();
    }
    this.symbols.add(symbolsItem);
    return this;
  }

  /**
   * ※為替銘柄を登録する場合、銘柄名は\"通貨A\" + \"/\" + \"通貨B\"、市場コードは\"300\"で指定してください。 例：'Symbol': 'EUR/USD', \"Exchange\": 300
   * @return symbols
   **/
  @Schema(description = "※為替銘柄を登録する場合、銘柄名は\"通貨A\" + \"/\" + \"通貨B\"、市場コードは\"300\"で指定してください。 例：'Symbol': 'EUR/USD', \"Exchange\": 300")
      @Valid
    public List<RequestRegisterSymbols> getSymbols() {
    return symbols;
  }

  public void setSymbols(List<RequestRegisterSymbols> symbols) {
    this.symbols = symbols;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestUnregister requestUnregister = (RequestUnregister) o;
    return Objects.equals(this.symbols, requestUnregister.symbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestUnregister {\n");
    
    sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
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
