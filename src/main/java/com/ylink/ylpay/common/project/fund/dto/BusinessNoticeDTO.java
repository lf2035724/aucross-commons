/**===========================================
 *        Copyright (C) 2013 YLINK
 *           All rights reserved
 *
 *  @项目名： aucross-common
 *  @文件名： BusinessNoticeVO.java
 *  @版本信息： V1.0.0 
 *  @作者： hinode
 *  @日期： 2013-1-26-下午02:17:45
 * 
 ============================================*/

package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @类名称： BusinessNoticeVO
 * @类描述： 
 * @创建人： hinode
 * @创建时间： 2013-1-26 下午02:17:45
 *
 * @修改人： hinode
 * @操作时间： 2013-1-26 下午02:17:45
 * @操作原因： 
 * 
 */
public class BusinessNoticeDTO implements Serializable {
	/**主键*/
	private Integer id;

	/**结算日期*/
    private String workDate;

    /**参与者类型*/
    private String partnerType;

    /**商户编号*/
    private String merchantCode;

    /**商户名称*/
    private String merchantName;

    /**收发类型*/
    private String trType;

    /**收发状态*/
    private String trStatus;

    /**收发次数*/
    private Integer trTimes;

    /**文件类型*/
    private String fileType;

    /**文件名*/
    private String fileName;

    /**总笔数*/
    private Integer totalCount;

    /**总金额*/
    private Long totalAmount;

    /**最后更新时间*/
    private Date lastUpdateDate;

    /**创建时间*/
    private Date createDate;

    /**异常信息*/
    private String errMsg;

    /**备注*/
    private String description;

    private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getPartnerType() {
		return partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getTrType() {
		return trType;
	}

	public void setTrType(String trType) {
		this.trType = trType;
	}

	public String getTrStatus() {
		return trStatus;
	}

	public void setTrStatus(String trStatus) {
		this.trStatus = trStatus;
	}

	public Integer getTrTimes() {
		return trTimes;
	}

	public void setTrTimes(Integer trTimes) {
		this.trTimes = trTimes;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
