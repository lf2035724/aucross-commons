package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 转账审核状态.
 * 
 * @author 潘瑞峥
 * @date 2012-12-13
 */
public enum TransferAuditStatus implements PersistentEnum<TransferAuditStatus, String> {

	INPUT( "01", "录入" ),

	CHECK_PASS( "02", "复核通过" ),

	CHECK_REFUSE( "03", "复核拒绝" ),

	PAY_PASS( "04", "支付通过" ),

	PAY_REFUSE( "05", "支付拒绝" ),

	TRANSFER_SUCCESS( "06", "已转账" ),
	
	PAY_FAILURE( "07", "支付失败" );

	private String value;
	private final String displayName;

	private static Map<String, TransferAuditStatus> valueMap = new HashMap<String, TransferAuditStatus>();

	static {
		for ( TransferAuditStatus _enum : TransferAuditStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	TransferAuditStatus( String value, String displayName ) {
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
	public TransferAuditStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, TransferAuditStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}