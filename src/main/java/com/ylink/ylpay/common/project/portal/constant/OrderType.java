package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 门户订单号类别
 * @author lyg
 *
 */
public enum OrderType implements PersistentEnum<OrderType, String> {

	
	
	HIDDEN_REG_11( "11", "隐性注册" ),
	ONE_STOP_REG_12( "12", "一站式开户" ),
	ADD_BANK_CARD_13( "13", "基金前置新增银行卡" ),
	ACTIVE_FUND_14( "14", "激活基金户" ),
	OPEN_SHORTCUT_15( "15", "银行卡开通快捷" ),
	CLOSE_SHORTCUT_16( "16", "银行卡关闭快捷" ),
	FUND_ADD_BANK_CARD_17( "17", "基金户增加快捷银行卡" ),
	FUND_ADD_EBANK_CARD_18( "18","基金户增加网关银行卡"),
	USER_TRANSFER_21( "21", "虚户转账" ),
	USER_RECHARGE_22( "22", "充值" ),
	FUNDPOST_RECHARGE_23( "23", "基金前置请求充值" ),
	USER_FUND_SHORTCUT_31( "31", "基金户快捷" ),
	USER_FUND_NETPAY_32( "32", "基金户网银" ),
	USER_CONSUMPTION_SHORTCUT_33( "33", "消费户快捷支付" ),
	USER_CONSUMPTION_NET_RECHARGE_34( "34", "消费户网银充值" ),
	ENTERPRISE_CONSUMPTION_NET_RECHARGE_38( "38", "企业客户消费网银充值" ),
	ENTERPRISE_FUND_NET_RECHARGE_39( "39", "企业客户基金网银充值" ),
	USER_CONSUMPTION_NET_PAY_36( "36", "消费户网银支付" ),
	FUNDPOST_NETPAY_35( "35", "基金前置请求支付" ),
	MERCHANT_NET_PAY_37( "37", "商银前置网银支付" ),
	CONSUMPTION_WITHDRAW_41( "41", "消费户提现" ),
	FUND_WITHDRAW_42( "42", "基金户提现" ),
	CONSUMPTION_BACK_43( "43", "消费户充值退回" ),
	FUND_BACK_44( "44", "基金户充值退回" ),
	AUTH_NAME_BACK_45( "45", "实名认证返回" ),
	PORTAL_AUTH_NAME_BACK_46( "46", "门户实名认证" ),
	STOCK_DEPOSIT_GATEWAY_47( "47", "股交所网关资金转入" ),
	
	STOCK_HIDDEN_REG_51( "51", "股交所隐性注册" ),
	STOCK_ADD_BANK_CARD_52( "52", "股交所新增银行卡" ),
	STOCK_CLOSE_SHORTCUT_53( "53", "股交所银行卡关闭" ),
//	STOCK_USER_FUND_NETPAY_54( "54", "股交所网银" ),
	STOCK_FUND_WITHDRAW_55( "55", "股交所提现" ),
	
	INVESTPOST_RECHARGE_24( "24", "慧投前置请求充值" ),
	INVESTPOST_NETPAY_25( "25", "慧投前置请求支付" ),
	INVEST_ADDBANKCARD_61( "61", "慧投前置新增银行卡" ),
	OTHER( "99", "基他" ),
	;

	private String value;
	private final String displayName;


	private static Map<String, OrderType> valueMap = new HashMap<String, OrderType>();

	static {
		for ( OrderType _enum : OrderType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	OrderType( String value, String displayName ) {
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
	public OrderType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, OrderType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static OrderType returnEnum( String value ) {
		return valueMap.get( value );
	}

	/**
	 * 枚举转换
	 */
	public static OrderType parseOf( String value ){
		for( OrderType item:values() )
			if( item.getValue().equals(value) )
				return item;		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}

}