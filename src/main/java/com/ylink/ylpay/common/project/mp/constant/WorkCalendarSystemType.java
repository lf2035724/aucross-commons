package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

public enum WorkCalendarSystemType  implements PersistentEnum<WorkCalendarSystemType, Integer> {
	MP( 0, "管理平台" ),
	FUND( 1, "基金" ),
	EXCHANGE( 2, "交易所" ),
	HT( 3, "慧投" );

	private final Integer value;
	private final String displayName;

	private static Map<Integer, WorkCalendarSystemType> valueMap = new HashMap<Integer, WorkCalendarSystemType>();

	static {
		for ( WorkCalendarSystemType _enum : WorkCalendarSystemType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	WorkCalendarSystemType( int value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public Integer getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public WorkCalendarSystemType getEnum( Integer value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<Integer, WorkCalendarSystemType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static WorkCalendarSystemType returnEnum( Integer value ) {
		return valueMap.get( value );
	}

}
