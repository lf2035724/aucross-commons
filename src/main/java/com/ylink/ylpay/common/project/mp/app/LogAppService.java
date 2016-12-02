package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.constant.OperateType;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 日志接口.
 * 
 * @author 潘瑞峥
 * @date 2012-10-29
 */
public interface LogAppService {

	/**
	 * 登录失败日志.
	 * 
	 * <pre>
	 * 接口: <b>2.3.1</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param userId
	 * @param loginName
	 * @param ip
	 * @param sessionId
	 */
	public void loginFailure( Long userId, String loginName, String ip, String sessionId ) throws MpCheckedException;

	/**
	 * 登录成功日志.
	 * 
	 * <pre>
	 * 接口: <b>2.3.2</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param userId
	 * @param loginName
	 * @param ip
	 */
	public void loginSuccess( Long userId, String loginName, String ip ) throws MpCheckedException;

	/**
	 * 操作日志.
	 * 
	 * <pre>
	 * 接口: <b>2.3.3</b>
	 * 规则: 1.userId: NOT NULL, 2.ip: NOT NULL, 3.operateType: NOT NULL, 4.remark: NULL.
	 * </pre>
	 * 
	 * @param userId
	 * @param ip
	 * @param operateType
	 * @param remark
	 */
	public void log( Long userId, String ip, OperateType operateType, String remark ) throws MpCheckedException;

}