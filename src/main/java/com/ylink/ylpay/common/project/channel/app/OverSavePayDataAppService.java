package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;
import com.ylink.ylpay.common.project.settle.dto.CheckMonitorDTO;

/**
 * @description 渠道对外提供的保存管理平台发送的数据完毕通知APP
 * @author wl
 * @date 2012-10
*/

public interface OverSavePayDataAppService 
{
	/**
	 * @description 渠道对外提供的保存管理平台发送的数据表完毕通知
	 * @param  List<SavaPayDataDTO>  渠道的公共的DTO
	 * @return boolean
	 * @author wl
	 * @date 2012-10
	*/
	public  boolean overSavePayData(CheckMonitorDTO checkMonitorDTO)  throws ChannelCheckedException;
}
