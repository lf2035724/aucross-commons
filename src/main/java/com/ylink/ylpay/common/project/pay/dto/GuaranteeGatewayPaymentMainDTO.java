/**
 * GuaranteeGatewayPaymentMainDTO.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:LiuQ 2013-3-28
 */
package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;
import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author LiuQ
 * @date 2013-3-28
 * @description：担保支付--网关支付主DTO
 */
public class GuaranteeGatewayPaymentMainDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

    /**
     * 操作代码
     */
    private String optCode;
    /**
     * 业务类型
     */
    private String productType;
    /**
     * 付款方客户编号
     */
    private String payerCustId;
	/**
	 * 付款方客户真实姓名 
	 */
    private String payerCustName;
    /**
     * 收款方客户编号
     */
    private String payeeCustId;
    /**
     * 收款方客户真实姓名
     */
    private String payeeCustName;
    /**
     * 商户号
     */
    private String merchantId;
    /**
     * 业务日期(电商方业务时间如：前置结算日期)
     */
    private Date businessTime;
	/**
	 * 订单明细
	 */
	private List<GuaranteeGatewayPaymentDTO> mergerDetails;
	/**
	 * @return the optCode
	 */
	public String getOptCode() {
		return optCode;
	}
	/**
	 * @param optCode the optCode to set
	 */
	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}
	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}
	/**
	 * @return the payerCustId
	 */
	public String getPayerCustId() {
		return payerCustId;
	}
	/**
	 * @param payerCustId the payerCustId to set
	 */
	public void setPayerCustId(String payerCustId) {
		this.payerCustId = payerCustId;
	}
	/**
	 * @return the payerCustName
	 */
	public String getPayerCustName() {
		return payerCustName;
	}
	/**
	 * @param payerCustName the payerCustName to set
	 */
	public void setPayerCustName(String payerCustName) {
		this.payerCustName = payerCustName;
	}
	/**
	 * @return the payeeCustId
	 */
	public String getPayeeCustId() {
		return payeeCustId;
	}
	/**
	 * @param payeeCustId the payeeCustId to set
	 */
	public void setPayeeCustId(String payeeCustId) {
		this.payeeCustId = payeeCustId;
	}
	/**
	 * @return the payeeCustName
	 */
	public String getPayeeCustName() {
		return payeeCustName;
	}
	/**
	 * @param payeeCustName the payeeCustName to set
	 */
	public void setPayeeCustName(String payeeCustName) {
		this.payeeCustName = payeeCustName;
	}
	/**
	 * @return the merchantId
	 */
	public String getMerchantId() {
		return merchantId;
	}
	/**
	 * @param merchantId the merchantId to set
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	/**
	 * @return the businessTime
	 */
	public Date getBusinessTime() {
		return businessTime;
	}
	/**
	 * @param businessTime the businessTime to set
	 */
	public void setBusinessTime(Date businessTime) {
		this.businessTime = businessTime;
	}
	/**
	 * @return the mergerDetails
	 */
	public List<GuaranteeGatewayPaymentDTO> getMergerDetails() {
		return mergerDetails;
	}
	/**
	 * @param mergerDetails the mergerDetails to set
	 */
	public void setMergerDetails(List<GuaranteeGatewayPaymentDTO> mergerDetails) {
		this.mergerDetails = mergerDetails;
	}
}
