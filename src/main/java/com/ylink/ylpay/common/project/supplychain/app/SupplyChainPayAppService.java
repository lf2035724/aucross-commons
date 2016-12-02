package com.ylink.ylpay.common.project.supplychain.app;

import com.ylink.ylpay.common.project.supplychain.dto.ContractDTO;
import com.ylink.ylpay.common.project.supplychain.dto.PayDTO;
import com.ylink.ylpay.common.project.supplychain.exception.SupplyChianCheckedException;

/**
 * @description 供应链对外提供的支付服务类(虚户支付、网关支付)
 * @author wanglei
 * @date 2013-9-5
*/
public interface SupplyChainPayAppService {
	
	/**
	 * @description 虚户支付
	 * @author wanglei
	 * @date 2013-9-5
	 */
	 public ContractDTO accountPayment(PayDTO dto) throws SupplyChianCheckedException;

	 /**
	  * @description 网关支付
	  * @author wanglei
	  * @date 2013-9-5
	  */
	 public ContractDTO gatewayPayment(PayDTO dto) throws SupplyChianCheckedException;
	
}
