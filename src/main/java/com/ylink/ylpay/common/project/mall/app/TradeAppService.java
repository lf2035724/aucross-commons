package com.ylink.ylpay.common.project.mall.app;

/** 
* @Description:商城前置提供的查询交易
* @author yangchen
* @date 2013-9-5 下午3:33:10 
*/ 
public interface TradeAppService {

	/** 
	* @Title: queryTradeOrder 
	* @Description: 在一代和二代前置库中查询订单 
	* @param seriNo 前置流水号
	* @return int 0--两个表都不存在，1--数据存在于一代库，2--数据存在于二代库
	* @throws Exception
	* @author yang_chen
	* @date 2013-9-5 下午3:36:29
	*/
	public int queryTradeOrder(String seriNo) throws Exception;
}
