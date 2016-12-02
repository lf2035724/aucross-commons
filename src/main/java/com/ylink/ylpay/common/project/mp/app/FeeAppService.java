package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.pay.constant.FeeType;

import com.ylink.ylpay.common.project.mp.constant.OptType;
import com.ylink.ylpay.common.project.mp.dto.FeeRuleDTO;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 手续费接口.
 * 
 * @author 潘瑞峥
 * @date 2013-3-19
 */
public interface FeeAppService {
	
	/**
	 * 判断计费类型
	 * @param merchantId 商户ID
	 * @param type 交易类型
	 */
	public FeeType getFeeType(String merchantId,OptType type);
	
	/**
	 * 事前计费
	 */
	public long calFee(OptType type,long amount);

	/**
	 * 根据商户code、计费方式(事前、事后)、OptType查询该商户的手续费模版集合.
	 * 
	 * <pre>
	 * 接口: <b>x.x.xx</b>
	 * 规则: 1.code NOT NULL; 2.way NULL; 3.optType NULL.
	 * </pre>
	 */
	public List<FeeRuleDTO> findList( String code, String way, String optType ) throws MpCheckedException;

}