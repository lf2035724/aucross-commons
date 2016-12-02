/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-27
 */

package com.ylink.ylpay.common.project.supervision.constant;

import java.util.HashMap;
import java.util.Map;



/** 
 * @author yu.han
 *
 */

public enum DetailAuditStatusEnum{
	NEW ("0","待审核"),
	AUDIT ("1","审核通过"),
	;
    private String value;
    private String displayName;
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    DetailAuditStatusEnum(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, DetailAuditStatusEnum> valueMap = new HashMap<String, DetailAuditStatusEnum>();

    static {
        for (DetailAuditStatusEnum _enum : DetailAuditStatusEnum.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static DetailAuditStatusEnum parseOf(String value){
        for(DetailAuditStatusEnum item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
	
}
