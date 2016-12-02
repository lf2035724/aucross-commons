/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-26
 */

/**
 * DayCutAppService.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-26
 */
package com.ylink.ylpay.common.project.fund.app;

import java.util.Date;

/** 
 * @author Leo
 * @date 2012-12-26
 * @description：修改下一工作日接口
 */
public interface DayCutAppService {
	/**
	 * 获取下一工作日
	 * @description 
	 * @author Leo
	 * @date 2012-12-26
	 */
	 
	public void nextDayCut();
	
	/**
	 * 产生对账文件
	 * @description   
	 * @author Leo
	 * @param date 
	 * @date 2013-1-5
	 */
	public void creatStatement(String taskId, String date);
	
	/**
	 * 生成赎回对账文件
	 * @description：
	 * @param taskId
	 * @param date  
	 * @author LiXiPing
	 * @date 2013-11-6
	 */
	public void creatRedemStatement(String taskId, String date);
	
	/**
	 * @description 产生股交所资金转入转出对账文件
	 * @param taskId
	 * @param date  
	 * @author LiuQ
	 * @date 2014-3-15
	 */
	public void createStockStatement(String taskId, String date);
	
	/**
	 * 
	 * @description：
	 * @return  
	 * @author LiXiPing
	 * @date 2014-6-25
	 */
	public Date findDayCutDate();
}
