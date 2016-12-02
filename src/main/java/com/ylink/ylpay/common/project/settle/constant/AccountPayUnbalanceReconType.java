/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangDM(Mingly)
 * @date 2013-1-4
 * @description：账务系统与支付系统对账类型
 */
public enum AccountPayUnbalanceReconType {

	VALID("0", "记账"), 
	REVERSE("1", "冲正"),
	;

	private String value;
	private final String displayName;

	private static Map<String, AccountPayUnbalanceReconType> valueMap = new HashMap<String, AccountPayUnbalanceReconType>();

	static {
		for ( AccountPayUnbalanceReconType _enum : AccountPayUnbalanceReconType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AccountPayUnbalanceReconType( String value, String displayName ) {
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
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static AccountPayUnbalanceReconType parseOf( String value ) {
		for ( AccountPayUnbalanceReconType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "账务系统与支付系统对账状态[" + value + "]不匹配!" );
	}

}