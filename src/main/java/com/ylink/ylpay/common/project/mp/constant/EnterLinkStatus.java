/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-9
 */

/**
 * EnterLinkStatus.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-9
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/** 
 * @author feng.li
 * @date 2013-9-9
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public enum EnterLinkStatus implements PersistentEnum<EnterLinkStatus, String>{
	
	NORMAL( "1", "正常" ),

	FREEZE( "2", "冻结" );

	private String value;
	private String displayName;

	private static Map<String, EnterLinkStatus> valueMap = new HashMap<String, EnterLinkStatus>();

	static {
		for ( EnterLinkStatus _enum : EnterLinkStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	EnterLinkStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	@Override
	public EnterLinkStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, EnterLinkStatus> getAllValueMap() {
		return valueMap;
	}

	public static EnterLinkStatus returnEnum( String value ) {
		return valueMap.get( value );
	}

}
