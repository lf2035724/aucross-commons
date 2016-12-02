package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 客户银行卡.
 * 
 * @author 张磊
 * @date 2012-11-1
 */
public enum CustBankCardType implements PersistentEnum<CustBankCardType, String> {

	CARD_TYPE1( "1", "借记卡" ),

	CARD_TYPE2( "2", "贷记卡" ),

	IS_SEND0( "0", "未发送" ),

	IS_SEND1( "1", "已发送" ),

	STATUS0( "0", "失效" ),

	STATUS1( "1", "有效" ),

	IS_PROTOCOL0( "0", "没签代扣协议" ),

	IS_PROTOCOL1( "1", "签代扣协议" ),
	
	IS_PROTOCOL2( "2", "关闭代扣协议" ),

	IS_CERT0( "0", "没认证" ),

	IS_CERT1( "1", "已认证" ),

	IS_CERT2( "2", "认证中" ),

	CREATE_TYPE1( "1", "客户自己创建" ),

	CREATE_TYPE2( "2", "系统自动创建" ),

	CREATE_TYPE3( "3", "管理系统创建" );

	private String value;
	private final String displayName;

	private static Map<String, CustBankCardType> valueMap = new HashMap<String, CustBankCardType>();

	static {
		for ( CustBankCardType _enum : CustBankCardType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CustBankCardType( String value, String displayName ) {
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
	public CustBankCardType getEnum( String value ) {
		return valueMap.get( value );
	}

	public static CustBankCardType returnEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, CustBankCardType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static CustBankCardType parseOf( String value ) {
		for ( CustBankCardType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

}