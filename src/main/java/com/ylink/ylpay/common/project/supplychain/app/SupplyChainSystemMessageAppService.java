/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-29
 */

/**
 * SupplyChainSystemMessageAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-29
 */
package com.ylink.ylpay.common.project.supplychain.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.supplychain.dto.SystemMessageDTO;
import com.ylink.ylpay.common.project.supplychain.exception.SupplyChianCheckedException;

/** 
 * @author feng.li
 * @date 2013-9-29
 * @description：供应链系统消息服务接口
 */

/**
 * @author feng.li
 */
public interface SupplyChainSystemMessageAppService {

	/**
	 * @description 消息查询
	 * @param ListPage<SystemMessageDTO> 
	 * @param SystemMessageDTO
	 * @return ListPage<SystemMessageDTO>
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public ListPage<SystemMessageDTO> listMessages(ListPage<SystemMessageDTO> page, SystemMessageDTO dto) throws SupplyChianCheckedException;

	
	/**
	 * @description 系统消息查询
	 * @param String messageSeq
	 * @return SystemMessageDTO
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public SystemMessageDTO getByMessageSeq(String messageSeq) throws SupplyChianCheckedException;
	
	
	/**
	 * @description 新增系统消息
	 * @param SystemMessageDTO
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public void addMessage(SystemMessageDTO dto) throws SupplyChianCheckedException;
	
	
	/**
	 * @description 删除
	 * @param messageSeq
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public void  deleteMessage(String messageSeq) throws SupplyChianCheckedException;
	
	/**
	 * @description 修改系统消息
	 * @param SystemMessageDTO
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public void  modifyMessage(SystemMessageDTO dto) throws SupplyChianCheckedException;
	
	/**
	 * @description 获得消息主键序列
	 * @param contractType
	 * @return
	 * @throws SupplyChianCheckedException  
	 * @author feng.li
	 * @date 2013-9-30
	 */
	public String getMessageSn(String messageType) throws SupplyChianCheckedException;
}
