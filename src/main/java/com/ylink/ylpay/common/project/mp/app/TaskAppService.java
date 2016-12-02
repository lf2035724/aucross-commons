package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;


/**
 * 任务业务接口
 * 
 * @author YangXiaojin
 * 
 */
public interface TaskAppService{
	
	/**
	 * 回调通知
	 * 
	 * @param taskid 任务ID
	 * @param result 执行结果
	 * 
	 */
	public void callback(String taskid,boolean result) throws MpCheckedException;
	
	/**
	 * 回调通知
	 * 
	 * @param taskid 任务ID
	 * @param result 执行结果
	 * @param errMsg 错误信息
	 * 
	 */
	public void callbackWithRemark(String taskid,boolean result,String errMsg) throws MpCheckedException;
	
}