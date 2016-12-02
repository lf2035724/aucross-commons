/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.PortalBiz;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 门户业务数据接口
 * @author yanghan
 * @date 2013-3-28上午10:17:02
 * @description
 */
public interface PortalBizAppService {
	
	/**
	 * 保存门户业务数据
	 * @param portalBiz (id,value为必填项)
	 * @return ("1":表示插入;"0":更新)
	 * @throws MpCheckedException
	 */
	public String savePortalBiz(PortalBiz portalBiz) throws MpCheckedException;
	/**
	 * 根据ID查询门户业务数据
	 * @param id
	 * @return 查询的门户业务数据
	 * @throws MpCheckedException
	 */
	public PortalBiz findPortalById(String id) throws MpCheckedException; 
	
}
