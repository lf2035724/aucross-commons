/**===========================================
 *        Copyright (C) 2012 YLINK
 *           All rights reserved
 *
 *  @项目名： zlrt-fund
 *  @文件名： IInvestorService.java
 *  @版本信息： V1.0.0 
 *  @作者： hinode
 *  @日期： 2012-12-28-下午02:39:00
 * 
 ============================================*/

package com.ylink.ylpay.common.project.fund.app;

import com.ylink.ylpay.common.project.fund.exception.FundCheckedException;

/**
 * @类名称： IInvestorService
 * @类描述： 投资者服务接口
 * @创建人： hinode
 * @创建时间： 2012-12-28 下午02:39:00
 *
 * @修改人： hinode
 * @操作时间： 2012-12-28 下午02:39:00
 * @操作原因： 
 * 
 */
public interface IInvestorService {
	/**
	 * @方法描述:  根据日期为投资者在监管行备案
	 * @作者： hinode
	 * @日期： 2012-12-28-下午02:41:05
	 * @param string 执行日期 update yu.han
	 * @返回类型： boolean
	 */
	public void investorRecord(String taskid,String string) throws FundCheckedException;
	/**
	 * @方法描述: 根据日期为基金销售机构在监管行备案
	 * @作者： hinode
	 * @日期： 2013-1-7-上午10:38:20
	 * @param string  update yu.han
	 * @return 
	 * @返回类型： boolean
	 */
	public void fundSalerRecord(String taskid,String string) throws FundCheckedException;
	
}
