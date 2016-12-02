package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 邮件服务器地址接口
 * @author xuwei
 * @param <EmailType>
 *
 */
public interface EmailServerAppService<EmailType> {

	public List<String> list() throws MpCheckedException;
	
	/**
	 * 查询邮件服务器URL
	 */
	public com.ylink.ylpay.common.project.mp.dto.EmailType getServerUrl(String serverName)throws MpCheckedException;
}
