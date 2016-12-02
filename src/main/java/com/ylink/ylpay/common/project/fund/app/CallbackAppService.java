/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:yu.han 2013-10-19
 */

/**
 * CallbackAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:yu.han 2013-10-19
 */
package com.ylink.ylpay.common.project.fund.app;

import com.ylink.ylpay.common.project.fund.exception.FundCheckedException;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;
import com.ylink.ylpay.common.project.pay.dto.GateWayFundRechargeCallBackDTO;
import com.ylink.ylpay.common.project.pay.dto.JhbTimelySubscribeDTO;
import com.ylink.ylpay.common.project.pay.dto.TimelyRedemptionDto;

/**
 * 其他系統回调前置接口
 * @author yu.han
 * @date 2013-10-19
 */
public interface CallbackAppService {
	/**
	 * 注册回调接口 
	 * @description 
	 * @param busi201dto  
	 * @author yu.han
	 * @throws Exception 
	 * @date 2013-10-19
	 */
	void registerCallback(String str) throws FundCheckedException ;
	/**
	 * 绑卡回调接口
	 * @description 
	 * @param str  
	 * @author yu.han
	 * @date 2013-10-22
	 */
	void newCardCallback(String str)throws FundCheckedException;
	
	/**
	 * 实时赎回回调接口
	 * @description：
	 * @param timelyRedemptionDto  
	 * @author LiXiPing
	 * @date 2013-10-30
	 */
	void timelyRedemptionCallBack(TimelyRedemptionDto timelyRedemptionDto);
	
	/**
	 * 生成实时赎回对账单前的检查
	 * @description：
	 * @param taskId
	 * @param date  
	 * @author LiXiPing
	 * @date 2013-11-29
	 */
	void checkFileTimelyRedemption(String taskId,String date);
	
	/**
	 * 提供支付系统回调获取金汇宝支付请求信息
	 * @description：
	 * @param buyInstuid
	 * @param buyFundSeqId
	 * @return  
	 * @author LiXiPing
	 * @date 2013-12-9
	 */
	public JhbTimelySubscribeDTO findTimelySubscribeInfo(String buyInstuid, String buyFundSeqId) throws FundCheckedException;
	
	/**
	 * 金汇宝网关支付回调通知
	 * @description：
	 * @param returnDto  
	 * @author LiXiPing 
	 * @date 2013-12-9
	 */
	void timelySubscribeCallBack(JhbTimelySubscribeDTO returnDto);
	/**
	 * 股交所资金转出回执
	 * @param withdrawId
	 * @param status
	 * @author LiXiaohu
	 * @date 2014-03-20
	 */
	void sendReceiptMsg(String withdrawId, String status);
	
	
	/**
	 * 注册回调接口 2
	 * @description 
	 * @param str
	 * @throws FundCheckedException  
	 * @author yu.han
	 * @date 2014-3-8
	 */
	void register2Callback(String str) throws FundCheckedException;
	/** 新版新增银行卡回调接口
	 * @description 
	 * @param str
	 * @throws FundCheckedException  
	 * @author yu.han
	 * @date 2014-3-18
	 */
	void newCard2Callback(String str) throws FundCheckedException;
	/**
	 * @description 股交所资金转入-网关回调
	 * @param gateWayFundRechargeCallBackDTO  
	 * @author LiuQ
	 * @date 2014-3-22
	 */
	public void stockDepositCallBack(GateWayFundRechargeCallBackDTO gateWayFundRechargeCallBackDTO);
	/**
	 * 移动绑卡异步回调接口
	 * @description 
	 * @param orderId
	 * @param bankCardId
	 * @throws FundCheckedException  
	 * @author yu.han
	 * @date 2014-6-20
	 */
	void mobileCallback(String orderId,String bankCardId) throws FundCheckedException;
}
