/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-24
 */

package com.ylink.ylpay.common.project.settle.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.settle.dto.CheckMonitorDTO;
import com.ylink.ylpay.common.project.settle.dto.CheckMonitorResultCountDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/**
 * @author ZhangDM(Mingly)
 * @date 2012-12-27
 * @description：渠道对账监控服务接口
 */

public interface CheckMonitorAppService {

	/**
	 * @description 查询对账监控分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2012-12-27
	 */
	public ListPage<CheckMonitorDTO> findMonitorInfoListPage(
			ListPage<CheckMonitorDTO> page, CheckMonitorDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * @description 更新对账监控信息
	 * @param checkMonitorDTO
	 *            id必填
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2012-12-27
	 */
	public void update(CheckMonitorDTO checkMonitorDTO)
			throws SettleCheckedException;

	/**
	 * @description 根据条件查询对账监控信息
	 * @param checkMonitorDTO
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-5
	 */
	public List<CheckMonitorDTO> findList(CheckMonitorDTO checkMonitorDTO)
			throws SettleCheckedException;

	/**
	 * 
	 * @description 根据条件查询对账监控信息携带对账结果统计
	 * @throws SettleCheckedException
	 * @param checkMonitorDTO
	 *            查询条件
	 * @author jf.zhao
	 * @date 2013-4-18
	 */
	public ListPage<CheckMonitorDTO> findMonitorInfoListPageWithResult(
			ListPage<CheckMonitorDTO> page, CheckMonitorDTO searchCondition)
			throws SettleCheckedException;

	/*	*//**
	 * 
	 * @description 根据条件查询渠道对账明细
	 * @throws SettleCheckedException
	 * @param CheckMonitorDTO
	 *            dto
	 * @author jf.zhao
	 * @date 2013-4-19
	 */
	/*
	 * public ListPage<ChannelReconDetailDTO> findMChannelReconDetailPage(
	 * ChannelReconDetailDTO dto) throws SettleCheckedException;
	 */

	/**
	 * 
	 * @description 统计对账结果, 开始时间与结束时间
	 * @throws
	 * @author jf.zhao
	 * @date 2013-6-1
	 */
	public CheckMonitorResultCountDTO getBillCheckResultCountByDate(
			CheckMonitorResultCountDTO dto) throws SettleCheckedException;

	/**
	 * 
	 * @description 统计对账结果
	 * @throws
	 * @author jf.zhao
	 * @date 2013-6-1
	 */
	public CheckMonitorResultCountDTO getBillCheckResultCountByCheckId(
			String checkMonitorId) throws SettleCheckedException;

	/**
	 * 
	 * @description 根据id查询对账监控信息
	 * @throws
	 * @author jf.zhao
	 * @date 2013-6-5
	 */
	public CheckMonitorDTO getCheckMonitorById(Long checkId) throws SettleCheckedException;

}
