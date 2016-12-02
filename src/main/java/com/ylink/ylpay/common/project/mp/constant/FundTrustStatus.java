package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 资金托管--划拨记录状态
 * @author lxh 20140917
 */
public enum FundTrustStatus implements PersistentEnum<FundTrustStatus, String> {

	INPUT( "00", "录入" ),

	CHECK_PASS( "01", "审核通过" ),

	CHECK_REFUSE( "02", "审核拒绝" );

	private String value;
	private final String displayName;

	private static Map<String, FundTrustStatus> valueMap = new HashMap<String, FundTrustStatus>();

	static {
		for ( FundTrustStatus _enum : FundTrustStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FundTrustStatus( String value, String displayName ) {
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
	public FundTrustStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, FundTrustStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}
	
	/**
	 * 枚举转换
	 */
	public static FundTrustStatus parseOf(String value) {
		for (FundTrustStatus item : values())
			if (item.getValue().equals(value))
				return item;
		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

}
