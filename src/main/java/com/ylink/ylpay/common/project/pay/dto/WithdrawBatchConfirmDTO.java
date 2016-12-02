/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 提现批次
 * @author yanghan
 * @date 2013-5-30
 */
public class WithdrawBatchConfirmDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -394321417405677049L;
	
	 	private String batchId;//批次号

	    private String batchStatus;//批量状态 (00：未处理 01：处理中)

	    private String payerBankType;//提现付款银行行别

	    private String payerBankCardNo;//提现付款银行卡卡号

	    private String payerCustId;//付款客户编号

	    private Date beginTime;//交易开始时间

	    private Date endTime;//交易结束时间

	    private Date createDate;//创建时间

	    private Date updateDate;//更新时间

	    private String errorCode;//异常代码

	    private String paymentType;//付款方式(0：线下 1：线上)
	    
	    private String payerCustName;//付款客户名称

		/**
		 * @return the batchId
		 */
		public String getBatchId() {
			return batchId;
		}

		/**
		 * @param batchId the batchId to set
		 */
		public void setBatchId(String batchId) {
			this.batchId = batchId;
		}

		/**
		 * @return the batchStatus
		 */
		public String getBatchStatus() {
			return batchStatus;
		}

		/**
		 * @param batchStatus the batchStatus to set
		 */
		public void setBatchStatus(String batchStatus) {
			this.batchStatus = batchStatus;
		}

		/**
		 * @return the payerBankType
		 */
		public String getPayerBankType() {
			return payerBankType;
		}

		/**
		 * @param payerBankType the payerBankType to set
		 */
		public void setPayerBankType(String payerBankType) {
			this.payerBankType = payerBankType;
		}

		/**
		 * @return the payerBankCardNo
		 */
		public String getPayerBankCardNo() {
			return payerBankCardNo;
		}

		/**
		 * @param payerBankCardNo the payerBankCardNo to set
		 */
		public void setPayerBankCardNo(String payerBankCardNo) {
			this.payerBankCardNo = payerBankCardNo;
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
		 * @return the beginTime
		 */
		public Date getBeginTime() {
			return beginTime;
		}

		/**
		 * @param beginTime the beginTime to set
		 */
		public void setBeginTime(Date beginTime) {
			this.beginTime = beginTime;
		}

		/**
		 * @return the endTime
		 */
		public Date getEndTime() {
			return endTime;
		}

		/**
		 * @param endTime the endTime to set
		 */
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}

		/**
		 * @return the createDate
		 */
		public Date getCreateDate() {
			return createDate;
		}

		/**
		 * @param createDate the createDate to set
		 */
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}

		/**
		 * @return the updateDate
		 */
		public Date getUpdateDate() {
			return updateDate;
		}

		/**
		 * @param updateDate the updateDate to set
		 */
		public void setUpdateDate(Date updateDate) {
			this.updateDate = updateDate;
		}

		/**
		 * @return the errorCode
		 */
		public String getErrorCode() {
			return errorCode;
		}

		/**
		 * @param errorCode the errorCode to set
		 */
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		/**
		 * @return the paymentType
		 */
		public String getPaymentType() {
			return paymentType;
		}

		/**
		 * @param paymentType the paymentType to set
		 */
		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
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

	    
}
