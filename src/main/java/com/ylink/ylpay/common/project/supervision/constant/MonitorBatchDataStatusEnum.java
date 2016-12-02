/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-27
 */

package com.ylink.ylpay.common.project.supervision.constant;

import java.util.HashMap;
import java.util.Map;



/** 
 * 监控表({@link SupervisionBatch})报送状态
 * @author yu.han
 *
 */

public enum MonitorBatchDataStatusEnum{
	NEW ("0","新建"),
	DATA_HANDING ("1","数据准备中"),
	DATA_SUCCESS ("2","数据准备成功"),
	DATA_FAIL ("3","数据准备失败");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    MonitorBatchDataStatusEnum(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, MonitorBatchDataStatusEnum> valueMap = new HashMap<String, MonitorBatchDataStatusEnum>();

    static {
        for (MonitorBatchDataStatusEnum _enum : MonitorBatchDataStatusEnum.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static MonitorBatchDataStatusEnum parseOf(String value){
        for(MonitorBatchDataStatusEnum item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
	
}
