package com.ylink.ylpay.common.project.channel.app;

import com.ylink.ylpay.common.project.channel.dto.HeadSavaPayDataDTO;


/**
 * 快捷付对账
 * @author neven.Yang
 *
 */
public interface CompareAccountEBSAppService {
	
	/***
	 * 快捷付对账
	 * @description 
	 * @param headSavaPayDataDTO
	 * @return
	 * @author neven.Yang
	 * @date 2013-3-23
	 */
	public String CompareAccountEBS(HeadSavaPayDataDTO headSavaPayDataDTO) ; 
	}
