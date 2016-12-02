package com.ylink.ylpay.common.project.invest.app;

import com.ylink.ylpay.common.project.fund.exception.FundCheckedException;

/**
 * 其他系統回调慧投前置接口
 * @author LiXiPing
 * @date 2014-7-4
 * @description：
 */
public interface InvestCallBackAppService {
	
	/**
	 * 隐形开户门户后台通知接口 
	 * @description：
	 * @param str
	 * @throws FundCheckedException  
	 * @author LiXiPing
	 * @date 2014-7-4
	 */
	public void registerCallback(String str) throws FundCheckedException ;
	
	/**
	 * 新增银行卡门户后台通知接口 
	 * @description：
	 * @param str
	 * @throws FundCheckedException  
	 * @author LiXiPing
	 * @date 2014-7-8
	 */
	public void newCardCallback(String str)throws FundCheckedException;
}
