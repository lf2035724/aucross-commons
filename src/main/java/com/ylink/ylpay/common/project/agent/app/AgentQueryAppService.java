package com.ylink.ylpay.common.project.agent.app;

import com.ylink.ylpay.common.project.agent.dto.AgentBillQueryDTO;
import com.ylink.ylpay.common.project.agent.dto.AgentReturnDTO;
import com.ylink.ylpay.common.project.agent.exception.AgentCheckedException;

/**
 * @author wanglei
 * @date 2014-5-9
 * @description：缴费系统查询服务接口（缴费单查询、销帐结果查询）
 */
public interface AgentQueryAppService {
	
	/**
	  * @description 缴费单查询服务
	  * @param AgentBillQueryDTO
	  * @return AgentReturnDTO
	  * @author wanglei
	  * @date 2014-5-9
	 */
	AgentReturnDTO queryAgentBill(AgentBillQueryDTO abqDto) throws AgentCheckedException;
}
