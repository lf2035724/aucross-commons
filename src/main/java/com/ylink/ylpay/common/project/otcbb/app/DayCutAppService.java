/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-5-14
 */
package com.ylink.ylpay.common.project.otcbb.app;

import com.ylink.ylpay.common.project.otcbb.dto.WorkDateDTO;
import com.ylink.ylpay.common.project.otcbb.exception.OtcbbException;

/**
 * @author jf.zhao
 * @date 2013-5-14
 * @description：
 */
public interface DayCutAppService {

	/**
	 * 
	 * @description 日切
	 * @throws
	 * @author jf.zhao
	 * @date 2013-5-14
	 */
	public void dateChange() throws OtcbbException;

	/**
	 * 
	 * @description 根据日期进行对账
	 * @throws
	 * @author jf.zhao
	 * @date 2013-5-14
	 */
	public void reconBill(final String workDate, final String taskId)
			throws OtcbbException;

	/**
	 * 
	 * @description 获取工作日历
	 * @throws
	 * @author jf.zhao
	 * @date 2013-5-28
	 */
	public WorkDateDTO getWorkDate() throws OtcbbException;
	
	/**
	 * 
	 * @description   系统关闭与启动
	 * @return
	 * @throws OtcbbException  
	 * @author fly.zhao
	 * @date 2014-11-23
	 */
	public void  sysTemcloseOrOpen(String loginStatus) throws OtcbbException;

}
