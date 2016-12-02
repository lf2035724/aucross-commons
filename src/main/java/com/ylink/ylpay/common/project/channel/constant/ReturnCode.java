package com.ylink.ylpay.common.project.channel.constant;

import java.util.HashMap;
import java.util.Map;


public enum ReturnCode {
	
	
	/**
	 * 银行返回码
	 */
	//已决
	BANKRETURNCODE_SUCCESS("0000", "成功"),
	BANKRETURNCODE_LOSS("0001", "不成功"),
	BANKRETURNCODE_REFUND_SUCCESS("0004", "退款成功"),
	BANKRETURNCODE_REFUND_LOSS("0005", "退款不成功"),
	BANKRETURNCODE_0008("0008", "账户状态异常"),
	BANKRETURNCODE_0009("0009", "交易超过单笔网上交易限额"),
	BANKRETURNCODE_0010("0010", "交易超过当日网上交易累计限额"),
	BANKRETURNCODE_0015("0015", "交易超过网上交易累计限额"),
	BANKRETURNCODE_0011("0011", "账户密码不正确"),
	BANKRETURNCODE_0012("0012", "户名不符"),
	BANKRETURNCODE_0013("0013", "您所提交的账号尚未申请网上操作功能，不能进入交易。"),
	BANKRETURNCODE_0014("0014", "您的账户尚未签约或签约过期"),
	BANKRETURNCODE_0016("0016", "余额不足"),
	BANKRETURNCODE_0017("0017", "银行无此订单"),
	BANKRETURNCODE_0018("0018", "金额超限"),
	
	
	BANKRETURNCODE_0019("0019", "非法商户"),
	BANKRETURNCODE_0020("0020", "验证签名失败"),
	BANKRETURNCODE_0021("0021", "签名失败"),
	BANKRETURNCODE_0022("0022", "客户信息不存在"),
	BANKRETURNCODE_0023("0023", "客户信息不一致"),
	BANKRETURNCODE_0024("0024", "商户用户不能支付"),
	BANKRETURNCODE_0025("0025", "客户状态不正常"),
	BANKRETURNCODE_0026("0026", "客户无支付权限"),
	BANKRETURNCODE_0027("0027", "密码解密错误"),
	BANKRETURNCODE_0028("0028", "保证金账户客户交易密码错误"),
	BANKRETURNCODE_0029("0029", "保证金账户客户资金密码错误"),
	BANKRETURNCODE_0030("0030", "证券资金可用不足"),
	BANKRETURNCODE_0031("0031", "支付金额超出单笔支付上限"),
	BANKRETURNCODE_0032("0032", "支付金额超出当日累计支付上限"),
	BANKRETURNCODE_0034("0034", "保证金账户资产帐号不存在或者客户未开通网上委托"),
	
	BANKRETURNCODE_0039("0039", "非交易时间"),
	BANKRETURNCODE_0040("0040", "保证金账户资产帐户状态不正常"),
	BANKRETURNCODE_0041("0041", "订单已存在但金额不一致"),
	BANKRETURNCODE_0042("0042", "存在相同已支付订单"),
	BANKRETURNCODE_0043("0043", "系统状态非托管状态，无法受理提现请求"),
	BANKRETURNCODE_0044("0044", "系统状态不是正常状态，不能开通权限"),
	BANKRETURNCODE_0045("0045", "该客户已经有支付权限，无需再次开通"),
	BANKRETURNCODE_0046("0046", "中间业务平台暂停托管"),
	
	
	BANKRETURNCODE_0033("0033", "密码校验次数超限"),
	
	//未决
	BANKRETURNCODE_WATIPAY("0002", "待支付"),
	BANKRETURNCODE_BANK_TIMEOUT("0006", "银行返回超时"),
	BANKRETURNCODE_BANK_UNKNOW("0007", "结果未知");
	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	ReturnCode(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
	
	private static Map<String, ReturnCode> valueMap = new HashMap<String, ReturnCode>();

	static {
		for (ReturnCode _enum : ReturnCode.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	/**
	 * 已决/未决
	 * @description 
	 * @param value
	 * @return  true 已决 false 未决
	 * @author yu.han
	 * @date 2013-11-17
	 */
	public static boolean isPendency(String value) {
		ReturnCode[] returnCodes= new ReturnCode[] { BANKRETURNCODE_WATIPAY,BANKRETURNCODE_BANK_TIMEOUT,BANKRETURNCODE_BANK_UNKNOW};
		ReturnCode type=ReturnCode.parseOf(value);
		for (ReturnCode returnCode : returnCodes) {
			if(returnCode.equals(type)){
				return false;
			}
		}
		return true;
	}
	/**
	 * 枚举转换
	 */
	public static ReturnCode parseOf(String value){
		for(ReturnCode item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付系统接口类型["+value+"]不匹配!");
	}	
	/**
	 * @description 是否是渠道业务异常返回码
	 * @param value
	 * @return  true 是  false 否
	 * @author LiuQ
	 * @date 2013-11-25
	 */
	public static boolean channelReturnCode(String value){
		//已决集合
		try{
			ReturnCode returnCode = ReturnCode.parseOf(value);
			if(returnCode==null){
				return false;
			}
			if(!isPendency(value)){
				return false;
			}
			ReturnCode[] returnCodes = new ReturnCode[]{ReturnCode.BANKRETURNCODE_SUCCESS,ReturnCode.BANKRETURNCODE_LOSS,ReturnCode.BANKRETURNCODE_REFUND_SUCCESS,ReturnCode.BANKRETURNCODE_REFUND_LOSS};
			for(ReturnCode item : returnCodes)
				if(item.getValue().equals(value))
					return false;
		}catch(Exception e){
			return false;
		}
		
		return true;
	}
}
