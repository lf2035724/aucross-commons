/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-6
 */

/**
 * DayCut.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-6
 */
package com.ylink.ylpay.common.project.invest.dto;

import java.io.Serializable;

/**
 * @author Petter
 */
public class FcheckMonitorDTO  implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String instuId;			//商户ID
	private String checkDate;		//对账日期，yyyyMMdd
	private String checkStatus;		//对账状态：0未对账1对账中2对账成功3对账失败
	private String fileStatus;		//对账文件状态：0未生成1生成成功2生成失败
	private String checkTime;			//对账时间：hhmmss
	private String fileTime;			//文件生成时间：hhmmss
	
	private String checkDateStart;
	private String checkDateEnd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInstuId() {
		return instuId;
	}
	public void setInstuId(String instuId) {
		this.instuId = instuId;
	}
	public String getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getFileTime() {
		return fileTime;
	}
	public void setFileTime(String fileTime) {
		this.fileTime = fileTime;
	}
	public String getCheckDateStart() {
		return checkDateStart;
	}
	public void setCheckDateStart(String checkDateStart) {
		this.checkDateStart = checkDateStart;
	}
	public String getCheckDateEnd() {
		return checkDateEnd;
	}
	public void setCheckDateEnd(String checkDateEnd) {
		this.checkDateEnd = checkDateEnd;
	}
	@Override
	public String toString() {
		return "FcheckMonitorDTO [id=" + id + ", instuId=" + instuId
				+ ", checkDate=" + checkDate + ", checkStatus=" + checkStatus
				+ ", fileStatus=" + fileStatus + ", checkTime=" + checkTime
				+ ", fileTime=" + fileTime + ", checkDateStart="
				+ checkDateStart + ", checkDateEnd=" + checkDateEnd + "]";
	}

}
