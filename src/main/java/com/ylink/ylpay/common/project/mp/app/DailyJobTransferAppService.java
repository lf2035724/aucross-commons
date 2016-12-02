package com.ylink.ylpay.common.project.mp.app;

import java.util.Date;


/**
 * 
 * @author wuruijin
 * @date  20140305
 * @deprecated:头寸调拨接口
 */

public interface DailyJobTransferAppService {
	
	/**
	 * 调拨任务入口
	 * @param date    轧差日期(结算日期)
	 * @param taskId  任务号
	 */
	public void creditDebitTransfer(String taskId,String date);

}
