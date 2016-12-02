/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 */
package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.EnterpriseAccountInfo;
import com.ylink.ylpay.common.project.mp.dto.EnterpriseAgencyInfo;
import com.ylink.ylpay.common.project.mp.dto.EnterpriseInfo;
import com.ylink.ylpay.common.project.mp.dto.EnterpriseLegalInfo;
import com.ylink.ylpay.common.project.mp.dto.PortalEnterpriseAudit;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 企业客户信息（门户）接口
 * @author yanghan
 * @date 2013-4-12
 * @description
 */
public interface PortalEnterpriseAppService {
	/**
	 * 根据企业客户编号查询审核信息
	 * @param custId 企业客户编号
	 * @return 审核信息
	 * @throws MpCheckedException 管理平台运行时发生的异常
	 */
	public PortalEnterpriseAudit getPortalEnterpriseAuditByCustId(String custId) throws MpCheckedException;
	
	/**
	 * 更新门户企业客户（企业信息部分）
	 * @param enterpriseInfo
	 */
	public void updateEnterpriseInfo(EnterpriseInfo enterpriseInfo) throws MpCheckedException;
	/**
	 * 更新门户企业客户（法人信息部分）
	 * @param enterpriseLegalInfo
	 * @throws MpCheckedException
	 */
	public void updateEnterpriseLegalInfo(EnterpriseLegalInfo enterpriseLegalInfo) throws MpCheckedException;
	/**
	 * 更新门户企业客户(对公账户信息部分) 或 换卡流程
	 * @param enterpriseAccountInfo
	 * @param isChangeCard 判断是否是换卡操作(true:换卡"走换卡流程", false:更新对公账户信息,必传)
	 * @throws MpCheckedException
	 */
	public void updateEnterpriseAccountInfoOrChangeCard(EnterpriseAccountInfo enterpriseAccountInfo,Boolean isChangeCard) throws MpCheckedException;
	/**
	 * 更新门户企业客户(代理人部分)
	 * @param enterpriseAccountInfo
	 * @throws MpCheckedException
	 */
	public void updateEnterpriseAgencyInfo(EnterpriseAgencyInfo enterpriseAgencyInfo) throws MpCheckedException;
	/**
	 * 撤销(必须审核拒绝后才能撤销);
	 * @param custId
	 * @throws MpCheckedException
	 */
	public void revocationReg(String custId) throws MpCheckedException;
}
