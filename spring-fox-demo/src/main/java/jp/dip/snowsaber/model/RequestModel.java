package jp.dip.snowsaber.model;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * リクエスト用のModel
 *
 */
@ApiModel(value = "検証用のリクエストModel")
public class RequestModel {

	/** ユーザID */
	@Size(min = 0, max = 4)
	@ApiModelProperty(value="${fd.userId.name}", example = "0002", required = true)
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
