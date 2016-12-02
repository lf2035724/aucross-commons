package com.ylink.ylpay.common.project.sms.app;

import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;
import com.ylink.ylpay.common.project.sms.dto.SmsSendBean;

/**
 * 短信接口.
 * 
 * @author 潘瑞峥
 * @date 2012-11-8
 */
public interface SmsAppService {

	/**
	 * 发送短信.
	 * 
	 * <pre>
	 * 接口: <b></b>
	 * 规则: dtoBean NOT NULL.<br>
	 *   1.dtoBean.destaddr(被叫手机号): NOT NULL;<br>
	 *   2.dtoBean.content(短信内容): NOT NULL;<br>
	 *   3.dtoBean.batchid(批次号): 可填;<br>
	 *   4.dtoBean.creatorid(创建用户id): 可填.
	 * </pre>
	 * 
	 * @param dtoBean
	 * @throws MpCheckedException
	 */
	public void send( SmsSendBean dtoBean ) throws MpCheckedException;

	/**
	 * 成功接收短信.
	 * 
	 * <pre>
	 * 接口: <b></b>
	 * 规则: NOT NULL.
	 * </pre>
	 * 
	 * @param id
	 * @throws MpCheckedException
	 */
	public void received( Integer id ) throws MpCheckedException;
	/**
	 * 查询余额
	 * @description 
	 * @return  
	 * @author yu.han
	 * @date 2013-4-3
	 */
	int queryBalance();

}