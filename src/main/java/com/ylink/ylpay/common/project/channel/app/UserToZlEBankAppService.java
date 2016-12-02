package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.dto.ReturnUserToZLDTO;
import com.ylink.ylpay.common.project.channel.dto.UserToZLEBankDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;


/**
 * @description 渠道对外提供的网银支付的APP
 * @author wl
 * @date 2012-10
*/

public interface UserToZlEBankAppService 
{
	/**
	 * @description 渠道对外提供的网银支付的APP
	 * @param UserToZLEBankDTO  渠道公共的DTO
	 * @return String   "0000"
	 * @author wl
	 * @date 2012-10
	*/
	public ReturnUserToZLDTO userToZlEBank(UserToZLEBankDTO userToZLEBankDTO) throws ChannelCheckedException;
}
