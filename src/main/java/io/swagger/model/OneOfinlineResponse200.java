package io.swagger.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* OneOfinlineResponse200
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = RankingDefaultResponse.class, name = "RankingDefaultResponse"),
  @JsonSubTypes.Type(value = RankingByTickCountResponse.class, name = "RankingByTickCountResponse"),
  @JsonSubTypes.Type(value = RankingByTradeVolumeResponse.class, name = "RankingByTradeVolumeResponse"),
  @JsonSubTypes.Type(value = RankingByTradeValueResponse.class, name = "RankingByTradeValueResponse"),
  @JsonSubTypes.Type(value = RankingByMarginResponse.class, name = "RankingByMarginResponse"),
  @JsonSubTypes.Type(value = RankingByCategoryResponse.class, name = "RankingByCategoryResponse")
})
public interface OneOfinlineResponse200 {

}
