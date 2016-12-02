/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-4
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-4
 * @description：交易详情类
 */

public class PaymentInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;
	
	/**
    * 付款说明                                             
    */
    private String paymentMsg;
    /**
    * 支付银行行别                                     
    */
    private String bankType;
    /**
     * 银行卡卡号
     */
    private String bankCardNo;
    /**
     * 授权号
     */
    private String authId;
    /**
     * 充值金额
     */
    private long rechargeAmt;
    /**
    * 付方银行行别                                     
    */
    private String payerBankType;
    /**
     * 付方银行卡卡号
     */
    private String payerBankCardNo;
    /**
    * 收方银行行别                                     
    */
    private String payeeBankType;
    /**
     * 收方银行卡卡号
     */
    private String payeeBankCardNo;
    /**
     * 打款方式  --选择ToUserMode枚举中的值
     */
    private String toUserMode;       
    /**
     * 转入帐户名称
     */
    private String payeeAccName;     
    /**
     * 转入帐户开户机构名称
     */
    private String payeeOpenaccDept; 
    /**
     * 转入帐户联行号
     */
    private String payeeUbankno;  
    /**
     * 基金申购、赎回、分红交易中，基金公司发行的基金代码
     */
    private String f_FundCode;
    /**
     * 基金类型
     *00 -- 股票型基金
     *01 -- 货币型基金
     *02 -- 债券型基金
     *03 -- 混合型基金
     *04 -- 保本型基金
     *05 -- 指数型基金
     *06 -- QDII型基金
     *07 -- ETF型基金
     *08 -- LOF型基金
     *09 -- 创新型基金
     *10 -- 其他 
     */
    private String f_FundType;
    /**
     * 商品名称
     */
    private String m_Subject;
    /**
     * 简单描述商品信息，包括商品型号，商品质量等情况
     */
    private String m_Goods_Details;
    /**
     * 可以是该笔订单的链接，也可以是该购物车的链接，或者是商品的链接
     */
    private String m_Show_Url;
    /**
     * '0 ' 实物配送      '1'  即时到帐
     */
    private String m_Subject_Type;
    /**
     * 单位为RMB Yuan0.01～100000000.00单件商品即为单价，购物车商品为该购物车中商品总价
     */
    private long m_Price;
    /**
     * >0单价商品购买的数量，购物车中商品数量为1
     */
    private long m_Amount;
    /**
     * 0.00～10000.00,默认为0
     */
    private long m_Transport_Fee;
    
    /**
     * 渠道流水
     */
    private String channelSn;
    /**
     * 渠道编号
     */
    private String requestSn;
    /**
     * 系统参数
     */
    private String systemParam;
    
    /**
     * 总分账户转账 扎差id
     */
    private String fundNetingId;
    /**
     * 总分账户转账 结算日期
     */
    private String settlementDate;
    //转入帐户会计柜台机构号
    private String recvCounterno;
    //转出帐户会计柜台机构号
    private String exchangeNo;
    //是否跨行
    private String isInterBank;
    /**
     * 充值补录订单id
     */
    private String additionalRecordId;
    /**
     * 付款方银行卡真实行别
     */
    private String actualBankType;
    /**
     * 银行、银联付款渠道
     * [互联网或移动]
     */
    private String bindSource;
    
    public PaymentInfoDTO obtainPaymentInfoDTO (){
        PaymentInfoDTO mPaymentInfoDTO = new PaymentInfoDTO();
        mPaymentInfoDTO.setAuthId(authId);
        mPaymentInfoDTO.setBankCardNo(bankCardNo);
        mPaymentInfoDTO.setBankType(bankType);
        mPaymentInfoDTO.setPaymentMsg(paymentMsg);
        mPaymentInfoDTO.setRechargeAmt(rechargeAmt);
        mPaymentInfoDTO.setPayerBankType(payerBankType);
        mPaymentInfoDTO.setPayerBankCardNo(payerBankCardNo);
        mPaymentInfoDTO.setPayeeBankType(payeeBankType);
        mPaymentInfoDTO.setPayeeBankCardNo(payeeBankCardNo);
        mPaymentInfoDTO.setToUserMode(toUserMode);
        mPaymentInfoDTO.setPayeeAccName(payeeAccName);
        mPaymentInfoDTO.setPayeeOpenaccDept(payeeOpenaccDept);
        mPaymentInfoDTO.setPayeeUbankno(payeeUbankno);
        mPaymentInfoDTO.setChannelSn(channelSn);
        mPaymentInfoDTO.setRequestSn(requestSn);
        
        mPaymentInfoDTO.setF_FundType(f_FundType);
        mPaymentInfoDTO.setF_FundCode(f_FundCode);
        mPaymentInfoDTO.setM_Subject(m_Subject);
        mPaymentInfoDTO.setM_Goods_Details(m_Goods_Details);
        mPaymentInfoDTO.setM_Show_Url(m_Show_Url);
        mPaymentInfoDTO.setM_Subject_Type(m_Subject_Type);
        mPaymentInfoDTO.setM_Price(m_Price);
        mPaymentInfoDTO.setM_Amount(m_Amount);
        mPaymentInfoDTO.setM_Transport_Fee(m_Transport_Fee);
        
        
        
        mPaymentInfoDTO.setSystemParam(systemParam);
        
        
        mPaymentInfoDTO.setFundNetingId(fundNetingId);
        mPaymentInfoDTO.setSettlementDate(settlementDate);
        

        mPaymentInfoDTO.setRecvCounterno(recvCounterno);
        mPaymentInfoDTO.setExchangeNo(exchangeNo);
        mPaymentInfoDTO.setIsInterBank(isInterBank);
        
        mPaymentInfoDTO.setAdditionalRecordId(additionalRecordId);
        
        mPaymentInfoDTO.setActualBankType(actualBankType);
        mPaymentInfoDTO.setBindSource(bindSource);
        return mPaymentInfoDTO;
    }

    public void setPaymentInfo(PaymentInfoDTO paymentInfoDTO){
        if(paymentInfoDTO==null){
            return;
        }
        this.setAuthId(paymentInfoDTO.getAuthId());
        this.setBankCardNo(paymentInfoDTO.getBankCardNo());
        this.setBankType(paymentInfoDTO.getBankType());
        this.setPaymentMsg(paymentInfoDTO.getPaymentMsg());
        this.setRechargeAmt(paymentInfoDTO.getRechargeAmt());
        this.setPayerBankType(paymentInfoDTO.getPayerBankType());
        this.setPayerBankCardNo(paymentInfoDTO.getPayerBankCardNo());
        this.setPayeeBankType(paymentInfoDTO.getPayeeBankType());
        this.setPayeeBankCardNo(paymentInfoDTO.getPayeeBankCardNo());
        this.setToUserMode(paymentInfoDTO.getToUserMode());
        this.setPayeeAccName(paymentInfoDTO.getPayeeAccName());
        this.setPayeeOpenaccDept(paymentInfoDTO.getPayeeOpenaccDept());
        this.setPayeeUbankno(paymentInfoDTO.getPayeeUbankno());
        this.setChannelSn(paymentInfoDTO.getChannelSn());
        this.setRequestSn(paymentInfoDTO.getRequestSn());
   
        this.setF_FundType(paymentInfoDTO.getF_FundType());
        this.setF_FundCode(paymentInfoDTO.getF_FundCode());
        this.setM_Subject(paymentInfoDTO.getM_Subject());
        this.setM_Goods_Details(paymentInfoDTO.getM_Goods_Details());
        this.setM_Show_Url(paymentInfoDTO.getM_Show_Url());
        this.setM_Subject_Type(paymentInfoDTO.getM_Subject_Type());
        this.setM_Price(paymentInfoDTO.getM_Price());
        this.setM_Amount(paymentInfoDTO.getM_Amount());
        this.setM_Transport_Fee(paymentInfoDTO.getM_Transport_Fee());

        
        this.setSystemParam(paymentInfoDTO.getSystemParam());
        
        
        this.setFundNetingId(paymentInfoDTO.getFundNetingId());
        this.setSettlementDate(paymentInfoDTO.getSettlementDate());
        
        this.setRecvCounterno(paymentInfoDTO.getRecvCounterno());
        this.setExchangeNo(paymentInfoDTO.getExchangeNo());
        this.setIsInterBank(paymentInfoDTO.getIsInterBank());
        
        this.setAdditionalRecordId(paymentInfoDTO.getAdditionalRecordId());
        this.setActualBankType(paymentInfoDTO.getActualBankType());
        this.setBindSource(paymentInfoDTO.getBindSource());
    }
    /**
     * @return the payeeAccName
     */
    public String getPayeeAccName() {
        return payeeAccName;
    }

    /**
     * @param payeeAccName the payeeAccName to set
     */
    public void setPayeeAccName(String payeeAccName) {
        this.payeeAccName = payeeAccName;
    }

    /**
     * @return the payeeOpenaccDept
     */
    public String getPayeeOpenaccDept() {
        return payeeOpenaccDept;
    }

    /**
     * @param payeeOpenaccDept the payeeOpenaccDept to set
     */
    public void setPayeeOpenaccDept(String payeeOpenaccDept) {
        this.payeeOpenaccDept = payeeOpenaccDept;
    }

    /**
     * @return the payeeUbankno
     */
    public String getPayeeUbankno() {
        return payeeUbankno;
    }

    /**
     * @param payeeUbankno the payeeUbankno to set
     */
    public void setPayeeUbankno(String payeeUbankno) {
        this.payeeUbankno = payeeUbankno;
    }
    public String getPaymentMsg() {
		return paymentMsg;
	}
	public void setPaymentMsg(String paymentMsg) {
		this.paymentMsg = paymentMsg;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
    public long getRechargeAmt() {
        return rechargeAmt;
    }
    public void setRechargeAmt(long rechargeAmt) {
        this.rechargeAmt = rechargeAmt;
    }

    /**
     * @return the payerBankType
     */
    public String getPayerBankType() {
        return payerBankType;
    }

    /**
     * @param payerBankType the payerBankType to set
     */
    public void setPayerBankType(String payerBankType) {
        this.payerBankType = payerBankType;
    }

    /**
     * @return the payerBankCardNo
     */
    public String getPayerBankCardNo() {
        return payerBankCardNo;
    }

    /**
     * @param payerBankCardNo the payerBankCardNo to set
     */
    public void setPayerBankCardNo(String payerBankCardNo) {
        this.payerBankCardNo = payerBankCardNo;
    }

    /**
     * @return the payeeBankType
     */
    public String getPayeeBankType() {
        return payeeBankType;
    }

    /**
     * @param payeeBankType the payeeBankType to set
     */
    public void setPayeeBankType(String payeeBankType) {
        this.payeeBankType = payeeBankType;
    }

    /**
     * @return the payeeBankCardNo
     */
    public String getPayeeBankCardNo() {
        return payeeBankCardNo;
    }

    /**
     * @param payeeBankCardNo the payeeBankCardNo to set
     */
    public void setPayeeBankCardNo(String payeeBankCardNo) {
        this.payeeBankCardNo = payeeBankCardNo;
    }

    /**
     * @return the toUserMode
     */
    public String getToUserMode() {
        return toUserMode;
    }

    /**
     * @param toUserMode the toUserMode to set
     */
    public void setToUserMode(String toUserMode) {
        this.toUserMode = toUserMode;
    }
    /**
     * @return the f_FundCode
     */
    public String getF_FundCode() {
        return f_FundCode;
    }
    /**
     * @param f_FundCode the f_FundCode to set
     */
    public void setF_FundCode(String f_FundCode) {
        this.f_FundCode = f_FundCode;
    }
    /**
     * @return the f_FundType
     */
    public String getF_FundType() {
        return f_FundType;
    }
    /**
     * @param f_FundType the f_FundType to set
     */
    public void setF_FundType(String f_FundType) {
        this.f_FundType = f_FundType;
    }
    /**
     * @return the m_Subject
     */
    public String getM_Subject() {
        return m_Subject;
    }
    /**
     * @param m_Subject the m_Subject to set
     */
    public void setM_Subject(String m_Subject) {
        this.m_Subject = m_Subject;
    }
    /**
     * @return the m_Goods_Details
     */
    public String getM_Goods_Details() {
        return m_Goods_Details;
    }
    /**
     * @param m_Goods_Details the m_Goods_Details to set
     */
    public void setM_Goods_Details(String m_Goods_Details) {
        this.m_Goods_Details = m_Goods_Details;
    }
    /**
     * @return the m_Show_Url
     */
    public String getM_Show_Url() {
        return m_Show_Url;
    }
    /**
     * @param m_Show_Url the m_Show_Url to set
     */
    public void setM_Show_Url(String m_Show_Url) {
        this.m_Show_Url = m_Show_Url;
    }
    /**
     * @return the m_Subject_Type
     */
    public String getM_Subject_Type() {
        return m_Subject_Type;
    }
    /**
     * @param m_Subject_Type the m_Subject_Type to set
     */
    public void setM_Subject_Type(String m_Subject_Type) {
        this.m_Subject_Type = m_Subject_Type;
    }
    /**
     * @return the m_Price
     */
    public long getM_Price() {
        return m_Price;
    }
    /**
     * @param m_Price the m_Price to set
     */
    public void setM_Price(long m_Price) {
        this.m_Price = m_Price;
    }
    /**
     * @return the m_Amount
     */
    public long getM_Amount() {
        return m_Amount;
    }
    /**
     * @param m_Amount the m_Amount to set
     */
    public void setM_Amount(long m_Amount) {
        this.m_Amount = m_Amount;
    }
    /**
     * @return the m_Transport_Fee
     */
    public long getM_Transport_Fee() {
        return m_Transport_Fee;
    }
    /**
     * @param m_Transport_Fee the m_Transport_Fee to set
     */
    public void setM_Transport_Fee(long m_Transport_Fee) {
        this.m_Transport_Fee = m_Transport_Fee;
    }

	public String getChannelSn() {
		return channelSn;
	}

	public void setChannelSn(String channelSn) {
		this.channelSn = channelSn;
	}

	public String getRequestSn() {
		return requestSn;
	}

	public void setRequestSn(String requestSn) {
		this.requestSn = requestSn;
	}

	public String getSystemParam() {
		return systemParam;
	}

	public void setSystemParam(String systemParam) {
		this.systemParam = systemParam;
	}

    /**
     * @return the fundNetingId
     */
    public String getFundNetingId() {
        return fundNetingId;
    }

    /**
     * @param fundNetingId the fundNetingId to set
     */
    public void setFundNetingId(String fundNetingId) {
        this.fundNetingId = fundNetingId;
    }

    /**
     * @return the settlementDate
     */
    public String getSettlementDate() {
        return settlementDate;
    }

    /**
     * @param settlementDate the settlementDate to set
     */
    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    /**
     * @return the recvCounterno
     */
    public String getRecvCounterno() {
        return recvCounterno;
    }

    /**
     * @param recvCounterno the recvCounterno to set
     */
    public void setRecvCounterno(String recvCounterno) {
        this.recvCounterno = recvCounterno;
    }

    /**
     * @return the exchangeNo
     */
    public String getExchangeNo() {
        return exchangeNo;
    }

    /**
     * @param exchangeNo the exchangeNo to set
     */
    public void setExchangeNo(String exchangeNo) {
        this.exchangeNo = exchangeNo;
    }

    /**
     * @return the isInterBank
     */
    public String getIsInterBank() {
        return isInterBank;
    }

    /**
     * @param isInterBank the isInterBank to set
     */
    public void setIsInterBank(String isInterBank) {
        this.isInterBank = isInterBank;
    }

	public String getAdditionalRecordId() {
		return additionalRecordId;
	}

	public void setAdditionalRecordId(String additionalRecordId) {
		this.additionalRecordId = additionalRecordId;
	}

	public String getActualBankType() {
		return actualBankType;
	}

	public void setActualBankType(String actualBankType) {
		this.actualBankType = actualBankType;
	}

	public String getBindSource() {
		return bindSource;
	}

	public void setBindSource(String bindSource) {
		this.bindSource = bindSource;
	}
}
