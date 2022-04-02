package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.PositionsSuccess;
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
public class PositionsApiController implements PositionsApi {

    private static final Logger log = LoggerFactory.getLogger(PositionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PositionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<PositionsSuccess>> positionsGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.QUERY, description = "取得する商品 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0</td>           <td>すべて</td>       </tr>       <tr>           <td>1</td>           <td>現物</td>       </tr>       <tr>           <td>2</td>           <td>信用</td>       </tr>       <tr>           <td>3</td>           <td>先物</td>       </tr>       <tr>           <td>4</td>           <td>OP</td>       </tr>   </tbody> </table>" ,schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @Valid @RequestParam(value = "product", required = false) String product,@Parameter(in = ParameterIn.QUERY, description = "銘柄コード<br>※指定された銘柄コードと一致するポジションのみレスポンスします。<br>※複数の銘柄コードを指定することはできません。" ,schema=@Schema()) @Valid @RequestParam(value = "symbol", required = false) String symbol,@Parameter(in = ParameterIn.QUERY, description = "売買区分フィルタ<br> 指定された売買区分と一致する注文を返す <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>売</td>       </tr>       <tr>           <td>2</td>           <td>買</td>       </tr>   </tbody> </table>" ,schema=@Schema(allowableValues={ "1", "2" }
)) @Valid @RequestParam(value = "side", required = false) String side,@Parameter(in = ParameterIn.QUERY, description = "追加情報出力フラグ（未指定時：true）<br> ※追加情報は、「現在値」、「評価金額」、「評価損益額」、「評価損益率」を意味します。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>true</td>           <td>追加情報を出力する</td>       </tr>       <tr>           <td>false</td>           <td>追加情報を出力しない</td>       </tr>   </tbody> </table>" ,schema=@Schema()) @Valid @RequestParam(value = "addinfo", required = false) String addinfo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<PositionsSuccess>>(objectMapper.readValue("[ {\n  \"ExecutionID\" : \"20200715E02N04738464\",\n  \"AccountType\" : 4,\n  \"Symbol\" : 8306,\n  \"SymbolName\" : \"三菱ＵＦＪフィナンシャル・グループ\",\n  \"Exchange\" : 1,\n  \"ExchangeName\" : \"東証１部\",\n  \"ExecutionDay\" : 20200702,\n  \"Price\" : 704,\n  \"LeavesQty\" : 500,\n  \"HoldQty\" : 0,\n  \"Side\" : \"1\",\n  \"Expenses\" : 0,\n  \"Commission\" : 1620,\n  \"CommissionTax\" : 162,\n  \"ExpireDay\" : 20201229,\n  \"MarginTradeType\" : 1,\n  \"CurrentPrice\" : 414.5,\n  \"Valuation\" : 207250,\n  \"ProfitLoss\" : 144750,\n  \"ProfitLossRate\" : 41.12215909090909\n}, {\n  \"ExecutionID\" : \"20200715E02N04738464\",\n  \"AccountType\" : 4,\n  \"Symbol\" : 8306,\n  \"SymbolName\" : \"三菱ＵＦＪフィナンシャル・グループ\",\n  \"Exchange\" : 1,\n  \"ExchangeName\" : \"東証１部\",\n  \"ExecutionDay\" : 20200702,\n  \"Price\" : 704,\n  \"LeavesQty\" : 500,\n  \"HoldQty\" : 0,\n  \"Side\" : \"1\",\n  \"Expenses\" : 0,\n  \"Commission\" : 1620,\n  \"CommissionTax\" : 162,\n  \"ExpireDay\" : 20201229,\n  \"MarginTradeType\" : 1,\n  \"CurrentPrice\" : 414.5,\n  \"Valuation\" : 207250,\n  \"ProfitLoss\" : 144750,\n  \"ProfitLossRate\" : 41.12215909090909\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PositionsSuccess>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PositionsSuccess>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
