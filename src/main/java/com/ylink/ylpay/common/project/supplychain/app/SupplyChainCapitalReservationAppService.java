/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-29
 */

/**
 * SupplyChainCapitalReservationAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-29
 */
package com.ylink.ylpay.common.project.supplychain.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.supplychain.dto.CapitalReservationDTO;
import com.ylink.ylpay.common.project.supplychain.exception.SupplyChianCheckedException;

/** 
 * @author feng.li
 * @date 2013-9-29
 * @description：供应链预约管理接口
 */

/**
 * @author feng.li
 */
public interface SupplyChainCapitalReservationAppService{

	/**
	 * @description 预约列表查询
	 * @param ListPage<CapitalReservationDTO> 
	 * @param CapitalReservationDTO
	 * @return ListPage<CapitalReservationDTO>
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public ListPage<CapitalReservationDTO> listMessages(ListPage<CapitalReservationDTO> page, CapitalReservationDTO dto) throws SupplyChianCheckedException;

	/**
	 * @description 预约查询
	 * @param String reservationSeq
	 * @return CapitalReservationDTO
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public CapitalReservationDTO getByReservationSeq(String reservationSeq) throws SupplyChianCheckedException;
	
	/**
	 * @description 新增预约
	 * @param CapitalReservationDTO
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public void addReservation(CapitalReservationDTO dto) throws SupplyChianCheckedException;
	
	/**
	 * @description 删除预约
	 * @param reservationSeq
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public void  deleteReservation(String reservationSeq) throws SupplyChianCheckedException;
	
	/**
	 * @description 修改预约
	 * @param CapitalReservationDTO
	 * @author feng.li
	 * @date 2013-9-29
	 */
	public void  modifyReservationInfo(CapitalReservationDTO dto) throws SupplyChianCheckedException;
	
	/**
	 * @description 获得预约对象主键序列
	 * @param reservationType
	 * @return
	 * @throws SupplyChianCheckedException  
	 * @author feng.li
	 * @date 2013-10-9
	 */
	public String getReservationSn(String reservationType) throws SupplyChianCheckedException;
}
