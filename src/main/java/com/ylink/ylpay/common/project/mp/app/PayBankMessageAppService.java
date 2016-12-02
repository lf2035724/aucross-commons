/**
 * PayBankMessageAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */
package com.ylink.ylpay.common.project.mp.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.mp.dto.PayBankMessageDTO;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/** 
 * @author feng.li
 * @date 2013-11-7
 * @description：TODO
 */

/**
 * @author feng.li
 */
public interface PayBankMessageAppService {
	
	/**
	 * @description 根据id查询
	 * @param id
	 * @return PayBankMessageDTO
	 * @author feng.li
	 * @date 2013-11-7
	 */
	public PayBankMessageDTO getById(String id) throws MpCheckedException;
	
	/**
	 * @description 查询
	 * @param dto	optType,recevBankType,custType不能为空
	 * @return PayBankMessageDTO
	 * @author feng.li
	 * @throws Exception 
	 * @date 2013-11-7
	 */
	public PayBankMessageDTO getByDTO(PayBankMessageDTO dto) throws MpCheckedException;
	/**
	 * 查所有付款行信息
	 */
	public ListPage<PayBankMessageDTO> list(ListPage<PayBankMessageDTO> page,PayBankMessageDTO payBankMessageDTO);
	/**
	 * 保存付款行信息
	 */
	public void savePayBankMessage(PayBankMessageDTO payBankMessageDTO) throws MpCheckedException;
	/*
	 * 通过主键查询付款行信息
	 */
	public PayBankMessageDTO getOneMessage(String identity) throws MpCheckedException;
	/**
	 * 通过主键付款行信息
	 */
	public void deleteByIdentity(String identity) throws MpCheckedException;
	/**
	 * 更新付款行信息
	 */
	public void updatePayBankMessage(PayBankMessageDTO payBankMessageDTO) throws MpCheckedException;
    /**
     * 判断付款行信息是否唯一
     */
	public boolean isUniquePayBankMessage(PayBankMessageDTO payBankMessageDTO) throws MpCheckedException;
}
