/**
 * OfflineRechargeAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:LiuQ 2013-12-10
 */
package com.ylink.ylpay.common.project.invest.app;


import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.invest.dto.OfflineRechargeOrderDTO;
import com.ylink.ylpay.common.project.invest.exception.InvestCheckedException;



/**
 * @author LiuQ
 * @date 2013-12-10
 * @description 线下充值服务接口
 */
public interface OfflineRechargeAppService {

	/**
	 * @description 获取所有初审的线下充值订单(成功)--初审结果
	 * @param userName
	 * @param bankCardNo
	 * @param rechargeCode
	 * @param rechargeAmt
	 * @return  
	 * @author LiuQ
	 * @date 2013-12-10
	 */
	public OfflineRechargeOrderDTO findFirstTrialOrder(String userName, String bankCardNo,
			String rechargeCode, long rechargeAmt) throws InvestCheckedException;
	
	/**
	 * @description 获取所有复审的线下充值订单(成功、失败、初审拒绝)--复审结果
	 * @param userName
	 * @param bankCardNo
	 * @param rechargeCode
	 * @param rechargeAmt
	 * @return  
	 * @author LiuQ
	 * @date 2013-12-10
	 */
	public OfflineRechargeOrderDTO findRecheckOrder(String userName, String bankCardNo,
			String rechargeCode, long rechargeAmt) throws InvestCheckedException;
	
	/**
	 * @description 根据充值码、银行卡号、客户名称、充值金额获取线下充值订单
	 * @param userName
	 * @param bankCardNo
	 * @param rechargeCode
	 * @param rechargeAmt
	 * @return  
	 * @author LiuQ
	 * @date 2013-12-10
	 */
	public OfflineRechargeOrderDTO findOfflineRechargeOrderByCode(String userName, String bankCardNo,
			String rechargeCode, long rechargeAmt) throws InvestCheckedException;
	
	/**
	 * @description 初审
	 * @param id
	 * @param result
	 * @param message
	 * @param checker
	 * @throws FundCheckedException  
	 * @author LiuQ
	 * @date 2014-3-13
	 */
	public void firstTrial(String id, String result, String message, String checker) throws InvestCheckedException;
	
	/**
	 * @description 复审
	 * @param id
	 * @param result
	 * @param message
	 * @param checker
	 * @throws FundCheckedException  
	 * @author LiuQ
	 * @date 2014-3-13
	 */
	public void recheck(String id, String result, String message, String checker) throws InvestCheckedException;
	
	/**
	 * @description 分页查询线下充值记录
	 * @param pages
	 * @param dto
	 * @return  
	 * @author LiuQ
	 * @date 2013-12-18
	 */
	public ListPage<OfflineRechargeOrderDTO> findOfflineRechargeOrderListPage(
			ListPage<OfflineRechargeOrderDTO> page, OfflineRechargeOrderDTO dto);
	
	/**
	 * @description 发送线下资金转入回执
	 * @param orderId  
	 * @author LiuQ
	 * @date 2014-3-15
	 */
	public void sendResult(String orderId);
}
