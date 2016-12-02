/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-1
 */

/**
 * PaymentOrderStatus.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:YG.HU 2012-11-1
 */
package com.ylink.ylpay.common.project.pay.constant;


/**
 * 通知状态
 * @author LiXiPing
 * @date 2013-11-13
 * @description：
 */
public enum NotifyStatus {
    
    NO_Notify("00", "未通知","RISKCONTROL", "未通知"),
    SUCCESS("01", "已通知","RISKCONTROL", "已通知"),
    ;
      
    private String value;
    private String displayName;
    private String riskControlFlag;
    /**
     * 展示用户的状态说明
     */
    private String displayNameToCust;
    
    public String getValue() {
        return this.value;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public String getriskControlFlag() {
        return this.riskControlFlag;
    }
    public String getDisplayNameToCust() {
		return displayNameToCust;
	}
    public static String getRiskControl(){   
        String head = "(";
        String foot = ")";
        String flag = ",";
        StringBuffer body = new StringBuffer();
        for (NotifyStatus _enum : NotifyStatus.values()) {
            if(_enum.riskControlFlag.equals("NORISKCONTROL")){
                body.append("'"+_enum.value+"'"+flag);
            }
        } 
        if (body.length()==0){
            return null;    
        }else{
            return head+body.subSequence(0, body.length()-flag.length())+foot;
        }
    }
    
    NotifyStatus(String value, String displayName ,String riskControlFlag, 
    		String displayNameToCust){
        this.value = value ;
        this.displayName = displayName ;
        this.riskControlFlag = riskControlFlag ;
        this.displayNameToCust = displayNameToCust;
    }
    /**
	 * 枚举转换
	 */
	public static NotifyStatus parseOf( String value ){
		for( NotifyStatus item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}
}
