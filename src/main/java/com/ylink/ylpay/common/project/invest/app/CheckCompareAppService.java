/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Leo 2013-1-7
 */

/**
 * FileHandlingService.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:Leo 2013-1-7
 */
package com.ylink.ylpay.common.project.invest.app;


/** 申购核算
 * @author lc
 * @date 2014-9-1
 * @description：TODO
 */

public interface CheckCompareAppService {

	/** 
	 * @description 申购核算heckresult表数据   
	 * @author lc
	 * @param date 
	 * @date 2014-9-11
	 */
	public void compareSubscribe();
	
	/**
	 * @赎回核算heckresult表数据
	 * @description   
	 * @author lc
	 * @param date 
	 * @date 2014-911
	 */	
	public void compareRedemption();
	
}
