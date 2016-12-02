package com.ylink.ylpay.common.project.supervision.app;

import com.ylink.ylpay.common.project.supervision.dto.ResultDTO;



/**
 * 监管系统日终调度
 * @author yu.han
 *
 */

public interface DayEndAppService {
	/**
	 * 创建监控
	 * @description 
	 * @param date
	 * @return  
	 * @author yu.han
	 * @date 2014-10-8
	 */
	boolean createMonitor(String date);
	void reSubmit(long monitorId);
	ResultDTO confirmSummit(long monitorId);
	void checkUploadFileStatus();
}
