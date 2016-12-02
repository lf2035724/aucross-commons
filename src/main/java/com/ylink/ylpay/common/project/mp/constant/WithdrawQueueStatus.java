package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 提现操作队列状态.
 * 
 * @author 潘瑞峥
 * @date 2012-12-1
 */
public enum WithdrawQueueStatus implements PersistentEnum<WithdrawQueueStatus, String> {

	NEW( "NEW", "新建" ),

	PROCESSING( "PROCESSING", "处理中" ),

	FAILURE( "FAILURE", "失败" ),

	SUCCESS( "SUCCESS", "成功" );

	private String value;
	private final String displayName;

	private static Map<String, WithdrawQueueStatus> valueMap = new HashMap<String, WithdrawQueueStatus>();

	static {
		for ( WithdrawQueueStatus _enum : WithdrawQueueStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	WithdrawQueueStatus( String value, String displayName ) {
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
	public WithdrawQueueStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, WithdrawQueueStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}