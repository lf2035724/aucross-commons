package com.ylink.ylpay.common.project.mall.app;

/** 
* @Description:产生商城前置对账文件接口服务
* @author yangchen
* @date 2013-8-29 上午9:48:42 
*/ 
public interface EstablishBillAppService {

	/** 
	* @Title: GenerateBillFile 
	* @Description: 生成各家商户的对账文件 
	* @param billDateStr 账期日'yyyyMMdd'
	* @param taskId 任务号
	* @return void
	* @throws 
	* @author yang_chen
	* @date 2013-8-29 上午9:58:30
	*/
	public void GenerateBillFile(String billDateStr, String taskId);
}
