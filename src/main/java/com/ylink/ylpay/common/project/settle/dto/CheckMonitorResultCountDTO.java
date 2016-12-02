/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-6-1
 */
package com.ylink.ylpay.common.project.settle.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author jf.zhao
 * @date 2013-6-1
 * @description：
 */
public class CheckMonitorResultCountDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5781842497757265799L;
	/**
	 * 总记录数
	 */
	private Long sumCount;
	/**
	 * 平帐总笔数
	 */
	private Long balanceCount;
	/**
	 * 不平帐总笔数
	 */
	private Long unBalanceCount;

	/**
	 * 未对账记录数
	 */
	private Long unBillCheckCount;

	/**
	 * 开始账务日期
	 */
	private String beginAccountDate;
	/**
	 * 结束账务日期
	 */
	private String endAccountDate;

	/**
	 * 调平帐笔数
	 */
	private Long adjustBalanceCount;

	/**
	 * 监控id
	 */
	private String checkId;
	
	/**
	 * 银行存款三级科目id
	 */
	private String accountId;

	public Long getSumCount() {
		return sumCount;
	}

	public void setSumCount(Long sumCount) {
		this.sumCount = sumCount;
	}

	public Long getBalanceCount() {
		return balanceCount;
	}

	public void setBalanceCount(Long balanceCount) {
		this.balanceCount = balanceCount;
	}

	public Long getUnBalanceCount() {
		return unBalanceCount;
	}

	public void setUnBalanceCount(Long unBalanceCount) {
		this.unBalanceCount = unBalanceCount;
	}

	public String getBeginAccountDate() {
		return beginAccountDate;
	}

	public void setBeginAccountDate(String beginAccountDate) {
		this.beginAccountDate = beginAccountDate;
	}

	public String getEndAccountDate() {
		return endAccountDate;
	}

	public void setEndAccountDate(String endAccountDate) {
		this.endAccountDate = endAccountDate;
	}

	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	public Long getUnBillCheckCount() {
		return unBillCheckCount;
	}

	public void setUnBillCheckCount(Long unBillCheckCount) {
		this.unBillCheckCount = unBillCheckCount;
	}

	public Long getAdjustBalanceCount() {
		return adjustBalanceCount;
	}

	public void setAdjustBalanceCount(Long adjustBalanceCount) {
		this.adjustBalanceCount = adjustBalanceCount;
	}

	@Override
	public String toString() {
		return "CheckMonitorResultCountDTO [sumCount=" + sumCount
				+ ", balanceCount=" + balanceCount + ", unBalanceCount="
				+ unBalanceCount + ", unBillCheckCount=" + unBillCheckCount
				+ ", beginAccountDate=" + beginAccountDate
				+ ", endAccountDate=" + endAccountDate
				+ ", adjustBalanceCount=" + adjustBalanceCount + ", checkId="
				+ checkId + "]";
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
}
