/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-31
 */

package com.ylink.ylpay.common.project.pay.app;

import com.ylink.ylpay.common.project.pay.dto.AsynchronousCallbackDTO;
import com.ylink.ylpay.common.project.pay.dto.BatchPayCallbackDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayCallbackDTO;
import com.ylink.ylpay.common.project.pay.dto.RefundableCallbackDTO;
import com.ylink.ylpay.common.project.pay.dto.TransferCallbackDTO;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-31
 * @description：回调对外服务接口
 */

public interface CallbackAppService {
	
	/**
	 * @description 网关回调
	 * @param gatewayCallbackDTO
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-3
	 */
	public void gatewayCallback(GatewayCallbackDTO gatewayCallbackDTO) 
		throws PayCheckedException;
	
	/**
	 * @description 批量支付回调
	 * @param batchPayCallbackDTO
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-12
	 */
	public void batchPayCallback(BatchPayCallbackDTO batchPayCallbackDTO) 
		throws PayCheckedException;
	
	/**
	 * @description 交易回退渠道回调
	 * @param refundableCallbackDTO
	 * @throws PayCheckedException  
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public void refundableCallback(RefundableCallbackDTO refundableCallbackDTO)
	    throws PayCheckedException;
	
	/**
	 * 
	 * @description 银行转账（线下）回调
	 * @param transferCallbackDTO
	 * @throws PayCheckedException  
	 * @author HuAJ
	 * @date 2012-11-15
	 */
	public void bankAccountTransferCallback( TransferCallbackDTO transferCallbackDTO) throws PayCheckedException;
	
	/**
	 * @description 线上提现结果，渠道异步通知回调
	 * @param asynchronousCallbackDTO
	 * @throws PayCheckedException  
	 * @author LiuQ
	 * @date 2013-10-28
	 */
	public void withdrawAsynchronousCallback(AsynchronousCallbackDTO asynchronousCallbackDTO) throws PayCheckedException;
}
