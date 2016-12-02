package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 短信平台发送状态.
 * 
 * @author 潘瑞峥
 * @date 2012-11-7
 */
public enum SmsSendType implements PersistentEnum<SmsSendType, String> {

	S0( "0", "发送成功" ),

	S1( "1", "发送失败" ),

	S2( "2", "已发送" ),

	S3( "3", "初始值" ),

	S4( "4", "是否成功未知" ),

	S5( "5", "非白名单" ),

	S6( "6", "黑名单" ),

	S7( "7", "无后缀不发送" );

	private String value;
	private final String displayName;

	private static Map<String, SmsSendType> valueMap = new HashMap<String, SmsSendType>();

	static {
		for ( SmsSendType _enum : SmsSendType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	SmsSendType( String value, String displayName ) {
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
	public SmsSendType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, SmsSendType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static SmsSendType returnEnum( String value ) {
		return valueMap.get( value );
	}

}