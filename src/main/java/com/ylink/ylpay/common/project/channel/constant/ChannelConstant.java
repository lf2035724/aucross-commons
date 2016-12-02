package com.ylink.ylpay.common.project.channel.constant;

import java.util.HashMap;
import java.util.Map;

public enum ChannelConstant {
	
	CCB_EBP("01050001", "建设银行网银"),
	CCB_CBS("01050002", "建设银行快捷付"),
	BC_EBP("01040001", "中国银行网银"),
	ABC_EBP("01030001", "农业银行网银"),
	CBE_EBP("03030001", "中国光大银行"),
	ICBC_EBP("01020001", "中国工商银行网银"),
	BCM_EBP("03010001", "中国交通银行网银"),
	EPAY("00010001", "华创现金易"),
	PSBC_EBP("01060001", "中国邮储银行网银");
	

	private String value;
	private String displayName;
	
	public String getValue() {
		return this.value;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
    private static Map<String, ChannelConstant> valueMap = new HashMap<String, ChannelConstant>();

    static {
        for (ChannelConstant _enum : ChannelConstant.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static ChannelConstant parseOf(String value){
        for(ChannelConstant item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("");
    }
    
	ChannelConstant(String value, String displayName){
		this.value = value ;
		this.displayName = displayName ;
	}

}
