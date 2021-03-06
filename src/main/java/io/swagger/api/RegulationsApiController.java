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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-09T08:08:07.124Z[GMT]")
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

    public ResponseEntity<RegulationsResponse> regulationsGet(@Parameter(in = ParameterIn.HEADER, description = "??????????????????????????????????????????????????????" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.PATH, description = "??????????????? <br> ?????????????????????????????????????????????<br> [???????????????]@[???????????????]<br> ???????????????????????????????????????????????????????????????????????? <b>???????????????</b> <table>   <thead>       <tr>           <th>?????????</th>           <th>??????</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>??????</td>       </tr>       <tr>           <td>3</td>           <td>??????</td>       </tr>       <tr>           <td>5</td>           <td>??????</td>       </tr>       <tr>           <td>6</td>           <td>??????</td>       </tr>   </tbody> </table>", required=true, schema=@Schema()) @PathVariable("symbol") String symbol) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RegulationsResponse>(objectMapper.readValue("{\n  \"Symbol\" : \"5614\",\n  \"RegulationsInfo\" : [ {\n    \"Exchange\" : 1,\n    \"Product\" : 8,\n    \"Side\" : \"2\",\n    \"Reason\" : \"???????????????????????????????????????????????????????????????\",\n    \"LimitStartDay\" : \"2020/10/01 00:00\",\n    \"LimitEndDay\" : \"2999/12/31 00:00\",\n    \"Level\" : 2\n  }, {\n    \"Exchange\" : 0,\n    \"Product\" : 1,\n    \"Side\" : \"2\",\n    \"Reason\" : \"????????????????????????????????????\",\n    \"LimitStartDay\" : \"2021/01/27 00:00\",\n    \"LimitEndDay\" : \"2021/02/17 00:00\",\n    \"Level\" : 2\n  } ]\n}", RegulationsResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RegulationsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RegulationsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
