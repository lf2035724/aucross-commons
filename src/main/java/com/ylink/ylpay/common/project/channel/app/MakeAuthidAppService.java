package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;


/**
 * @description 渠道对外提供的获取授权号
 * @author wl
 * @date 2012-10
*/

public interface MakeAuthidAppService
{	
	/**
	 * @description 渠道对外提供的获取授权号
	 * @param bankType  行别
	 * @return String   20位授权号（建行）
	 * @author wl
	 * @date 2012-10
	*/
	public String makeAuthid(String bankType)  throws ChannelCheckedException;
}
