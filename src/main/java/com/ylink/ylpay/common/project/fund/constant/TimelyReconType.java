package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

public enum TimelyReconType {

	RECON_UNGATHER("0","未汇总"),
	RECON_GATHERED("1","已汇总"),
	RECON_WITHDRAWAPPLY("2","提现申请"),
	RECON_ACCOUNT("3","赎回到账"),
	RECON_REVERSE("4","已冲减额度");
	
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    TimelyReconType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, TimelyReconType> valueMap = new HashMap<String, TimelyReconType>();

    static {
        for (TimelyReconType _enum : TimelyReconType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }

    /**
     * 枚举转换
     */
    public static TimelyReconType parseOf(String value){
        for(TimelyReconType item : values())
            if(item.getValue().equals(value))
                return item;
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
