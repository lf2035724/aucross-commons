/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-5-29
 */
package com.ylink.ylpay.common.project.otcbb.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author jf.zhao
 * @date 2013-5-29
 * @description：
 */
public class BillCheckDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4279133123973347791L;
	/**
	 * 序号
	 */
	private String id;
	/**
	 * 商户号
	 */
	private String merchantId;
	/**
	 * 工作日
	 */
	private String workDate;
	/**
	 * 对账状态
	 */
	private String status;
	/**
	 * 完成时间
	 */
	private Date finishedTime;
	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 开始工作日
	 */
	private String begWorkDate;
	/**
	 * 结束工作日
	 */
	private String endWorkDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getFinishedTime() {
		return finishedTime;
	}

	public void setFinishedTime(Date finishedTime) {
		this.finishedTime = finishedTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getBegWorkDate() {
		return begWorkDate;
	}

	public void setBegWorkDate(String begWorkDate) {
		this.begWorkDate = begWorkDate;
	}

	public String getEndWorkDate() {
		return endWorkDate;
	}

	public void setEndWorkDate(String endWorkDate) {
		this.endWorkDate = endWorkDate;
	}

}
