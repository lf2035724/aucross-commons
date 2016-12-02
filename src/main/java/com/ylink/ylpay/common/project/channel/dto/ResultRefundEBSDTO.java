/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:yu.han 2013-7-16
 */

/**
 * RefundmentEBSDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:yu.han 2013-7-16
 */
package com.ylink.ylpay.common.project.channel.dto;

/** 
 * 快捷退款返回类
 * @author yu.han
 * @date 2013-7-16
 * @description：快捷退款返回类
 */
public class ResultRefundEBSDTO extends AbstractDTO {

	private static final long serialVersionUID = -2861429337005895821L;
	private String requestSn;    //请求序列号(渠道编号)  
	private String returnCode;   //响应码      
	private String returnMsg;   //响应码      
	private String channelSn;    //渠道流水     
	/**
	 * 
	 */
	public ResultRefundEBSDTO() {
		super();
	}
	/**
	 * @param requestSn
	 * @param returnCode
	 * @param returnMsg
	 * @param channelSn
	 */
	public ResultRefundEBSDTO(String requestSn, String returnCode, String returnMsg, String channelSn) {
		super();
		this.requestSn = requestSn;
		this.returnCode = returnCode;
		this.returnMsg = returnMsg;
		this.channelSn = channelSn;
	}
	/**
	 * @return the requestSn
	 */
	public String getRequestSn() {
		return requestSn;
	}
	/**
	 * @param requestSn the requestSn to set
	 */
	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}
	/**
	 * @return the returnCode
	 */
	public String getReturnCode() {
		return returnCode;
	}
	/**
	 * @param returnCode the returnCode to set
	 */
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	/**
	 * @return the returnMsg
	 */
	public String getReturnMsg() {
		return returnMsg;
	}
	/**
	 * @param returnMsg the returnMsg to set
	 */
	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}
	/**
	 * @return the channelSn
	 */
	public String getChannelSn() {
		return channelSn;
	}
	/**
	 * @param channelSn the channelSn to set
	 */
	public void setChannelSn(String channelSn) {
		this.channelSn = channelSn;
	}
	
}
