/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-19
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;


/** 
 * @author YG.HU
 * @date 2012-12-19
 * @description：TODO
 */

public enum RedemptionType {
    
    REDEMPTION_TO_ACC( "1", "赎回到虚户" , "01"),
    
    REDEMPTION_TO_BANK( "0", "赎回到银行卡", "02");
    
    private String value;
    private String displayName;
    private String superVisionInterFaceCode;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    public String getSuperVisionInterFaceCode() {
        return this.superVisionInterFaceCode;
    }
    
    RedemptionType(String value, String displayName ,String superVisionInterFaceCode){
        this.value = value ;
        this.displayName = displayName ;
        this.superVisionInterFaceCode = superVisionInterFaceCode;
    }
    
    private static Map<String, RedemptionType> valueMap = new HashMap<String, RedemptionType>();

    static {
        for (RedemptionType _enum : RedemptionType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static RedemptionType parseOf(String value){
        for(RedemptionType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
    
    public static RedemptionType parseOfInterFace(String value){
        
        for(RedemptionType item : values())
            if(item.getSuperVisionInterFaceCode().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
