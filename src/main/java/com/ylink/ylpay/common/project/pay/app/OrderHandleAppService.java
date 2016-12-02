/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-16
 */

package com.ylink.ylpay.common.project.pay.app;

import java.util.List;

import com.ylink.ylpay.common.project.pay.dto.AdditionalRecordDTO;
import com.ylink.ylpay.common.project.pay.dto.OrderReverseDTO;
import com.ylink.ylpay.common.project.pay.dto.PaymentOrderRevokeDTO;
import com.ylink.ylpay.common.project.pay.dto.PreAccountBookReturnDTO;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-11-16
 * @description：订单处理对外服务接口
 */

public interface OrderHandleAppService {
	
	/**
	 * @description 撤单请求
	 * @param tradeId
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-16
	 */
	public void markPaymentOrderRevoke(String tradeId) throws PayCheckedException;
	
	/**
	 * @description 执行撤单操作
	 * @param tradeId
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-16
	 */
	public String executePaymentOrderRevoke(PaymentOrderRevokeDTO paymentOrderRevokeDTO) throws PayCheckedException;
	
	/**
	 * @description 冲正交易订单下已记账的支付订单
	 * 				tradeId、reconFlag必填
	 * @param orderReverseDTO  
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-27
	 */
	public void reversePayOrder(OrderReverseDTO orderReverseDTO) throws PayCheckedException;
	
	/**
	 * @description 冲正该支付订单
	 * 				payId、reconFlag必填
	 * @param orderReverseDTO  
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-27
	 */
	public void reverseOnlyPayOrder(OrderReverseDTO orderReverseDTO) throws PayCheckedException;
	
	/**
	 * @description 查询冲正预记账
	 * @param tradeId
	 * @return  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-2
	 */
	public List<PreAccountBookReturnDTO> findReversePreAcct(String tradeId, String tradeType) 
			throws PayCheckedException;;
	
	/**
	 * @description 补录
	 * @param additionalRecordDTO
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-27
	 */
	public String additionalRecord(AdditionalRecordDTO additionalRecordDTO) 
			throws PayCheckedException;
	
	/**
	 * @description 查询补录预记账
	 * @param additionalRecordDTO
	 * @return  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-2
	 */
	public List<PreAccountBookReturnDTO> findAdditionalRecordPreAcct(
			AdditionalRecordDTO additionalRecordDTO) throws PayCheckedException;
	
	/**
	 * @description 查询充值回退预记账
	 * @param custId
	 * @param optCode
	 * @param orderAmt
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-2
	 */
	public List<PreAccountBookReturnDTO> findRechargeRollbackApplyPreAcct(
			String custId, String optCode, long orderAmt) throws PayCheckedException;
	
	/**
	 * @description 修改支付订单和对应的交易订单状态为"成功"
	 * @param payId  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-8
	 */
	public void updateTradeAndPayOrderSuccStatus(String payId) throws PayCheckedException;
	
	/**
	 * @description 修改冲正支付订单和对应的交易订单状态为"成功"
	 * @param payId  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-8
	 */
	public void updateTradeAndReversePayOrderSuccStatus(String payId) throws PayCheckedException;
	
	/**
	 * @description 更新支付订单状态为“成功”
	 * @param payId  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-8
	 */
	public void updatePayOrderSuccStatus(String payId) throws PayCheckedException;
}
