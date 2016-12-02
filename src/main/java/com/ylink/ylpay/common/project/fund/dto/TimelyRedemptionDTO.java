package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 基金实时赎回
 * @author LiXiPing
 * @date 2013-11-8
 * @description：
 */
public class TimelyRedemptionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;	//	流水号
	private String instuid;	//	证联融通分配给商户的机构代码
	private String funddate;	//	商户的系统日期，YYYYMMDD
	private String fundtime;	//	商户的时间戳，HHMMSS
	private String fundseqid;	//	唯一索引	结算日期联合索引	Y	商户系统流水号。需要保证一个交易日中流水号的唯一性
	private String flag;	//	赎回方式：	00赎回到用户银行卡（银行卡为(默认)
	private String banktype;	//	银行类别，行别
	private String cardno;	//	银行卡帐号
	private String userid;	//	用户在证联融通平台里的客户号
	private String usernametext;	//	客户的姓名
	private String certtype;	//	证件类型，参考附录
	private String certid;	//	证件号码
	private String transamt;	//	基金交易金额 以分为单位
	private String liqdate;	//	交易结算日期，YYYYMMDD；	不小于交易日期
	private String fundcode;	//	基金公司发行的基金代码
	private String fundType;	//	见附录10：基金类型
	private String trade_id;	//	赎回提现订单号
	private String checkstatus;	//	对账状态
	private String transfer_status;	//	到账状态  	0 未到账 	1 已到账	2 交易失败
	private Date transfer_date;	//	到账日期
	private String recv_Url;	//	回调地址（后台）
	private Date create_time;	//	创建日期
	private Date update_time;	//	更新日期
	private String resp_code;	//	应答码
	private String resp_desc;	//	应答描述
	private String gather_id;	//	汇总ID
	private String resv;	//	预留字段
	private String[] instuidInfo;
	private Date queryBeginTransferDate;//到账日期
    private Date queryEndTransferDate;
    
    private Date queryBeginLiqDate;//交易结算日期
    private Date queryEndLiqDate;
    
	/**
	 * @return the instuidInfo
	 */
	public String[] getInstuidInfo() {
		return instuidInfo;
	}
	/**
	 * @param instuidInfo the instuidInfo to set
	 */
	public void setInstuidInfo(String[] instuidInfo) {
		this.instuidInfo = instuidInfo;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the instuid
	 */
	public String getInstuid() {
		return instuid;
	}
	/**
	 * @param instuid the instuid to set
	 */
	public void setInstuid(String instuid) {
		this.instuid = instuid;
	}
	/**
	 * @return the funddate
	 */
	public String getFunddate() {
		return funddate;
	}
	/**
	 * @param funddate the funddate to set
	 */
	public void setFunddate(String funddate) {
		this.funddate = funddate;
	}
	/**
	 * @return the fundtime
	 */
	public String getFundtime() {
		return fundtime;
	}
	/**
	 * @param fundtime the fundtime to set
	 */
	public void setFundtime(String fundtime) {
		this.fundtime = fundtime;
	}
	/**
	 * @return the fundseqid
	 */
	public String getFundseqid() {
		return fundseqid;
	}
	/**
	 * @param fundseqid the fundseqid to set
	 */
	public void setFundseqid(String fundseqid) {
		this.fundseqid = fundseqid;
	}
	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}
	/**
	 * @return the banktype
	 */
	public String getBanktype() {
		return banktype;
	}
	/**
	 * @param banktype the banktype to set
	 */
	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}
	/**
	 * @return the cardno
	 */
	public String getCardno() {
		return cardno;
	}
	/**
	 * @param cardno the cardno to set
	 */
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the usernametext
	 */
	public String getUsernametext() {
		return usernametext;
	}
	/**
	 * @param usernametext the usernametext to set
	 */
	public void setUsernametext(String usernametext) {
		this.usernametext = usernametext;
	}
	/**
	 * @return the certtype
	 */
	public String getCerttype() {
		return certtype;
	}
	/**
	 * @param certtype the certtype to set
	 */
	public void setCerttype(String certtype) {
		this.certtype = certtype;
	}
	/**
	 * @return the certid
	 */
	public String getCertid() {
		return certid;
	}
	/**
	 * @param certid the certid to set
	 */
	public void setCertid(String certid) {
		this.certid = certid;
	}
	/**
	 * @return the transamt
	 */
	public String getTransamt() {
		return transamt;
	}
	/**
	 * @param transamt the transamt to set
	 */
	public void setTransamt(String transamt) {
		this.transamt = transamt;
	}
	/**
	 * @return the liqdate
	 */
	public String getLiqdate() {
		return liqdate;
	}
	/**
	 * @param liqdate the liqdate to set
	 */
	public void setLiqdate(String liqdate) {
		this.liqdate = liqdate;
	}
	/**
	 * @return the fundcode
	 */
	public String getFundcode() {
		return fundcode;
	}
	/**
	 * @param fundcode the fundcode to set
	 */
	public void setFundcode(String fundcode) {
		this.fundcode = fundcode;
	}
	/**
	 * @return the fundType
	 */
	public String getFundType() {
		return fundType;
	}
	/**
	 * @param fundType the fundType to set
	 */
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	/**
	 * @return the trade_id
	 */
	public String getTrade_id() {
		return trade_id;
	}
	/**
	 * @param trade_id the trade_id to set
	 */
	public void setTrade_id(String trade_id) {
		this.trade_id = trade_id;
	}
	/**
	 * @return the checkstatus
	 */
	public String getCheckstatus() {
		return checkstatus;
	}
	/**
	 * @param checkstatus the checkstatus to set
	 */
	public void setCheckstatus(String checkstatus) {
		this.checkstatus = checkstatus;
	}
	/**
	 * @return the transfer_status
	 */
	public String getTransfer_status() {
		return transfer_status;
	}
	/**
	 * @param transfer_status the transfer_status to set
	 */
	public void setTransfer_status(String transfer_status) {
		this.transfer_status = transfer_status;
	}
	/**
	 * @return the transfer_date
	 */
	public Date getTransfer_date() {
		return transfer_date;
	}
	/**
	 * @param transfer_date the transfer_date to set
	 */
	public void setTransfer_date(Date transfer_date) {
		this.transfer_date = transfer_date;
	}
	/**
	 * @return the recv_Url
	 */
	public String getRecv_Url() {
		return recv_Url;
	}
	/**
	 * @param recv_Url the recv_Url to set
	 */
	public void setRecv_Url(String recv_Url) {
		this.recv_Url = recv_Url;
	}
	/**
	 * @return the create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}
	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	/**
	 * @return the update_time
	 */
	public Date getUpdate_time() {
		return update_time;
	}
	/**
	 * @param update_time the update_time to set
	 */
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	/**
	 * @return the resp_code
	 */
	public String getResp_code() {
		return resp_code;
	}
	/**
	 * @param resp_code the resp_code to set
	 */
	public void setResp_code(String resp_code) {
		this.resp_code = resp_code;
	}
	/**
	 * @return the resp_desc
	 */
	public String getResp_desc() {
		return resp_desc;
	}
	/**
	 * @param resp_desc the resp_desc to set
	 */
	public void setResp_desc(String resp_desc) {
		this.resp_desc = resp_desc;
	}
	/**
	 * @return the gather_id
	 */
	public String getGather_id() {
		return gather_id;
	}
	/**
	 * @param gather_id the gather_id to set
	 */
	public void setGather_id(String gather_id) {
		this.gather_id = gather_id;
	}
	/**
	 * @return the resv
	 */
	public String getResv() {
		return resv;
	}
	/**
	 * @param resv the resv to set
	 */
	public void setResv(String resv) {
		this.resv = resv;
	}
	/**
	 * @return the queryBeginTransferDate
	 */
	public Date getQueryBeginTransferDate() {
		return queryBeginTransferDate;
	}
	/**
	 * @param queryBeginTransferDate the queryBeginTransferDate to set
	 */
	public void setQueryBeginTransferDate(Date queryBeginTransferDate) {
		this.queryBeginTransferDate = queryBeginTransferDate;
	}
	/**
	 * @return the queryEndTransferDate
	 */
	public Date getQueryEndTransferDate() {
		return queryEndTransferDate;
	}
	/**
	 * @param queryEndTransferDate the queryEndTransferDate to set
	 */
	public void setQueryEndTransferDate(Date queryEndTransferDate) {
		this.queryEndTransferDate = queryEndTransferDate;
	}
	/**
	 * @return the queryBeginLiqDate
	 */
	public Date getQueryBeginLiqDate() {
		return queryBeginLiqDate;
	}
	/**
	 * @param queryBeginLiqDate the queryBeginLiqDate to set
	 */
	public void setQueryBeginLiqDate(Date queryBeginLiqDate) {
		this.queryBeginLiqDate = queryBeginLiqDate;
	}
	/**
	 * @return the queryEndLiqDate
	 */
	public Date getQueryEndLiqDate() {
		return queryEndLiqDate;
	}
	/**
	 * @param queryEndLiqDate the queryEndLiqDate to set
	 */
	public void setQueryEndLiqDate(Date queryEndLiqDate) {
		this.queryEndLiqDate = queryEndLiqDate;
	}
	
}
