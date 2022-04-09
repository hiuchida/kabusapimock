package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.SymbolNameSuccess;
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
public class SymbolnameApiController implements SymbolnameApi {

    private static final Logger log = LoggerFactory.getLogger(SymbolnameApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SymbolnameApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SymbolNameSuccess> symbolnameFutureGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@NotNull @Parameter(in = ParameterIn.QUERY, description = "限月<br> ※限月はyyyyMM形式で指定します。0を指定した場合、直近限月となります。<br> ※取引最終日に「0」（直近限月）を指定した場合、日中・夜間の時間帯に関わらず、 取引最終日を迎える限月の銘柄コードを返します。取引最終日を迎える銘柄の取引は日中取引をもって終了となりますので、ご注意ください。" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "DerivMonth", required = true) Integer derivMonth,@Parameter(in = ParameterIn.QUERY, description = "先物コード<br> ※大文字小文字は区別しません。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>NK225</td>           <td>日経平均先物</td>       </tr>       <tr>           <td>NK225mini</td>           <td>日経225mini先物</td>       </tr>       <tr>           <td>TOPIX</td>           <td>TOPIX先物</td>       </tr>       <tr>           <td>TOPIXmini</td>           <td>ミニTOPIX先物</td>       </tr>       <tr>           <td>MOTHERS</td>           <td>東証マザーズ先物</td>       </tr>       <tr>           <td>JPX400</td>           <td>JPX日経400先物</td>       </tr>       <tr>           <td>DOW</td>           <td>NYダウ先物</td>       </tr>       <tr>           <td>VI</td>           <td>日経平均VI先物</td>       </tr>       <tr>           <td>Core30</td>           <td>TOPIX Core30先物</td>       </tr>       <tr>           <td>REIT</td>           <td>東証REIT指数先物</td>       </tr>   </tbody> </table>" ,schema=@Schema()) @Valid @RequestParam(value = "FutureCode", required = false) String futureCode) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SymbolNameSuccess>(objectMapper.readValue(
"{\n  \"Symbol\" : \"167060019\",\n  \"SymbolName\" : \"日経225mini 22/06\"\n}",
						SymbolNameSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SymbolNameSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SymbolNameSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SymbolNameSuccess> symbolnameOptionGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@NotNull @Parameter(in = ParameterIn.QUERY, description = "限月<br>※限月はyyyyMM形式で指定します。0を指定した場合、直近限月となります。<br>※取引最終日に「0」（直近限月）を指定した場合、日中・夜間の時間帯に関わらず、取引最終日を迎える限月の銘柄コードを返します。取引最終日を迎える銘柄の取引は日中取引をもって終了となりますので、ご注意ください。" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "DerivMonth", required = true) Integer derivMonth,@NotNull @Parameter(in = ParameterIn.QUERY, description = "コール or プット<br> ※大文字小文字は区別しません。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>P</td>           <td>PUT</td>       </tr>       <tr>           <td>C</td>           <td>CALL</td>       </tr>   </tbody> </table>" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "PutOrCall", required = true) String putOrCall,@NotNull @Parameter(in = ParameterIn.QUERY, description = "権利行使価格<br>※0を指定した場合、APIを実行した時点でのATMとなります。" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "StrikePrice", required = true) Integer strikePrice) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SymbolNameSuccess>(objectMapper.readValue(
"{\n  \"Symbol\" : \"136091318\",\n  \"SymbolName\" : \"日経平均オプション 21/09 プット 31375\"\n}",
						SymbolNameSuccess.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SymbolNameSuccess>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SymbolNameSuccess>(HttpStatus.NOT_IMPLEMENTED);
    }

}
