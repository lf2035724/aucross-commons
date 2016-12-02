/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-19
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;


/** 
 * @author ZHANGLEI
 * @date 2013-1-7
 * @description：业务类型
 */

public enum BusiType {
    
	FUNDBUY( "0001", "基金认购" ),
	FUNDSUNSCRIBE( "0002", "基金申购" ),
	FUNDDINGTOU( "0003", "基金定投" ),
	FUNDRANSOM( "0004", "基金赎回" ),
	FUNDSHARE( "0005", "基金分红" ),
	FUNDDRAWBACK( "0006", "基金退款" ),
	FUNDBACK( "0007", "基金撤单" ),
	RECHARGE ( "0008", "充值" ),
	WITHDRAWALS( "0009", "提现" ),
	EPAYBUY("1001","现金易认购"),
	EPAYSUNSCRIBE("1002","现金易申购"),
	EPAYRANSOM("1004","现金易赎回"),
	EPAYRANSOMBUY("1005","现金易支付申购"),
	FUND_CANCEL_WITHDRAW("1225","基金撤单提现"),
	FUND_REDEMPTION_WITHDRAW("1227","基金赎回提现"),
	ACCRUAL( "0020", "计息" ),
	FUND_INTEREST_ACCT("0207","利息"),
	TIMELY_REDEEM("9008","及时赎回"),
	TIMELY_SUBSCRIBE("9009","及时申购"),
	
	EPAYDINGTOU("1003","现金易定投"),
	FUND_0108("0108","充值流水查询"),
	FUND_0109("0109","提现流水查询"),
	FUND_0101("0101","账户余额查询"),
	FUND_0102("0102","银行卡验证查询"),
	FUND_0103("0103","账户余额流水查询"),
	FUND_1008("1008","增加银行卡"),
	FUND_1009("1009","取消银行卡"),
	FUND_1010("1010","用户隐性注册注册"),
	FUND_1011("1011","用户一站式注册"),
	FUND_1099("1099","对账用于调用对账功能时的指令参数"),
	
//	/**
//	 * 股交所
//	 */
//	FUND_2001("2001","快捷资金转入"),
//	FUND_2002("2002","网关资金转入"),
//	FUND_2003("2003","线下资金转入"),

//	FUNDPAY( "0010", "基金充值" ),
//	FUNDWITHDRAW( "0011", "基金提现" ),
	
	
	ERRORDEAL( "9999", "差错处理");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    BusiType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
	/**
	 * 基金申购类业务类型
	 */
	public static BusiType[] getFundPurchaseTypes( ){
		return new BusiType[]{FUNDBUY,FUNDSUNSCRIBE,FUNDDINGTOU
				,FUNDBACK,EPAYBUY,EPAYSUNSCRIBE,EPAYDINGTOU};
	}
	
	/**
	 * 基金赎回类业务类型
	 */
	public static BusiType[] getFundRedemptionTypes( ){
		return new BusiType[]{FUNDRANSOM,FUNDSHARE,FUNDDRAWBACK,EPAYRANSOM};
	}
    
    private static Map<String, BusiType> valueMap = new HashMap<String, BusiType>();

    static {
        for (BusiType _enum : BusiType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static BusiType parseOf(String value){
        for(BusiType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
