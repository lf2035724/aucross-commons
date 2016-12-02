package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.dto.CheckAccountDTO;
import com.ylink.ylpay.common.project.channel.dto.ReturnUserToZLDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;


/**
 * @description 渠道对外提供的实名签约的APP
 * @author wl
 * @date 2012-10
*/

public interface CheckAccountAppService
{    
	/**
	 * @description 渠道对外提供的网银验证账户合法性的APP
	 * @param CheckAccountDTO  渠道公共DTO
	 * @return String “0000”
	 * @author wl
	 * @date 2012-10
	*/
	public ReturnUserToZLDTO checkAccount(CheckAccountDTO checkAccountDTO) throws ChannelCheckedException;
	
	
}
