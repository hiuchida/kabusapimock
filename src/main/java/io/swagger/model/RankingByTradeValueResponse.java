package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RankingByTradeValueResponseRanking;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RankingByTradeValueResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")


public class RankingByTradeValueResponse  implements OneOfinlineResponse200 {
  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("ExchangeDivision")
  private String exchangeDivision = null;

  @JsonProperty("Ranking")
  @Valid
  private List<RankingByTradeValueResponseRanking> ranking = null;

  public RankingByTradeValueResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * 種別
   * @return type
   **/
  @Schema(description = "種別")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RankingByTradeValueResponse exchangeDivision(String exchangeDivision) {
    this.exchangeDivision = exchangeDivision;
    return this;
  }

  /**
   * 市場
   * @return exchangeDivision
   **/
  @Schema(description = "市場")
  
    public String getExchangeDivision() {
    return exchangeDivision;
  }

  public void setExchangeDivision(String exchangeDivision) {
    this.exchangeDivision = exchangeDivision;
  }

  public RankingByTradeValueResponse ranking(List<RankingByTradeValueResponseRanking> ranking) {
    this.ranking = ranking;
    return this;
  }

  public RankingByTradeValueResponse addRankingItem(RankingByTradeValueResponseRanking rankingItem) {
    if (this.ranking == null) {
      this.ranking = new ArrayList<RankingByTradeValueResponseRanking>();
    }
    this.ranking.add(rankingItem);
    return this;
  }

  /**
   * ランキング
   * @return ranking
   **/
  @Schema(description = "ランキング")
      @Valid
    public List<RankingByTradeValueResponseRanking> getRanking() {
    return ranking;
  }

  public void setRanking(List<RankingByTradeValueResponseRanking> ranking) {
    this.ranking = ranking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingByTradeValueResponse rankingByTradeValueResponse = (RankingByTradeValueResponse) o;
    return Objects.equals(this.type, rankingByTradeValueResponse.type) &&
        Objects.equals(this.exchangeDivision, rankingByTradeValueResponse.exchangeDivision) &&
        Objects.equals(this.ranking, rankingByTradeValueResponse.ranking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, exchangeDivision, ranking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingByTradeValueResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    exchangeDivision: ").append(toIndentedString(exchangeDivision)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
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
