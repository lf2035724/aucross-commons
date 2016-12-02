/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-27
 */

package com.ylink.ylpay.common.project.pay.app;


import com.ylink.ylpay.common.project.pay.dto.GatewayChannelInfoDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayFundRechargeDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayFundReturnInfoDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayRechargeDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayReturnInfoDTO;
import com.ylink.ylpay.common.project.pay.dto.OfflineRechargeDTO;
import com.ylink.ylpay.common.project.pay.dto.ShortcutRechargeDTO;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-27
 * @description：充值对外服务接口
 */

public interface RechargeAppService {
	
	/**
	 * @description 网关充值请求
	 * @param gatewayRechargeDTO 网关充值信息DTO
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-10-29
	 */
	public GatewayReturnInfoDTO gatewayRecharge(GatewayRechargeDTO gatewayRechargeDTO,
	        GatewayChannelInfoDTO gatewayChannelInfoDTO) 
		throws PayCheckedException;
	
	/**
	 * @description 基金网关充值请求
	 * @param gatewayFundRechargeDTO 基金网关充值信息DTO
	 * @return
	 * @throws PayCheckedException  
	 * @author yu.han
	 * @date 2013-1-28
	 */
	public GatewayFundReturnInfoDTO gatewayFundRecharge(GatewayFundRechargeDTO gatewayFundRechargeDTO,
	        GatewayChannelInfoDTO gatewayChannelInfoDTO) 
		throws PayCheckedException;
	
	/**
	 * @description 快捷充值请求处理
	 * @param ShortcutRechargeDTO 快捷充值信息DTO
	 * @return 充值订单号
	 * @throws PayCheckedException  
	 * @author YG.HU
	 * @date 2012-10-29
	 */
	public String shortCutRecharge(ShortcutRechargeDTO shortCutRechargeDTO) 
	    throws PayCheckedException;
	
	/**
	 * @description 清除可回退余额
	 * @throws PayCheckedException  
	 * @author YG.HU
	 * @date 2012-12-6
	 */
	public void cleanUpCanRollBackAMT() throws PayCheckedException;
	
	/**
	 * @description 线下充值请求处理
	 * @param offlineRechargeDTO
	 * @return
	 * @throws PayCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-17
	 */
	public String offlineRecharge(OfflineRechargeDTO offlineRechargeDTO) 
	    throws PayCheckedException;
}
