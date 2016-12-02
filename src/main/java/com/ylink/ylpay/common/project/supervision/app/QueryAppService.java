/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:yu.han 2014-10-11
 */

/**
 * OrderQueryBusiService.java
 * 版权所有(C) 2014 证联支付有限责任公司
 * 创建:yu.han 2014-10-11
 */
package com.ylink.ylpay.common.project.supervision.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.supervision.dto.CapitalDetailDTO;
import com.ylink.ylpay.common.project.supervision.dto.CustAccountDetailDTO;
import com.ylink.ylpay.common.project.supervision.dto.NomatchDetailDTO;
import com.ylink.ylpay.common.project.supervision.dto.ResultDTO;
import com.ylink.ylpay.common.project.supervision.dto.SupervisionBatchDTO;
import com.ylink.ylpay.common.project.supervision.dto.SupervisionMonitorDTO;
import com.ylink.ylpay.common.project.supervision.dto.TradeDetailDTO;
import com.ylink.ylpay.common.project.supervision.exception.SupervisionCheckedException;

/** 
 * @author yu.han
 * @date 2014-10-11
 * @description：TODO
 */

/**
 * @author yu.han 
 * @date 2014-10-11
 */
public interface QueryAppService {

	/**
	 * @description 
	 * @param page
	 * @param searchCondition
	 * @return  
	 * @author yu.han
	 * @throws SupervisionCheckedException 
	 * @date 2014-10-11
	 */
	ListPage<TradeDetailDTO> findTradeDetailListPage(ListPage<TradeDetailDTO> page, TradeDetailDTO searchCondition) throws SupervisionCheckedException;
	ListPage<CustAccountDetailDTO> findCustAccountDetailListPage(ListPage<CustAccountDetailDTO> page,CustAccountDetailDTO searchCondition)throws SupervisionCheckedException;
	ListPage<CapitalDetailDTO> findCapitalDetailListPage(ListPage<CapitalDetailDTO> page,CapitalDetailDTO searchCondition)throws SupervisionCheckedException;
	ListPage<SupervisionMonitorDTO> findMonitorListPage(ListPage<SupervisionMonitorDTO> page,SupervisionMonitorDTO searchCondition)throws SupervisionCheckedException;
	ListPage<SupervisionBatchDTO> findMonitorBatchListPage(ListPage<SupervisionBatchDTO> page,SupervisionBatchDTO searchCondition)throws SupervisionCheckedException;
	/**
	 * @description 
	 * @param monitorId
	 * @return
	 * @throws SupervisionCheckedException  
	 * @author yu.han
	 * @date 2014-10-16
	 */
	List<TradeDetailDTO> findReconData(long monitorId) throws SupervisionCheckedException;
	void queryUploadFileStatus(long batchId)throws SupervisionCheckedException;
	/**
	 * @description 
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SupervisionCheckedException  
	 * @author yu.han
	 * @date 2014-10-28
	 */
	ListPage<NomatchDetailDTO> findNomatchDetailListPage(ListPage<NomatchDetailDTO> page, NomatchDetailDTO searchCondition) throws SupervisionCheckedException;
}
