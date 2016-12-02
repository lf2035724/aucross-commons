package com.ylink.ylpay.common.project.supplychain.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.supplychain.dto.CapitalRequirementsDTO;
import com.ylink.ylpay.common.project.supplychain.dto.CapitalSupplyDTO;
import com.ylink.ylpay.common.project.supplychain.exception.SupplyChianCheckedException;

/**
 * @description 供应链对外提供的融资服务类(融资供给信息列表查询、融资供给信息明细查询、融资供给信息审核、融资供给信息新增、融资需求信息列表查询、融资需求信息明细查询、融资需求信息审核、融资需求信息新增、获取ContractSn)
 * @author wanglei
 * @date 2013-9-5
*/
public interface SupplyChainCapitalAppService {
	
	/**
	 * @description 融资供给信息查询服务--分页查询记录
	 * @param ListPage<CapitalSupplyDTO> 
	 * @param CapitalSupplyDTO
	 * @return ListPage<CapitalSupplyDTO>
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public ListPage<CapitalSupplyDTO> capitalSupplySelectList(ListPage<CapitalSupplyDTO> page, CapitalSupplyDTO dto) throws SupplyChianCheckedException;

	/**
	 * @description 融资供给信息明细查询服务
	 * @param String messageSeq
	 * @return CapitalSupplyDTO
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public CapitalSupplyDTO capitalSupplySelectOne (String messageSeq) throws SupplyChianCheckedException;
	
	/**
	 * @description 融资供给信息审核服务
	 * @param CapitalSupplyDTO
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public void capitalSupplyAudit (CapitalSupplyDTO dto) throws SupplyChianCheckedException;
	
	/**
	 * @description 融资供给信息新增服务
	 * @param CapitalSupplyDTO
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public void capitalSupplyAdd (CapitalSupplyDTO dto) throws SupplyChianCheckedException;
	
	
	/**
	 * @description 融资需求信息查询服务--分页查询记录
	 * @param ListPage<CapitalRequirementsDTO> 
	 * @param CapitalRequirementsDTO
	 * @return ListPage<CapitalRequirementsDTO>
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public ListPage<CapitalRequirementsDTO> capitalRequirementsSelectList(ListPage<CapitalRequirementsDTO> page, CapitalRequirementsDTO dto) throws SupplyChianCheckedException;

	/**
	 * @description 融资需求信息明细查询服务
	 * @param String messageSeq
	 * @return CapitalRequirementsDTO
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public CapitalRequirementsDTO capitalRequirementsSelectOne (String messageSeq) throws SupplyChianCheckedException;
	
	/**
	 * @description 融资需求信息审核服务
	 * @param CapitalRequirementsDTO
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public void capitalRequirementsAudit (CapitalRequirementsDTO dto) throws SupplyChianCheckedException;
	
	/**
	 * @description 融资需求信息新增服务
	 * @param CapitalRequirementsDTO
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public void capitalRequirementsAdd (CapitalRequirementsDTO dto) throws SupplyChianCheckedException;
	
	/**
	 * @description 获取MessageSen  已不用
	 * @param capitalType(消息类型2：无  0：两方  1：三方)
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public String getMessageSn(String capitalType) throws SupplyChianCheckedException;
	
}
