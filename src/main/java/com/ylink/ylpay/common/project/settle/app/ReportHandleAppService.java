/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-24
 */

package com.ylink.ylpay.common.project.settle.app;

import java.util.List;

import com.ylink.ylpay.common.project.settle.constant.DayReportSettleStatus;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/**
 * @author ZhangDM(Mingly)
 * @date 2012-12-27
 * @description：报表处理服务接口
 */

public interface ReportHandleAppService {

	/**
	 * @description 基金商户日结算报表处理  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-10
	 */
	public void merchantDayClearReportHandle(final String taskId,final String acctDate) throws SettleCheckedException;
	
	/**
	 * @description 商城商户日结算报表处理  
	 * @param taskId
	 * @param accountDate
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-9
	 */
	public void consumeTradeDayReportHandle(final String taskId, 
			final String accountDate) throws SettleCheckedException;
	
	/**
	 * @description 基金交易日报表处理  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-10
	 */
	public void fundTradeDayReportHandle(final String taskId,final String acctDate) throws SettleCheckedException;
	
	/**
	 * @description 基金运营日报表处理  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-10
	 */
	public void fundMtcDayReportHandle(final String taskId,final String acctDate) throws SettleCheckedException;
	
	/**
	 * @description 生成某商户日报表结算文件
	 * @param reportId 报表ID
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-24
	 */
	public void merchantDayClearReportByReportId(Long reportId) throws SettleCheckedException; 
	
	/**
	 * @description 更新消费商户日交易状态
	 * @param reportIdList
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-10
	 */
	public void updateConsumeTradeDayReportSettled(List<Long> reportIdList, 
			DayReportSettleStatus settleStatus) 
			throws SettleCheckedException;
}
