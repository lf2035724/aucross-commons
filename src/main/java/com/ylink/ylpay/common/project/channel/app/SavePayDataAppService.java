package com.ylink.ylpay.common.project.channel.app;

import java.util.List;

import com.ylink.ylpay.common.project.channel.dto.HeadSavaPayDataDTO;
import com.ylink.ylpay.common.project.channel.dto.SavaPayDataDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;

/**
 * @description 渠道对外提供的保存管理平台发送的数据APP
 * @author wl
 * @date 2012-10
*/

public interface SavePayDataAppService 
{
	/**
	 * @description 渠道对外提供的保存管理平台发送的数据表
	 * @param  List<SavaPayDataDTO>  渠道的公共的DTO
	 * @return String “0000”
	 * @author wl
	 * @date 2012-10
	*/
	public  void  savePayData(final HeadSavaPayDataDTO headSavaPayDataDTO,final List<SavaPayDataDTO> savaPayDataDTOList)  throws ChannelCheckedException;
}
