/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:yu.han 2013-05-23
 */

package com.ylink.ylpay.common.project.supervision.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.channel.constant.ReturnCode;

/**
 * 账户类型
 * @author yu.han
 */
public enum CustAccType {
	CAPITAL("1", "实名制账户"),
	UNREAL("2", "非实名制账户"),
	COLLECTION("3", "集合管理账户"),
	;

	private String value;
	private final String displayName;
	private ReturnCode returnCode;

	private static Map<String, CustAccType> valueMap = new HashMap<String, CustAccType>();

	static {
		for ( CustAccType _enum : CustAccType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CustAccType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	/**
	 * @param value
	 * @param displayName
	 * @param returnCode
	 */
	private CustAccType(String value, String displayName, ReturnCode returnCode) {
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
	public static CustAccType parseOf( String value ) {
		for ( CustAccType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "银行返回码[" + value + "]不匹配!" );
	}

}