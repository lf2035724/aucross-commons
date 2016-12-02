/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:yu.han 2013-05-23
 */

package com.ylink.ylpay.common.project.supervision.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.channel.constant.ReturnCode;

/**
 * 存管账户类型
 * @author yu.han
 */
public enum AccountAccType {
	CAPITAL("01", "客户资金账户"),
	PIRVATE("02", "自有资金户"),
	INTEREST("03", "利息收入户"),
	FEE("04", "手续费收入户"),
	OTHER("05", "其他收入户（含押金）"),
	CONVERSION("06", "定活互转户"),
	UNKNOWN("07", "待查户（错帐调整）"),
	ALLOCATION_OF_POSITIONS("08", "头寸调拨户"),
	;

	private String value;
	private final String displayName;
	private ReturnCode returnCode;

	private static Map<String, AccountAccType> valueMap = new HashMap<String, AccountAccType>();

	static {
		for ( AccountAccType _enum : AccountAccType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AccountAccType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	/**
	 * @param value
	 * @param displayName
	 * @param returnCode
	 */
	private AccountAccType(String value, String displayName, ReturnCode returnCode) {
		this.value = value;
		this.displayName = displayName;
		this.returnCode = returnCode;
	}


	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @return the returnCode
	 */
	public ReturnCode getReturnCode() {
		return returnCode;
	}


	@Override
	public String toString() {
		return this.getDisplayName();
	}
	/**
	 * 枚举转换
	 */
	public static AccountAccType parseOf( String value ) {
		for ( AccountAccType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "银行返回码[" + value + "]不匹配!" );
	}

}