package com.ylink.ylpay.common.project.fund.dto;
/** 
 * @author Leo
 * @date 2012-10-23
 * @description：新增银行卡应答信息DTO
 */
public class Busi202DTO {
	
	private String instuId; 			//证联融通分配给商户的机构代码
	private String fundDate; 			//商户的系统日期，YYYYMMDD 
	private String fundTime; 			//商户的时间戳，HHMMSS
	private String fundSeqId; 			//商户系统流水号。需要保证一个交易日中流水号的唯一性
//	private String transType; 			//参见接口说明
	private String userId; 				//用户在证联融通平台里的客户号
	private String userNameText; 		//客户的姓名
	private String certType; 			//证件类型，参考附录
	private String certId; 				//证件号码
	private String bankCode; 			//银行代码，参见附录 
	private String bankProvinceCode;	//省份代码，参见附录
	private String bankRegionCode; 		//地区代码，参见附录
	private String cardNo; 				//提现银行卡帐号
	private String pnrDate;				//证联融通发起交易的系统日期，YYYYMMDD
	private String pnrTime;				//证联融通发给基金的时间戳，HHMMSS
	private String pnrSeqId;			//证联融通的流水号。需要保证一个交易日中流水号的唯一性
	private String respCode; 			//应答码，参考附录
	private String respDesc; 			//业务应答描述
	private String resv; 				//保留域，接收方必须原样回送该字段数据
	private String tradeOrigin;         //交易来源 0:互联网，1:移动终端              
	private String useType;             //使用方式  0:标准(直连银行)，1:小额(银联)   
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
//	public String getTransType() {
//		return transType;
//	}
//	public void setTransType(String transType) {
//		this.transType = transType;
//	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNameText() {
		return userNameText;
	}
	public void setUserNameText(String userNameText) {
		this.userNameText = userNameText;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertId() {
		return certId;
	}
	public void setCertId(String certId) {
		this.certId = certId;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankProvinceCode() {
		return bankProvinceCode;
	}
	public void setBankProvinceCode(String bankProvinceCode) {
		this.bankProvinceCode = bankProvinceCode;
	}
	public String getBankRegionCode() {
		return bankRegionCode;
	}
	public void setBankRegionCode(String bankRegionCode) {
		this.bankRegionCode = bankRegionCode;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPnrDate() {
		return pnrDate;
	}
	public void setPnrDate(String pnrDate) {
		this.pnrDate = pnrDate;
	}
	public String getPnrTime() {
		return pnrTime;
	}
	public void setPnrTime(String pnrTime) {
		this.pnrTime = pnrTime;
	}
	public String getPnrSeqId() {
		return pnrSeqId;
	}
	public void setPnrSeqId(String pnrSeqId) {
		this.pnrSeqId = pnrSeqId;
	}
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespDesc() {
		return respDesc;
	}
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	public String getResv() {
		return resv;
	}
	public void setResv(String resv) {
		this.resv = resv;
	}
	public String getTradeOrigin() {
		return tradeOrigin;
	}
	public void setTradeOrigin(String tradeOrigin) {
		this.tradeOrigin = tradeOrigin;
	}
	public String getUseType() {
		return useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}
	
	
	
}
