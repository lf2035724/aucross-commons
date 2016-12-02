/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/** 
 * @author YangXiaojin
 * @date 2012-11-13
 * @description：邮件发送服务
 */

public interface EmailAppService {
	
	/**
	 * @description 邮件发送
	 * @param addressee 收件人
	 * @param subject 邮件主题
	 * @param content 邮件内容
	 * @author YangXiaojin
	 * @date 2012-11-13
	 */
	public void send( String addressee,String subject,String content ) throws MpCheckedException;

}
