package com.ylink.ylpay.common.project.mp.constant;


/**
 * 帐户帐户类型
 */
public enum BankAccountType{
	FUND_TOTAL( "FUND_TOTAL", "基金总帐户" ),
	OTCBB_TOTAL( "OTCBB_TOTAL", "交易所总帐户" ),
	GENERAL_TOTAL( "GENERAL_TOTAL", "消费所总帐户" ),
	FUND_SUB( "FUND_SUB", "基金分帐户" ),
	FUND_VIR( "FUND_VIR", "基金中间账户" ),
	GENERAL( "GENERAL", "一般消费帐户" ),
	OTCBB( "OTCBB", "交易所帐户" );

	private String value;
	private final String displayName;

	BankAccountType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}
	
	/**
	 * 枚举转换
	 */
	public static BankAccountType parseOf( String value ) {
		for ( BankAccountType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
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

}