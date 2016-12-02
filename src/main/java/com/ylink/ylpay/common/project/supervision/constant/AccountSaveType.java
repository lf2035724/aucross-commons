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
public enum AccountSaveType {
	SAVE("1", "备付金存管账户"),
	INOUT("2", "备付金收付账户"),
	IN("3", "备付金汇缴账户"),
	SELF("4", "自有资金账户"),
	RISK("5", "风险准备金账户"),
	OTHER("6", "其他资金账户"),
	;

	private String value;
	private final String displayName;
	private ReturnCode returnCode;

	private static Map<String, AccountSaveType> valueMap = new HashMap<String, AccountSaveType>();

	static {
		for ( AccountSaveType _enum : AccountSaveType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AccountSaveType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	/**
	 * @param value
	 * @param displayName
	 * @param returnCode
	 */
	private AccountSaveType(String value, String displayName, ReturnCode returnCode) {
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
	public static AccountSaveType parseOf( String value ) {
		for ( AccountSaveType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "银行返回码[" + value + "]不匹配!" );
	}

}