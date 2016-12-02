package com.ylink.ylpay.common.project.invest.app;

import java.util.Date;

/**
 * @author wanglei
 * @date 2014-8-25
 * @description：慧投前置日终服务
 */
public interface DayCutAppService {
	
	/**
	  * @description 获取下一工作日期
	  * @param 
	  * @return void
	  * @author wanglei
	  * @date 2014-8-25
	 */
	void nextDayCut();
	
	/**
	  * @description 查询日切时间
	  * @param 
	  * @return Date
	  * @author wanglei
	  * @date 2014-8-25
	 */
	Date findDayCutDate();
	
	/**
	  * @description 购买对账文件
	  * @param 
	  * @return void
	  * @author wanglei
	  * @date 2014-8-25
	 */
	void creatStatement(String taskId, String date);
}
