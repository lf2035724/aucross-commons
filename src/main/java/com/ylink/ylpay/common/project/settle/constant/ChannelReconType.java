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
 * @description：渠道对账类型
 */
public enum ChannelReconType {

	AUTO_RECON( "0", "自动对账" ),
	HANDWORK_RECON( "1", "手动对账" ),
	;

	private String value;
	private final String displayName;

	private static Map<String, ChannelReconType> valueMap = new HashMap<String, ChannelReconType>();

	static {
		for ( ChannelReconType _enum : ChannelReconType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	ChannelReconType( String value, String displayName ) {
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
	public static ChannelReconType parseOf( String value ) {
		for ( ChannelReconType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "渠道对账类型[" + value + "]不匹配!" );
	}

}