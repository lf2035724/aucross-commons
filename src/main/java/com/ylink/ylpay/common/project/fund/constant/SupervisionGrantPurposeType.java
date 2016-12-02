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

public enum SupervisionGrantPurposeType {
    
    PURPOSETYPE_1( "1000", "联融通总账户划拨款项到基金公司" ),
    
    PURPOSETYPE_2( "1001", "联融通总账户划拨款项到分账户" ),
    
    PURPOSETYPE_3( "1002", "联融通分账户划拨款项到总账户" ),
    
    PURPOSETYPE_4( "1003", "分账户到其他货币资金" ),
    
    PURPOSETYPE_5( "1004", "其他货币资金到分账户" ),
    
    PURPOSETYPE_6( "1004", "证联联融通总账户划拨款项到资产管理人备付金账户" );
    
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    SupervisionGrantPurposeType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, SupervisionGrantPurposeType> valueMap = new HashMap<String, SupervisionGrantPurposeType>();

    static {
        for (SupervisionGrantPurposeType _enum : SupervisionGrantPurposeType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static SupervisionGrantPurposeType parseOf(String value){
        for(SupervisionGrantPurposeType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
