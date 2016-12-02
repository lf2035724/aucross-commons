/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-27
 */

package com.ylink.ylpay.common.project.fund.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-12-27
 * @description：TODO
 */

public class RedemptionOrderDTO extends BaseDTO{
    
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String instuId;             //证联融通分配给商户的机构代码
    private String fundDate;            //商户的系统日期，YYYYMMDD 
    private String fundTime;            //商户的时间戳，HHMMSS
    private String fundSeqId;           //商户系统流水号。需要保证一个交易日中流水号的唯一性
    private String flag;                //赎回方式： 0 赎回到用户银行卡（银行卡为必填）  1 赎回到用户虚户（银行卡为空）
    private String bankType;            //银行类别
    private String cardNo;              //19    不可空 银行卡帐号
    private String fundType;            //2 不可空 基金类型：00 -- 股票基金 01 -- 货币基金  02 -- 债券基金
    private String fundCode;            //基金申购、赎回、分红交易中，基金公司发行的基金代码
    private String userId;              //用户在证联融通平台里的客户号
    private String userNameText;        //客户的姓名
    private String certType;            //证件类型，参考附录
    private String certId;              //证件号码
    private String transAmt;            //以分为单位，账户充值金额、基金交易金额、基金转换的金额、账户取现金额等业务交易金额的统称
    private String liqDate;             //交易结算日期，YYYYMMDD；不小于交易日期
    private String orgFundDate;         //原始基金申购交易日期，YYYYMMDD
    private String orgFundSeqId;        //原始基金申购交易流水号
    private String busiType;            //业务类型: 赎回0004、分红 0005、退款0006
    private String batchno;             //赎回批次
    private String transferStatus;      //到账状态  空为未到账 1为已到账
    private Date   transferDate;        //到账日期
    private String redemPayMentId;      //赎回支付订单号
    private String withdrawPayMentId;   //提现支付订单号
    private String remark;              //备注
    private String refundRemark;        //退款说明 
    
    private Date queryBeginTransferDate;
    private Date queryEndTransferDate;
    
    private Date queryBeginLiqDate;
    private Date queryEndLiqDate;
    
    /**
     * 金额
     */
    public long getTransAmount(){
    	try{
    		return Long.parseLong(this.transAmt);
    	}catch( Exception e ){
    		return 0;
    	}
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
     * @return the instuId
     */
    public String getInstuId() {
        return instuId;
    }
    /**
     * @param instuId the instuId to set
     */
    public void setInstuId(String instuId) {
        this.instuId = instuId;
    }
    /**
     * @return the fundDate
     */
    public String getFundDate() {
        return fundDate;
    }
    /**
     * @param fundDate the fundDate to set
     */
    public void setFundDate(String fundDate) {
        this.fundDate = fundDate;
    }
    /**
     * @return the fundTime
     */
    public String getFundTime() {
        return fundTime;
    }
    /**
     * @param fundTime the fundTime to set
     */
    public void setFundTime(String fundTime) {
        this.fundTime = fundTime;
    }
    /**
     * @return the fundSeqId
     */
    public String getFundSeqId() {
        return fundSeqId;
    }
    /**
     * @param fundSeqId the fundSeqId to set
     */
    public void setFundSeqId(String fundSeqId) {
        this.fundSeqId = fundSeqId;
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
     * @return the bankType
     */
    public String getBankType() {
        return bankType;
    }
    /**
     * @param bankType the bankType to set
     */
    public void setBankType(String bankType) {
        this.bankType = bankType;
    }
    /**
     * @return the cardNo
     */
    public String getCardNo() {
        return cardNo;
    }
    /**
     * @param cardNo the cardNo to set
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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
     * @return the fundCode
     */
    public String getFundCode() {
        return fundCode;
    }
    /**
     * @param fundCode the fundCode to set
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }
    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * @return the userNameText
     */
    public String getUserNameText() {
        return userNameText;
    }
    /**
     * @param userNameText the userNameText to set
     */
    public void setUserNameText(String userNameText) {
        this.userNameText = userNameText;
    }
    /**
     * @return the certType
     */
    public String getCertType() {
        return certType;
    }
    /**
     * @param certType the certType to set
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }
    /**
     * @return the certId
     */
    public String getCertId() {
        return certId;
    }
    /**
     * @param certId the certId to set
     */
    public void setCertId(String certId) {
        this.certId = certId;
    }
    /**
     * @return the transAmt
     */
    public String getTransAmt() {
        return transAmt;
    }
    /**
     * @param transAmt the transAmt to set
     */
    public void setTransAmt(String transAmt) {
        this.transAmt = transAmt;
    }
    /**
     * @return the liqDate
     */
    public String getLiqDate() {
        return liqDate;
    }
    /**
     * @param liqDate the liqDate to set
     */
    public void setLiqDate(String liqDate) {
        this.liqDate = liqDate;
    }
    /**
     * @return the orgFundDate
     */
    public String getOrgFundDate() {
        return orgFundDate;
    }
    /**
     * @param orgFundDate the orgFundDate to set
     */
    public void setOrgFundDate(String orgFundDate) {
        this.orgFundDate = orgFundDate;
    }
    /**
     * @return the orgFundSeqId
     */
    public String getOrgFundSeqId() {
        return orgFundSeqId;
    }
    /**
     * @param orgFundSeqId the orgFundSeqId to set
     */
    public void setOrgFundSeqId(String orgFundSeqId) {
        this.orgFundSeqId = orgFundSeqId;
    }
    /**
     * @return the busiType
     */
    public String getBusiType() {
        return busiType;
    }
    /**
     * @param busiType the busiType to set
     */
    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }
    /**
     * @return the batchno
     */
    public String getBatchno() {
        return batchno;
    }
    /**
     * @param batchno the batchno to set
     */
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }
    /**
     * @return the transferStatus
     */
    public String getTransferStatus() {
        return transferStatus;
    }
    /**
     * @param transferStatus the transferStatus to set
     */
    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }
    /**
     * @return the transferDate
     */
    public Date getTransferDate() {
        return transferDate;
    }
    /**
     * @param transferDate the transferDate to set
     */
    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }
    /**
     * @return the redemPayMentId
     */
    public String getRedemPayMentId() {
        return redemPayMentId;
    }
    /**
     * @param redemPayMentId the redemPayMentId to set
     */
    public void setRedemPayMentId(String redemPayMentId) {
        this.redemPayMentId = redemPayMentId;
    }
    /**
     * @return the withdrawPayMentId
     */
    public String getWithdrawPayMentId() {
        return withdrawPayMentId;
    }
    /**
     * @param withdrawPayMentId the withdrawPayMentId to set
     */
    public void setWithdrawPayMentId(String withdrawPayMentId) {
        this.withdrawPayMentId = withdrawPayMentId;
    }
    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }
    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**
     * @return the refundRemark
     */
    public String getRefundRemark() {
        return refundRemark;
    }
    /**
     * @param refundRemark the refundRemark to set
     */
    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark;
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
