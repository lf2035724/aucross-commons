/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-27
 */

package com.ylink.ylpay.common.project.supervision.constant;

import java.util.HashMap;
import java.util.Map;



/**
 * 监控类型
 * @author yu.han 
 * @date 2014-9-22
 */
public enum SupervisionTypeEnum{
	TRADE ("0","交易明细"),
	CUST_ACCOUNT ("1","客户账户余额明细"),
	CAPITAL ("2","资金明细");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    SupervisionTypeEnum(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, SupervisionTypeEnum> valueMap = new HashMap<String, SupervisionTypeEnum>();

    static {
        for (SupervisionTypeEnum _enum : SupervisionTypeEnum.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static SupervisionTypeEnum parseOf(String value){
        for(SupervisionTypeEnum item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
	
}
