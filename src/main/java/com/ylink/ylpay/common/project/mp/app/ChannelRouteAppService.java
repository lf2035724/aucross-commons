/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */

/**
 * ChannelRouteAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */
package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.constant.ChannelRouteDTO;
import com.ylink.ylpay.common.project.mp.constant.OptType;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/** 
 * @author feng.li
 * @date 2013-11-7
 * @description：渠道路由AppService
 */

/**
 * @author feng.li
 */
public interface ChannelRouteAppService {
	
	/**
	 * @description 查询渠道路由
	 * @param id
	 * @return ChannelRouteDTO
	 * @author feng.li
	 * @date 2013-11-7
	 */
	public ChannelRouteDTO getById(String id) throws MpCheckedException;
	
	/**
	 * @description 查询渠道路由
	 * @param dto (optType,bankType,interBankType不能为空)
	 * @return ChannelRouteDTO
	 * @author feng.li
	 * @date 2013-11-7
	 */
	public ChannelRouteDTO getByDTO(ChannelRouteDTO dto) throws MpCheckedException;
	
	/**
	 * @description 查询默认渠道路由
	 * @param optType
	 * @return String
	 * @author feng.li
	 * @date 2014-3-6
	 */
	public String getDefault(OptType optType) throws MpCheckedException;
}
