/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-4
 */

package com.ylink.ylpay.common.project.pay.app;

import com.ylink.ylpay.common.project.pay.dto.QueryWithdCountAndAmtDTO;
import com.ylink.ylpay.common.project.pay.dto.RechargeRollbackApplyDTO;
import com.ylink.ylpay.common.project.pay.dto.RechargeRollbackApplyReturnDTO;
import com.ylink.ylpay.common.project.pay.dto.RechargeRollbackConfirmDTO;
import com.ylink.ylpay.common.project.pay.dto.RedemtionWithdrawDTO;
import com.ylink.ylpay.common.project.pay.dto.TimelyRedemptionDto;
import com.ylink.ylpay.common.project.pay.dto.WithdrawApplyDTO;
import com.ylink.ylpay.common.project.pay.dto.WithdrawChangeStutasDTO;
import com.ylink.ylpay.common.project.pay.dto.WithdrawConfirmDTO;
import com.ylink.ylpay.common.project.pay.dto.WithdrawConfirmSingleDTO;
import com.ylink.ylpay.common.project.pay.dto.WithdrawOrderDTO;
import com.ylink.ylpay.common.project.pay.dto.WithdrawRefuseDTO;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

/**
 * @author ZhangDM(Mingly)
 * @date 2012-11-4
 * @description：提现对外服务接口
 */

public interface WithdrawAppService {

	/**
	 * @description 提现申请
	 * @param withdrawApplyDTO
	 * @return
	 * @throws PayCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-4
	 */
	public String withdrawApply(WithdrawApplyDTO withdrawApplyDTO)
			throws PayCheckedException;

	/**
	 * @description 提现拒绝预处理
	 * @param withdrawIdList
	 * @throws PayCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-6
	 */
	public void withdrawRefuse(WithdrawRefuseDTO withdrawRefuseDTO)
			throws PayCheckedException;

	/**
	 * @description 审批拒绝后续处理（定时任务处理）
	 * @author YG.HU
	 * @date 2012-12-1
	 */
	public void withdrawRefuseHandle() throws PayCheckedException;

	/**
	 * @description 提现确认预处理
	 * @param withdrawConfirmDTO
	 * @throws PayCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-9
	 */
	public void withdrawConfirm(WithdrawConfirmDTO withdrawConfirmDTO)
			throws PayCheckedException;

	/**
	 * @description 提现线下确认处理 （定时任务处理）
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-10
	 */
	public void withdrawOfflineConfirmHandle() throws PayCheckedException;

	/**
	 * @description 提现线上确认处理 （定时任务处理）
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-10
	 */
	public void withdrawOnlineConfirmHandle() throws PayCheckedException;

	/**
	 * @description 单笔提现确认（实时转账）
	 * @param withdrawConfirmSingleDTO
	 * @throws PayCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-9
	 */
	public void withdrawConfirmSingle(
			WithdrawConfirmSingleDTO withdrawConfirmSingleDTO)
			throws PayCheckedException;

	/**
	 * @description 提现申请状态变更（批量）-支持初审、复审
	 * @param withdrawChangeStutasDTO
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public void withdrawChangeStutas(
			WithdrawChangeStutasDTO withdrawChangeStutasDTO)
			throws PayCheckedException;

	/**
	 * @description 获取提现限额（暂无用）
	 * @param custId
	 * @param bankType
	 * @param productType
	 * @return
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-11-8
	 */
	public long getWithdrawAmt(String custId, String bankType,
			String productType) throws PayCheckedException;

	/**
	 * @description 充值回退申请
	 * @param rechargeRollbackApplyDTO
	 * @return 返回结果
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public RechargeRollbackApplyReturnDTO rechargeRollbackApply(
			RechargeRollbackApplyDTO rechargeRollbackApplyDTO,String oldTradeType)
			throws PayCheckedException;
	
	
	/**
	 * @description 充值回退申请
	 * @param rechargeRollbackApplyDTO
	 * @return 返回结果
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public RechargeRollbackApplyReturnDTO rechargeRollbackApply(
			RechargeRollbackApplyDTO rechargeRollbackApplyDTO)
			throws PayCheckedException;

	/**
	 * @description 充值回退状态变更（批量）-支持初审、复审
	 * @param rechargeRollbackChangeStutasDTO
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public void rechargeRollbackChangeStutas(
			WithdrawChangeStutasDTO rechargeRollbackChangeStutasDTO)
			throws PayCheckedException;

	/**
	 * @description 获取充值回退数量
	 * @param custId
	 * @param optCode
	 * @param queryDateBegin
	 * @param queryDateEnd
	 * @return
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public long queryRechargeRollbackCount(String custId, String optCode,
			String queryDateBegin, String queryDateEnd)
			throws PayCheckedException;

	/**
	 * @description 充值回退支付（批量）
	 * @param rechargeRollbackConfirmDTO
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public void rechargeRollbackConfirm(
			RechargeRollbackConfirmDTO rechargeRollbackConfirmDTO)
			throws PayCheckedException;

	/**
	 * @description 充值回退拒绝（批量）
	 * @param rechargeRollbackRefuseDTO
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public void rechargeRollbackRefuse(
			WithdrawRefuseDTO rechargeRollbackRefuseDTO)
			throws PayCheckedException;

	/**
	 * @description 充值回退拒绝后续处理
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public void rechargeRollbackRefuseHandle();

	/**
	 * @description 充值回退线下确认处理
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-10
	 */
	public void rechargeRollbackOfflineConfirmHandle();

	/**
	 * @description 充值回退线上确认处理
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-10
	 */
	public void rechargeRollbackOnlineConfirmHandle();

	/**
	 * @description 充值回退确认回执
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-12
	 */
	public void rechargeRollbackCallbackHandle();

	/**
	 * @description 提现确认回执
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-12
	 */
	public void withdrawConfirmCallbackHandle();

	/**
	 * @description 查询一定期限内的提现交易次数和金额
	 * @param queryWithdCountAndAmtDTO
	 * @return
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public QueryWithdCountAndAmtDTO queryWithdrawSumCountAndAmt(
			QueryWithdCountAndAmtDTO queryWithdCountAndAmtDTO);

	/**
	 * 
	 * @description 更新提现订单信息
	 * @throws
	 * @author jf.zhao
	 * @date 2013-9-24
	 */
	public void updateWithDraw(WithdrawOrderDTO dto) throws PayCheckedException;
	
	/**
	 * @description 实时赎回提现--实时转账
	 * @param redemtionWithdrawDTO
	 * @return
	 * @throws PayCheckedException  
	 * @author LiuQ
	 * @date 2013-10-29
	 */
	public TimelyRedemptionDto immediatelyRedemptionWithdraw(
			RedemtionWithdrawDTO redemtionWithdrawDTO)
			throws PayCheckedException;
	
}
