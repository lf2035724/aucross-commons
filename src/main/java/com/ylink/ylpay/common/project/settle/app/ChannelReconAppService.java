/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-24
 */

package com.ylink.ylpay.common.project.settle.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.settle.dto.AccountBillDTO;
import com.ylink.ylpay.common.project.settle.dto.BatchBillDTO;
import com.ylink.ylpay.common.project.settle.dto.ChannelBankAccDTO;
import com.ylink.ylpay.common.project.settle.dto.ChannelReconDetailDTO;
import com.ylink.ylpay.common.project.settle.dto.ChannelReconResultDataDTO;
import com.ylink.ylpay.common.project.settle.dto.ChannelReconResultInfoDTO;
import com.ylink.ylpay.common.project.settle.dto.ShouldChannelReconBillDTO;
import com.ylink.ylpay.common.project.settle.dto.UnReconChannelAccDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/**
 * @author HuAJ
 * @date 2012-11-24
 * @description：渠道对账对外服务接口
 */

public interface ChannelReconAppService {

	/**
	 * @description 渠道银行与支付对账
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-8
	 */
	public void payAndChannelRecon() throws SettleCheckedException;

	/**
	 * @description 手工触发渠道银行与支付对账
	 * @param checkMonitorId
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-11
	 */
	public void payAndChannelReconByHand(final Long checkMonitorId)
			throws SettleCheckedException;

	/**
	 * @description 查询未对账科目分页信息 beginAccountDate、endAccountDate、accountId为必填字段
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-9
	 */
	public ListPage<AccountBillDTO> findUnreconSubjectListPage(
			ListPage<AccountBillDTO> page, AccountBillDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * @description 查询全部未对账科目分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author yanghan
	 * @date 2013-5-20
	 */
	public ListPage<AccountBillDTO> findAllUnreconSubjectListPage(
			ListPage<AccountBillDTO> page, AccountBillDTO searchCondition)
			throws SecurityException;

	/**
	 * @description 查询已对账科目分页信息 beginAccountDate、endAccountDate、accountId为必填字段
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-9
	 */
	public ListPage<AccountBillDTO> findReconedSubjectListPage(
			ListPage<AccountBillDTO> page, AccountBillDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * @description 创建手工对账批次与流水关系 bankType不需要
	 * @param batchBillDTO
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-25
	 */
	public void createBatchBill(BatchBillDTO batchBillDTO)
			throws SettleCheckedException;

	/**
	 * @description 拒绝对账
	 * @param batchId
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-25
	 */
	public void refuseBatchBill(Long batchId) throws SettleCheckedException;

	/**
	 * @description 通过对账 bankType、batchId为必填
	 * @param batchId
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-25
	 */
	public void passRecon(BatchBillDTO batchBillDTO)
			throws SettleCheckedException;

	/**
	 * @description 通过不平帐 bankType、batchId、unbalanceReason为必填
	 * @param batchId
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-25
	 */
	public void passReconUnbalance(BatchBillDTO batchBillDTO)
			throws SettleCheckedException;

	/**
	 * @description 通过取消对账
	 * @param batchId
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-25
	 */
	public void passCancelRecon(Long batchId) throws SettleCheckedException;

	/**
	 * @description 通过取消对账不平帐
	 * @param batchId
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-25
	 */
	public void passCancelReconUnbalance(Long batchId)
			throws SettleCheckedException;

	/**
	 * @description 根据记账流水id查询记账流水信息
	 * @param billId
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-25
	 */
	public AccountBillDTO findAccountBill(Long billId)
			throws SettleCheckedException;

	/**
	 * @description 通过批次查询关连记账流水明细信息
	 * @param batchId
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-25
	 */
	public List<AccountBillDTO> findAccountBillListByBatchId(Long batchId)
			throws SettleCheckedException;

	/**
	 * @description 查询对账明细分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-26
	 */
	public ListPage<ChannelReconDetailDTO> findChannelReconDetailListPage(
			ListPage<ChannelReconDetailDTO> page,
			ChannelReconDetailDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * 
	 * @description 银行对账汇总信息
	 * @throws
	 * @author jf.zhao
	 * @date 2013-7-26
	 */
	public ListPage<ChannelReconResultInfoDTO> findChannelReconCountListPage(
			ListPage<ChannelReconResultInfoDTO> page,
			ChannelReconResultInfoDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * 
	 * @description  根据账务日期、虚拟客户号、三级科目账户查询统计明细
	 * @throws
	 * @author jf.zhao
	 * @date 2013-8-21
	 */
	public ChannelReconResultInfoDTO getChannelReconCountDetail(
			ChannelReconResultInfoDTO searchCondition)
			throws SettleCheckedException;;

	/**
	 * 
	 * @description 按照账务日期，虚拟客户号 银行行别查询银行对账汇总信息
	 * @throws
	 * @author jf.zhao
	 * @date 2013-7-31
	 */
	public ListPage<ChannelBankAccDTO> findChannelBankAccListPage(
			ListPage<ChannelBankAccDTO> page, ChannelBankAccDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * 
	 * @description 按照账务日期，虚拟客户号 银行行别 平衡标志 入账或者出账标识 查询银行对账结果汇总信息 入账或者出账 入账 dr
	 *              出账cr
	 * @throws
	 * @author jf.zhao
	 * @date 2013-7-31
	 */
	public ListPage<ChannelReconResultDataDTO> findReconResultListPage(
			ListPage<ChannelReconResultDataDTO> page,
			ChannelReconResultDataDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * 
	 * @description 查询未对账列表 按照虚拟客户号 ，账务日期 银行 帐号
	 * @throws
	 * @author jf.zhao
	 * @date 2013-7-31
	 */
	public ListPage<UnReconChannelAccDTO> findUnReconListPage(
			ListPage<UnReconChannelAccDTO> page,
			UnReconChannelAccDTO searchCondition) throws SettleCheckedException;

	/**
	 * 
	 * @description 应该对账列表
	 * @throws
	 * @author jf.zhao
	 * @date 2013-8-15
	 */
	public ListPage<ShouldChannelReconBillDTO> findShouldReconListPage(
			ListPage<ShouldChannelReconBillDTO> page,
			ShouldChannelReconBillDTO searchCondition)
			throws SettleCheckedException;

}
