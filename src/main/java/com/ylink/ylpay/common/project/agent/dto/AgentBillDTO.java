package com.ylink.ylpay.common.project.agent.dto;

import java.util.List;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-5-9
 * @description：缴费单DTO
 */
public class AgentBillDTO extends AbstractDTO{
	private static final long serialVersionUID = 6554605760700591114L;
	/**交易码*/
	private String transCode;
	/**接入商户ID*/
	private String instuId;
	/**通知ID*/
	private String notifyId;
	/**通知时间*/
	private String notifyTime;
	/**通知类型*/
	private String notifyType;
	/**返回码*/
	private String respCode;
	/**返回信息*/
	private String respMsg;
	/**查询流水号*/
	private String requestSn;
	/**机表号*/
	private String billKey;
	/**收费单位标识号*/
	private String companyId;
	/**备用字段*/
	private String item1;
	/**备用字段*/
	private String item2;
	/**备用字段*/
	private String item3;
	/**备用字段*/
	private String item4;
	/**备用字段*/
	private String item5;
	/**备用字段*/
	private String item6;
	/**备用字段*/
	private String item7;
	/**总笔数*/
	private String totalNum;
	/**缴费单明细*/
	private List<AgentBillDetailDTO> listData;
	public String getTransCode() {
		return transCode;
	}
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}
	public String getInstuId() {
		return instuId;
	}
	public void setInstuId(String instuId) {
		this.instuId = instuId;
	}
	public String getNotifyId() {
		return notifyId;
	}
	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}
	public String getNotifyTime() {
		return notifyTime;
	}
	public void setNotifyTime(String notifyTime) {
		this.notifyTime = notifyTime;
	}
	public String getNotifyType() {
		return notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	public String getRequestSn() {
		return requestSn;
	}
	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}
	public String getItem1() {
		return item1;
	}
	public void setItem1(String item1) {
		this.item1 = item1;
	}
	public String getItem2() {
		return item2;
	}
	public void setItem2(String item2) {
		this.item2 = item2;
	}
	public String getItem3() {
		return item3;
	}
	public void setItem3(String item3) {
		this.item3 = item3;
	}
	public String getItem4() {
		return item4;
	}
	public void setItem4(String item4) {
		this.item4 = item4;
	}
	public String getItem5() {
		return item5;
	}
	public void setItem5(String item5) {
		this.item5 = item5;
	}
	public String getItem6() {
		return item6;
	}
	public void setItem6(String item6) {
		this.item6 = item6;
	}
	public String getItem7() {
		return item7;
	}
	public void setItem7(String item7) {
		this.item7 = item7;
	}
	public String getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public List<AgentBillDetailDTO> getListData() {
		return listData;
	}
	public void setListData(List<AgentBillDetailDTO> listData) {
		this.listData = listData;
	}
	public String getBillKey() {
		return billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
}
