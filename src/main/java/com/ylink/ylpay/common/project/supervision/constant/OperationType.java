/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:yu.han 2013-05-23
 */

package com.ylink.ylpay.common.project.supervision.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.channel.constant.ReturnCode;

/**
 * 监管行交易码
 * @author yu.han
 */
public enum OperationType {
	ADD("1", "添加"),
	UPDATE("2", "修改"),
	DELETE("3", "删除"),
	LOCAL_DELETE("0", "本地删除"),
	;

	private String value;
	private final String displayName;
	private ReturnCode returnCode;

	private static Map<String, OperationType> valueMap = new HashMap<String, OperationType>();

	static {
		for ( OperationType _enum : OperationType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	OperationType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	/**
	 * @param value
	 * @param displayName
	 * @param returnCode
	 */
	private OperationType(String value, String displayName, ReturnCode returnCode) {
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
	public static ReturnCode getReturnCode(String ccbCode){
		for ( OperationType item : values() )
			if ( item.getValue().equals( ccbCode ) )
				return item.getReturnCode();
		return ReturnCode.BANKRETURNCODE_WATIPAY;
	}
	/**
	 * 枚举转换
	 */
	public static OperationType parseOf( String value ) {
		for ( OperationType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "银行返回码[" + value + "]不匹配!" );
	}

}