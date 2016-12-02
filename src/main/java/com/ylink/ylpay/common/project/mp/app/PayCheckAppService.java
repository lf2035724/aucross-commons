package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 
 * @author YangXiojin
 * @date 2013-4-12
 * 
 */
public interface PayCheckAppService {
	
	/**
	 * 验证付款金额
	 * @param custId 企业客户编码
	 * @param amount 付款金额
	 * @return
	 */
	public boolean validatePaymentAmount(String custId,Long amount) throws MpCheckedException;
	
	/**
	 * 验证银行卡付款金额，用于新加银行卡
	 * @param custId 企业客户编码
	 * @param bankcardId 银行卡ID
	 * @param amount 付款金额
	 * @return
	 */
	public boolean validateBankcardPaymentAmount(String custId,String bankcardId,Long amount) throws MpCheckedException;
	
	/**
	 * 获取验证次数
	 */
	public int getValidateTimes();
	
	/**
	 * 获取客户剩余验证次数
	 */
	public int getCustValidateTimes(String custId);

}
