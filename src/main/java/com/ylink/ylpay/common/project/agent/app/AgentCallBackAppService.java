package com.ylink.ylpay.common.project.agent.app;

import com.ylink.ylpay.common.project.agent.dto.PayCallBackDTO;
import com.ylink.ylpay.common.project.agent.exception.AgentCheckedException;

/**
 * @author wanglei
 * @date 2014-5-9
 * @description：缴费系统回调服务接口（缴费单销帐结果回调，支付完成回调，缴费单查询结果回调）
 */
public interface AgentCallBackAppService {
	
	/**
	  * @description 缴费支付完成时提供给支付系统的回调接口
	  * @param 
	  * @return void
	  * @author wanglei
	  * @date 2014-5-26
	 */
	void payCallBack(PayCallBackDTO pcbDto) throws AgentCheckedException;
	void cebbChargeOffCallBack(String repMsg) throws AgentCheckedException;
}
