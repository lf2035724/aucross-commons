package com.ylink.ylpay.common.project.fund.app;

public interface ScanTimelyOrderStatusAppService {

	/**
	 * 实时赎回、金汇宝支付、普通申购定时扫描接口
	 * @description：  
	 * @author LiXiPing
	 * @date 2013-11-28
	 */
	public void scanTimlyCheckOrders();
	
	/**
	 * 实时赎回定时扫描
	 * @description：  
	 * @author LiXiPing
	 * @date 2013-11-28
	 */
	public void scanTimelyRedemption(String liqdate);
}
