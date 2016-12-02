package com.ylink.ylpay.common.project.fund.app;

import com.ylink.ylpay.common.project.fund.exception.FundCheckedException;


/**
 * @类名称： IReserve
 * @类描述： 监管行备付金接口
 * @创建人： hinode
 * @创建时间： 2013-1-6 下午03:31:29
 *
 * @修改人： hinode
 * @操作时间： 2013-1-6 下午03:31:29
 * @操作原因： 
 * 
 */
public interface IReserveService {
	/**
	 * 
	 * @方法描述: 备付金余额
	 * @作者： hinode
	 * @日期： 2013-1-9-下午05:54:05
	 * @param date 
	 * @return 
	 * @返回类型： boolean
	 */
	public void reserveMoney(String taskid,String date) throws FundCheckedException;
	/**
	 * @方法描述: 备付金余额变动
	 * @作者： hinode
	 * @日期： 2013-1-9-下午05:54:35
	 * @param date
	 * @return 
	 * @返回类型： boolean
	 */
	public void reserveChange(String taskid,String date) throws FundCheckedException;
	
	
	public void reserveChangeAndMoney(String taskid,String date) throws FundCheckedException;
	
	/**
	 * @方法描述: 轧差
	 * @作者： hinode
	 * @日期： 2013-1-9-下午05:54:52
	 * @return 
	 * @返回类型： boolean
	 */
	public void netbalance(String taskid)throws FundCheckedException;
	/**
	 * @方法描述:  轧差明细
	 * @作者： hinode
	 * @日期： 2013-1-15-下午09:58:01
	 * @param taskid
	 * @throws FundCheckedException 
	 * @返回类型： void
	 */
	public void netbalanceDetail(String taskid)throws FundCheckedException;
	/**
	 * 备付金-轧差
	 * @description 
	 * @param taskid
	 * @param date
	 * @throws FundCheckedException  
	 * @author yu.han
	 * @date 2013-11-3
	 */
	public void netbalanceAndDetail(String taskid, String date)throws FundCheckedException;
	
	/**
	 * 备案快速提现轧差信息and轧差明细
	 * @description：
	 * @param taskid
	 * @param date
	 * @throws FundCheckedException  
	 * @author LiXiPing
	 * @date 2014-3-7
	 */
	public void quicklyWithdrawNetBalanceAndDetail(String taskid, String date)throws FundCheckedException;
	
	/**
	 * @方法描述: 支付机构和投资者划款j04
	 * @作者： hinode
	 * @日期： 2013-1-18-下午05:33:04
	 * @param taskid
	 * @param date 
	 * @throws FundCheckedException 
	 * @返回类型： void
	 */
	public void transferForInvestor(String taskid, String date)throws FundCheckedException;
	
	/**
	 * @方法描述: 支付机构和基金销售机构划款j03
	 * @作者： hinode
	 * @日期： 2013-1-18-下午05:33:13
	 * @param taskid
	 * @throws FundCheckedException 
	 * @返回类型： void
	 */
	public void transferForfundSaler(String taskid, String date)throws FundCheckedException;
}
