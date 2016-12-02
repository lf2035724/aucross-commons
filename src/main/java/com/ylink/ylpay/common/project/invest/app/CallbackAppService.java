package com.ylink.ylpay.common.project.invest.app;
/**
 * @author wanglei
 * @date 2014-10-23
 * @description：慧投前置回调接口
 */
public interface CallbackAppService {
	
	/**
	  * @description 慧投申购款划拨完成回调接口
	  * @param investCode 商户号
	  * @param settleMentDate 结算日期
	  * @param batchNo 批次号
	  * @return void
	  * @author wanglei
	  * @date 2014-10-23
	 */
	void subscriptionPayCallBack(String investCode,String settleMentDate,String batchNo);
}
