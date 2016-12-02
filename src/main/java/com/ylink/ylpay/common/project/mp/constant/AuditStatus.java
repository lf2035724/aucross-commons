package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 审核状态.
 * 
 * @author 潘瑞峥
 * @date 2012-12-21
 */
public enum AuditStatus implements PersistentEnum<AuditStatus, String> {

	WAIT_AUDIT( "0", "待审核" ),

	AUDIT_PASS( "1", "复审通过" ),

	AUDIT_REFUSE( "2", "复审拒绝" ),

	AUDIT_FIRST_PASS( "3", "初审通过" ),

	AUDIT_FIRST_REFUSE( "4", "初审拒绝" ),

	REMITTANCE_SUCCESS( "5", "汇款成功" ),

	REMITTANCE_FAILURE( "6", "汇款失败" ),

	VERIFY_REMITTANCE_SUCCESS( "7", "校验汇款成功" ),

	VERIFY_REMITTANCE_FAILURE( "8", "校验汇款失败" ),
	
	PAYING( "9", "汇款处理中" ),
	
	CHANGE_BANK_CARD( "10", "换卡" ),
	
	REVOCATION_REG("11","撤销")
	;

	private String value;
	private final String displayName;

	private static Map<String, AuditStatus> valueMap = new HashMap<String, AuditStatus>();

	static {
		for ( AuditStatus _enum : AuditStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AuditStatus( String value, String displayName ) {
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
	public AuditStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, AuditStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static AuditStatus parseOf(String value){
		for(AuditStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("["+value+"]不匹配!");
	}
}