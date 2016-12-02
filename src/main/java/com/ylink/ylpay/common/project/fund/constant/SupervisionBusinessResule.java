/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-20
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author YG.HU
 * @date 2012-12-20
 * @description：TODO
 */

public enum SupervisionBusinessResule {

    RESULE_SUC( "00", "核算成功" ),

    RESULE_FAIL( "01", "核算失败" ),
    
    RESULE_NOT( "99", "未核算" );

    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    SupervisionBusinessResule(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, SupervisionBusinessResule> valueMap = new HashMap<String, SupervisionBusinessResule>();

    static {
        for (SupervisionBusinessResule _enum : SupervisionBusinessResule.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static SupervisionBusinessResule parseOf(String value){
        for(SupervisionBusinessResule item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
