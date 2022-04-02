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
 * RegistSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class RegistSuccess   {
  @JsonProperty("RegistList")
  @Valid
  private List<RequestRegisterSymbols> registList = null;

  public RegistSuccess registList(List<RequestRegisterSymbols> registList) {
    this.registList = registList;
    return this;
  }

  public RegistSuccess addRegistListItem(RequestRegisterSymbols registListItem) {
    if (this.registList == null) {
      this.registList = new ArrayList<RequestRegisterSymbols>();
    }
    this.registList.add(registListItem);
    return this;
  }

  /**
   * 現在登録されている銘柄のリスト
   * @return registList
   **/
  @Schema(description = "現在登録されている銘柄のリスト")
      @Valid
    public List<RequestRegisterSymbols> getRegistList() {
    return registList;
  }

  public void setRegistList(List<RequestRegisterSymbols> registList) {
    this.registList = registList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistSuccess registSuccess = (RegistSuccess) o;
    return Objects.equals(this.registList, registSuccess.registList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistSuccess {\n");
    
    sb.append("    registList: ").append(toIndentedString(registList)).append("\n");
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
