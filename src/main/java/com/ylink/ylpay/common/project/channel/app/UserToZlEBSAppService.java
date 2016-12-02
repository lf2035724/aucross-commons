package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.dto.ReturnSYSDTO;
import com.ylink.ylpay.common.project.channel.dto.UserToZLEBSDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;

/**
 * @description 渠道对外提供的快捷付的APP
 * @author wl
 * @date 2012-10
*/

public interface UserToZlEBSAppService 
{
	/**
	 * @description 渠道对外提供的快捷付的APP
	 * @param UserToZLEBSDTO  渠道公共的DTO
	 * @return ReturnSYSDTO   渠道公共的DTO
	 * @author wl
	 * @date 2012-10
	*/
	public ReturnSYSDTO UserToZlEBS(UserToZLEBSDTO userToZLEBSDTO) throws ChannelCheckedException;
}
