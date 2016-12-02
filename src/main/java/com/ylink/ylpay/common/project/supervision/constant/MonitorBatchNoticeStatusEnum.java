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

public enum MonitorBatchNoticeStatusEnum{
	NEW ("0","未报送"),
	UPLOAD_HANDING ("1","文件上传中"),
	UPLOAD_SUCCESS ("2","文件上传成功"),
	UPLOAD_FAIL ("3","文件上传失败"),
	NOTICE_HANDING ("4","文件报送中"),
	NOTICE_SUCCESS ("5","文件报送成功"),
	NOTICE_FAIL ("6","文件报送失败");
    
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    
    MonitorBatchNoticeStatusEnum(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, MonitorBatchNoticeStatusEnum> valueMap = new HashMap<String, MonitorBatchNoticeStatusEnum>();

    static {
        for (MonitorBatchNoticeStatusEnum _enum : MonitorBatchNoticeStatusEnum.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static MonitorBatchNoticeStatusEnum parseOf(String value){
        for(MonitorBatchNoticeStatusEnum item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
	
}
