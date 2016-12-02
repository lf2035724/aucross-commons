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
 * @description：TODO
 */

public enum CheckResultType {
    
	WIN( "0000", "成功" ),
    
	BOTHNOGREE( "1000", "双方字段信息不符" ),
	
	ONLYINFUND( "1001", "记录只存在于基金公司" ),
	
	ONLYINZLRT( "1002", "记录只存在于证联融通"),
	
	INVESTORFAILE( "1003", "与投资者备案不符");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    CheckResultType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, CheckResultType> valueMap = new HashMap<String, CheckResultType>();

    static {
        for (CheckResultType _enum : CheckResultType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static CheckResultType parseOf(String value){
        for(CheckResultType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
