/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:yu.han 2013-5-28
 */

/**
 * QueryService.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:yu.han 2013-5-28
 */
package com.ylink.ylpay.common.project.otcbb.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.otcbb.dto.BillCheckDTO;
import com.ylink.ylpay.common.project.otcbb.dto.BillCheckDetailDTO;
import com.ylink.ylpay.common.project.otcbb.dto.WithdrawDTO;
import com.ylink.ylpay.common.project.otcbb.dto.WithdrawDetailDTO;

/**
 * 查询类对外接口
 * 
 * @author yu.han
 * @date 2013-5-28
 * @description：TODO
 */
public interface QueryAppService {
	/**
	 * 查询提现数据
	 * 
	 * @description 可分页
	 * @param page
	 * @param dto
	 * @return
	 * @author yu.han
	 * @date 2013-5-28
	 */
	ListPage<WithdrawDTO> findWithdrawListPage(ListPage<WithdrawDTO> page,
			WithdrawDTO dto);

	/**
	 * 查询提现明细数据
	 * 
	 * @description 可分页
	 * @param page
	 * @param dto
	 * @return
	 * @author yu.han
	 * @date 2013-5-28
	 */
	ListPage<WithdrawDetailDTO> findWithdrawDetailListPage(
			ListPage<WithdrawDetailDTO> page, WithdrawDetailDTO dto);

	/**
	 * 
	 * @description 查询对账结果表记录 可分页
	 * @throws
	 * @author jf.zhao
	 * @date 2013-5-29
	 */
	public ListPage<BillCheckDTO> findbillCheck(ListPage<BillCheckDTO> page,
			BillCheckDTO dto);

	/**
	 * 
	 * @description 查询对账明细记录 可分页
	 * @throws
	 * @author jf.zhao
	 * @date 2013-5-29
	 */
	public ListPage<BillCheckDetailDTO> findBillCheckDetail(
			ListPage<BillCheckDetailDTO> page, BillCheckDetailDTO dto);

}
