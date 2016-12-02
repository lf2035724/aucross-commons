/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-29
 */

package com.ylink.ylpay.common.project.pay.constant;

/** 
 * @author YG.HU
 * @date 2012-11-29
 * @description：TODO
 */

public enum IsSuccessType {
    UNSuccess("0", "失败"),
    Success("1", "成功"),
    ;
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    IsSuccessType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
}
