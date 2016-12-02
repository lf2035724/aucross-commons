/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2013-1-25
 */

package com.ylink.ylpay.common.project.settle.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.settle.dto.AccountPayUnbalanceDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/** 
 * @author Petter
 * @date 2013-3-8
 * @description：内部对账接口
 */

public interface InternalReconAppService {
	
	/**
	 * @description 内部对账分页查询
	 * @param page
	 * @param dto
	 * @return
	 * @throws SettleCheckedException
	 */
	public ListPage<AccountPayUnbalanceDTO> findAccountPayUnbalanceListPage(ListPage<AccountPayUnbalanceDTO> page, AccountPayUnbalanceDTO dto)
			throws SettleCheckedException;
	
	/**
	 * @description 根据ID获取内部对账明细
	 * @param id
	 * @return AccountPayUnbalanceDTO
	 * @throws SettleCheckedException
	 */
	public AccountPayUnbalanceDTO getAccountPayUnbalance(Long id)
			throws SettleCheckedException;
	
	/**
	 * @description 手工触发内部对账
	 * @param checkMonitorId
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-11
	 */
	public void payAndAccountReconByHand(Long checkMonitorId) throws SettleCheckedException;
	
}
