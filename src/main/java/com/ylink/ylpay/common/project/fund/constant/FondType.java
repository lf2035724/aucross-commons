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

public enum FondType {
    
	STOCKFUND( "00", "股票型基金" ),
    
	MONEYFUND( "01", "货币型基金" ),
	
	BONDFUND( "02", "债券型基金" ),
	
	MIXEDFUND( "03", "混合型基金" ),
    
	BREAKEVENFUND( "04", "保本型基金" ),
	
	EXPONENTIALFUND( "05", "指数型基金" ),
	
	QDIIFUND( "06", "QDII型基金" ),
    
	ETFFUND( "07", "ETF型基金" ),
	
	LOFFUND( "08", "LOF型基金" ),
    
	INNOVATIONFUND( "09", "创新型基金" ),
	
	OTHERSFUND( "10", "其他" );
	
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    FondType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, FondType> valueMap = new HashMap<String, FondType>();

    static {
        for (FondType _enum : FondType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static FondType parseOf(String value){
        for(FondType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
