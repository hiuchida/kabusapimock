package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Positions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")


public class Positions   {
  @JsonProperty("HoldID")
  private String holdID = null;

  @JsonProperty("Qty")
  private Integer qty = null;

  public Positions holdID(String holdID) {
    this.holdID = holdID;
    return this;
  }

  /**
   * 返済建玉ID
   * @return holdID
   **/
  @Schema(example = "20200702E01N04699739", description = "返済建玉ID")
  
    public String getHoldID() {
    return holdID;
  }

  public void setHoldID(String holdID) {
    this.holdID = holdID;
  }

  public Positions qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * 返済建玉数量
   * @return qty
   **/
  @Schema(example = "500", description = "返済建玉数量")
  
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
    Positions positions = (Positions) o;
    return Objects.equals(this.holdID, positions.holdID) &&
        Objects.equals(this.qty, positions.qty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdID, qty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Positions {\n");
    
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
