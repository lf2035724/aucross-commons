package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * T+0 提现（轧差、报备、调拨、支付）状态枚举
 * @author LiXiPing
 * @date 2014-3-5
 * @description：
 */
public enum FundNetStatus {
	UNTREATED("00", "未处理"),
	SUCCASSS("01", "处理成功"),
	HANDLING("02", "处理中"),
	FAIL("03", "处理失败"),
	;
	
	private String value;
	private final String displayName;

	private static Map<String, FundNetStatus> valueMap = new HashMap<String, FundNetStatus>();

	static {
		for ( FundNetStatus _enum : FundNetStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FundNetStatus( String value, String displayName ) {
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

	/**
	 * 枚举转换
	 */
	public static FundNetStatus parseOf( String value ) {
		for ( FundNetStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "基金T+0提现状态[" + value + "]不匹配!" );
	}

}