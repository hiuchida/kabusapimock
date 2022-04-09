package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.WalletCashSuccess;
import io.swagger.model.WalletFutureSuccess;
import io.swagger.model.WalletMarginSuccess;
import io.swagger.model.WalletOptionSuccess;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")
@RestController
public class WalletApiController implements WalletApi {

    private static final Logger log = LoggerFactory.getLogger(WalletApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WalletApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<WalletCashSuccess> walletCashGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletCashSuccess>(objectMapper.readValue("{\n  \"StockAccountWallet\" : 0.8008281904610115\n}", WalletCashSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletCashSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletCashSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WalletCashSuccess> walletCashSymbolGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.PATH, description = "銘柄コード <br> ※次の形式で入力してください。<br> [銘柄コード]@[市場コード]<br> ※市場コードは下記の定義値から選択してください。 <b>市場コード</b> <table>   <thead>     <tr>       <th>定義値</th>       <th>説明</th>     </tr>   </thead>   <tbody>     <tr>       <td>1</td>       <td>東証</td>     </tr>     <tr>       <td>3</td>       <td>名証</td>     </tr>     <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>   </tbody> </table>", required=true, schema=@Schema()) @PathVariable("symbol") String symbol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletCashSuccess>(objectMapper.readValue("{\n  \"StockAccountWallet\" : 0.8008281904610115\n}", WalletCashSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletCashSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletCashSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WalletFutureSuccess> walletFutureGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletFutureSuccess>(objectMapper.readValue("{\n  \"FutureTradeLimit\" : 0.8008281904610115,\n  \"MarginRequirement\" : 6.027456183070403\n}", WalletFutureSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletFutureSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletFutureSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WalletFutureSuccess> walletFutureSymbolGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.PATH, description = "銘柄コード <br> ※次の形式で入力してください。<br> [銘柄コード]@[市場コード]<br> ※市場コードは下記の定義値から選択してください。 <b>市場コード</b> <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>", required=true, schema=@Schema()) @PathVariable("symbol") String symbol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletFutureSuccess>(objectMapper.readValue("{\n  \"FutureTradeLimit\" : 0.8008281904610115,\n  \"MarginRequirement\" : 6.027456183070403\n}", WalletFutureSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletFutureSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletFutureSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WalletMarginSuccess> walletMarginGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletMarginSuccess>(objectMapper.readValue("{\n  \"ConsignmentDepositRate\" : 1.4658129805029452,\n  \"CashOfConsignmentDepositRate\" : 5.962133916683182,\n  \"MarginAccountWallet\" : 0.8008281904610115,\n  \"DepositkeepRate\" : 6.027456183070403\n}", WalletMarginSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletMarginSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletMarginSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WalletMarginSuccess> walletMarginSymbolGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.PATH, description = "銘柄コード <br> ※次の形式で入力してください。<br> [銘柄コード]@[市場コード]<br> ※市場コードは下記の定義値から選択してください。 <b>市場コード</b> <table>   <thead>     <tr>       <th>定義値</th>       <th>説明</th>     </tr>   </thead>   <tbody>     <tr>       <td>1</td>       <td>東証</td>     </tr>     <tr>       <td>3</td>       <td>名証</td>     </tr>   </tbody> </table>", required=true, schema=@Schema()) @PathVariable("symbol") String symbol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletMarginSuccess>(objectMapper.readValue("{\n  \"ConsignmentDepositRate\" : 1.4658129805029452,\n  \"CashOfConsignmentDepositRate\" : 5.962133916683182,\n  \"MarginAccountWallet\" : 0.8008281904610115,\n  \"DepositkeepRate\" : 6.027456183070403\n}", WalletMarginSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletMarginSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletMarginSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WalletOptionSuccess> walletOptionGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletOptionSuccess>(objectMapper.readValue("{\n  \"OptionSellTradeLimit\" : 6.027456183070403,\n  \"MarginRequirement\" : 1.4658129805029452,\n  \"OptionBuyTradeLimit\" : 0.8008281904610115\n}", WalletOptionSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletOptionSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletOptionSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WalletOptionSuccess> walletOptionSymbolGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.PATH, description = "銘柄コード <br> ※次の形式で入力してください。<br> [銘柄コード]@[市場コード]<br> ※市場コードは下記の定義値から選択してください。 <b>市場コード</b> <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>", required=true, schema=@Schema()) @PathVariable("symbol") String symbol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletOptionSuccess>(objectMapper.readValue("{\n  \"OptionSellTradeLimit\" : 6.027456183070403,\n  \"MarginRequirement\" : 1.4658129805029452,\n  \"OptionBuyTradeLimit\" : 0.8008281904610115\n}", WalletOptionSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletOptionSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletOptionSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

}
