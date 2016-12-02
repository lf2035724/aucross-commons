/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:yu.han 2014-10-11
 */

/**
 * CapitalDetailDTO.java
 * 版权所有(C) 2014 证联支付有限责任公司
 * 创建:yu.han 2014-10-11
 */
package com.ylink.ylpay.common.project.supervision.dto;

import java.util.List;

import com.ylink.ylpay.common.project.channel.constant.ReturnCode;

/** 
 * @author yu.han
 * @date 2014-10-11
 * @description：TODO
 */

/**
 * @author yu.han 
 * @date 2014-10-11
 */
public class ResultDTO extends AbstractDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7236532519871376381L;
	private ReturnCode returnCode;
	private String returnMsg;
	private String errCode;
	
	
	/**
	 * @return the returnCode
	 */
	public ReturnCode getReturnCode() {
		return returnCode;
	}


	/**
	 * @param returnCode the returnCode to set
	 */
	public void setReturnCode(ReturnCode returnCode) {
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
	 * @return the errCode
	 */
	public String getErrCode() {
		return errCode;
	}


	/**
	 * @param errCode the errCode to set
	 */
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}


	/**
	 * @return the list
	 */
	public List<Object> getList() {
		return list;
	}


	/**
	 * @param list the list to set
	 */
	public void setList(List<Object> list) {
		this.list = list;
	}


	private List<Object> list;
	
	
}
