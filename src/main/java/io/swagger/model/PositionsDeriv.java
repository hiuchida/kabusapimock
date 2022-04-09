package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PositionsDeriv
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class PositionsDeriv   {
  @JsonProperty("HoldID")
  private String holdID = null;

  @JsonProperty("Qty")
  private Integer qty = null;

  public PositionsDeriv holdID(String holdID) {
    this.holdID = holdID;
    return this;
  }

  /**
   * 返済建玉ID
   * @return holdID
   **/
  @Schema(description = "返済建玉ID")
  
    public String getHoldID() {
    return holdID;
  }

  public void setHoldID(String holdID) {
    this.holdID = holdID;
  }

  public PositionsDeriv qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * 返済建玉数量
   * @return qty
   **/
  @Schema(description = "返済建玉数量")
  
    public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
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
    PositionsDeriv positionsDeriv = (PositionsDeriv) o;
    return Objects.equals(this.holdID, positionsDeriv.holdID) &&
        Objects.equals(this.qty, positionsDeriv.qty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdID, qty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionsDeriv {\n");
    
    sb.append("    holdID: ").append(toIndentedString(holdID)).append("\n");
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
