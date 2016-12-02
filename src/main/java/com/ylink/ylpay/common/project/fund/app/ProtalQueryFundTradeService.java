package com.ylink.ylpay.common.project.fund.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.fund.dto.MerchantUserDTO;
import com.ylink.ylpay.common.project.fund.dto.OfflineRechargeOrderDTO;
import com.ylink.ylpay.common.project.fund.dto.RedemptionDTO;
import com.ylink.ylpay.common.project.fund.dto.TimelyRedemptionDTO;
import com.ylink.ylpay.common.project.fund.dto.TimelySubscribeDTO;

public interface ProtalQueryFundTradeService {

	/**
	 * 查询基金实时赎回列表
	 * @description：
	 * @param page
	 * @param dto
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-8
	 */
	public ListPage<TimelyRedemptionDTO> findTimelyRedemptionListPage(ListPage<TimelyRedemptionDTO> page, TimelyRedemptionDTO dto);

	/**
	 * 根据Id查询实时赎回明细
	 * @description：
	 * @param id
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-8
	 */
	public TimelyRedemptionDTO findTimelyRedemptionById(String id);
	
	/**
	 * 查询基金金汇宝支付列表
	 * @description：
	 * @param page
	 * @param dto
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-8
	 */
	public ListPage<TimelySubscribeDTO> findTimelySubscribeListPage(ListPage<TimelySubscribeDTO> page, TimelySubscribeDTO dto);

	/**
	 * 根据ID查询金汇宝支付明细
	 * @description：
	 * @param id
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-8
	 */
	public TimelySubscribeDTO findTimelySubscribeById(String id);
	
	
	/**
	 * 获取基金前置客服登录信息
	 * @description：
	 * @param userName
	 * @param passWord
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-29
	 */
	public MerchantUserDTO findMerchantUserInfo(String userName,String passWord);
	
	/**
	 * 普通赎回列表查询
	 * @description：
	 * @param page
	 * @param dto
	 * @return  
	 * @author LiXiPing
	 * @date 2014-3-28
	 */
	public ListPage<RedemptionDTO> findRedemptionListPage(ListPage<RedemptionDTO> page, RedemptionDTO dto);

	/**
	 * 根据ID查询赎回订单详情
	 * @description：
	 * @param id
	 * @return  
	 * @author LiXiPing
	 * @date 2014-3-28
	 */
	public RedemptionDTO findRedemptionById(String id);
	
	/**
	 * 充值订单列表查询
	 * @description：
	 * @param page
	 * @param dto
	 * @return  
	 * @author LiXiPing
	 * @date 2014-3-28
	 */
	public ListPage<OfflineRechargeOrderDTO> findRechargeOrderListPage(
			ListPage<OfflineRechargeOrderDTO> page, OfflineRechargeOrderDTO dto);
	
	/**
	 * 根据ID查询充值订单详情
	 * @description：
	 * @param id
	 * @return  
	 * @author LiXiPing
	 * @date 2014-3-28
	 */
	public OfflineRechargeOrderDTO findRechargeOrderById(String id);
	
}
