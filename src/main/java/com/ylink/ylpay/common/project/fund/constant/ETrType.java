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
 * @类名称： ETrType
 * @类描述： 
 * @创建人： hinode
 * @创建时间： 2013-1-25 下午05:03:09
 *
 * @修改人： hinode
 * @操作时间： 2013-1-25 下午05:03:09
 * @操作原因： 
 * 
 */
public enum ETrType {
	REC( "01", "接收文件" ),
	
	SEND( "02", "发送文件" );
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    ETrType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, ETrType> valueMap = new HashMap<String, ETrType>();

    static {
        for (ETrType _enum : ETrType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static ETrType parseOf(String value){
        for(ETrType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
