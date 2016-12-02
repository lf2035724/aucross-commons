package com.ylink.ylpay.common.project.mp.dto;

import java.io.Serializable;

public class CustobyUserDTO implements Serializable {
	
	private static final long serialVersionUID = 5872149634658299016L;

	private String identity;

	/**
	 * 客户ID
	 */
	private String custId;
	/**
	 * 客户姓名
	 */
	private String custName;
	/**
	 * 客户id
	 */
	private String whiteCustId;
	/**
	 * 客户姓名
	 */
	private String whiteCustName;
	/**
	 * 收款方银行卡号
	 */
	private String whiteCardNo;
	/**
	 * 收款方银行卡户名
	 */
	private String whiteCardName;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 行别
	 */
	private String whiteBankType;
	
	
	/**
	 * 行别名称
	 */
	private String whiteBankTypeName;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 更新时间
	 */
	private String updateTime;
	
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getWhiteCustId() {
		return whiteCustId;
	}
	public void setWhiteCustId(String whiteCustId) {
		this.whiteCustId = whiteCustId;
	}
	public String getWhiteCustName() {
		return whiteCustName;
	}
	public void setWhiteCustName(String whiteCustName) {
		this.whiteCustName = whiteCustName;
	}
	public String getWhiteCardNo() {
		return whiteCardNo;
	}
	public void setWhiteCardNo(String whiteCardNo) {
		this.whiteCardNo = whiteCardNo;
	}
	public String getWhiteCardName() {
		return whiteCardName;
	}
	public void setWhiteCardName(String whiteCardName) {
		this.whiteCardName = whiteCardName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getWhiteBankType() {
		return whiteBankType;
	}
	public void setWhiteBankType(String whiteBankType) {
		this.whiteBankType = whiteBankType;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getWhiteBankTypeName() {
		return whiteBankTypeName;
	}
	public void setWhiteBankTypeName(String whiteBankTypeName) {
		this.whiteBankTypeName = whiteBankTypeName;
	}

}
