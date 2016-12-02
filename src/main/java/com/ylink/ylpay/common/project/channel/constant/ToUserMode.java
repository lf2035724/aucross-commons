package com.ylink.ylpay.common.project.channel.constant;

import java.util.HashMap;
import java.util.Map;

public enum ToUserMode {
	
	
	/**
	 * ZL到客户付款方式（单笔）
	 */
	TOUSERMODE_6W1303("6W1303", "外联平台单笔代发代扣"),           //单笔业务，包含：提现、赎回业务
	TOUSERMODE_6W8010("6W8010", "外联平台自动转帐（行内对公）"),     //同行交易，包含：基金总账户->基金分账户、 基金分账户->基金总账户、 基金总账户->基金公司账户 
	TOUSERMODE_6W8020("6W8020", "外联平台非自动转帐(跨行公对公)"),   //跨行交易，包含：基金总账户->基金分账户、 基金总账户->基金公司账户
	TOUSERMODE_6W2100("6W2100", "外联平台批量代发代扣"),           //同行批量交易，包含：基金分公司到投资者提现赎回
	TOUSERMODE_EPAY01("EPAY01", "保证金银转证"),                 //保证金银转证
	TOUSERMODE_EPAY02("EPAY02", "保证金证转银");                 //保证金证转银
	

	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
    private static Map<String, ToUserMode> valueMap = new HashMap<String, ToUserMode>();

    static {
        for (ToUserMode _enum : ToUserMode.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static ToUserMode parseOf(String value){
        for(ToUserMode item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("ZL到客户付款方式（单笔）["+value+"]不匹配!");
    }
    
	ToUserMode(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}

}
