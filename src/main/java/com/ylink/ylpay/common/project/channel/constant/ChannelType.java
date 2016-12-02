package com.ylink.ylpay.common.project.channel.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.constant.UserType;





public enum ChannelType {
	
	
	/**
	 * 业务类型
	 */
//	CHANNELTYPE_ALL("0000", "全部"),
	CHANNELTYPE_OFFLINE("9999", "线下"),
	CHANNELTYPE_IBP("0001", "网银借记卡"),
	CHANNELTYPE_CBS("0002", "快捷付"),
	CHANNELTYPE_B2B("0003", "B2B"),
	CHANNELTYPE_DEFAULT("0000", "默认"),
	CHANNELTYPE_IBP_CRE("0004", "网银贷记卡"),
	;
	private String value;
	private String displayName;
	private static Map<String, ChannelType> valueMap = new HashMap<String, ChannelType>();

	static {
		for ( ChannelType _enum : ChannelType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	public static ChannelType parseOf( String value ){
		for ( ChannelType item : values() )
			if ( item.getValue().equals( value ) )
				return item;
		
		throw new IllegalArgumentException("业务类型枚举值["+value+"]错误！");
	}
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	public ChannelType getEnum( String value ) {
		return valueMap.get( value );
	}
	ChannelType(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
