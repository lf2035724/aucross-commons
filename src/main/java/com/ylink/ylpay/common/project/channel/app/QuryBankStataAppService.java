package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.dto.QuryEBankStataDTO;
import com.ylink.ylpay.common.project.channel.dto.ReturnQuryEBankStataDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;

/**
 * @description 渠道对外提供的查询网银支付状态的APP
 * @author wl
 * @date 2012-10
*/

public interface QuryBankStataAppService 
{
	/**
	 * @description 渠道对外提供的网银支付状态的APP
	 * @param QuryEBankStataDTO  渠道公共的DTO
	 * @return ReturnQuryEBankStataDTO   渠道公共的DTO
	 * @author wl
	 * @date 2012-10
	*/
	public ReturnQuryEBankStataDTO quryBankStata(QuryEBankStataDTO quryEBankStataDTO) throws ChannelCheckedException;
}
