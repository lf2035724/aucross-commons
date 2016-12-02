package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 工作日.
 * 
 * @author 潘瑞峥
 * @date 2012-10-31
 */
public enum WorkDayType implements PersistentEnum<WorkDayType, Integer> {

	YES( 1, "工作日" ), NO( 0, "非工作日" );

	private final Integer value;
	private final String displayName;

	private static Map<Integer, WorkDayType> valueMap = new HashMap<Integer, WorkDayType>();

	static {
		for ( WorkDayType _enum : WorkDayType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	WorkDayType( int value, String displayName ) {
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
	public WorkDayType getEnum( Integer value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<Integer, WorkDayType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static WorkDayType returnEnum( Integer value ) {
		return valueMap.get( value );
	}

}