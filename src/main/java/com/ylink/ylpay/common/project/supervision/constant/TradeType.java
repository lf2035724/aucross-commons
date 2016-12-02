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
public enum TradeType {
	TD_001("001", "入金"),
	TD_002("002","出金"),
	TD_003("003","内转"),
	TD_004("004","现金入金"),
	TD_005("005","现金出金"),
	TD_006("006","押金收现"),
	TD_007("007","押金现退"),
	TD_008("008","押金转退"),
	TD_009("009","特殊入金"),
	TD_010("010","特殊出金"),
	TD_011("011","利息收入"),
	TD_012("012","利息调拨"),
	TD_013("013","利息结转"),
	TD_014("014","准备金结转"),
	TD_015("015","手续费结转"),
	TD_016("016","自有存取"),
	TD_017("017","银行扣费"),
	TD_018("018","非活转活"),
	TD_019("019","活转非活"),
	TD_020("020","头寸调拨"),


	;

	private String value;
	private final String displayName;
	private ReturnCode returnCode;

	private static Map<String, TradeType> valueMap = new HashMap<String, TradeType>();

	static {
		for ( TradeType _enum : TradeType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	TradeType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	/**
	 * @param value
	 * @param displayName
	 * @param returnCode
	 */
	private TradeType(String value, String displayName, ReturnCode returnCode) {
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
	public static TradeType parseOf( String value ) {
		for ( TradeType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "银行返回码[" + value + "]不匹配!" );
	}

}