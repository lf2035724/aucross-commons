package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.constant.CertificationType;
import com.ylink.ylpay.common.project.mp.constant.OptType;
import com.ylink.ylpay.common.project.mp.dto.CustFundsLimit;
import com.ylink.ylpay.common.project.mp.dto.Customer;
import com.ylink.ylpay.common.project.mp.dto.Personal;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 客户业务接口
 * 
 * @author Administrator
 * 
 */
public interface CustomerAppService {

	/**
	 * 修改门户客户支付密码.
	 * 
	 * <pre>
	 * 接口: <b>2.1.9</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @author 张磊
	 * @date 2012-11-01
	 * @param userId
	 * @param oldPassword
	 * @param newPassword
	 */
	public void updatePassword( String userId, String oldPassword, String newPassword ) throws MpCheckedException;

	/**
	 * 查询客户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.1.7</b>
	 * 规则: 1.NOT NULL.
	 * </pre>
	 * 
	 * @param id
	 * @return
	 */
	public Customer getCustomerInfo( String custId ) throws MpCheckedException;

	/**
	 * 保存客户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.1.7</b>
	 * 规则: 1.NOT NULL.
	 * </pre>
	 * 
	 * @param id
	 * @return
	 */
	public Personal saveCustomerInfo( Personal personal ) throws MpCheckedException;

	/**
	 * 保存客户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.1.7</b>
	 * 规则: 1.NOT NULL.
	 * </pre>
	 * 
	 * @param id
	 * @return
	 */
	public Personal updateCustomerInfo( Personal personal ) throws MpCheckedException;

	/**
	 * @description 校验支付密码
	 * @param custId
	 *            客户ID
	 * @param payPassword
	 *            支付密码
	 * @return boolean
	 * @author zhanglei
	 * @date 2012-11-20
	 */
	public boolean checkPayPassword( String custId, String payPassword ) throws MpCheckedException;

	/**
	 * 修改身份证姓名
	 * 
	 * @param custId
	 * @param idNo
	 * @param idType
	 * @param trueName
	 * @author xuwei
	 * @return
	 */
	public Personal updateCert( String custId, String idNo, String idType, String trueName ) throws MpCheckedException;

	/**
	 * 查询资金限额
	 * 
	 * @param custId
	 * @param optType
	 * @author xuwei
	 * @return
	 */
	public List<CustFundsLimit> listFundsLimit( String custId, OptType optType ) throws MpCheckedException;

	/**
	 * 修改资金限额
	 * 
	 * @param custId
	 * @param optType
	 * @param singleWarn
	 * @param singleLimit
	 * @param dayWarn
	 * @param dayLimit
	 * @return
	 * @throws MpCheckedException
	 */
	public List<CustFundsLimit> updateFundsLimit( String custId, OptType optType, Long singleWarn, Long singleLimit, Long dayWarn,
			Long dayLimit ) throws MpCheckedException;

	/**
	 * 根据姓名、证件号码、证件类型查询门户注册的有效个人客户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.2.8</b>
	 * 规则: NOT NULL.
	 * </pre>
	 * 
	 * @param name
	 * @param identityCardNumber
	 * @param type
	 * @return
	 * @throws MpCheckedException
	 * 
	 * @author 潘瑞峥
	 * @date 2013-01-15
	 */
	public List<Personal> getPersonal( String name, String identityCardNumber, CertificationType type ) throws MpCheckedException;
	
	/**
	 * 根据姓名、证件号码、认证状态查询个人客户信息.
	 * 
	 * @param name
	 * @param identityCardNumber
	 * @param certStatus
	 * @return
	 * @throws MpCheckedException
	 * 
	 * @author 潘瑞峥
	 * @date 2013-01-15
	 */
	public List<Personal> getPersonal(String identityCardNumber, String certStatus ) throws MpCheckedException;
	
	/**
	 * 根据客户编号查询客户信息
	 * @param code
	 * @return
	 * @throws Exception
	 * @author Yang
	 * date 2013-01-22
	 */
	public Customer getCustomer(String code)throws Exception;
	
	/**
	 * 根据商户编号查询客户信息
	 */
	public Customer getCustomerByMerchant(String code)throws MpCheckedException;
	
	/**
	 * 根据银行卡，创建状态，认证状态查询客户信息
	 * @description：
	 * @param bankCode
	 * @param newCardType
	 * @param isCert
	 * @return  
	 * @author LiXiPing
	 * @date 2014-1-16
	 */
	public List<Personal> getPersonalInfo(String bankCode,String newCardType,String isCert);
	
	/**
	 * 根据证件类型和号码查询客户信息
	 * @param code
	 * @return
	 * @throws Exception
	 * @author feng.li
	 * date 2014-04-28
	 */
	public Customer getCustomerByCertNOAndType(String certType,String certNO)throws Exception;

	/**
	 * 更新认证状态
	 * @description 
	 * @param custid
	 * @param flag  
	 * @author yu.han
	 * @date 2014-5-12
	 */
	void updateCertStatus(String custid, boolean flag);
}