package com.ylink.ylpay.common.project.fund.dto;

import java.lang.reflect.Method;

import com.ylink.ylpay.common.project.utils.ContextUtil;

/** 
 * @author Leo
 * @date 2012-10-23
 * @description：新增银行卡请求信息DTO
 */
public class Busi102DTO  {
	private static final long serialVersionUID = 1L;
	
	private String instuId; 			//证联融通分配给商户的机构代码
	private String fundDate; 			//商户的系统日期，YYYYMMDD 
	private String fundTime; 			//商户的时间戳，HHMMSS
	private String fundSeqId; 			//商户系统流水号。需要保证一个交易日中流水号的唯一性
//	private String transType; 			//参见接口说明 
	private String userId;				//12客户号
	private String userNameText; 		//客户的姓名
	private String certType; 			//证件类型，参考附录
	private String certId; 				//证件号码
	private String bankCode; 			//银行代码，参见附录 
	private String bankProvinceCode;	//省份代码，参见附录
	private String bankRegionCode; 		//地区代码，参见附录
	private String cardNo; 				//提现银行卡帐号
	private String pgRecvUrl; 			//交易请求方将交易发给接收方后，交易应答接收的页面地址
	private String bgRecvUrl; 			//交易请求方将交易发给接收方后，交易应答接收后台地址
	private String resv; 				//保留域，接收方必须原样回送该字段数据
	private String reBackUrl;
	private String tiedCardType;       //绑卡方式，0：快捷，1：网关
	private String tradeOrigin;         //交易来源  0:互联网，1:移动终端                   
	private String useType;             //使用方式(直连银行(默认大额)还是银联(默认小额))  
	
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
	public String getTiedCardType() {
		return tiedCardType;
	}
	public void setTiedCardType(String tiedCardType) {
		this.tiedCardType = tiedCardType;
	}
	
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
	public String getPgRecvUrl() {
		return pgRecvUrl;
	}
	public void setPgRecvUrl(String pgRecvUrl) {
		this.pgRecvUrl = pgRecvUrl;
	}
	public String getBgRecvUrl() {
		return bgRecvUrl;
	}
	public void setBgRecvUrl(String bgRecvUrl) {
		this.bgRecvUrl = bgRecvUrl;
	}
	public String getResv() {
		return resv;
	}
	public void setResv(String resv) {
		this.resv = resv;
	}

	public String getReBackUrl() {
		return reBackUrl;
	}
	public void setReBackUrl(String reBackUrl) {
		this.reBackUrl = reBackUrl;
	}
	
	public static String Buis102DTOToStr(Busi102DTO busi102DTO){
		StringBuffer sBuffer = new StringBuffer(); 
		sBuffer.append("instuId="+busi102DTO.getInstuId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundDate="+busi102DTO.getFundDate()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundTime="+busi102DTO.getFundTime()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("fundSeqId="+busi102DTO.getFundSeqId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("userNameText="+busi102DTO.getUserNameText()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("userId="+busi102DTO.getUserId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("certType="+busi102DTO.getCertType()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("certId="+busi102DTO.getCertId()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankCode="+busi102DTO.getBankCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankProvinceCode="+busi102DTO.getBankProvinceCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bankRegionCode="+busi102DTO.getBankRegionCode()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("cardNo="+busi102DTO.getCardNo()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("pgRecvUrl="+busi102DTO.getPgRecvUrl()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("bgRecvUrl="+busi102DTO.getBgRecvUrl()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("resv="+busi102DTO.getResv()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("reBackUrl="+busi102DTO.getReBackUrl()+ ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("tiedCardType="+busi102DTO.getTiedCardType()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("tradeOrigin="+ContextUtil.URL_EQUAL_DELIMITER+busi102DTO.getTradeOrigin()+ContextUtil.URL_FIELD_DELIMITER);
		sBuffer.append("useType="+ContextUtil.URL_EQUAL_DELIMITER+busi102DTO.getUseType()+ContextUtil.URL_FIELD_DELIMITER);
		
		return sBuffer.toString();
	}
	public static Busi102DTO strToBusi102DTO(String str)
	{
		String[] params=str.split( ContextUtil.URL_FIELD_DELIMITER);
		Busi102DTO dto=new Busi102DTO();
		for(String param:params)
		{
			String[] keyValue=param.split("=");
			if(keyValue.length==2)
			{
				try {
					Method methodsn =dto.getClass().getMethod("set"+keyValue[0].substring(0, 1).toUpperCase()+keyValue[0].substring(1), String.class);
					methodsn.invoke(dto, keyValue[1]);
				} catch (Exception e) {
					
				}
				
			}
		}
		return dto;
	}
	
}
