package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.dto.EBSSignDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;


/**
 * @description 渠道对外提供的实名签约的APP
 * @author wl
 * @date 2012-10
*/

public interface EBSSignAppService
{    
	/**
	 * @description 渠道对外提供的实名签约的APP
	 * @param EBSSignDTO  渠道公共DTO
	 * @return String “0000”
	 * @author wl
	 * @date 2012-10
	*/
	public String signEBS(EBSSignDTO eBSSignDTO) throws ChannelCheckedException;
	
	/**
	 * @description 渠道对外提供的修改的APP
	 * @param bankType  行别
	 * @param authId    授权号
	 * @return String “0000”
	 * @author wl
	 * @date 2012-10
	*/
	public String changeSignEBS(String bankType,String paytype,String authId) throws ChannelCheckedException;
	
	/**
	 * @description 渠道对外提供的注销的APP
	 * @param bankType  行别
	 * @param authId    授权号
	 * @return String “0000”
	 * @author wl
	 * @date 2012-10
	*/
	public String deteleSignEBS(EBSSignDTO eBSSignDTO) throws ChannelCheckedException;
}
