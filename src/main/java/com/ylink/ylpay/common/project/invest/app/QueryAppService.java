/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Pengyindong 2013-1-8
 */

package com.ylink.ylpay.common.project.invest.app;

import java.util.Date;
import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.invest.dto.CheckResultDTO;
import com.ylink.ylpay.common.project.invest.dto.DayCutDTO;
import com.ylink.ylpay.common.project.invest.dto.FcheckMonitorDTO;
import com.ylink.ylpay.common.project.invest.dto.RedemptionDTO;
import com.ylink.ylpay.common.project.invest.dto.SubscriptionDTO;


/** 
 * @author Pengyindong
 * @date 2013-1-8
 * @description：基金前置查询接口
 */

public interface QueryAppService {

	/**
	 * @description 分页查询赎回记录信息
	 * @param page
	 * @param dto
	 * @return  
	 * @author Pengyindong
	 * @date 2013-1-8
	 */
	public ListPage<RedemptionDTO> findRedemptionListPage(
			ListPage<RedemptionDTO> page, RedemptionDTO dto);
	
	/**
	 * @description 分页查询申购记录信息
	 * @param page
	 * @param dto
	 * @return  
	 * @author Pengyindong
	 * @date 2013-1-8
	 */
	public ListPage<SubscriptionDTO> findSubscriptionListPage(
			ListPage<SubscriptionDTO> page, SubscriptionDTO dto);
	
	public ListPage<SubscriptionDTO> findSubscriptionList(
			ListPage<SubscriptionDTO> page, SubscriptionDTO dto);
	
	/**
	 * @description 日切数据查询
	 * @return  
	 * @author Pengyindong
	 * @date 2013-1-9
	 */
	public List<DayCutDTO> findDayCutList(DayCutDTO dto);
	
	/**
	 * huoquriqie
	 * @description：
	 * @return  
	 * @author LiXiPing
	 * @date 2013-12-3
	 */
	public Date getDayCut();
	
	/**
	 * 分页查询对账结果信息
	 * @description 
	 * @param page
	 * @param dto
	 * @return  
	 * @author Leo
	 * @date 2013-1-21
	 */
	public ListPage<CheckResultDTO> findListPage(ListPage<CheckResultDTO> page, CheckResultDTO dto);
//	public ListPage<CheckResultDTO> findListPage(ListPage<CheckResultDTO> page, CheckResultDTO checkResult);
	
	/**
	 * @description 对账记录分页信息
	 * @param page
	 * @param dto
	 * @return  
	 * @author Pengyindong
	 * @date 2013-1-26
	 */
	public ListPage<FcheckMonitorDTO> findFcheckMonitorListPage(ListPage<FcheckMonitorDTO> page, FcheckMonitorDTO dto);
}
