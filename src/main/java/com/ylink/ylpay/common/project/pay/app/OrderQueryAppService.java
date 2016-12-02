/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-8
 */

package com.ylink.ylpay.common.project.pay.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.pay.dto.JhbTimelySubscribeDTO;
import com.ylink.ylpay.common.project.pay.dto.MerchantClearReportDTO;
import com.ylink.ylpay.common.project.pay.dto.MerchantOrderDTO;
import com.ylink.ylpay.common.project.pay.dto.PayOrderDTO;
import com.ylink.ylpay.common.project.pay.dto.PaymentOrderDTO;
import com.ylink.ylpay.common.project.pay.dto.RechargeOrderDTO;
import com.ylink.ylpay.common.project.pay.dto.TradeCollectInfoDTO;
import com.ylink.ylpay.common.project.pay.dto.TradeReportByOptTypeDTO;
import com.ylink.ylpay.common.project.pay.dto.WithdrawBatchConfirmDTO;
import com.ylink.ylpay.common.project.pay.dto.WithdrawOrderDTO;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;


/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-8
 * @description：订单查询对外服务接口
 */

public interface OrderQueryAppService {
	
	/**
	 * @description 查询充值订单分页信息
	 * @param page 分页信息
	 * @param searchCondition 查询条件
	 * 			必填：custId、optCode
	 * 			查询条件有：除endDate都可作为查询条件
     * @throws PayCheckedException 
	 * @return  
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-8
	 */
	public ListPage<RechargeOrderDTO> findRechargeOrderListPage(ListPage<RechargeOrderDTO> page, 
			RechargeOrderDTO searchCondition)throws PayCheckedException;
	
	/**
	 * @description 查询充值订单明细
	 * @param rechargeId
	 * @return
	 * @throws PayCheckedException  
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public RechargeOrderDTO findRechargeOrder(String rechargeId) throws PayCheckedException;
	
	/**
	 * @description 根据支付订单查询充值订单明细
	 * @param payId
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-2
	 */
	public RechargeOrderDTO findRechargeOrderByPayId(String payId) throws PayCheckedException;
	
	/**
	 * @description 查询网关充值订单状态
	 * @param businessSn
	 * @param merchantId
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-12-15
	 */
	public RechargeOrderDTO findRechargeOrderStatus(String businessSn, String merchantId)
			throws PayCheckedException;
	
	/**
	 * @description 查询支付交易订单分页信息
	 * @param page 分页信息
	 * @param searchCondition 查询条件
	 *          必填：optCode 操作编码、querySideId 查询方custid 
	 *          可选条件：paymentId 支付系统订单号、businessSn 客户系统口水、
	 *          productType 业务类型、queryBeginOrderAmt 查询支付金额开始、
	 *          queryEndOrderAmt 查询支付金额截止、orderStatus 订单状态、
	 *          queryBeginCreateDate 查询创建日期开始、queryEndCreateDate 查询创建日期截止、
	 *          otherSideName 对方名称
     * @throws PayCheckedException 
	 * @return  
	 * @author YG.HU
	 * @date 2012-11-9
	 */
	public ListPage<PaymentOrderDTO> findPaymentOrderListPage(ListPage<PaymentOrderDTO> page,
	        PaymentOrderDTO searchCondition)throws PayCheckedException;
	/**
	 * @description 查询支付交易订单明细
	 * @param paymentId
	 * @return
	 * @throws PayCheckedException  
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public PaymentOrderDTO findPaymentOrder(String paymentId) throws PayCheckedException;
	
	/**
	 * @description 根据支付订单查询支付交易订单明细
	 * @param payId
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-2
	 */
	public PaymentOrderDTO findPaymentOrderByPayId(String payId) throws PayCheckedException;
	
	/**
	 * @description 查询支付订单状态
	 * @param businessSn
	 * @param merchantId
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-12-15
	 */
	public PaymentOrderDTO findPaymentOrderStatus(String businessSn, String merchantId)
			throws PayCheckedException;
	
	/**
	 * @description 查询支付订单状态--担保交易
	 * @param businessSn
	 * @param merchantId
	 * @return
	 * @throws PayCheckedException  
	 * @author LiuQ
	 * @date 2013-9-25
	 */
	public PaymentOrderDTO findPaymentOrderStatusForGuarantee(String businessSn, String merchantId)
			throws PayCheckedException;
	
	/**
	 * @description 查询支付订单分页信息
	 * @param page 分页信息
	 * @param searchCondition 查询条件
	 *         必填：optCode 操作编码、querySideId 查询方custid 
	 *         可选条件：payId 支付订单号、tradeId 交易订单号、
	 *         tradeType 交易类型、payStatus 支付订单状态、
	 *         dealCode 步骤编码、accountCode 记账编码、
	 *         productType 业务类型、查询方id querySideId、
	 *         queryBeginUpdateDate 查询创建日期开始、queryEndUpdateDate 查询创建日期截止
	 * @throws PayCheckedException        
	 * @return  
	 * @author YG.HU
	 * @date 2012-11-9
	 */
	public ListPage<PayOrderDTO> findPayOrderListPage(ListPage<PayOrderDTO> page,
	        PayOrderDTO searchCondition) throws PayCheckedException;
	/**
	 * @description 查询支付订单附带交易详情分页查询
     * @param page 分页信息
     * @param searchCondition 查询条件
     *         必填：optCode 操作编码、querySideId 查询方custid 
     *         可选条件：payId 支付订单号、tradeId 交易订单号、
     *         tradeType 交易类型、payStatus 支付订单状态、
     *         dealCode 步骤编码、accountCode 记账编码、
     *         productType 业务类型、查询方id querySideId、
     *         queryBeginUpdateDate 查询创建日期开始、queryEndUpdateDate 查询创建日期截止
     * @throws PayCheckedException      
	 * @author YG.HU
	 * @date 2012-12-13
	 */
	public ListPage<PayOrderDTO> findPayOrderExtListPage(ListPage<PayOrderDTO> page,
            PayOrderDTO searchCondition) throws PayCheckedException;
	/**
	 * @description 查询支付订单明细
	 * @param payId
	 * @return
	 * @throws PayCheckedException  
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public PayOrderDTO findPayOrder(String payId) throws PayCheckedException;
	
	/**
	 * @description 查询提现交易订单分页信息
	 * @param page 分页信息
	 * @param searchCondition 查询条件
	 *         必填：optCode 操作编码、custId 提现客户号
	 *         可选条件：withdrawId 提现订单编号、businessSn 业务流水号、
	 *         productType 业务类型、orderStatus 订单状态、
	 *         custName 提现客户名称、feeStatus 计费状态、
	 *         queryBeginCreateDate 查询创建时间起始、queryEndCreateDate、查询创建时间终止
	 * @throws PayCheckedException 
	 * @return  
	 * @author YG.HU
	 * @date 2012-11-9
	 */
	public ListPage<WithdrawOrderDTO> findWithdrawOrderListPage(ListPage<WithdrawOrderDTO> page,
	        WithdrawOrderDTO searchCondition) throws PayCheckedException;      
	/**
	 * @description 查询提现交易订单明细
	 * @param withdrawId
	 * @return
	 * @throws PayCheckedException  
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public WithdrawOrderDTO findWithdrawOrder(String withdrawId) throws PayCheckedException;
	
	/**
	 * @description 根据支付订单查询提现交易订单明细
	 * @param payId
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-2
	 */
	public WithdrawOrderDTO findWithdrawOrderByPayId(String payId) throws PayCheckedException;
	
	
	/**
	 * @description 查询交易汇总信息
	 * @param tradeCollectInfoDTO
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-21
	 */
	public TradeCollectInfoDTO findTradeCollectInfo(TradeCollectInfoDTO tradeCollectInfoDTO) throws PayCheckedException; 
	
	/**
	 * @description 查询业务类型明细信息
	 * @param tradeDate
	 * @return  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-1
	 */
	public List<TradeReportByOptTypeDTO> findTradeReportByOptType(String tradeDate) throws PayCheckedException;
	
	/**
	 * @description 查询商户结算
	 * @param merchantClearReportDTO
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-9
	 */
	public MerchantClearReportDTO findMerchantClearReport(MerchantClearReportDTO merchantClearReportDTO) 
			throws PayCheckedException;
	
	/**
	 * @description 查询商户计费汇总信息
	 * @param merchantClearReportDTO
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-9
	 */
	public MerchantClearReportDTO findMerchantFeeReport(MerchantClearReportDTO merchantClearReportDTO) 
			throws PayCheckedException;
	
	/**
	 * @description 根据批次ID查询批次信息
	 * @param id
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-9
	 */
	public WithdrawBatchConfirmDTO getWithdrawBatchConfirmById(String id) throws PayCheckedException ;
	
	/**
	 * 
	 * @description：
	 * @param merchantId
	 * @param businessSn
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-14
	 */
	public WithdrawOrderDTO findByBusiSn(String merchantId, String businessSn)throws PayCheckedException;
	
	/***
	 * 查询商户交易订单
	 * @description 
	 * @param page
	 * @param searchCondition
	 * @return  
	 * @author lyg
	 * @date 2013-7-16
	 */
	public ListPage<MerchantOrderDTO> findMerchantOrderListPage(ListPage<MerchantOrderDTO> page, MerchantOrderDTO searchCondition); 
	
	/**
	 * @description 查询支付订单状态--支持快捷支付订单查询渠道状态
	 * @param businessSn
	 * @param merchantId
	 * @return
	 * @throws PayCheckedException  
	 * @author LiuQ
	 * @date 2013-11-22
	 */
	public PaymentOrderDTO findPaymentOrderStatusForShort(String businessSn, String merchantId)
			throws PayCheckedException;
	
	/**
	 * @description  金汇宝支付状态查询
	 * @param businessSn 申购订单号
	 * @param merchantId 机构号
	 * @param payType    充值类型 
	 * @throws 
	 * @author wanglei
	 * @date 2014-1-10
	 */
	public JhbTimelySubscribeDTO findJhbTimelySubscribeStatus(String businessSn, String merchantId, String payType)
			throws PayCheckedException;

	/**
	 * @description 快速提现次数查询
	 * @param  withdrawOrderDTO 查询条件
	 *         必填：optCode 操作编码、custId 提现客户号
	 *         可选条件：withdrawId 提现订单编号、businessSn 业务流水号、
	 *         productType 业务类型、orderStatus 订单状态、
	 *         custName 提现客户名称、feeStatus 计费状态、
	 *         queryBeginCreateDate 查询创建时间起始、queryEndCreateDate、查询创建时间终止
	 * @throws 
	 * @author wuruijin
	 * @date 2014-4-3
	 */
	public int findWithdrawOrderCount(WithdrawOrderDTO withdrawOrderDTO)
			throws PayCheckedException;
}
