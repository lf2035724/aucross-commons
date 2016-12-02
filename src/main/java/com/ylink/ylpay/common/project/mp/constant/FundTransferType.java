package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 基金转账相关业务类型.
 * 
 * @author 潘瑞峥
 * @date 2013-1-17
 */
public enum FundTransferType implements PersistentEnum<FundTransferType, String> {

	/* 基金总分账户头寸调拨对应清结算轧差数据. */
	NETTING( "1", "清结算轧差", "基金总分账户头寸调拨对应清结算轧差数据" ),

	/* 申购类基金结算对应清结算申购数据. */
	PURCHASE( "2", "清结算申购", "申购类基金结算对应清结算申购数据" );

	private String value;
	private final String displayName;
	private final String remark;

	private static Map<String, FundTransferType> valueMap = new HashMap<String, FundTransferType>();

	static {
		for ( FundTransferType _enum : FundTransferType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	FundTransferType( String value, String displayName, String remark ) {
		this.value = value;
		this.displayName = displayName;
		this.remark = remark;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getRemark() {
		return remark;
	}

	@Override
	public FundTransferType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, FundTransferType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

}