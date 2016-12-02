package com.ylink.ylpay.common.project.fund.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.fund.dto.MerchantUserDTO;
import com.ylink.ylpay.common.project.fund.dto.TimelyBillReconDTO;
import com.ylink.ylpay.common.project.fund.dto.TimelyRedemptionDTO;
import com.ylink.ylpay.common.project.fund.dto.TimelySubscribeDTO;

public interface QueryFundTimelyService {

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
	 * 查询基金交易汇总列表
	 * @description：
	 * @param page
	 * @param dto
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-8
	 */
	public ListPage<TimelyBillReconDTO> findTimelyBillReconListPage(ListPage<TimelyBillReconDTO> page, TimelyBillReconDTO dto);

	/**
	 * 根据ID查询基金交易汇总明细
	 * @description：
	 * @param id
	 * @return  
	 * @author LiXiPing
	 * @date 2013-11-8
	 */
	public TimelyBillReconDTO findTimelyBillReconById(String id);
	
	/**
	 * 修改基金前置汇总状态
	 * @description：
	 * @param timelyBillReconDTO  
	 * @author LiXiPing
	 * @date 2013-11-14
	 */
	public void updateTimelyBillRecon(TimelyBillReconDTO timelyBillReconDTO);
	
	/**
	 * 金汇宝信息查询接口
	 * @description：
	 * @param instuid 商户号
	 * @param liqDate 结算日期
	 * @param redeemFundSeqId 赎回请求流水号
	 * @return  TimelySubscribeDTO
	 * @author LiXiPing
	 * @date 2013-11-20
	 */
	public TimelySubscribeDTO findTimelySubscribeBySeqId(String instuid,String liqDate,String redeemFundSeqId);
	
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
}
