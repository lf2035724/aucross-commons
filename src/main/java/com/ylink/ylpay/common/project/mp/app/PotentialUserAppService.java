package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.PotentialUser;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 潜在客户接口.
 * 
 * @author 潘瑞峥
 * @date 2012-10-29
 */
public interface PotentialUserAppService {

	/**
	 * 保存潜在客户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.1.6</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param id
	 * @param email
	 * @param mobile
	 * @throws MpCheckedException
	 */
	public void savePotentialUser( String id, String email, String mobile ) throws MpCheckedException;

	/**
	 * 查询潜在客户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.1.7</b>
	 * 规则: 1.NOT NULL.
	 * </pre>
	 * 
	 * @param id
	 * @return
	 */
	public PotentialUser getPotentialUser( String id ) throws MpCheckedException;

	/**
	 * 激活潜在客户.
	 * 
	 * <pre>
	 * 接口: <b>2.1.7</b>
	 * 规则: 1.NOT NULL.
	 * </pre>
	 * 
	 * @param id
	 */
	public void activePotentialUser( String id ) throws MpCheckedException;

}