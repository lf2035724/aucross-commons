package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 交易类型
 * @author LiXiPing
 * @date 2014-4-29
 * @description：
 */
public enum ProjectOrderType implements PersistentEnum<ProjectOrderType, String>{
	/*基金操作类型*/
	FUND_REGISTER("101","用户开户"),
	FUND_ONESTOPREGISTER("111","一站式开户"),
	FUND_ADDCARD("102","添加银行卡"),
	FUND_DELCARD("103","解绑银行卡"),
	FUND_MARGINREGISTER("108","保证金开户"),
	FUND_MARGINADDCARD("109","保证金添加银行卡"),
	FUND_SUBSCRIBEBACK("302","后台申购"),
	FUND_REVOKE("303","基金撤单"),
	FUND_REDEMPTION("305","普通赎回"),
	FUND_SUBSCRIBEGATEWAY("308","网关申购"),
	FUND_TIMELYREDEMPTION("331","实时赎回"),
	FUND_JHBPAY("333","金汇宝支付"),
	FUND_CORPBUYBACK("334","做市商回购"),
	FUND_ORDERQUERY("332","交易订单查询"),
	FUND_RECHARGE("104","快速充值"),
	FUND_NETRECHARGE("106","网关充值"),
	FUND_WITHDRAW("105","基金提现"),
	FUND_CHECKBALANCE("505","余额查询"),
	FUND_RECHARGEQUERY("506","充值流水查询"),
	FUND_WITHDRAWQUERY("507","提现流水查询"),
	FUND_WITHDRAWCOUNT("510","快速提现次数查询")
	;
	
	/**
	 * 接口编号
	 */
	private String value;
	
	/**
	 * 接口描述
	 */
	private String displayName;
	
	private static Map<String, ProjectOrderType> valueMap = new HashMap<String, ProjectOrderType>();
	
	private static Map<String, ProjectOrderType[]> custMap = new HashMap<String, ProjectOrderType[]>();

	static {
		for (ProjectOrderType _enum : ProjectOrderType.values()) {
			valueMap.put(_enum.value, _enum);
		}
		/*基金操作类型*/
		custMap.put(CustType.FUND.getValue(), new ProjectOrderType[]{
			FUND_REGISTER,FUND_ADDCARD,FUND_DELCARD,FUND_MARGINREGISTER,FUND_MARGINADDCARD,
			FUND_SUBSCRIBEBACK,FUND_REVOKE,FUND_REDEMPTION,FUND_SUBSCRIBEGATEWAY,FUND_TIMELYREDEMPTION,
			FUND_JHBPAY,FUND_CORPBUYBACK,FUND_ORDERQUERY,FUND_RECHARGE,FUND_NETRECHARGE,FUND_WITHDRAW,
			FUND_CHECKBALANCE,FUND_RECHARGEQUERY,FUND_WITHDRAWQUERY,FUND_WITHDRAWCOUNT
		});
		/*商城操作类型*/
		custMap.put(CustType.MALL.getValue(), new ProjectOrderType[]{});
		/*白酒操作类型*/
		custMap.put(CustType.WINE.getValue(), new ProjectOrderType[]{});
		/*交易所操作类型*/
		custMap.put(CustType.OTCBB.getValue(), new ProjectOrderType[]{});
		/*其他操作类型*/
		custMap.put(CustType.OTHER.getValue(), new ProjectOrderType[]{});
	}

	/**
	 * 商户类型基金的操作类型集合.
	 * 
	 * @return
	 */
	public static ProjectOrderType[] fundValues() {
		ProjectOrderType[] types = new ProjectOrderType[] { 
			FUND_REGISTER,FUND_ADDCARD,FUND_DELCARD,FUND_MARGINREGISTER,FUND_MARGINADDCARD,
			FUND_SUBSCRIBEBACK,FUND_REVOKE,FUND_REDEMPTION,FUND_SUBSCRIBEGATEWAY,FUND_TIMELYREDEMPTION,
			FUND_JHBPAY,FUND_CORPBUYBACK,FUND_ORDERQUERY,FUND_RECHARGE,FUND_NETRECHARGE,FUND_WITHDRAW,
			FUND_CHECKBALANCE,FUND_RECHARGEQUERY,FUND_WITHDRAWQUERY,FUND_WITHDRAWCOUNT
		};
		return types;
	}
	
	/**
	 * 商户类型商城的操作类型集合.
	 * 
	 * @return
	 */
	public static ProjectOrderType[] mallValues() {
		ProjectOrderType[] types = new ProjectOrderType[] { 
		};
		return types;
	}
	
	/**
	 * 商户类型交易所的操作类型集合.
	 * 
	 * @return
	 */
	public static ProjectOrderType[] otcbbValues() {
		ProjectOrderType[] types = new ProjectOrderType[] { 
		};
		return types;
	}
	
	/**
	 * 商户类型白酒的操作类型集合.
	 * 
	 * @return
	 */
	public static ProjectOrderType[] wineValues() {
		ProjectOrderType[] types = new ProjectOrderType[] { 
		};
		return types;
	}
	
	private ProjectOrderType(String value,  String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	/**
	 * 枚举转换
	 */
	public static ProjectOrderType parseOf(String value) {
		for (ProjectOrderType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public ProjectOrderType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, ProjectOrderType> getAllValueMap() {
		return valueMap;
	}

}
