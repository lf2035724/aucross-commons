package com.ylink.ylpay.common.project.mp.constant;

/**
 * 操作日志的操作类型.
 * 
 * @author 潘瑞峥
 * @date 2012-10-30
 */
public enum OperateType {

	REGISTER( "REGISTER", "注册" ),

	LOGIN( "LOGIN", "登录" ),

	MODIFY_SENSITIVE( "MODIFY_SENSITIVE", "修改敏感信息" ),

	ACCOUNT_FREEZE( "ACCOUNT_FREEZE", "冻结帐户" ),

	ACCOUNT_UNFREEZE( "ACCOUNT_UNFREEZE", "解冻帐户" ),
	
	SEND_MOBILE_CODE( "SEND_MOBILE_CODE", "发送手机校验码" ),

	COMMON( "COMMON", "普通操作" );

	private final String value;
	private final String displayName;

	OperateType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}