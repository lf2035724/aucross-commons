/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-27
 */

package com.ylink.ylpay.common.project.supervision.constant;

import java.util.HashMap;
import java.util.Map;



/** 
 * 监控表({@link SupervisionMonitor})报送状态
 * @author yu.han
 *
 */

public enum MonitorStatusEnum{
	NEW ("0","新建"),
	DATA_SUCCESS ("1","数据准备成功"),
	DATA_FAIL ("2","数据准备失败"),
	UPLOAD_FAIL ("3","文件上传失败"),
	UPLOAD_SUCCESS ("4","文件上传成功"),
	NOTICE_FAIL ("5","文件报送失败"),
	NOTICE_SUCCESS ("6","文件报送成功"),
	CHECK_UNLIKELINESS ("7","核对不一致"),
	CHECK_FAIL ("8","核对失败"),
	CHECK_SUCCESS ("9","核对成功"),
	CONFIRMATION_FAIL ("10","确认数据失败"),
	CONFIRMATION_SUCCESS ("11","确认数据成功"),
	;
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    MonitorStatusEnum(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, MonitorStatusEnum> valueMap = new HashMap<String, MonitorStatusEnum>();

    static {
        for (MonitorStatusEnum _enum : MonitorStatusEnum.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static MonitorStatusEnum parseOf(String value){
        for(MonitorStatusEnum item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
	
}
