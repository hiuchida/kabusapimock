package io.swagger.api;

import io.swagger.model.BoardSuccess;
import io.swagger.model.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-02T09:52:30.553Z[GMT]")
@RestController
public class BoardApiController implements BoardApi {

    private static final Logger log = LoggerFactory.getLogger(BoardApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BoardApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BoardSuccess> boardGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.PATH, description = "銘柄コード <br> ※次の形式で入力してください。<br> [銘柄コード]@[市場コード]<br> ※市場コードは下記の定義値から選択してください。 <b>市場コード</b> <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>", required=true, schema=@Schema()) @PathVariable("symbol") String symbol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BoardSuccess>(objectMapper.readValue("{\n  \"Symbol\" : \"5401\",\n  \"SymbolName\" : \"新日鐵住金\",\n  \"Exchange\" : 1,\n  \"ExchangeName\" : \"東証１部\",\n  \"CurrentPrice\" : 2408,\n  \"CurrentPriceTime\" : \"2020-07-22T15:00:00+09:00\",\n  \"CurrentPriceChangeStatus\" : \"0058\",\n  \"CurrentPriceStatus\" : 1,\n  \"CalcPrice\" : 343.7,\n  \"PreviousClose\" : 1048,\n  \"PreviousCloseTime\" : \"2020-07-21T00:00:00+09:00\",\n  \"ChangePreviousClose\" : 1360,\n  \"ChangePreviousClosePer\" : 129.77,\n  \"OpeningPrice\" : 2380,\n  \"OpeningPriceTime\" : \"2020-07-22T09:00:00+09:00\",\n  \"HighPrice\" : 2418,\n  \"HighPriceTime\" : \"2020-07-22T13:25:47+09:00\",\n  \"LowPrice\" : 2370,\n  \"LowPriceTime\" : \"2020-07-22T10:00:04+09:00\",\n  \"TradingVolume\" : 4571500,\n  \"TradingVolumeTime\" : \"2020-07-22T15:00:00+09:00\",\n  \"VWAP\" : 2394.4262,\n  \"TradingValue\" : 10946119350,\n  \"BidQty\" : 100,\n  \"BidPrice\" : 2408.5,\n  \"BidTime\" : \"2020-07-22T14:59:59+09:00\",\n  \"BidSign\" : \"0101\",\n  \"MarketOrderSellQty\" : 0,\n  \"Sell1\" : {\n    \"Time\" : \"2020-07-22T14:59:59+09:00\",\n    \"Sign\" : \"0101\",\n    \"Price\" : 2408.5,\n    \"Qty\" : 100\n  },\n  \"Sell2\" : {\n    \"Price\" : 2409,\n    \"Qty\" : 800\n  },\n  \"Sell3\" : {\n    \"Price\" : 2409.5,\n    \"Qty\" : 2100\n  },\n  \"Sell4\" : {\n    \"Price\" : 2410,\n    \"Qty\" : 800\n  },\n  \"Sell5\" : {\n    \"Price\" : 2410.5,\n    \"Qty\" : 500\n  },\n  \"Sell6\" : {\n    \"Price\" : 2411,\n    \"Qty\" : 8400\n  },\n  \"Sell7\" : {\n    \"Price\" : 2411.5,\n    \"Qty\" : 1200\n  },\n  \"Sell8\" : {\n    \"Price\" : 2412,\n    \"Qty\" : 27200\n  },\n  \"Sell9\" : {\n    \"Price\" : 2412.5,\n    \"Qty\" : 400\n  },\n  \"Sell10\" : {\n    \"Price\" : 2413,\n    \"Qty\" : 16400\n  },\n  \"AskQty\" : 200,\n  \"AskPrice\" : 2407.5,\n  \"AskTime\" : \"2020-07-22T14:59:59+09:00\",\n  \"AskSign\" : \"0101\",\n  \"MarketOrderBuyQty\" : 0,\n  \"Buy1\" : {\n    \"Time\" : \"2020-07-22T14:59:59+09:00\",\n    \"Sign\" : \"0101\",\n    \"Price\" : 2407.5,\n    \"Qty\" : 200\n  },\n  \"Buy2\" : {\n    \"Price\" : 2407,\n    \"Qty\" : 400\n  },\n  \"Buy3\" : {\n    \"Price\" : 2406.5,\n    \"Qty\" : 1000\n  },\n  \"Buy4\" : {\n    \"Price\" : 2406,\n    \"Qty\" : 5800\n  },\n  \"Buy5\" : {\n    \"Price\" : 2405.5,\n    \"Qty\" : 7500\n  },\n  \"Buy6\" : {\n    \"Price\" : 2405,\n    \"Qty\" : 2200\n  },\n  \"Buy7\" : {\n    \"Price\" : 2404.5,\n    \"Qty\" : 16700\n  },\n  \"Buy8\" : {\n    \"Price\" : 2403,\n    \"Qty\" : 1300\n  },\n  \"Buy9\" : {\n    \"Price\" : 2403.5,\n    \"Qty\" : 1300\n  },\n  \"Buy10\" : {\n    \"Price\" : 2403,\n    \"Qty\" : 3000\n  },\n  \"OverSellQty\" : 974900,\n  \"UnderBuyQty\" : 756000,\n  \"TotalMarketValue\" : 3.2662546593614E12,\n  \"SecurityType\" : 1\n}", BoardSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BoardSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BoardSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

}
