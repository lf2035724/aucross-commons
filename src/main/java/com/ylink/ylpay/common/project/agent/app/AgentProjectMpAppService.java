package com.ylink.ylpay.common.project.agent.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.agent.dto.AgentProjectDTO;
import com.ylink.ylpay.common.project.agent.exception.AgentCheckedException;

/**
 * @author wanglei
 * @date 2014-7-16
 * @description：缴费项目管理APP
 */
public interface AgentProjectMpAppService {
	
	/**
	  * @description 缴费项目查询
	  * @param 
	  * @return ListPage<AgentProjectDTO>
	  * @author wanglei
	  * @date 2014-7-16
	 */
	ListPage<AgentProjectDTO> agentProjectList(ListPage<AgentProjectDTO> page, AgentProjectDTO apDto) throws AgentCheckedException;
	/**
	  * @description 关闭或打开缴费项目
	  * @param 
	  * @return void
	  * @author wanglei
	  * @date 2014-7-17
	 */
	void closeOrOpenAgentProject(AgentProjectDTO apDto) throws AgentCheckedException;
	
	/**
	  * @description 按ID查询具体缴费项目
	  * @param 
	  * @return AgentProjectDTO
	  * @author wanglei
	  * @date 2014-7-23
	 */
	AgentProjectDTO agentProjectListQueryById(AgentProjectDTO apDto) throws AgentCheckedException;
	
	/**
	  * @description 修改缴费项目信息
	  * @param 
	  * @return void
	  * @author wanglei
	  * @date 2014-7-23
	 */
	void modifyAgentProject(AgentProjectDTO apDto) throws AgentCheckedException;
	
	
}
