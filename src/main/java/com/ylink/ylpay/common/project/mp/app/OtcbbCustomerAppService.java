package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.OtcbbCustomer;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 
 * @author YangXiojin
 * @date 2013-5-11
 * 
 */
public interface OtcbbCustomerAppService {
	
	/**
	 * 开户
	 * @param OtcbbCustomer.merchant 必填
	 * @param OtcbbCustomer.name 必填
	 * @param OtcbbCustomer.certType 必填
	 * @param OtcbbCustomer.certNo 必填
	 * @param OtcbbCustomer.bankCode 必填
	 * @param OtcbbCustomer.cardName 必填
	 * @param OtcbbCustomer.cardNo 必填
	 * @return 返回客户ID
	 */
	public String sinup(OtcbbCustomer dto) throws MpCheckedException;
	
	/**
	 * 绑卡
	 * @param OtcbbCustomer.merchant 必填
	 * @param OtcbbCustomer.custId 必填
	 * @param OtcbbCustomer.name 必填
	 * @param OtcbbCustomer.bankCode 必填
	 * @param OtcbbCustomer.cardName 必填
	 * @param OtcbbCustomer.cardNo 必填
	 * @throws MpCheckedException
	 */
	public void bindBankCard( OtcbbCustomer dto ) throws MpCheckedException;
	
	/**
	 * 解卡
	 * @param OtcbbCustomer.merchant 必填
	 * @param OtcbbCustomer.custId 必填
	 * @param OtcbbCustomer.name 必填
	 * @param OtcbbCustomer.bankCode 必填
	 * @param OtcbbCustomer.cardName 必填
	 * @param OtcbbCustomer.cardNo 必填
	 * @throws MpCheckedException 
	 */
	public void unbindBankCard( OtcbbCustomer dto ) throws MpCheckedException;
	
	/**
	 * 是否绑定银行卡
	 * @param OtcbbCustomer.merchant 必填
	 * @param OtcbbCustomer.custId 必填
	 * @param OtcbbCustomer.bankCode 必填
	 * @param OtcbbCustomer.cardName 必填
	 * @param OtcbbCustomer.cardNo 必填
	 * @return boolean 
	 */
	public boolean isBindBankCard( OtcbbCustomer dto ) throws MpCheckedException;

}
