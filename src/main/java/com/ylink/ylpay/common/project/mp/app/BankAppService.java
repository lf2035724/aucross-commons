/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.dto.Bank;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * @author yanghan
 * @date 2013-3-20上午11:09:33
 * @description 银行信息接口
 */
public interface BankAppService {
	/**
	 * 根据银行行别或者所在地查询银行信息(其中银行行别为必传项,所在地为选传)
	 * @param bank
	 * @return 银行信息list
	 * @throws Exception
	 */
	public List<Bank> getBankListByBankTypeAndGeo(Bank bank) throws MpCheckedException;
}
