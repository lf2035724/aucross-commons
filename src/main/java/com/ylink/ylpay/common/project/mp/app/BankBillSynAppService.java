package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.channel.dto.SavaPayDataDTO;

/**
 * 
 * @author YangXiojin
 * @date 2013-4-9
 * 
 */
public interface BankBillSynAppService {
	
	/**
	 * 银行对账数据回调通知（网银）
	 */
	public void callbackForSynBankBill( List<SavaPayDataDTO> results );

}
