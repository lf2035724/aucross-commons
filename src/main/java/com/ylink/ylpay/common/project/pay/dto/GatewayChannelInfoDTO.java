/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-16
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-16
 * @description：网关渠道信息DTO
 */

public class GatewayChannelInfoDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	private String clientIp;     //客户端IP
	private String reginfo;		 //客户注册信息
	private String proinfo;		 //商品信息
	private String portOrderId;
	
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getReginfo() {
		return reginfo;
	}
	public void setReginfo(String reginfo) {
		this.reginfo = reginfo;
	}
	public String getProinfo() {
		return proinfo;
	}
	public void setProinfo(String proinfo) {
		this.proinfo = proinfo;
	}
	public String getPortOrderId() {
		return portOrderId;
	}
	public void setPortOrderId(String portOrderId) {
		this.portOrderId = portOrderId;
	}
	
	
}
