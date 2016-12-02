/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/** 
 * @author YangXiaojin
 * @date 2012-11-2
 * @description：TODO
 */

public interface SequenceAppService {
	
	/**
	 * 
	 * @description 取门户序列号
	 * @param length 生成长度在6-20之间，小于6按6处理，大于20当成20。
	 * @return String
	 * @author YangXiaojin
	 * @date 2012-11-2
	 */
	public String getPortalNextValue(int length ) throws MpCheckedException;

}
