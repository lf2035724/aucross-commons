/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-6
 */

package com.ylink.ylpay.common.project.pay.dto;


import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-6
 * @description：提现确认DTO
 */

public class WithdrawConfirmSingleDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 确认订单号
	 */
	private String withdrawId;
	

    /**
	 * 付款款方银行虚拟客户Id
	 */
	private String vPayerBankCustId;
	/**
	 * 付款款方银行虚拟客户名称
	 */
	private String vPayerBankCustName;
	/**
	 * 付款方银行卡号
	 */
	private String payerBankCardNo;
	/**
	 * 付款方银行行别
	 */
	private String payerBankType;
	/**
	 * 支付类型，参照枚举 WithdrawPaymentType
	 */
	private String paymentType;
	
    /**
     * 线上付款方银行支付类型
     */
    private String payerBankChannelType;
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
     * 备注1
     */
    private String remark1;
    /**
     * 备注2
     */
    private String remark2;
    //转入帐户会计柜台机构号
    private String recvCounterno;
    //转出帐户会计柜台机构号
    private String exchangeNo;
    //是否跨行
    private String isInterBank;
	

	public String getvPayerBankCustId() {
		return vPayerBankCustId;
	}
	public void setvPayerBankCustId(String vPayerBankCustId) {
		this.vPayerBankCustId = vPayerBankCustId;
	}
	public String getvPayerBankCustName() {
		return vPayerBankCustName;
	}
	public void setvPayerBankCustName(String vPayerBankCustName) {
		this.vPayerBankCustName = vPayerBankCustName;
	}
	public String getPayerBankCardNo() {
		return payerBankCardNo;
	}
	public void setPayerBankCardNo(String payerBankCardNo) {
		this.payerBankCardNo = payerBankCardNo;
	}
	public String getPayerBankType() {
		return payerBankType;
	}
	public void setPayerBankType(String payerBankType) {
		this.payerBankType = payerBankType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	   /**
     * @return the withdrawId
     */
    public String getWithdrawId() {
        return withdrawId;
    }
    /**
     * @param withdrawId the withdrawId to set
     */
    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId;
    }
    /**
     * @return the payerBankChannelType
     */
    public String getPayerBankChannelType() {
        return payerBankChannelType;
    }
    /**
     * @param payerBankChannelType the payerBankChannelType to set
     */
    public void setPayerBankChannelType(String payerBankChannelType) {
        this.payerBankChannelType = payerBankChannelType;
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
    /**
     * @return the remark1
     */
    public String getRemark1() {
        return remark1;
    }
    /**
     * @param remark1 the remark1 to set
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }
    /**
     * @return the remark2
     */
    public String getRemark2() {
        return remark2;
    }
    /**
     * @param remark2 the remark2 to set
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2;
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
}
