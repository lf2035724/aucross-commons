/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.channel.constant.BankType;
import com.ylink.ylpay.common.project.channel.constant.ChannelType;
import com.ylink.ylpay.common.project.mp.constant.ProductType;
import com.ylink.ylpay.common.project.mp.dto.BankAccount;
import com.ylink.ylpay.common.project.mp.dto.TradeBankInfo;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/** 
 * @author YangXiaojin
 * @date 2012-10-30
 * @description：银行帐户接口
 */
public interface BankAccountAppService {
	
	/**
	 * 查询银行帐户，返回DTO
	 * @param bankType 行别
	 * @param productType 产品类型
	 * @param channelType 渠道类型
	 */
	public com.ylink.ylpay.common.project.mp.dto.BankAccount getBankAccount(String bankType
			,ProductType productType,ChannelType channelType) throws MpCheckedException;
	
	/**
	 * 查询基金总帐户
	 */
	public com.ylink.ylpay.common.project.mp.dto.BankAccount getFundTotalBankAccount( ) throws MpCheckedException;
	
	/**
	 * 
	 * @description 查询银行虚拟客户
	 * @param bankType 行别
	 * @param productType 产品类型
	 * @param channelType 渠道类型
	 * @return String
	 * @author YangXiaojin
	 * @date 2012-10-30
	 */
	public String getVirtualCust( String bankType
			,ProductType productType
			,ChannelType channelType) throws MpCheckedException;
	
	/**
	 * 查所有银行帐户
	 */
	public List<BankAccount> list() throws MpCheckedException;
	
	/**
	 * 查询银行帐户
	 * @description 
	 * @param orderId 支付系统pay_id
	 * @return
	 * @throws MpCheckedException  
	 * @author yu.han
	 * @date 2013-10-25
	 */
	public TradeBankInfo getTradeBankInfo( String orderId) throws MpCheckedException;
	/**
	 * 根据id查询银行帐户
	 */
	public BankAccount getBankAccountById(String id) throws MpCheckedException;
	
}
