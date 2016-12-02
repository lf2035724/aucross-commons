/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-19
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;


/** 
 * @author ZHANGLEI
 * @date 2013-1-24
 * @description：下载监管行回执文件并解析及更新订单状态操作状态
 */

public enum DownloadBankFileStateType {
    
	DISPOSE( "0", "待处理" ),
    
	SUCCEED( "1", "成功"),
	
	FAIL( "2", "失败");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    DownloadBankFileStateType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, DownloadBankFileStateType> valueMap = new HashMap<String, DownloadBankFileStateType>();

    static {
        for (DownloadBankFileStateType _enum : DownloadBankFileStateType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static DownloadBankFileStateType parseOf(String value){
        for(DownloadBankFileStateType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
