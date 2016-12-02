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
 * @description：扎差状态
 */

public enum NettingStatus {

	NETTING_STATUS_0 ("0","不能轧差"),
	NETTING_STATUS_1 ("1","可以轧差"),
	NETTING_STATUS_2 ("2","轧差完成");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    NettingStatus(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, NettingStatus> valueMap = new HashMap<String, NettingStatus>();

    static {
        for (NettingStatus _enum : NettingStatus.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static NettingStatus parseOf(String value){
        for(NettingStatus item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
	
}
