package com.ylink.ylpay.common.project.supplychain.app;

import com.ylink.ylpay.common.project.supplychain.exception.SupplyChianCheckedException;

/**
 * @description 供应链对外提供的批处理服务(至到期未签署协议失效)
 * @author wanglei
 * @date 2013-9-10
*/
public interface SupplyChainBatchAppService {
	
	/**
	 * @description 至到期未签署协议失效
	 * @author wanglei
	 * @throws SupplyChianCheckedException
	 */
	public void supplyChainBatch() throws SupplyChianCheckedException;
}
