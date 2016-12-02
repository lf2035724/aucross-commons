/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2013-1-4
 */

package com.ylink.ylpay.common.project.settle.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.account.constant.ParamValue;
import com.ylink.ylpay.common.project.settle.dto.AccountBalanceInfoDTO;
import com.ylink.ylpay.common.project.settle.dto.AccountCapitalBillReportDTO;
import com.ylink.ylpay.common.project.settle.dto.AccountChangeInfoDTO;
import com.ylink.ylpay.common.project.settle.dto.AccountDueStatisticsInfoDTO;
import com.ylink.ylpay.common.project.settle.dto.ProvisionStatisticsInfoDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-1-4
 * @description：账务查询接口
 */

public interface AccountQueryAppService {
	
	/**
	 * @description 查询某账务日期的基金备付金余额分页信息
	 * @param accountDate
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-5
	 */
	public ListPage<AccountBalanceInfoDTO> findFundAccountBalanceListPage(ListPage<AccountBalanceInfoDTO> page, 
			String accountDate) throws SettleCheckedException;
	
	/**
	 * @description 查询某账务日期的基金备付金余额总页数
	 * @param accountDate
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-5
	 */
	public int findFundAccountBalanceListPageCount(String accountDate) 
			throws SettleCheckedException;
	
	/**
	 * @description 查询某账务日期的基金备付金变动分页信息
	 * @param page
	 * @param accountDate
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-5
	 */
	public ListPage<AccountChangeInfoDTO> findFundAccountChangeInfoListPage(ListPage<AccountChangeInfoDTO> page, 
			String accountDate) throws SettleCheckedException;
	
	/**
	 * @description 查询某账务日期的基金备付金变动信息总页数
	 * @param accountDate
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-5
	 */
	public int findFundAccountChangeInfoListPageCount(String accountDate) 
			throws SettleCheckedException;
	
	/**
	 * @description 根据条件查询账务日期
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-9
	 */
	public String findAccountDate(ParamValue paramValue) throws SettleCheckedException;
	/**
	 * 
	 * <p>备付金统计信息查询</p>
	 * @param accountDate 帐务日期
	 * @return
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-4-2 下午3:21:58
	 */
	public List<ProvisionStatisticsInfoDTO> findProvisionStatisticsInfo(String accountDate) throws SettleCheckedException;
	/**
	 * 
	 * <p>商户应付款统计信息查询</p>
	 * @param accountDate 帐务日期
	 * @return
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-4-2 下午3:21:58
	 */
	public List<AccountDueStatisticsInfoDTO> findAccountDueStatisticsInfo(String accountDate) throws SettleCheckedException;
	/**
	 * 
	 * <p>商户(基金)资金往来流水日报查询</p>
	 * @param accountDate 帐务日期
	 * @return
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-4-2 下午3:21:58
	 */
	public List<AccountCapitalBillReportDTO> findAccountCapitalBillReport(String accountDate) throws SettleCheckedException;
	
	/**
	 * @description 商户(消费)资金往来流水日报查询
	 * @param accountDate 帐务日期
	 * @return
	 * @throws SettleCheckedException  
	 * @author LiuQ
	 * @date 2013-6-14
	 */
	public List<AccountCapitalBillReportDTO> findAccountConsumeCapitalBillReport(String accountDate) throws SettleCheckedException;
	
}
