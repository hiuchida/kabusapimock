package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.RegulationsResponse;
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
public class RegulationsApiController implements RegulationsApi {

    private static final Logger log = LoggerFactory.getLogger(RegulationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegulationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<RegulationsResponse> regulationsGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.PATH, description = "銘柄コード <br> ※次の形式で入力してください。<br> [銘柄コード]@[市場コード]<br> ※市場コードは下記の定義値から選択してください。 <b>市場コード</b> <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>   </tbody> </table>", required=true, schema=@Schema()) @PathVariable("symbol") String symbol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RegulationsResponse>(objectMapper.readValue("{\n  \"Symbol\" : \"5614\",\n  \"RegulationsInfo\" : [ {\n    \"Exchange\" : 1,\n    \"Product\" : 8,\n    \"Side\" : \"2\",\n    \"Reason\" : \"品受停止（貸借申込停止銘柄（日証金規制））\",\n    \"LimitStartDay\" : \"2020/10/01 00:00\",\n    \"LimitEndDay\" : \"2999/12/31 00:00\",\n    \"Level\" : 2\n  }, {\n    \"Exchange\" : 0,\n    \"Product\" : 1,\n    \"Side\" : \"2\",\n    \"Reason\" : \"その他（代用不適格銘柄）\",\n    \"LimitStartDay\" : \"2021/01/27 00:00\",\n    \"LimitEndDay\" : \"2021/02/17 00:00\",\n    \"Level\" : 2\n  } ]\n}", RegulationsResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RegulationsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RegulationsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
