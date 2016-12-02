package com.ylink.ylpay.common.project.channel.dto;

public class EpaySignReturnDTO extends AbstractDTO{

	private static final long serialVersionUID = 505032043282824178L;
	
	private String returnCode;     //返回码 
	private String returnMsg;      //描述 
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMsg() {
		return returnMsg;
	}
	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}
	
}
