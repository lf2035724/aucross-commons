package com.ylink.ylpay.common.project.channel.dto;

import java.util.Date;


public class ChannelParmDTO extends AbstractDTO{
	/**
	 * 渠道参数
	 */
	private static final long serialVersionUID = 5935558070945316368L;
	
	private String bankType;//行别                                              
	private String code;//系统参数代码                                      
	private String parName;//系统参数名称                                      
	private String parvalue;//系统参数值                                        
	private String ifmodify;//是否可修改（Y /N）                                
	private String userCode;//更新人代码                                        
	private Date updateTime;//更新日期时间                                      
	private String reMark;//参数描述    
	/**
	 * payType 返回值的枚举类参照com.ylink.ylpay.common.project.channel.constant.PayType 
	 */
	private String payType;
	
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getParName() {
		return parName;
	}
	public void setParName(String parName) {
		this.parName = parName;
	}
	public String getParvalue() {
		return parvalue;
	}
	public void setParvalue(String parvalue) {
		this.parvalue = parvalue;
	}
	public String getIfmodify() {
		return ifmodify;
	}
	public void setIfmodify(String ifmodify) {
		this.ifmodify = ifmodify;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getReMark() {
		return reMark;
	}
	public void setReMark(String reMark) {
		this.reMark = reMark;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
