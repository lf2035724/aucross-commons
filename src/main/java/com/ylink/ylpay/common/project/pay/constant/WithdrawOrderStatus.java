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
 * @author YG.HU
 * @date 2012-11-1
 * @description：提现交易订单状态
 */
public enum WithdrawOrderStatus {
    
    APPLYING("00", "提现申请中","RISKCONTROL", "申请中"),
    HANDLING("01", "提现处理中","RISKCONTROL", "处理中"),
    BANKING("02", "银行处理中(线上)","RISKCONTROL", "处理中"),
    OFFLINEING("03", "银行处理中(线下)","RISKCONTROL", "处理中"),
    REFUSEING("04", "拒绝处理中","RISKCONTROL", "处理中"),
    SUCCESS("05", "提现成功","RISKCONTROL", "成功"),
    FAILREFUND("06", "提现失败，待退款","RISKCONTROL", "处理中"),
    FAIL("07", "提现失败","NORISKCONTROL", "失败"),
    FAIL_REVERSE("08", "提现失败,已冲正","NORISKCONTROL", "失败，已冲正"),
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
        for (WithdrawOrderStatus _enum : WithdrawOrderStatus.values()) {
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
    
    WithdrawOrderStatus(String value, String displayName ,String riskControlFlag, 
    		String displayNameToCust){
        this.value = value ;
        this.displayName = displayName ;
        this.riskControlFlag = riskControlFlag ;
        this.displayNameToCust = displayNameToCust;
    }
    /**
	 * 枚举转换
	 */
	public static WithdrawOrderStatus parseOf( String value ){
		for( WithdrawOrderStatus item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("枚举值["+value+"]不匹配!");
	}
}
