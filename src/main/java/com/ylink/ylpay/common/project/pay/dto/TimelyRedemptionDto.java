package com.ylink.ylpay.common.project.pay.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

public class TimelyRedemptionDto extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	private String instuid;		//证联融通分配给商户的机构代码
	private String fundseqid;	//商户系统流水号。需要保证一个交易日中流水号的唯一性
	private String liqdate;  	//交易结算日期
	private String tradeid;		//赎回提现订单号
	private String transferStatus;	//到账状态  	TTrnasferStatus
	private Date   transferDate;	//	到账日期
	private String message;        //公共信息
	/**
	 * @return the instuid
	 */
	public String getInstuid() {
		return instuid;
	}
	/**
	 * @param instuid the instuid to set
	 */
	public void setInstuid(String instuid) {
		this.instuid = instuid;
	}
	/**
	 * @return the fundseqid
	 */
	public String getFundseqid() {
		return fundseqid;
	}
	/**
	 * @param fundseqid the fundseqid to set
	 */
	public void setFundseqid(String fundseqid) {
		this.fundseqid = fundseqid;
	}
	/**
	 * @return the liqdate
	 */
	public String getLiqdate() {
		return liqdate;
	}
	/**
	 * @param liqdate the liqdate to set
	 */
	public void setLiqdate(String liqdate) {
		this.liqdate = liqdate;
	}
	/**
	 * @return the tradeid
	 */
	public String getTradeid() {
		return tradeid;
	}
	/**
	 * @param tradeid the tradeid to set
	 */
	public void setTradeid(String tradeid) {
		this.tradeid = tradeid;
	}
	/**
	 * @return the transferStatus
	 */
	public String getTransferStatus() {
		return transferStatus;
	}
	/**
	 * @param transferStatus the transferStatus to set
	 */
	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	/**
	 * @return the transferDate
	 */
	public Date getTransferDate() {
		return transferDate;
	}
	/**
	 * @param transferDate the transferDate to set
	 */
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
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
	
}
