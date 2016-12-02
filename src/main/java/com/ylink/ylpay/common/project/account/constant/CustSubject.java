/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-29
 */

package com.ylink.ylpay.common.project.account.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.constant.AdjustProductType;

/**
 * @author Iquil
 * @date 2012-10-29
 * @description：客户账户类型（客户使用的二级科目）
 */

public enum CustSubject {

	/** 备付金. */
	BEIFUJIN( "2011", "备付金" ),

	SHOP( "2011101", "消费备付金" ),

	FUND( "2011201", "基金备付金" ),
	
	FUND_AUTH( "2011202", "基金授信备付金" ),
	
	OTCBB( "2011401", "交易所备份金" ),

	/** 中间账户. */
	SHOP_PAYABLES( "2241101", "消费业务其他应付款" ),

	FUND_PAYABLES( "2241201", "基金业务其他应付款" ),

	SPIRIT_PAYABLES( "2241301", "白酒业务其他应付款" ),
	
	OTCBB_PAYABLES( "2241401", "交易所业务其他应付款" ),

	/** 存款类 */
	CCY_DEP( "1002", "银行存款" ), 
	NOCCY_DEP( "1012", "其他货币资金" ), 
	SHOP_CCY_DEP( "1002100", "一般消费银行存款" ), 
	FUND_CCY_DEP( "1002200", "基金业务银行存款" ), 
	JIANGUAN_CCY_DEP("1002201", "基金监管银行存款" ), 
	OTCBB_CCY_DEP("1002400", "交易所业务银行存款" ), 
	SHOP_NOCCY_DEP( "1012100", "一般消费其他货币资金" ), 
	FUND_NOCCY_DEP( "1012200", "基金业务其他货币资金" ),
	OTCBB_NOCCY_DEP( "1012400", "交易所业务其他货币资金" ),
	/**主营业务收入*/
	SHOP_INCOME_OUT("5001100","消费业务收入汇缴转出"),
	FUND_INCOME_OUT("5001200","消费业务收入汇缴转出"),
	OTCBB_INCOME_OUT("5001300","消费业务收入汇缴转出"),
	SHOP_INTEREST_PAY("5001102","消费业务利息收入"),
	FUND_INTEREST_PAY("5001202","基金业务利息收入"),
	OTCBB_INTEREST_PAY("5001302","交易所业务利息收入"),
	/**主营业务成本*/
	SHOP_FEE_PAY("5401101","消费业务手续费支出"),
	FUND_FEE_PAY("5401201","基金业务手续费支出"),
	OTCBB_FEE_PAY("5401301","交易所业务手续费支出");
	
	
	private String value;
	private String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	CustSubject( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, CustSubject> valueMap = new HashMap<String, CustSubject>();
	
	private static Map<String,CustSubject[]> adjustMap = new HashMap<String, CustSubject[]>();
	private static Map<String,CustSubject>  incomeOutMap = new HashMap<String, CustSubject>();
	private static Map<String,CustSubject>  feePayMap = new HashMap<String, CustSubject>();
	private static Map<String,CustSubject>  interestPayMap = new HashMap<String, CustSubject>();
	static {
		for ( CustSubject _enum : CustSubject.values() ) {
			valueMap.put( _enum.value, _enum );
		}
		adjustMap.put(AdjustProductType.CONSUMPTION.getValue(), new CustSubject[]{SHOP_CCY_DEP,SHOP_NOCCY_DEP});
		adjustMap.put(AdjustProductType.FUND.getValue(), new CustSubject[]{FUND_CCY_DEP,JIANGUAN_CCY_DEP,FUND_NOCCY_DEP});
		adjustMap.put(AdjustProductType.OTC.getValue(), new CustSubject[]{OTCBB_CCY_DEP});
		incomeOutMap.put(AdjustProductType.CONSUMPTION.getValue(), SHOP_INCOME_OUT);
		incomeOutMap.put(AdjustProductType.FUND.getValue(), FUND_INCOME_OUT);
		incomeOutMap.put(AdjustProductType.OTC.getValue(), OTCBB_INCOME_OUT);
		feePayMap.put(AdjustProductType.CONSUMPTION.getValue(), SHOP_FEE_PAY);
		feePayMap.put(AdjustProductType.FUND.getValue(), FUND_FEE_PAY);
		feePayMap.put(AdjustProductType.OTC.getValue(), OTCBB_FEE_PAY);
		interestPayMap.put(AdjustProductType.CONSUMPTION.getValue(), SHOP_INTEREST_PAY);
		interestPayMap.put(AdjustProductType.FUND.getValue(), FUND_INTEREST_PAY);
		interestPayMap.put(AdjustProductType.OTC.getValue(), OTCBB_INTEREST_PAY);
	}

	/**
	 * 枚举转换
	 */
	public static CustSubject parseOf( String value ) {
		for ( CustSubject item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "枚举值[" + value + "]不匹配!" );
	}

	/**
	 * 备付金.
	 */
	public static CustSubject[] reservesValues() {
		CustSubject[] subjects = new CustSubject[] { SHOP, FUND ,OTCBB };
		return subjects;
	}

	/**
	 * 已经开户的备付金.
	 */
	public static CustSubject[] reservesValues( String[] openSubjects ) {
		if ( null != openSubjects ) {
			List<CustSubject> subjectList = new ArrayList<CustSubject>();
			List<String> list = Arrays.asList( openSubjects );
			for ( CustSubject subject : CustSubject.reservesValues() ) {
				if ( list.contains( subject.getValue() ) ) {
					subjectList.add( subject );
				}
			}
			CustSubject[] subjects = ( CustSubject[] ) subjectList.toArray( new CustSubject[subjectList.size()] );
			return subjects;
		}
		return new CustSubject[] {};
	}

	/**
	 * 中间账户.
	 */
	public static CustSubject[] interAccountsValues() {
		CustSubject[] subjects = new CustSubject[] { SHOP_PAYABLES, FUND_PAYABLES, SPIRIT_PAYABLES };
		return subjects;
	}

	/**
	 * 存款类
	 */
	public static CustSubject[] bankSavingsValues() {
		return new CustSubject[] { SHOP_CCY_DEP, FUND_CCY_DEP, JIANGUAN_CCY_DEP
				, SHOP_NOCCY_DEP, FUND_NOCCY_DEP,OTCBB_CCY_DEP };
	}
	public static CustSubject[] getAdjustSubject(String value){
		return adjustMap.get(value);
	}
	public static CustSubject getIncomeOutSubject(String value){
		return incomeOutMap.get(value);
	}
	public static CustSubject getFeePaySubject(String value){
		return feePayMap.get(value);
	}
	public static CustSubject getInterestPaySubject(String value){
		return interestPayMap.get(value);
	}
}