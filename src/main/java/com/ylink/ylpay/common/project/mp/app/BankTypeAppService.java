package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.BankType;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;
/**
 * 银行信息查询接口
 * @author xuwei
 *
 */
public interface BankTypeAppService {
	
	public  BankType getBankType( String  bankType)  throws MpCheckedException;
	
}
