/**
 * ApplyRefund.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:LiuQ 2013-4-12
 */
package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author LiuQ
 * @date 2013-4-12
 * @description 退款申请DTO
 */
public class ApplyRefundDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;

	/**
	 * 交易订单编号
	 */
	private String tradeId;
	
	/**
	 * 退款理由
	 */
	private String refundReson;
	
	/**
	 * 拒绝理由
	 */
	private String refuseReson;
	
	/**
	 * 留言
	 */
	private String message;
	
	/**
	 * 退款金额
	 */
	private long refundAmt;
	
	/**
	 * 退款状态：
	 * 00：退款协议等待卖家确认中
	 * 01：拒绝退款
	 * 02：退款成功
	 * 03：退款关闭
	 */
	private String refundStatus;
	
	/**
	 * 物流状态
	 */
	private String logisticsStatus;
	
	/**
	 * 交易订单状态
	 */
	private String tradeStatus;
	
	/**
	 * 是否需要退货
	 */
	private String isReturn;
	
	/**
	 * 创建时间
	 */
	private Date createDate;
	
	/**
	 * 更新时间
	 */
	private Date updateDate;
	
	/**
	 * @return the tradeId
	 */
	public String getTradeId() {
		return tradeId;
	}

	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * @return the refundReson
	 */
	public String getRefundReson() {
		return refundReson;
	}

	/**
	 * @param refundReson the refundReson to set
	 */
	public void setRefundReson(String refundReson) {
		this.refundReson = refundReson;
	}

	/**
	 * @return the refuseReson
	 */
	public String getRefuseReson() {
		return refuseReson;
	}

	/**
	 * @param refuseReson the refuseReson to set
	 */
	public void setRefuseReson(String refuseReson) {
		this.refuseReson = refuseReson;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the refundAmt
	 */
	public long getRefundAmt() {
		return refundAmt;
	}

	/**
	 * @param refundAmt the refundAmt to set
	 */
	public void setRefundAmt(long refundAmt) {
		this.refundAmt = refundAmt;
	}

	/**
	 * @return the refundStatus
	 */
	public String getRefundStatus() {
		return refundStatus;
	}

	/**
	 * @param refundStatus the refundStatus to set
	 */
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	/**
	 * @return the logisticsStatus
	 */
	public String getLogisticsStatus() {
		return logisticsStatus;
	}

	/**
	 * @param logisticsStatus the logisticsStatus to set
	 */
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	/**
	 * @return the tradeStatus
	 */
	public String getTradeStatus() {
		return tradeStatus;
	}

	/**
	 * @param tradeStatus the tradeStatus to set
	 */
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	/**
	 * @return the isReturn
	 */
	public String getIsReturn() {
		return isReturn;
	}

	/**
	 * @param isReturn the isReturn to set
	 */
	public void setIsReturn(String isReturn) {
		this.isReturn = isReturn;
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
}
