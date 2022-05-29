package jp.dip.snowsaber.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * レスポンス用のモデル
 *
 */
@ApiModel("検証用の返却値用モデル")
public class ResponseModel {

	/** 名前 */
	@ApiModelProperty(value="名前", example = "検証太郎")
	private String name;
	
	/** アドレス */
	@ApiModelProperty(value="住所", example = "日本")
	private String addr;

	public ResponseModel(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}
}
