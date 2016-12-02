package com.ylink.ylpay.common.project.agent.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-5-9
 * @description：缴费单查询DTO
 */
public class AgentBillQueryDTO extends AbstractDTO{

	private static final long serialVersionUID = -2337171510691624962L;
	/**交易码*/
	private String transCode;
	/**接入商户ID*/
	private String instuId;
	/**通知URL*/
	private String notifyUrl;
	/**请求流水*/
	private String requestSn;
	/**机表号*/
	private String billKey;
//	/**收费单位标识*/
//	private String companyId;
	/**缴费项目城市代码*/
	private String cityCode;
	/**缴费项目代码*/
	private String projectCode;
	/**公用回传参数*/
	private String extraCommonParam;
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
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getRequestSn() {
		return requestSn;
	}
	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}
	public String getBillKey() {
		return billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getExtraCommonParam() {
		return extraCommonParam;
	}
	public void setExtraCommonParam(String extraCommonParam) {
		this.extraCommonParam = extraCommonParam;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
}
