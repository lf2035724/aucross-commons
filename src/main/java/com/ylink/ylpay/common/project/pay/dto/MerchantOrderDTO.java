/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:lyg 2013-7-16
 */

package com.ylink.ylpay.common.project.pay.dto;

/** 
 * @author lyg
 * @date 2013-7-16
 * @description：TODO
 */

public class MerchantOrderDTO extends PaymentOrderDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String orderId;
	private String queryBeginDateStr;
    private String queryEndDateStr;
    private String beginSettleDateStr;
    private String endSettleDateStr;
    
   

	public String getOrderId() {
		return orderId;
	}

	public String getBeginSettleDateStr() {
		return beginSettleDateStr;
	}

	public void setBeginSettleDateStr(String beginSettleDateStr) {
		this.beginSettleDateStr = beginSettleDateStr;
	}

	public String getEndSettleDateStr() {
		return endSettleDateStr;
	}

	public void setEndSettleDateStr(String endSettleDateStr) {
		this.endSettleDateStr = endSettleDateStr;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getQueryBeginDateStr() {
		return queryBeginDateStr;
	}

	public void setQueryBeginDateStr(String queryBeginDateStr) {
		this.queryBeginDateStr = queryBeginDateStr;
	}

	public String getQueryEndDateStr() {
		return queryEndDateStr;
	}

	public void setQueryEndDateStr(String queryEndDateStr) {
		this.queryEndDateStr = queryEndDateStr;
	}
	
}
