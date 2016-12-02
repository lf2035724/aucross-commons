package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.dto.EBSSignDTO;
import com.ylink.ylpay.common.project.channel.dto.EpaySignReturnDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;


/**
 * @description 渠道对外提供的保证金实名签约的APP
 * @author wanglei
 * @date 2014-2-25
*/

public interface EpaySignAppService
{    
	/**
	 * @description 渠道对外提供的保证金实名签约的APP
	 * @param EBSSignDTO  渠道公共DTO
	 * @return String “0000”
	 * @author wl
	 * @date 2012-10
	*/
	public EpaySignReturnDTO signEpay(EBSSignDTO eBSSignDTO) throws ChannelCheckedException;
	
}
