package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UnregisterAllSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class UnregisterAllSuccess   {
  @JsonProperty("RegistList")
  private Object registList = null;

  public UnregisterAllSuccess registList(Object registList) {
    this.registList = registList;
    return this;
  }

  /**
   * 現在登録されている銘柄のリスト<br>※銘柄登録解除が正常に行われれば、空リストを返します。<br>　登録解除でエラー等が発生した場合、現在登録されている銘柄のリストを返します
   * @return registList
   **/
  @Schema(example = "[]", description = "現在登録されている銘柄のリスト<br>※銘柄登録解除が正常に行われれば、空リストを返します。<br>　登録解除でエラー等が発生した場合、現在登録されている銘柄のリストを返します")
  
    public Object getRegistList() {
    return registList;
  }

  public void setRegistList(Object registList) {
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
    UnregisterAllSuccess unregisterAllSuccess = (UnregisterAllSuccess) o;
    return Objects.equals(this.registList, unregisterAllSuccess.registList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnregisterAllSuccess {\n");
    
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
