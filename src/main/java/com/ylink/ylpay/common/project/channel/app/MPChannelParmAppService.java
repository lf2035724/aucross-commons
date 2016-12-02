package com.ylink.ylpay.common.project.channel.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.channel.dto.ChannelDetailDTO;
import com.ylink.ylpay.common.project.channel.dto.ChannelParmDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;

/**
 * @description 渠道对外提供的渠道参数查询的APP
 * @author wl
 * @date 2012-10
*/

public interface MPChannelParmAppService 
{
	/**
	 * @description 渠道对外提供的渠道参数查询的APP
	 * @param ListPage<ChannelParmDTO> page  渠道公共的DTO
	 * @return ChannelParmDTO   渠道公共的DTO
	 * @return ListPage<ChannelParmDTO>
	 * @author wl
	 * @date 2012-10
	*/
	public  ListPage<ChannelParmDTO> queryListPage(ListPage<ChannelParmDTO> page,ChannelParmDTO channelParmDTO) throws ChannelCheckedException;
	
	/**
	 * @description 渠道对外提供的管理平台对渠道参数修改接口APP
	 * @param UserToZLEBSDTO 
	 * @return String 
	 * @author wl
	 * @date 2012-10
	*/
	public  String updata(ChannelParmDTO channelParmDTO) throws ChannelCheckedException;
	
	/**
	 * @description 渠道对外提供的管理平台对渠道参数的新增接口APP
	 * @param UserToZLEBSDTO 
	 * @return String 
	 * @author wl
	 * @date 2012-10
	*/
	public  String save(ChannelParmDTO channelParmDTO) throws ChannelCheckedException;
	/**
	 * 初始化渠道内存参数
	 * @description   
	 * @author yu.han
	 * @date 2013-4-18
	 */
	public void initParam();
	/**
	 * 查询渠道交易明细
	 * @description 
	 * @return  
	 * @author yu.han
	 * @date 2013-7-9
	 */
	ChannelDetailDTO queryChannelDetail(String orderId);
	/**
	 * 编辑内存参数
	 * @description 
	 * @param bankType
	 * @param payType
	 * @param parName
	 * @param parValue  如果值为空,内存会删除该值
	 * @author yu.han
	 * @date 2013-4-18
	 */
//	public void editParam(String bankType,String payType,String parName,String parValue);
}
