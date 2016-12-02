package com.ylink.ylpay.common.project.channel.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.constant.ProductType;



public enum PayType{

	/**
	 * 系统参数表中的数据模式
	 */
	/**线下支付*/
	OFFLINE("99", "线下支付"),
	/**消费网关借记卡支付*/
	CONSUMEHTTP("01", "消费网关借记卡支付"),
	/**消费网关贷记卡支付*/
	CONSUMEHTTP1("011", "消费网关贷记卡支付"),
	/**消费快捷支付*/
	CONSUMEEBS("02", "消费快捷支付"),
	/**基金分账户网关支付*/
	FUNDSUBHTTP("03", "基金分账户网关支付"),
	/**基金分账户快捷付*/
	FUNDSUBEBS("04", "基金分账户快捷付"),
	//消费B2B细化
	/**基金B2B业务公用参数类型*/
	FUNDPUBLICB2B("05", "基金B2B业务公用参数类型"),  //B2B外联平台公用参数，不做业务参数传递
	/**基金总账户B2B业务参数类型*/
	FUNDTOTALB2B("051", "基金总账户B2B业务参数类型"), //基金总账户->基金分账户，基金总账户->基金公司账户
	/**基金分账户B2B业务参数类型*/
	FUNDSUBB2B("052", "基金分账户B2B业务参数类型"),   //基金分账户->基金总账户，基金分账户->个人（单笔），基金分账户->个人（批量）
	/**消费账户B2B业务参数类型*/
	CONSUMEB2B("053", "消费账户B2B业务参数类型"), 
	
	/**交易所网关支付*/
	OTCBBHTTP("06", "交易所网关支付"), 
	/**交易所快捷支付*/
	OTCBBEBS("07", "交易所快捷支付"), 
	/**交易所B2B业务*/
	OTCBBB2B("08", "交易所B2B业务"); 
//	HTTP( "01", "消费网关" ),
//
//	B2C( "02", "消费快捷付B2C" ),
//
//	B2B( "03", "消费B2B" ),
//	REFB2C( "04", "消费退B2C" ),
//
//	FUNDHTTP( "05", "基金网关" ),//暂时只有建行的个人信息验证口--授权等口的使用的也是网关模式
//	
//	FUNDB2C( "06", "基金快捷付B2C" ),
//	FUNDREFB2C( "07", "基金快捷付退款B2C" ),
//	
//	FUNDB2B( "08", "基金B2B" );
	private String value;
	private final String displayName;

	private static Map<String, PayType> valueMap = new HashMap<String, PayType>();

	static {
		for ( PayType _enum : PayType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	PayType( String value, String displayName ) {
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
	public static PayType parseOf( String value ) {
		for ( PayType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}
	/**
	 * 获取交易类型
	 * @description 
	 * @param payType
	 * @return  ProductType.value
	 * @author yu.han
	 * @date 2013-12-25
	 */
	public static ProductType getProductType(String payType){
		PayType[] payTypes = new PayType[]{PayType.CONSUMEB2B,PayType.CONSUMEEBS,PayType.CONSUMEHTTP,PayType.CONSUMEHTTP1};
		for ( PayType item : payTypes  )
			if ( item.getValue().equals( payType ) )
				return ProductType.CONSUMPTION;
		PayType[] payTypes2 = new PayType[]{PayType.FUNDPUBLICB2B,PayType.FUNDSUBB2B,PayType.FUNDSUBEBS,PayType.FUNDSUBHTTP,PayType.FUNDTOTALB2B};
		for ( PayType item : payTypes2  )
			if ( item.getValue().equals( payType ) )
				return ProductType.FUND;
		PayType[] payTypes3 = new PayType[]{PayType.OTCBBB2B,PayType.OTCBBEBS,PayType.OTCBBHTTP};
		for ( PayType item : payTypes3  )
			if ( item.getValue().equals( payType ) )
				return ProductType.OTC;
		throw new IllegalArgumentException( "枚举值[" + payType + "]不匹配!" );
		
	}
}