/**
 * BankSettleNoticeDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:YULONG.DU 2013-12-31
 */
package com.ylink.ylpay.common.project.mp.dto;

import java.util.Date;
import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * @author YULONG.DU
 * @date 2013-12-31
 * @description 银行清算通知对外传输对象
 */
public class BankSettleNoticeDTO extends BaseDTO{

   private static final long serialVersionUID = 6848282207660134338L;
   /**
    * 记录主键
    */
   private String id;
   /**
    * 行别
    */
   private String bankType;
   /**
    * 支付类型
    */
   private String payType;
   /**
    * 对账日期
    */
   private String settleDate;
   /**
    * 批次号
    */
   private String batchNo;
   /**
    * 对账文件名
    */
   private String fileName;
   /**
    * 处理结果
    */
   private String dealResult;
   /**
    * 创建时间
    */
   private Date createTime;
   /**
    * 更新时间
    */
   private Date updateTime;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getBankType() {
	return bankType;
}

public void setBankType(String bankType) {
	this.bankType = bankType;
}

public String getPayType() {
	return payType;
}

public void setPayType(String payType) {
	this.payType = payType;
}

public String getSettleDate() {
	return settleDate;
}

public void setSettleDate(String settleDate) {
	this.settleDate = settleDate;
}

public String getBatchNo() {
	return batchNo;
}

public void setBatchNo(String batchNo) {
	this.batchNo = batchNo;
}

public String getFileName() {
	return fileName;
}

public void setFileName(String fileName) {
	this.fileName = fileName;
}

public String getDealResult() {
	return dealResult;
}

public void setDealResult(String dealResult) {
	this.dealResult = dealResult;
}

public Date getCreateTime() {
	return createTime;
}

public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}

public Date getUpdateTime() {
	return updateTime;
}

public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
} 
}
