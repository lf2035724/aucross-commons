/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-30
 */

package com.ylink.ylpay.common.project.pay.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author YG.HU
 * @date 2012-11-30
 */
public enum MPAuditStatus implements PersistentEnum<MPAuditStatus, String> {

	WAIT_AUDIT( "00", "待审批" ),

	FIRST_AUDIT_PASS( "01", "初审通过" ),

	FIRST_AUDIT_REFUSE( "02", "初审拒绝" ),

	SECOND_AUDIT_PASS( "03", "终审通过" ),

	SECOND_AUDIT_REFUSE( "04", "终审拒绝" ),

	PAY_LAST_AUDIT_PASSED( "05", "划拨终审通过" ),

	PAY_LAST_AUDIT_REFUSE( "06", "划拨终审拒绝" ),

	PAY_IMPORT( "10", "划款导入" );

	private String value;
	private final String displayName;

	private static Map<String, MPAuditStatus> valueMap = new HashMap<String, MPAuditStatus>();

	static {
		for ( MPAuditStatus _enum : MPAuditStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	MPAuditStatus( String value, String displayName ) {
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
	public MPAuditStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, MPAuditStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static MPAuditStatus parseOf( String value ) {
		for ( MPAuditStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "充值订单状态[" + value + "]不匹配!" );
	}

}