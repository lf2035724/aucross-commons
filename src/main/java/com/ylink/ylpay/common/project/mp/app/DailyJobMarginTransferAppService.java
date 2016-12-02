package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * @description 保证金,总分调拨接口
 * @author wrj
 * @date 2014-06-19
 */
public interface DailyJobMarginTransferAppService {
	
	/**
	 * @description:保证金总分调拨入口
	 * @param taskId
	 * @param date
	 * @throws MpCheckedException
	 * @author wrj
	 * @date 2014-06-19
	 */
	public void marginTransfer(String taskId,String date) throws MpCheckedException;
	
}
