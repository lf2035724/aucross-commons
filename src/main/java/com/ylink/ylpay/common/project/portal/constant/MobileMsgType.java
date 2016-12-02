package com.ylink.ylpay.common.project.portal.constant;



/****
 * 发送手机短信的类型
 * @author lyg
 *
 */
public enum MobileMsgType  {

	REG_CODE("1", "注册验证码"),
	TRANSFER_CODE("2", "转账验证码"),
	UPDATE_MOBILE_SOURCE_CODE("3", "修改手机原手机验证码"),
	UPDATE_MOBILE_TARGET_CODE("4", "修改手机目标手机验证码"),
	FIND_PAY_PASSWORD_CODE("5", "找回支付密码验证码"),
	FIND_LOGIN_PASSWORD_CODE("6", "找回登陆密码验证码"),
	UPDATE_LOGIN_PASSWORD_CODE("7", "修改登陆密码验证码"),
	UPDATE_PAY_PASSWORD_CODE("8", "修改支付密码验证码"),
	PAY_CODE("9", "支付验证码"),
	TRANSFER_MSG_CODE("10", "转账发送消息验证码"),
	UPDATE_FUNDS_LIMIT_CODE("11", "修改限额"),
	WITHDRAW_CODE("12", "修改限额")
	;

	private String value;
	private final String displayName;

	MobileMsgType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;

	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	public static MobileMsgType parseOf(String value){
		for(MobileMsgType item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("类型["+value+"]不匹配!");
	}



}