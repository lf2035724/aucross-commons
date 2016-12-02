/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.constant;

/** 
 * @author YangXiaojin
 * @date 2012-12-10
 * @description：TODO
 */

public enum SubSystem {
	MP("管理平台"),
	PORTAL("门户"),
	MALL("商城前置"),
	FUND("基金前置"),
	PAY("支付系统"),
	ACCOUNT("帐务系统"),
	CHANNEL("渠道系统"),
	SETTLEMENT("清结算系统");
	
	private String value;
	
	SubSystem( String value ){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String toString(){
		return this.value;
	}
}
