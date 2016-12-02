package com.ylink.ylpay.common.project.portal.app;

import java.text.ParseException;
import java.util.Date;

import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

public interface BankPayAppService {
	
	/**
	 * 支付完成回调
	 * @param tradeId 支付订单号
	 * @param businessSn 业务流水号
	 * @param payStatus  支付状态
	 * @param payDate  支付时间
	 * @param custId   买家账户id
	 * @return 
	 * @throws PayCheckedException 
	 * @throws ParseException 
	 * @throws ParseException 
	 */
	public void bankPayCallBack(String tradeId,String businessSn,
			Date payDate,String custId,String optCode);
	/**
	 * 渠道签约回执
	 * @description 
	 * @param orderId
	 * @param bankCardId  
	 * @author yu.han
	 * @throws PortalException 
	 * @date 2013-10-19
	 */
	void bankSignCallBack(String orderId,String bankCardId) throws Exception;
	
	/**
	 * @description 股交所资金转入-网关回调
	 * @param tradeId
	 * @param businessSn
	 * @param merchantId  
	 * @author LiuQ
	 * @date 2014-3-22
	 */
	public void gateWayRechargeCallBack(String tradeId, String businessSn, String merchantId);
	
}
