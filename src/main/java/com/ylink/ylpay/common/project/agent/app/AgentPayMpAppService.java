package com.ylink.ylpay.common.project.agent.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.agent.dto.AgentPayDTO;
import com.ylink.ylpay.common.project.agent.dto.AgentPayDetailDTO;
import com.ylink.ylpay.common.project.agent.exception.AgentCheckedException;

/**
 * @author wanglei
 * @date 2014-7-23
 * @description：缴费明细管理APP
 */
public interface AgentPayMpAppService {
	/**
	  * @description 缴费明细列表查询
	  * @param 
	  * @return ListPage<AgentPayDTO>
	  * @author wanglei
	  * @date 2014-7-23
	 */
	ListPage<AgentPayDTO> agentPayList(ListPage<AgentPayDTO> page, AgentPayDTO apDto) throws AgentCheckedException;
	
	/**
	  * @description 按agentPaySn查询AgentPayDetail
	  * @param 
	  * @return AgentPayDetailDTO
	  * @author wanglei
	  * @date 2014-7-23
	 */
	AgentPayDetailDTO agentPayDetailQueryByAgentPaySn(AgentPayDetailDTO apdDto) throws AgentCheckedException;
}
