package com.ylink.ylpay.common.project.pay.app;

/**
 * 
 * @author wuruijin
 * @date  20140306
 * @deprecated:T+0 轧差模式支付接口
 *
 */
public interface DailyJobTransferPayAppService {
	
	/**
	 * 支付入口
	 * @param date   结算日期
	 * @param taskId 定时任务编号
	 */
	public void modifyPayOnline(String taskId,String date);

}
