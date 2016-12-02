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
 * @类名称： ETrStaus
 * @类描述： 
 * @创建人： hinode
 * @创建时间： 2013-1-25 下午05:03:09
 *
 * @修改人： hinode
 * @操作时间： 2013-1-25 下午05:03:09
 * @操作原因： 
 * 
 */
public enum ETrStaus {
	SUCESSED( "01", "成功" ),
	
	FAILE( "02", "失败" );
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    ETrStaus(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, ETrStaus> valueMap = new HashMap<String, ETrStaus>();

    static {
        for (ETrStaus _enum : ETrStaus.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static ETrStaus parseOf(String value){
        for(ETrStaus item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
