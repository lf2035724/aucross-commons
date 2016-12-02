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

public enum ReturnReceiptType {
    
	SUBSCRIBE( "2002", "申购" ),
    
    REDEMPTION( "2004", "赎回");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    ReturnReceiptType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, ReturnReceiptType> valueMap = new HashMap<String, ReturnReceiptType>();

    static {
        for (ReturnReceiptType _enum : ReturnReceiptType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static ReturnReceiptType parseOf(String value){
        for(ReturnReceiptType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("状态["+value+"]不匹配!");
    }
}
