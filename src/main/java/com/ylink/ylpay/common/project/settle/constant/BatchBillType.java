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
 * @description：批次流水类型
 */
public enum BatchBillType {

	RECON( "0", "对账" ),
	CANCEL_RECON( "1", "取消对账" ),
	RECON_UNBALANCE( "2", "对账不平" ),
	CANCEL_RECON_UNBALANCE( "3", "取消对账不平" ),
	;

	private String value;
	private final String displayName;

	private static Map<String, BatchBillType> valueMap = new HashMap<String, BatchBillType>();

	static {
		for ( BatchBillType _enum : BatchBillType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	BatchBillType( String value, String displayName ) {
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
	public static BatchBillType parseOf( String value ) {
		for ( BatchBillType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "批次流水类型[" + value + "]不匹配!" );
	}

}