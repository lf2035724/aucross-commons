/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.constant.OptType;
import com.ylink.ylpay.common.project.mp.dto.RiskControlDTO;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/** 
 * @author YangXiaojin
 * @date 2012-11-5
 * @description：TODO
 */

public interface RiskControlAppService {
	
	/**
	 * 
	 * @description 风险控制
	 * @param custId 客户ID
	 * @param optType 交易类型
	 * @param amount 发生金额
	 * @return true表示通过风险控制
	 * @author YangXiaojin
	 * @date 2012-11-28
	 */
	public boolean riskControl (String custId,OptType optType
			,Long amount) throws MpCheckedException;
	
	/**
	 * 
	 * @description 风险控制
	 * @param riskDTO 风控参数对象
	 * @return true表示通过风险控制
	 * @author feng.li
	 * @date 2014-11-13
	 */
	public boolean withdrawRiskControl (RiskControlDTO riskDTO) throws MpCheckedException;
	
}
