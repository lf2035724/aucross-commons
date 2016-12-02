package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.constant.EnterLinkStatus;
import com.ylink.ylpay.common.project.mp.dto.Enterprise;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 企业客户接口.
 * 
 * @author 潘瑞峥
 * @date 2013-3-26
 */
public interface EnterpriseAppService {

	/**
	 * 保存企业客户.
	 * 
	 * <pre>
	 * 接口: <b>x.x.x</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 */
	public Enterprise save( Long userId, Enterprise enterpriseDto ) throws MpCheckedException;
	
	/**
	 * 根据企业客户编号查询企业客户信息
	 * @author YangHan
	 * @param custId
	 * @return
	 * @throws MpCheckedException
	 */
	public Enterprise getEnterpriseByCustId(String custId) throws MpCheckedException;
	
	/**
	 * 更改企业通开通状态
	 */
	public Enterprise updateEnterLinkStatus(String custId,EnterLinkStatus enterLinkStatus) throws MpCheckedException;
	
	/**
	 * 开通企业通
	 * @param custId
	 * @param ifOpenEnterLink 0未开通 1已开通
	 * @return Enterprise
	 * @throws MpCheckedException
	 */
	public Enterprise openEnterLink(String custId,String ifOpenEnterLink) throws MpCheckedException;
	
	/**
	 * 查询所有企业通用户
	 * @param page
	 * @return dto
	 * @throws MpCheckedException
	 */
	public List<Enterprise> findListPage(Enterprise dto) throws MpCheckedException;

	/**
	 * 根据客户绑定的银行卡查询客户信息
	 * @description 
	 * @param bankCard
	 * @param isCert
	 * @return
	 * @throws MpCheckedException  
	 * @author yu.han
	 * @date 2014-4-16
	 */
	List<Enterprise> findByBankcard(String bankCard, String isCert) throws MpCheckedException;
}