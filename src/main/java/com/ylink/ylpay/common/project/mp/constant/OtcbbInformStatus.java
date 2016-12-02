/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 
 * @author yanghan
 * @date 2013-5-16
 */
public enum OtcbbInformStatus implements PersistentEnum<OtcbbInformStatus, String>{
		FAIL("0","通知失败"),
		SUCCESS("1","通知成功")
	;
	private String value;
	private String displayName;
	
	private static Map<String,OtcbbInformStatus> valueMap = new HashMap<String, OtcbbInformStatus>();
	
	OtcbbInformStatus(String value,String displayName){
		this.value = value;
		this.displayName = displayName;
	}
	static {
		for ( OtcbbInformStatus _enum : OtcbbInformStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	/**
	 * @see com.ylink.modules.orm.hibernate.type.PersistentEnum#getValue()
	 */
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	/**
	 * @see com.ylink.modules.orm.hibernate.type.PersistentEnum#getDisplayName()
	 */
	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return displayName;
	}

	/**
	 * @see com.ylink.modules.orm.hibernate.type.PersistentEnum#getEnum(java.lang.Object)
	 */
	@Override
	public OtcbbInformStatus getEnum(String value) {
		// TODO Auto-generated method stub
		return valueMap.get(value);
	}

	/**
	 * @see com.ylink.modules.orm.hibernate.type.PersistentEnum#getAllValueMap()
	 */
	@Override
	public Map<String, OtcbbInformStatus> getAllValueMap() {
		// TODO Auto-generated method stub
		return valueMap;
	}
	/**
	 * 枚举转换
	 */
	public static OtcbbInformStatus parseOf( String value ) {
		for ( OtcbbInformStatus item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
}
