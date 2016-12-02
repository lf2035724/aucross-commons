/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-24
 */

package com.ylink.ylpay.common.project.settle.app;

import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/**
 * @author HuAJ
 * @date 2012-11-24
 * @description：日中处理
 */

public interface DailyJobAppService {

	/**
	 * 
	 * @description 日切
	 * @author HuAJ
	 * @date 2012-11-28
	 */
	public void dailyChange(final String taskId) throws SettleCheckedException;

	/**
	 * 
	 * @description 试算平衡
	 * @author HuAJ
	 * @date 2012-11-28
	 */
	public void trialBalancing(final String taskId,final String acctDate) throws SettleCheckedException;
	
	/**
	 * @description 初始化对账监控数据
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-7
	 */
	public void initCheckMonitorData(final String taskId) throws SettleCheckedException;
	
	/**
	 * @description 账务与支付对账
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-4
	 */
	public void payAndAccountRecon(final String taskId,final String acctDate) throws SettleCheckedException;
	
	
	/**
	 * @description 基金扎差
	 * @param isLastNetNo 是否是最后场次
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-9
	 */
	public void fundNetbalance(final boolean isLastNetNo, final String taskId,final String acctDate) throws SettleCheckedException;
	
	/**
	 * 基金提现多场次轧差
	 * @description：
	 * @param taskId    管理平台任务号
	 * @param acctDate  账务日期
	 * @throws SettleCheckedException  
	 * @author LiXiPing
	 * @date 2014-3-5
	 */
	public void fundWithDrawNetbalance(final String taskId,final String acctDate)throws SettleCheckedException;
	
	/**
	 * @description 生成支付结算机构、销售机构资金划付表数据（J03）
	 * @return
	 * @throws SettleCheckedException  
	 * @author yu.han
	 * @date 2013-1-17
	 */
	public void generateFundTransferDate(String taskId,final String acctDate) throws SettleCheckedException;
	
	/**
	 * @description 生成投资人资金划拨数据（J04）
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-19
	 */
	public void generateInvestorTransferDate(String taskId,final String acctDate) throws SettleCheckedException;
	
	/**
	 * @description 计息
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-21
	 */
	public void calcInterest(final String taskId,final String acctDate) throws SettleCheckedException;
	
	/**
	 * @description 结息
	 * @param accountDate
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-21
	 */
	public void interestSettle(final String accountDate, final String taskId) throws SettleCheckedException;
	
	/**
	 * @description 计费
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-21
	 */
	public void calcFee(final String taskId,final String acctDate) throws SettleCheckedException;
	/**
	 * 
	 * <p>统计交易状态信息</p>
	 * @param taskId
	 * @throws SettleCheckedException
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-4-2 上午11:51:24
	 */
	public void statisticsPayTransStatus(final String taskId,final String acctDate)throws SettleCheckedException;
	
	
	/***
	 * 
	 * @description 
	 * @param isLastNetNo
	 * @param taskId
	 * @param acctDate
	 * @param netBalanceType
	 * @throws SettleCheckedException  
	 * @author fly.zhao
	 * @date 2014-9-25
	 */

	public void netbalanceByType(final boolean isLastNetNo, final String taskId,
			final String acctDate,final String netBalanceType) throws SettleCheckedException;
}
