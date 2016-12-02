/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Pengyindong 2013-1-10
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/**
 *  到账状态
 * @author LiXiPing
 * @date 2013-10-29
 * @description：
 */
public enum TTrnasferStatus {

	Trnsfer_STATUS_00 ("00","等待付款"),
	Trnsfer_STATUS_01 ("01","处理中"),
	Trnsfer_STATUS_02 ("02","付款成功"),
	Trnsfer_STATUS_03 ("03","付款失败");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    TTrnasferStatus(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, TTrnasferStatus> valueMap = new HashMap<String, TTrnasferStatus>();

    static {
        for (TTrnasferStatus _enum : TTrnasferStatus.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static TTrnasferStatus parseOf(String value){
        for(TTrnasferStatus item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
    
}
