package com.ylink.ylpay.common.project.supplychain.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.supplychain.dto.ContractDTO;
import com.ylink.ylpay.common.project.supplychain.exception.SupplyChianCheckedException;

/**
 * @description 供应链对外提供的协议服务类(新增协议、协议列表查询、签署协议、单笔协议查询、获取ContractSeq)
 * @author wanglei
 * @date 2013-9-5
*/
public interface SupplyChainContractAppService {
	
	/**
	 * @description 协议查询服务--分页查询记录
	 * @param ListPage<ContractDTO> 
	 * @param ContractDTO
	 * @return ListPage<ContractDTO>
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public ListPage<ContractDTO> contractSelectList(ListPage<ContractDTO> page, ContractDTO dto) throws SupplyChianCheckedException;

//	/**
//	 * @description 协议明细查询
//	 * @param String contractSeq
//	 * @return ContractDTO
//	 * @author wanglei
//	 * @date 2013-9-5
//	 */
//	public ContractDTO contractSelectOne (String contractSeq) throws SupplyChianCheckedException;
	
	/**
	 * @description 协议明细查询
	 * @param String contractSeq
	 * @param ContractType contractType
	 * @return ContractDTO
	 * @author feng.li
	 * @date 2013-9-25
	 */
	public ContractDTO contractSelectOne(String contractSeq,String contractType) throws SupplyChianCheckedException;
	
	/**
	 * @description 协议签署
	 * @param ContractDTO
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public void contractSign (ContractDTO dto) throws SupplyChianCheckedException;
	
	/**
	 * @description 新增协议
	 * @param ContractDTO
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public void contractAdd (ContractDTO dto) throws SupplyChianCheckedException;
	
	/**
	 * @description 获取ContractSeq
	 * @param contractType(协议类型1：两方  2：三方)
	 * @author wanglei
	 * @date 2013-9-5
	 */
	public String getContractSn(String contractType) throws SupplyChianCheckedException;
}
