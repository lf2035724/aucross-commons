package com.ylink.ylpay.common.project.fund.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.fund.dto.CorpBuyBackDTO;

public interface QueryCorpBuyBackAppService {

	/**
	 * 查询做市商回购订单列表
	 * @description：
	 * @param page
	 * @param dto
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-8
	 */
	public ListPage<CorpBuyBackDTO> findCorpBuyBackListPage(ListPage<CorpBuyBackDTO> page, CorpBuyBackDTO dto);

	/**
	 * 根据Id查询做市商回购订单明细
	 * @description：
	 * @param id
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-8
	 */
	public CorpBuyBackDTO findCorpBuyBackById(String id);
}
