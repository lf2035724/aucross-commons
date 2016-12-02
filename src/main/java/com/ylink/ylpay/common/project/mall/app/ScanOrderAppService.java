/**
 * ScanOrderAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:LiuQ 2013-7-30
 */
package com.ylink.ylpay.common.project.mall.app;

/**
 * @author LiuQ
 * @date 2013-7-30
 * @description 
 */
public interface ScanOrderAppService {

	/**
	 * @description 扫描订单服务接口,扫描所有的非终态订单，
	 * 并逐级更新订单状态。(最终依据为银行状态)每笔订单做多扫描3次。
	 * @author LiuQ
	 * @date 2013-7-30
	 */
	public void scanAndCheckOrders();
}
