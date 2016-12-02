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
 * @description：支付交易订单状态
 */
public enum PaymentOrderStatus {
    
    HANDLING("00", "等待付款", "等待对方付款", "RISKCONTROL"),
    SUCCESS("01", "交易成功", "交易成功","RISKCONTROL"),
    FAIL("02", "交易失败", "交易失败","NORISKCONTROL"),
    REVOKEAPPLY("03", "撤单申请中", "对方撤单申请中","RISKCONTROL"),
    REVOKED("04", "已撤单", "对方已撤单","NORISKCONTROL"),
    FAIL_REVERSE("05", "交易失败,已冲正", "交易失败,已冲正","NORISKCONTROL"),
    CALLBACK_HANDLING("06", "处理中", "处理中","RISKCONTROL"),
    WAIT_BUYER_CONFIRM("07", "等待买家确认", "等待买家确认","RISKCONTROL"),
    APPLY_REFUND("08", "已申请退款", "已申请退款","RISKCONTROL"),
    REFUND_CLOSED("09", "交易关闭,已退款", "交易关闭,已退款","RISKCONTROL"),
    FAIL_ADDITIONAL("10", "交易失败,已补录", "交易失败,已补录","NORISKCONTROL"),
    TRDER_CLOSED("11", "交易关闭", "交易关闭", "RISKCONTROL"),
    ALL("99","全部","全部","ALL")
    ;
    
    private String value;
    private String payerDisplayName;
    private String payeeDisplayName;
    private String riskControlFlag;
    
    public String getValue() {
        return this.value;
    }
    public static String getRiskControl(){   
        String head = "(";
        String foot = ")";
        String flag = ",";
        StringBuffer body = new StringBuffer();
        for (PaymentOrderStatus _enum : PaymentOrderStatus.values()) {
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
    public String getPayerDisplayName() {
		return payerDisplayName;
	}

	public String getPayeeDisplayName() {
		return payeeDisplayName;
	}
	
    public String getriskControlFlag() {
        return riskControlFlag;
    }
//Hibernate	使用
//	private static Map<String, PaymentOrderStatus> valueMap = new HashMap<String, PaymentOrderStatus>();
//
//	static {
//		for (PaymentOrderStatus _enum : PaymentOrderStatus.values()) {
//			valueMap.put(_enum.value, _enum);
//		}
//	}
//	
	/**
	 * 枚举转换
	 */
	public static PaymentOrderStatus parseOf(String value){
		for(PaymentOrderStatus item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("支付交易订单状态["+value+"]不匹配!");
	}


	PaymentOrderStatus(String value, String payerDisplayName, String payeeDisplayName ,String riskControlFlag){
        this.value = value ;
        this.payerDisplayName = payerDisplayName;
        this.payeeDisplayName = payeeDisplayName;
        this.riskControlFlag = riskControlFlag;
    }
	
}
