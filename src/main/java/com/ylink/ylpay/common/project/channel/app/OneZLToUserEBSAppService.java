package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.dto.OneZlToUserEBSDTO;
import com.ylink.ylpay.common.project.channel.dto.OneZlToUserEBSReturnDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;

/**
 * @description 渠道对外提供的快捷付单笔代付的APP
 * @author wl
 * @date 2012-10
*/

public interface OneZLToUserEBSAppService 
{
	/**
	 * @description 渠道对外提供的快捷付单笔代付的APP
	 * @param OneZlToUserEBSDTO  渠道公共的DTO
	 * @return OneZlToUserEBSReturnDTO   渠道公共的DTO
	 * @author wl
	 * @date 2012-10
	*/
	public OneZlToUserEBSReturnDTO oneZLToUserEBS(OneZlToUserEBSDTO oneZlToUserEBSDTO)  throws ChannelCheckedException;
}
