/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-1
 */

/**
 * AccountPayMentDTO.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:YG.HU 2012-11-1
 */
package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;


/** 
 * @author ZhangDM(Mingly)
 * @date 2013-2-27
 * @description：订单冲正DTO
 */

public class OrderReverseDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;
    
    private String tradeId;
    
    private String payId;
    
    private boolean reconFlag;
    
    private String tradeType;

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public boolean isReconFlag() {
		return reconFlag;
	}

	public void setReconFlag(boolean reconFlag) {
		this.reconFlag = reconFlag;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
    
    
}
