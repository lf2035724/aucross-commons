package com.ylink.ylpay.common.project.pay.app;

import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

/**
 * @description 保证金快速提现支付接口
 * @author RuiJin.Wu
 * @date   2014-06-24
 */
public interface DailyJobMarginPayAppService {
	
	/**
	 * @description  保证金支付入口
	 * @param date   结算日期
	 * @param taskId 定时任务编号
	 */
	public void marginPay(String taskId,String date) throws PayCheckedException;

}
