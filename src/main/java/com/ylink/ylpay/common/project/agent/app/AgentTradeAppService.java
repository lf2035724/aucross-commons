/**
	 * 版权所有(C) 2013 证联融通
	 * 创建:wanglei 2013-9-29
	 */
package com.ylink.ylpay.common.project.agent.app;

import com.ylink.ylpay.common.project.agent.dto.AgentBillQueryNoticeDTO;
import com.ylink.ylpay.common.project.agent.dto.AgentChargeOffDTO;
import com.ylink.ylpay.common.project.agent.dto.AgentPayQueryNoticeDTO;
import com.ylink.ylpay.common.project.agent.dto.AgentReturnDTO;
import com.ylink.ylpay.common.project.agent.dto.PayCallBackDTO;
import com.ylink.ylpay.common.project.agent.dto.PayOverNoticeDTO;
import com.ylink.ylpay.common.project.agent.exception.AgentCheckedException;

/**
 * @author wanglei
 * @date 2013-9-29
 * @description：缴费系统交易服务接口（缴费单销帐）
 */
public interface AgentTradeAppService {
	/**
	 * @description 支付完成回调缴费前置服务
	 * @throws 
	 * @author wanglei
	 * @date 2013-9-29
	 */
//	public void payOverCallBack(PayCallBackDTO pcbDto) throws AgentCheckedException;
	
	/**
	 * @description 缴费单查询结果回调
	 * @param agentBillQueryNoticeDTO
	 * @throws AgentCheckedException  
	 * @author LiuQ
	 * @date 2013-10-18
	 */
	public void queryBillCallBack(AgentBillQueryNoticeDTO agentBillQueryNoticeDTO) throws AgentCheckedException;
	
	/**
	 * @description 缴费单销账结果查询回调
	 * @param agentPayQueryNoticeDTO
	 * @throws AgentCheckedException  
	 * @author LiuQ
	 * @date 2013-10-19
	 */
	public void queryAgentPayCallBack(AgentPayQueryNoticeDTO agentPayQueryNoticeDTO) throws  AgentCheckedException;

	/**
	  * @description 缴费系统内销帐服务
	  * @param 
	  * @return AgentReturnDTO
	  * @author wanglei
	  * @date 2014-5-26
	 */
	public AgentReturnDTO agentChargeOff(AgentChargeOffDTO acoDto) throws  AgentCheckedException;
}
