/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:neven.Yang 2013-4-3
 */

/**中行网银支付退款
 * RefundZlEBankAppService.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:neven.Yang 2013-4-3
 */
package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.dto.RefundEBankDTO;
import com.ylink.ylpay.common.project.channel.dto.ReturnSYSDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;

/** 中行网银支付退款
 * @author neven.Yang
 * @date 2013-4-3
 * @description：TODO
 */

/**
 * @author neven.Yang
 *
 */
public interface RefundEBankAppService {

	/***
	 * 中行网银支付退款
	 * @description 
	 * @param refundEBankDTO
	 * @return
	 * @throws ChannelCheckedException  
	 * @author neven.Yang
	 * @date 2013-4-15
	 */
	public ReturnSYSDTO refundEBank(RefundEBankDTO refundEBankDTO) throws ChannelCheckedException;
	
}



