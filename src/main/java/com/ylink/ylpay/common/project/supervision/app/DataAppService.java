/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:yu.han 2014-10-11
 */

/**
 * DataAppService.java
 * 版权所有(C) 2014 证联支付有限责任公司
 * 创建:yu.han 2014-10-11
 */
package com.ylink.ylpay.common.project.supervision.app;

import java.util.List;

import com.ylink.ylpay.common.project.supervision.dto.AbstractDTO;
import com.ylink.ylpay.common.project.supervision.dto.CapitalDetailDTO;
import com.ylink.ylpay.common.project.supervision.dto.CustAccountDetailDTO;
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
public interface DataAppService {
	
	void addTradeDetail(TradeDetailDTO dto)throws SupervisionCheckedException;
	void updateTradeDetail(TradeDetailDTO dto)throws SupervisionCheckedException;
	void delTradeDetail(TradeDetailDTO dto)throws SupervisionCheckedException;
	void addCustAccountDetail(CustAccountDetailDTO dto)throws SupervisionCheckedException;
	void updateCustAccountDetail(CustAccountDetailDTO dto)throws SupervisionCheckedException;
	void delCustAccountDetail(CustAccountDetailDTO dto)throws SupervisionCheckedException;
	void addCapitalDetail(CapitalDetailDTO dto)throws SupervisionCheckedException;
	void updateCapitalDetail(CapitalDetailDTO dto)throws SupervisionCheckedException;
	void delCapitalDetail(CapitalDetailDTO dto)throws SupervisionCheckedException;
//	void audit(List<TradeDetailDTO> list,String detailAuditStatusEnum)throws SupervisionCheckedException;
	int syncReconData(long monitorId, String bankSn) throws SupervisionCheckedException;
	void updateMonitor(SupervisionMonitorDTO dto) throws SupervisionCheckedException;
	void auditCustAccount(List<CustAccountDetailDTO> list, String detailAuditStatusEnum) throws SupervisionCheckedException;
	void auditTrade(List<TradeDetailDTO> list, String detailAuditStatusEnum) throws SupervisionCheckedException;
	void auditCapital(List<CapitalDetailDTO> list, String detailAuditStatusEnum) throws SupervisionCheckedException;
}
