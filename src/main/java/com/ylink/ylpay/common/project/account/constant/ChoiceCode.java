/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-19
 */

package com.ylink.ylpay.common.project.account.constant;

/** 
 * @author HuAJ
 * @date 2012-11-19
 * @description：辅助编码类型
 */

public enum ChoiceCode {
	FUND_PURCHASE("00", "基金申购"), 
	FUND_REDEMPTION("01", "基金赎回"),
	SHOP_PURCHASE("02", "消费申购"), 
	SHOP_REDEMPTION("03", "消费赎回"),
	SHOP_ALLOT("04", "划拨"),
	SHOP_TRANSFER("05", "转让"),
	SHOP_PROJECT_BACK_SECTION("06", "项目回款"),
	SHOP_TRADE_FEE("07", "手续费"),
	;

	private String value;
	private String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	ChoiceCode(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	/**
	 * 枚举转换
	 */
	public static ChoiceCode parseOf( String value ){
		for( ChoiceCode item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}
	
}
