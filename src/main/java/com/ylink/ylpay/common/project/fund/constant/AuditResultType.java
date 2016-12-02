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

public enum AuditResultType {
    
/*	TODO( "0", "待处理" ),
	AUDITWIN( "00", "审核成功" ),
    
	AUDITFAIL( "01", "审核失败"),
	
	RESULE_NOT( "99", "未核算" );*/
	TODO( "0", "待处理" ),
	AUDITWIN( "00", "核算一致" ),
    
	AUDITFAIL( "01", "核算不一致"),
	
	RESULE_NOT( "99", "未核算" );
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    AuditResultType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, AuditResultType> valueMap = new HashMap<String, AuditResultType>();

    static {
        for (AuditResultType _enum : AuditResultType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static AuditResultType parseOf(String value){
        for(AuditResultType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
