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
 * RequestRegister
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class RequestRegister   {
  @JsonProperty("Symbols")
  @Valid
  private List<RequestRegisterSymbols> symbols = null;

  public RequestRegister symbols(List<RequestRegisterSymbols> symbols) {
    this.symbols = symbols;
    return this;
  }

  public RequestRegister addSymbolsItem(RequestRegisterSymbols symbolsItem) {
    if (this.symbols == null) {
      this.symbols = new ArrayList<RequestRegisterSymbols>();
    }
    this.symbols.add(symbolsItem);
    return this;
  }

  /**
   * Get symbols
   * @return symbols
   **/
  @Schema(description = "")
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
    RequestRegister requestRegister = (RequestRegister) o;
    return Objects.equals(this.symbols, requestRegister.symbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestRegister {\n");
    
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
