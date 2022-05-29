package jp.dip.snowsaber;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jp.dip.snowsaber.model.RequestModel;
import jp.dip.snowsaber.model.ResponseModel;

/**
 * springfoxのサンプル用のControllerクラス
 * 
 */
@RestController
@Tag(name="検証用APIコントローラ", description = "コントローラ説明用")
@Api(tags= "検証用APIコントローラ")
public class SpringFoxExampleController {

	/**
	 * Postのサンプル
	 * 
	 * @param requestModel リクエスト
	 * @return レスポンスModel
	 */
	@PostMapping(value="/insert", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "テスト用のリクエスト", notes = "${api.note}")
	public ResponseModel insert(@RequestBody RequestModel requestModel) {
		return new ResponseModel("テスト太郎", "xxxx@xxxx.xxxx");
	}
	
}
