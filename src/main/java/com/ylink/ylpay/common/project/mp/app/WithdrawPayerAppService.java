/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */

/**
 * WithdrawPayerAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */
package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.WithdrawPayerDTO;
/** 
 * @author feng.li
 * @date 2013-11-7
 * @description：TODO
 */
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * @author feng.li
 */
public interface WithdrawPayerAppService {
	
	/**
	 * 保存
	 * @param withdrawId
	 */
	public void save(String withdrawId) throws MpCheckedException;
	
	/**
	 * 保存
	 * @param withdrawPayerDTO
	 */
	public void saveObject(WithdrawPayerDTO withdrawPayerDTO) throws MpCheckedException;
	
	/**
	 * 查询
	 * @param withdrawId
	 * @return WithdrawPayerDTO
	 */
	public WithdrawPayerDTO getByWithdrawId( String withdrawId ) throws MpCheckedException;

}
