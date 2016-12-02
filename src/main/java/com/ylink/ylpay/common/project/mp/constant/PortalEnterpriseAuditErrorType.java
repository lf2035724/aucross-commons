/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 门户企业客户注册审核错误类型
 * @author yanghan
 * @date 2013-4-12
 * @description
 */
public enum PortalEnterpriseAuditErrorType implements PersistentEnum<PortalEnterpriseAuditErrorType, String>{
	ENT_INFO("01","企业信息"),
	LEGAL_INFO("02","法人信息"),
	ACC_INFO("03","对公帐户"),
	AGENCY_INFO("04","代理人信息");
	
	private String value;
	private String displayName;
	
	PortalEnterpriseAuditErrorType( String value , String displayName){
		this.value = value;
		this.displayName = displayName;
	}
	
	private static Map<String,PortalEnterpriseAuditErrorType> valueMap = new HashMap<String, PortalEnterpriseAuditErrorType>();
	
	static {
		for ( PortalEnterpriseAuditErrorType _enum : PortalEnterpriseAuditErrorType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	
	public String getValue() {
		return value;
	}
	public String getDisplayName() {
		return displayName;
	}
	public String toString(){
		return this.value;
	}

	/*
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getEnum(java.lang.Object)
	 */
	@Override
	public PortalEnterpriseAuditErrorType getEnum(String value) {
		return valueMap.get( value );
	}

	/*
	 * @see com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum#getAllValueMap()
	 */
	@Override
	public Map<String, PortalEnterpriseAuditErrorType> getAllValueMap() {
		return valueMap;
	}
	public static PortalEnterpriseAuditErrorType parseOf( String value ) {
		for ( PortalEnterpriseAuditErrorType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
}
