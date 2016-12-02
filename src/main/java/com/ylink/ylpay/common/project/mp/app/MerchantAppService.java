package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.constant.CustType;
import com.ylink.ylpay.common.project.mp.constant.OptType;
import com.ylink.ylpay.common.project.mp.constant.ProjectOrderType;
import com.ylink.ylpay.common.project.mp.dto.Merchant;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 商户接口.
 * 
 * @author 潘瑞峥
 * @date 2012-11-6
 */
public interface MerchantAppService {

	/**
	 * 根据商户ID查询商户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.4.1</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param merchantId
	 * @return
	 * @throws MpCheckedException
	 */
	public Merchant getMerchantById( String merchantId ) throws MpCheckedException;

	/**
	 * 根据商户code查询商户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.4.4</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param code
	 * @return
	 * @throws MpCheckedException
	 */
	public Merchant getMerchantByCode( String code ) throws MpCheckedException;

	/**
	 * 查询商户及证书.( 暂时去掉, 与上方法合并 )
	 * 
	 * <pre>
	 * 接口: <b>2.4.2</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param merchantId
	 * @return
	 * @throws MpCheckedException
	 */
	// public Merchant getWithDigitalCertificate( String merchantId ) throws MpCheckedException;

	/**
	 * 查询商户交易类型.
	 * 
	 * <pre>
	 * 接口: <b>2.4.3</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param merchantId
	 * @return
	 * @throws MpCheckedException
	 */
	public List<OptType> listBusinessType( String merchantId ) throws MpCheckedException;

	/**
	 * 查询所有商户
	 * 
	 * @description
	 * @return
	 * @throws MpCheckedException
	 * @author YangXiaojin
	 * @date 2012-12-7
	 */
	public List<Merchant> listAll() throws MpCheckedException;

	/**
	 * 根据商户类型查询商户信息.
	 */
	public List<Merchant> list( CustType type ) throws MpCheckedException;

	/**
	 * 查询除开证联融通和虚拟商户的所有商户.
	 * 
	 * @return
	 * @throws MpCheckedException
	 */
	public List<Merchant> listNotSelf() throws MpCheckedException;
	
	/**
	 * 根据企业客户编号和产品类型查询商户信息
	 * @param custId 企业客户编号
	 * @param custType 产品类型 对应枚举(com.ylink.ylpay.common.project.mp.constant.CustType)
	 * @return
	 * @throws MpCheckedException
	 */
	public Merchant getMerchantByCustId(String custId,CustType custType) throws MpCheckedException;

	/**
	 * 根据商户编号查询商户所属机构对应企业的对应商户信息
	 * @param merchantCode 商户编号
	 * @return Merchant
	 * @throws MpCheckedException
	 */
	public Merchant getEnterpriseMerchantOfAgencyByMerchantCode(String merchantCode) throws MpCheckedException;
	
	/**
	 * 查询商户交易接口.
	 * 
	 * <pre>
	 * 接口: <b>2.4.3</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param merchantId
	 * @return
	 * @throws MpCheckedException
	 */
	public List<ProjectOrderType> listProjectOrderType( String merchantId ) throws MpCheckedException;
}