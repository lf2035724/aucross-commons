package com.ylink.ylpay.common.project.agent.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-5-21
 * @description：缴费系统公共返回DTO
 */
public class AgentReturnDTO extends AbstractDTO{

	private static final long serialVersionUID = -2754131265781557681L;

	/**响应码0光大银行成功受理请求，1失败*/
//	private String respCode;
	/**响应信息*/
	private String respMsg;
	/**销帐请求支付串（只有销帐请求会返回该字段）*/
	private String requestHttpStr;
	
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	public String getRequestHttpStr() {
		return requestHttpStr;
	}
	public void setRequestHttpStr(String requestHttpStr) {
		this.requestHttpStr = requestHttpStr;
	}
}
