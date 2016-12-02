package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.CompanyCustomer;
import com.ylink.ylpay.common.project.mp.dto.Customer;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 企业客户信息管理类
 * @author yu.han
 *
 */
public interface StockAppService {
	
	/**
	 * 开户
	 * @param CompanyCustomer.merchant 必填
	 * @param CompanyCustomer.name 必填
	 * @param CompanyCustomer.certType 必填
	 * @param CompanyCustomer.certNo 必填
	 * @param CompanyCustomer.bankCode 必填
	 * @param CompanyCustomer.cardName 必填
	 * @param CompanyCustomer.cardNo 必填
	 * @return 返回客户ID
	 */
	public Customer sinup(CompanyCustomer dto) throws MpCheckedException;
	
	/**
	 * 绑卡
	 * @param CompanyCustomer.merchant 必填
	 * @param CompanyCustomer.custId 必填
	 * @param CompanyCustomer.name 必填
	 * @param CompanyCustomer.bankCode 必填
	 * @param CompanyCustomer.cardName 必填
	 * @param CompanyCustomer.cardNo 必填
	 * @throws MpCheckedException
	 */
	public void bindBankCard( CompanyCustomer dto ) throws MpCheckedException;
	
	/**
	 * 解卡
	 * @param CompanyCustomer.merchant 必填
	 * @param CompanyCustomer.custId 必填
	 * @param CompanyCustomer.name 必填
	 * @param CompanyCustomer.bankCode 必填
	 * @param CompanyCustomer.cardName 必填
	 * @param CompanyCustomer.cardNo 必填
	 * @throws MpCheckedException 
	 */
	public void unbindBankCard( CompanyCustomer dto ) throws MpCheckedException;
	
	/**
	 * 是否绑定银行卡
	 * @param CompanyCustomer.merchant 必填
	 * @param CompanyCustomer.custId 必填
	 * @param CompanyCustomer.bankCode 必填
	 * @param CompanyCustomer.cardName 必填
	 * @param CompanyCustomer.cardNo 必填
	 * @return boolean 
	 */
	public boolean isBindBankCard( CompanyCustomer dto ) throws MpCheckedException;

}
