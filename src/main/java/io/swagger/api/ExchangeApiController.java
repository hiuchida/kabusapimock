package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.ExchangeResponse;
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
public class ExchangeApiController implements ExchangeApi {

    private static final Logger log = LoggerFactory.getLogger(ExchangeApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ExchangeApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ExchangeResponse> exchangeGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.PATH, description = "通貨 <table>   <thead>     <tr>       <th>定義値</th>       <th>内容</th>     </tr>   </thead>   <tbody>     <tr>       <td>usdjpy</td>       <td>USD/JPY</td>     </tr>     <tr>       <td>eurjpy</td>       <td>EUR/JPY</td>     </tr>     <tr>       <td>gbpjpy</td>       <td>GBP/JPY</td>     </tr>     <tr>       <td>audjpy</td>       <td>AUD/JPY</td>     </tr>     <tr>       <td>chfjpy</td>       <td>CHF/JPY</td>     </tr>     <tr>       <td>cadjpy</td>       <td>CAD/JPY</td>     </tr>     <tr>       <td>nzdjpy</td>       <td>NZD/JPY</td>     </tr>     <tr>       <td>zarjpy</td>       <td>ZAR/JPY</td>     </tr>     <tr>       <td>eurusd</td>       <td>EUR/USD</td>     </tr>     <tr>       <td>gbpusd</td>       <td>GBP/USD</td>     </tr>     <tr>       <td>audusd</td>       <td>AUD/USD</td>     </tr>   </tbody> </table>", required=true, schema=@Schema(allowableValues={ "usdjpy", "eurjpy", "gbpjpy", "audjpy", "chfjpy", "cadjpy", "nzdjpy", "zarjpy", "eurusd", "gbpusd", "audusd" }
)) @PathVariable("symbol") String symbol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExchangeResponse>(objectMapper.readValue("{\n  \"Symbol\" : \"USD/JPY\",\n  \"BidPrice\" : 105.502,\n  \"Spread\" : 0.2,\n  \"AskPrice\" : 105.504,\n  \"Change\" : -0.055,\n  \"Time\" : \"16:10:45\"\n}", ExchangeResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExchangeResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExchangeResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
