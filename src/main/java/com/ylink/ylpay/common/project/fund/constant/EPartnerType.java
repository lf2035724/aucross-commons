/**===========================================
 *        Copyright (C) 2013 YLINK
 *           All rights reserved
 *
 *  @项目名： aucross-common
 *  @文件名： EFileType.java
 *  @版本信息： V1.0.0 
 *  @作者： hinode
 *  @日期： 2013-1-25-下午05:03:09
 * 
 ============================================*/

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @类名称： EPartnerType
 * @类描述： 
 * @创建人： hinode
 * @创建时间： 2013-1-25 下午05:03:09
 *
 * @修改人： hinode
 * @操作时间： 2013-1-25 下午05:03:09
 * @操作原因： 
 * 
 */
public enum EPartnerType {
	FUND( "01", "基金公司" ),
	
	BANK( "02", "监管银行" );
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    EPartnerType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, EPartnerType> valueMap = new HashMap<String, EPartnerType>();

    static {
        for (EPartnerType _enum : EPartnerType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static EPartnerType parseOf(String value){
        for(EPartnerType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
