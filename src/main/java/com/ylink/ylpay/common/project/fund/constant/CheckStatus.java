/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Pengyindong 2013-1-10
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author Pengyindong
 * @date 2013-1-10
 * @description：对账状态
 */

public enum CheckStatus {

	CHECK_STATUS_00 ("00","未对帐"),
	CHECK_STATUS_01 ("01","平帐"),
	CHECK_STATUS_02 ("02","不平帐");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    CheckStatus(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, CheckStatus> valueMap = new HashMap<String, CheckStatus>();

    static {
        for (CheckStatus _enum : CheckStatus.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static CheckStatus parseOf(String value){
        for(CheckStatus item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
	
}
