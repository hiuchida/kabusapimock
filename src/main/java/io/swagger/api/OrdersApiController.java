package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.OrdersSuccess;
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
public class OrdersApiController implements OrdersApi {

    private static final Logger log = LoggerFactory.getLogger(OrdersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrdersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<OrdersSuccess>> ordersGet(@Parameter(in = ParameterIn.HEADER, description = "トークン発行メソッドで取得した文字列" ,required=true,schema=@Schema()) @RequestHeader(value="X-API-KEY", required=true) String X_API_KEY,@Parameter(in = ParameterIn.QUERY, description = "取得する商品 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>0</td>           <td>すべて </td>       </tr>       <tr>           <td>1</td>           <td>現物</td>       </tr>       <tr>           <td>2</td>           <td>信用</td>       </tr>       <tr>           <td>3</td>           <td>先物</td>       </tr>       <tr>           <td>4</td>           <td>OP</td>       </tr>   </tbody> </table>" ,schema=@Schema(allowableValues={ "0", "1", "2", "3", "4" }
)) @Valid @RequestParam(value = "product", required = false) String product,@Parameter(in = ParameterIn.QUERY, description = "注文番号<br> ※指定された注文番号と一致する注文のみレスポンスします。<br> ※指定された注文番号との比較では大文字小文字を区別しません。<br> ※複数の注文番号を指定することはできません。" ,schema=@Schema()) @Valid @RequestParam(value = "id", required = false) String id,@Parameter(in = ParameterIn.QUERY, description = "更新日時<br> ※形式：yyyyMMddHHmmss （例：20201201123456）<br> ※指定された更新日時以降（指定日時含む）に更新された注文のみレスポンスします。<br> ※複数の更新日時を指定することはできません。" ,schema=@Schema()) @Valid @RequestParam(value = "updtime", required = false) String updtime,@Parameter(in = ParameterIn.QUERY, description = "注文詳細抑止 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>true</td>           <td>注文詳細を出力する（デフォルト）</td>       </tr>       <tr>           <td>false</td>           <td>注文詳細の出力しない</td>       </tr>   </tbody> </table>" ,schema=@Schema()) @Valid @RequestParam(value = "details", required = false) String details,@Parameter(in = ParameterIn.QUERY, description = "銘柄コード<br>※指定された銘柄コードと一致する注文のみレスポンスします。<br>※複数の銘柄コードを指定することができません。" ,schema=@Schema()) @Valid @RequestParam(value = "symbol", required = false) String symbol,@Parameter(in = ParameterIn.QUERY, description = "状態<br> ※指定された状態と一致する注文のみレスポンスします。<br> ※フィルタには数字の入力のみ受け付けます。<br> ※複数の状態を指定することはできません。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>待機（発注待機）</td>       </tr>       <tr>           <td>2</td>           <td>処理中（発注送信中）</td>       </tr>       <tr>           <td>3</td>           <td>処理済（発注済・訂正済）</td>       </tr>       <tr>           <td>4</td>           <td>訂正取消送信中</td>       </tr>       <tr>           <td>5</td>           <td>終了（発注エラー・取消済・全約定・失効・期限切れ）</td>       </tr>   </tbody> </table>" ,schema=@Schema(allowableValues={ "1", "2", "3", "4", "5" }
)) @Valid @RequestParam(value = "state", required = false) String state,@Parameter(in = ParameterIn.QUERY, description = "売買区分<br> ※指定された売買区分と一致する注文のみレスポンスします。<br> ※フィルタには数字の入力のみ受け付けます。<br> ※複数の売買区分を指定することができません。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>売</td>       </tr>       <tr>           <td>2</td>           <td>買</td>       </tr>   </tbody> </table>" ,schema=@Schema(allowableValues={ "1", "2" }
)) @Valid @RequestParam(value = "side", required = false) String side,@Parameter(in = ParameterIn.QUERY, description = "取引区分<br> ※指定された取引区分と一致する注文のみレスポンスします。<br> ※フィルタには数字の入力のみ受け付けます。<br> ※複数の取引区分を指定することができません。 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>新規</td>       </tr>       <tr>           <td>3</td>           <td>返済</td>       </tr>   </tbody> </table>" ,schema=@Schema(allowableValues={ "2", "3" }
)) @Valid @RequestParam(value = "cashmargin", required = false) String cashmargin) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<OrdersSuccess>>(objectMapper.readValue("[ {\n  \"ID\" : \"20220404A02N04738436\",\n  \"State\" : 5,\n  \"OrderState\" : 5,\n  \"OrdType\" : 1,\n  \"RecvTime\" : \"2022-04-04T18:00:51.763683+09:00\",\n  \"Symbol\" : \"8306\",\n  \"SymbolName\" : \"三菱ＵＦＪフィナンシャル・グループ\",\n  \"Exchange\" : 1,\n  \"ExchangeName\" : \"東証プ\",\n  \"TimeInForce\" : 1,\n  \"Price\" : 704.5,\n  \"OrderQty\" : 1500,\n  \"CumQty\" : 1500,\n  \"Side\" : \"1\",\n  \"CashMargin\" : 2,\n  \"AccountType\" : 4,\n  \"DelivType\" : 2,\n  \"ExpireDay\" : 20220404,\n  \"MarginTradeType\" : 1,\n  \"Details\" : [ {\n    \"SeqNum\" : 1,\n    \"ID\" : \"20220404A02N04738436\",\n    \"RecType\" : 1,\n    \"ExchangeID\" : \"00000000-0000-0000-0000-00000000\",\n    \"State\" : 3,\n    \"TransactTime\" : \"2022-04-04T18:00:51.763683+09:00\",\n    \"OrdType\" : 1,\n    \"Price\" : 704.5,\n    \"Qty\" : 1500,\n    \"ExecutionID\" : \"\",\n    \"ExecutionDay\" : \"2022-04-04T18:02:00+09:00\",\n    \"DelivDay\" : 20220406,\n    \"Commission\" : 0,\n    \"CommissionTax\" : 0\n  } ]\n}, {\n  \"ID\" : \"20220404A02N04738436\",\n  \"State\" : 5,\n  \"OrderState\" : 5,\n  \"OrdType\" : 1,\n  \"RecvTime\" : \"2022-04-04T18:00:51.763683+09:00\",\n  \"Symbol\" : \"8306\",\n  \"SymbolName\" : \"三菱ＵＦＪフィナンシャル・グループ\",\n  \"Exchange\" : 1,\n  \"ExchangeName\" : \"東証プ\",\n  \"TimeInForce\" : 1,\n  \"Price\" : 704.5,\n  \"OrderQty\" : 1500,\n  \"CumQty\" : 1500,\n  \"Side\" : \"1\",\n  \"CashMargin\" : 2,\n  \"AccountType\" : 4,\n  \"DelivType\" : 2,\n  \"ExpireDay\" : 20220404,\n  \"MarginTradeType\" : 1,\n  \"Details\" : [ {\n    \"SeqNum\" : 1,\n    \"ID\" : \"20220404A02N04738436\",\n    \"RecType\" : 1,\n    \"ExchangeID\" : \"00000000-0000-0000-0000-00000000\",\n    \"State\" : 3,\n    \"TransactTime\" : \"2022-04-04T18:00:51.763683+09:00\",\n    \"OrdType\" : 1,\n    \"Price\" : 704.5,\n    \"Qty\" : 1500,\n    \"ExecutionID\" : \"\",\n    \"ExecutionDay\" : \"2022-04-04T18:02:00+09:00\",\n    \"DelivDay\" : 20220406,\n    \"Commission\" : 0,\n    \"CommissionTax\" : 0\n  } ]\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<OrdersSuccess>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<OrdersSuccess>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
