/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-28
 */

/**
 * AuthMoneyAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-28
 */
package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.AuthMoneyDTO;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/** 
 * @author feng.li
 * @date 2013-10-28
 * @description：管理平台授信控制接口
 */

/**
 * @author feng.li
 */
public interface AuthMoneyAppService {
	
	/**
	 * 根据客户号查询授信信息
	 * 
	 * @param custId
	 * @return AuthMoneyDTO
	 */
	public AuthMoneyDTO getAuthMoneyByCustId(String custId);
	
	/**
	 * 增加赎回可用额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void addRedeemUsedAuthMoney(String custId,Long money) throws MpCheckedException;
	
	/**
	 * 减少赎回可用额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void reduceRedeemUsedAuthMoney(String custId,Long money) throws MpCheckedException;
	
	/**
	 * 增加支付可用额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void addPayUsedAuthMoney(String custId,Long money) throws MpCheckedException;
	
	/**
	 * 减少支付可用额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void reducePayUsedAuthMoney(String custId,Long money) throws MpCheckedException;
}
