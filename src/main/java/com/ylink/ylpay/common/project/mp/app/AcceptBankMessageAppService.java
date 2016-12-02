/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-12
 */

/**
 * AcceptBankMessageAppService.java
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-12
 */
package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.dto.AcceptBankMessageDTO;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/** 
 * @author feng.li
 * @date 2014-11-12
 * @description：TODO 
 */

/**
 * @author feng.li 
 */
public interface AcceptBankMessageAppService{
	
	public List<AcceptBankMessageDTO> findList(AcceptBankMessageDTO dto) throws MpCheckedException;
}
