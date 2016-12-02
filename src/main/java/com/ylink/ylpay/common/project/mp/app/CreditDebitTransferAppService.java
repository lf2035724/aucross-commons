/**
 * 版权所有(C) 2013 证联融通
 * 创建:jf.zhao 2013-9-3
 */
package com.ylink.ylpay.common.project.mp.app;

/**
 * @author jf.zhao
 * @date 2013-9-3
 * @description：资金划拨接口
 */
public interface CreditDebitTransferAppService {


	/**
	 * 
	 * @description 按照id 更新单笔借贷转账 状态
	 * @param  status参见TransferAuditStatus 状态
	 * @throws
	 * @author jf.zhao
	 * @date 2013-9-3
	 */
	public void updateCreditDebitTransferStatusById(String id, String status);

}
