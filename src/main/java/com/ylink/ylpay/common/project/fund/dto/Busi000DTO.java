package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;

/** 
 * @author Leo
 * @date 2012-10-23
 * @description：文件上传通知请求信息DTO
 */
public class Busi000DTO implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	private String instuId; 			//证联融通分配给商户的机构代码
	private String fundDate; 			//系统日期，YYYYMMDD 
	private String fundTime; 			//时间戳，HHMMSS
	private String fundSeqId; 			//通知发起方系统流水号。需要保证一个交易日中流水号的唯一性
	private String fileName; 			//文件名称
	private String filePath; 			//文件存放ftp路径
	private String busiType; 			//文件业务类型
	public String getInstuId() {
		return instuId;
	}
	public void setInstuId(String instuId) {
		this.instuId = instuId;
	}
	public String getFundDate() {
		return fundDate;
	}
	public void setFundDate(String fundDate) {
		this.fundDate = fundDate;
	}
	public String getFundTime() {
		return fundTime;
	}
	public void setFundTime(String fundTime) {
		this.fundTime = fundTime;
	}
	public String getFundSeqId() {
		return fundSeqId;
	}
	public void setFundSeqId(String fundSeqId) {
		this.fundSeqId = fundSeqId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getBusiType() {
		return busiType;
	}
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	
	
	
}
