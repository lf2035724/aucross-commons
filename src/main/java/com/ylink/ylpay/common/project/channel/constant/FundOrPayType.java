package com.ylink.ylpay.common.project.channel.constant;





public enum FundOrPayType {
	
	
	/**
	 *网银支付特别
	 */
	FUND("01", "基金"),
	PAY("02", "消费"),
	CHECKDETAIL("03", "个人信息验证"),
	;
	private String value;
	private String displayName;
	
	public static FundOrPayType parseOf( String value ){
		for ( FundOrPayType item : values() )
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
	
	FundOrPayType(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}
}
