package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.ManualRecovery;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 人工找回密码接口.
 * 
 * @author 潘瑞峥
 * @date 2013-1-4
 */
public interface ManualRecoveryAppService {

	/**
	 * 通过id查询.
	 * 
	 * @param id
	 * @return
	 * @throws MpCheckedException
	 */
	ManualRecovery find( String id ) throws MpCheckedException;

	/**
	 * 通过custId查询待审核且未找回的记录.
	 * 
	 * @param custId
	 * @return
	 * @throws MpCheckedException
	 */
	ManualRecovery findValidByCustId( String custId ) throws MpCheckedException;

	/**
	 * 新增.
	 * 
	 * @param dtoBean
	 * @throws MpCheckedException
	 */
	void save( ManualRecovery dtoBean ) throws MpCheckedException;

	/**
	 * 通过id修改为找回密码成功状态.
	 * 
	 * @param id
	 * @throws MpCheckedException
	 */
	void modifySuccess( String id ) throws MpCheckedException;

}