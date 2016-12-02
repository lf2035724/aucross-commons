/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-24
 */

package com.ylink.ylpay.common.project.settle.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.settle.dto.BalanceSheetDTO;
import com.ylink.ylpay.common.project.settle.dto.ConsumeTradeDayReportDTO;
import com.ylink.ylpay.common.project.settle.dto.FundMtcDayReportDTO;
import com.ylink.ylpay.common.project.settle.dto.FundMtcDayReportDetailDTO;
import com.ylink.ylpay.common.project.settle.dto.FundTradeDayReportDTO;
import com.ylink.ylpay.common.project.settle.dto.FundTradeDayReportDetailDTO;
import com.ylink.ylpay.common.project.settle.dto.FundTransferReportDTO;
import com.ylink.ylpay.common.project.settle.dto.InterestSettleDTO;
import com.ylink.ylpay.common.project.settle.dto.InvestorTransferDTO;
import com.ylink.ylpay.common.project.settle.dto.MerchantClearDTO;
import com.ylink.ylpay.common.project.settle.dto.PayStatusStatisticsDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/**
 * @author ZhangDM(Mingly)
 * @date 2012-12-27
 * @description：报表查询服务接口
 */

public interface ReportQueryAppService {

	/**
	 * @description 查询商户结算报表分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-9
	 */
	public ListPage<MerchantClearDTO> findMerchantClearInfoListPage(ListPage<MerchantClearDTO> page,
			MerchantClearDTO searchCondition) throws SettleCheckedException;
	
	/**
	 * @description 查询消费商户交易日统计报表分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-10
	 */
	public ListPage<ConsumeTradeDayReportDTO> findConsumeTradeDayInfoListPage(ListPage<ConsumeTradeDayReportDTO> page,
			ConsumeTradeDayReportDTO searchCondition) throws SettleCheckedException;
	
	/**
	 * @description 根据id查询消费商户交易日统计
	 * @param reportId
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-11
	 */
	public ConsumeTradeDayReportDTO findConsumeTradeDayInfoByReportId(Long reportId) 
			throws SettleCheckedException;
	
	/**
	 * @description 查询基金公司交易日统计报表分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-10
	 */
	public ListPage<FundTradeDayReportDTO> findFundTradeDayInfoListPage(ListPage<FundTradeDayReportDTO> page,
			FundTradeDayReportDTO searchCondition) throws SettleCheckedException;

	/**
	 * @description 查询基金公司交易日统计报表详细分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-10
	 */
	public ListPage<FundTradeDayReportDetailDTO> findFundTradeDayDetailInfoListPage(
			ListPage<FundTradeDayReportDetailDTO> page, FundTradeDayReportDetailDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * @description 查询基金运维日统计报表分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-10
	 */
	public ListPage<FundMtcDayReportDTO> findFundMtcDayInfoListPage(ListPage<FundMtcDayReportDTO> page,
			FundMtcDayReportDTO searchCondition) throws SettleCheckedException;

	/**
	 * @description 查询基金运维日统计报表详细分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-10
	 */
	public ListPage<FundMtcDayReportDetailDTO> findFundMtcDayDetailInfoListPage(
			ListPage<FundMtcDayReportDetailDTO> page, FundMtcDayReportDetailDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * 
	 * @description 查询J03报表数据
	 * @param page
	 * @param searchCondition
	 *            查询条件实体类
	 * @return
	 * @throws SettleCheckedException
	 * @author yu.han
	 * @date 2013-1-18
	 */
	public ListPage<FundTransferReportDTO> findFundTransferReportListPage(ListPage<FundTransferReportDTO> page,
			FundTransferReportDTO searchCondition) throws SettleCheckedException;

	/**
	 * 
	 * @description 查询J04报表数据
	 * @param page
	 * @param searchCondition
	 *            查询条件实体类
	 * @return
	 * @throws SettleCheckedException
	 * @author yu.han
	 * @date 2013-1-18
	 */
	public ListPage<InvestorTransferDTO> findInvestorTransferReportListPage(ListPage<InvestorTransferDTO> page,
			InvestorTransferDTO searchCondition) throws SettleCheckedException;

	/**
	 * 
	 * @description 查询计息汇总结果
	 * @param page
	 * @param searchCondition
	 *            查询条件实体类
	 * @return
	 * @throws SettleCheckedException
	 * @author yu.han
	 * @date 2013-1-24
	 */
	public ListPage<InterestSettleDTO> findInterestSettleListPage(ListPage<InterestSettleDTO> page,
			InterestSettleDTO searchCondition) throws SettleCheckedException;

	/**
	 * 
	 * <p>
	 * 查询交易统计信息
	 * </p>
	 * 
	 * @param optCode
	 *            交易类型代码
	 * @param startDate
	 *            交易开始时间,格式:yyyyMmdd
	 * @param endDate
	 *            交易结束时间,格式:yyyyMmdd
	 * @return
	 * @throws SettleCheckedException
	 * @author 杜波 159-9965-3650 Created on: 2013-4-2 上午11:15:38
	 */
	public List<PayStatusStatisticsDTO> findStatisticsPayTransStatusInfo(String optCode, String startDate,
			String endDate) throws SettleCheckedException;
	
	/**
	 * 
	 * <p>
	 * 统计交易信息
	 * </p>
	 * 
	 * @param optCode
	 *            交易类型代码
	 * @param startDate
	 *            交易开始时间,格式:yyyyMmdd
	 * @param endDate
	 *            交易结束时间,格式:yyyyMmdd
	 * @return
	 * @throws SettleCheckedException
	 * @author 杜波 159-9965-3650 Created on: 2013-4-2 上午11:15:38
	 */
	public List<PayStatusStatisticsDTO> statisticsPayStausInfo(String optCode, String startDate,String endDate) throws SettleCheckedException;
	/**
	 * @description 按月份查询资产负债表
	 * @param month，6位字符串，如201303
	 * @return 
	 * @throws SettleCheckedException  
	 * @author Iquil
	 * @date 2013-4-2
	 */
	public List<BalanceSheetDTO> findBalanceSheetReportByMonth(String month) throws SettleCheckedException;
	
	/**
	 * @description 按月份查询利润表
	 * @param month，6位字符串，如201303
	 * @return
	 * @throws SettleCheckedException  
	 * @author Iquil
	 * @date 2013-4-3
	 */
	public List<BalanceSheetDTO> findProfitReportByMonth(String month) throws SettleCheckedException;
	
	/**
	 * @description 按天查询资产负债表
	 * @param month，8位字符串，如20130303
	 * @return 
	 * @throws SettleCheckedException  
	 * @author feng.li
	 * @date 2014-7-14
	 */
	public List<BalanceSheetDTO> findBalanceSheetReportByDay(String day) throws SettleCheckedException;
}
