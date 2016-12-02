package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;

/**
 * @description 渠道对外提供的快捷付的APP
 * @author wl
 * @date 2012-10
*/

public interface RefundmentEBSAppService 
{
	/**
	 * @description 渠道对外提供的快捷付的单笔退款接口APP实现
	 * @param bankType  行别 
	 * @param money  退款金额 
	 * @param order  渠道流水
	 * @param tradeId  支付交易订单号
	 * @return String “0000” 
	 * @author wl
	 * @date 2012-10
	*/
	public String refundmentEBS(String bankType,String payType,String money ,String order,String tradeId) throws  ChannelCheckedException;
}
