package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 人工找回密码状态.
 * 
 * @author 潘瑞峥
 * @date 2013-1-4
 */
public enum RecoveryStatus implements PersistentEnum<RecoveryStatus, String> {

	NEW( "0", "新建" ),

	EMAIL( "1", "已发送找回邮件" ),

	SUCCESS( "9", "找回成功" );

	private String value;
	private final String displayName;

	private static Map<String, RecoveryStatus> valueMap = new HashMap<String, RecoveryStatus>();

	static {
		for ( RecoveryStatus _enum : RecoveryStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	RecoveryStatus( String value, String displayName ) {
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
	public RecoveryStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, RecoveryStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}