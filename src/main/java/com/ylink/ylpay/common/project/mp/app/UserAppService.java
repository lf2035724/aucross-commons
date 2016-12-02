package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.channel.constant.BankType;
import com.ylink.ylpay.common.project.mp.constant.CertificationType;
import com.ylink.ylpay.common.project.mp.dto.CompanyCustomer;
import com.ylink.ylpay.common.project.mp.dto.Personal;
import com.ylink.ylpay.common.project.mp.dto.User;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 登录帐户业务接口
 * 
 * @author YangXiaojin
 * 
 */
public interface UserAppService {

	/**
	 * @description 用户认证接口
	 * @param loginName
	 *            手机号邮箱或登录名称
	 * @return User
	 * @author YangXiaojin
	 * @date 2012-10-29
	 */
	public User getAuthentication( String loginName ) throws MpCheckedException;

	/**
	 * @description 用户授权接口
	 * @param loginName
	 *            手机号邮箱或登录名称
	 * @return List<String>
	 * @author YangXiaojin
	 * @date 2012-10-29
	 */
	public List<String> getAuthorization( String loginName ) throws MpCheckedException;

	/**
	 * @description 通过手机号查门户登录帐户
	 * @param mobile
	 *            手机号
	 * @return User
	 * @author YangXiaojin
	 * @date 2012-10-26
	 */
	public User getByMobile( String mobile ) throws MpCheckedException;

	/**
	 * @description 通过邮箱查门户登录帐户
	 * @param email
	 *            邮箱
	 * @return User
	 * @author YangXiaojin
	 * @date 2012-10-26
	 */
	public User getByEmail( String email ) throws MpCheckedException;

	/**
	 * 验证门户登录账户是否存在该手机号.
	 * 
	 * <pre>
	 * 接口: <b>2.1.1</b>
	 * 规则: 1.NOT NULL; 2.11位; 3.数字格式.
	 * </pre>
	 * 
	 * @author 潘瑞峥
	 * @date 2012-10-29
	 * @param mobile
	 * @return
	 */
	public boolean isExistMobile( String mobile ) throws MpCheckedException;

	/**
	 * 验证门户登录账户是否存在该邮箱.
	 * 
	 * <pre>
	 * 接口: <b>2.1.2</b>
	 * 规则: 1.NOT NULL; 2.邮箱格式.
	 * </pre>
	 * 
	 * @author 潘瑞峥
	 * @date 2012-10-29
	 * @param email
	 * @return
	 */
	public boolean isExistEmail( String email ) throws MpCheckedException;

	/**
	 * 查询用户信息及关联的客户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.1.5</b>
	 * 规则: NOT NULL.
	 * </pre>
	 * 
	 * @param loginName
	 * @return
	 */
	public User getWithCustomer( String loginName ) throws MpCheckedException;

	/**
	 * 个人手机注册.
	 * 
	 * <pre>
	 * 接口: <b>2.1.9</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param mobile
	 * @param name
	 * @param certificationType
	 * @param certificationNo
	 * @param loginPassword
	 * @param payPassword
	 * @param safeQuestion
	 * @param safeAnswer
	 * @return
	 */


	public	User personSignupByMobile( String mobile, String name,
			CertificationType certificationType, String certificationNo, String loginPassword, String payPassword, String safeQuestion,
			String safeAnswer ) throws MpCheckedException;

	/**
	 * 个人邮箱注册.
	 * 
	 * <pre>
	 * 接口: <b>2.1.10</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param mobile
	 * @param email
	 * @param name
	 * @param certificationType
	 * @param certificationNo
	 * @param loginPassword
	 * @param payPassword
	 * @param safeQuestion
	 * @param safeAnswer
	 * @return
	 */
	public User personSignupByEmail( String mobile, String email, String name,
			CertificationType certificationType, String certificationNo, String loginPassword, String payPassword, String safeQuestion,
			String safeAnswer ) throws MpCheckedException;

	/**
	 * 修改门户用户密码.
	 * 
	 * <pre>
	 * 接口: <b>2.1.11</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @author 潘瑞峥
	 * @date 2012-10-29
	 * @param userId
	 * @param oldPassword
	 * @param newPassword
	 */
	public void updatePassword( Long userId, String oldPassword, String newPassword ) throws MpCheckedException;

	/**
	 * 找回登录密码.
	 * 
	 * <pre>
	 * 接口: <b>2.1.12</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * 
	 * @author 潘瑞峥
	 * @date 2012-11-5
	 * @param userId
	 * @param newPassword
	 * @throws MpCheckedException
	 */
	public void recoverPassword( Long userId, String newPassword ) throws MpCheckedException;

	/**
	 * 修改门户用户手机号.
	 * 
	 * <pre>
	 * 接口: <b>2.1.13</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @author 潘瑞峥
	 * @date 2012-10-30
	 * @param userId
	 * @param oldMobile
	 * @param newMobile
	 */
	public void updateMobile( Long userId, String oldMobile, String newMobile ) throws MpCheckedException;

	/**
	 * 登录失败锁定.
	 * 
	 * <pre>
	 * 接口: <b>2.1.14</b>
	 * 规则: 1.ALL NOT NULL; 2.只改锁定时间.
	 * </pre>
	 * 
	 * @author 潘瑞峥
	 * @date 2012-11-5
	 * @param userId
	 */
	public void loginLock( Long userId ) throws MpCheckedException;

	/**
	 * 修改邮箱.
	 * 
	 * <pre>
	 * 接口: <b>2.1.15</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @author 潘瑞峥
	 * @date 2012-11-13
	 * @param userId
	 * @param loginPassword
	 * @param oldEmail
	 * @param newEmail
	 */
	public void updateEmail( Long userId, String loginPassword, String oldEmail, String newEmail ) throws MpCheckedException;

	/**
	 * 修改个人信息.
	 * 
	 * <pre>
	 * 接口: <b>2.2.5</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @author 潘瑞峥
	 * @date 2012-11-14
	 * @param personalDtoBean
	 * @throws MpCheckedException
	 */
	public void updatePersonal( Personal personal ) throws MpCheckedException;

	/**
	 * 网关注册.
	 * 
	 * <pre>
	 * 接口: <b>2.2.1</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @author 潘瑞峥
	 * @date 2012-11-26
	 */
	public Personal signupByGateway( String name, CertificationType certificationType, String certificationNo
			, String merchantCode,String conuterNo,
			BankType bankType, String cardNo, String authNo ) throws MpCheckedException;
	/**
	 * 网关注册.
	 * 
	 * <pre>
	 * 接口: <b>2.2.1</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @author 杜玉龙
	 * @date 2013-11-29
	 */
	public Personal signupByGateway( String name, CertificationType certificationType, String certificationNo
			, String merchantCode,String conuterNo,
			BankType bankType, String cardNo, String authNo,String firstGeo,String secondGeo,String bindSource,String bindCanal,String mobile) throws MpCheckedException;
	/**
	 * 线下注册
	 * @description 
	 * @param name
	 * @param certificationType
	 * @param certificationNo
	 * @param merchantCode
	 * @param bankType
	 * @param cardNo
	 * @param firstGeo
	 * @param secondGeo
	 * @return
	 * @throws MpCheckedException  
	 * @author yu.han
	 * @date 2014-3-27
	 */
	Personal signupByoffLine(String name, CertificationType certificationType, String certificationNo, String merchantCode, BankType bankType, String cardNo,
			String firstGeo, String secondGeo) throws MpCheckedException;
	
	/**
	 * 线下注册
	 * @description 
	 * @param name
	 * @param certificationType
	 * @param certificationNo
	 * @param merchantCode
	 * @param bankType
	 * @param cardNo
	 * @param firstGeo
	 * @param secondGeo
	 * @param bindSource
	 * @param bindCanal
	 * @param mobile
	 * @return
	 * @throws MpCheckedException  
	 * @author yu.han
	 * @date 2014-3-27
	 */
	Personal signupByoffLineWithBindCanal(String name, CertificationType certificationType, String certificationNo, String merchantCode, BankType bankType, String cardNo,
			String firstGeo, String secondGeo, String bindSource, String bindCanal, String mobile) throws MpCheckedException;
	
	/**
	 * 绑定邮箱
	 * 
	 * @param custId
	 * @param email
	 * @throws MpCheckedException
	 */
	public boolean bindEmail( String custId, String email ) throws MpCheckedException;

	/**
	 * 根据custId查询用户信息.
	 * 
	 * <pre>
	 * 接口: <b>2.1.17</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @author 潘瑞峥
	 * @date 2013-01-15
	 */
	public User getByCustId( String custId ) throws MpCheckedException;

	/**
	 * 企业用户手机注册.
	 * 
	 * <pre>
	 * 接口: <b>2.1.18</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param mobile
	 * @param loginPassword
	 * @param payPassword
	 * @param safeQuestion
	 * @param safeAnswer
	 * @return
	 */
	public com.ylink.ylpay.common.project.mp.dto.User enterpriseSignupByMobile( String mobile, String loginPassword, String payPassword,
			String safeQuestion, String safeAnswer ) throws MpCheckedException;

	/**
	 * 企业用户邮箱注册.
	 * 
	 * <pre>
	 * 接口: <b>2.1.19</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param mobile
	 * @param email
	 * @param loginPassword
	 * @param payPassword
	 * @param safeQuestion
	 * @param safeAnswer
	 * @return
	 */
	public User enterpriseSignupByEmail( String mobile, String email, String loginPassword,
			String payPassword, String safeQuestion, String safeAnswer ) throws MpCheckedException;

	/**
	 * 查询用户列表
	 * @param user
	 * @return
	 */
	public List<com.ylink.ylpay.common.project.mp.dto.User> findUserList( User user ) throws MpCheckedException;
	
	/**
	 * 保证金开户
	 * @description 
	 * @param CompanyCustomer.merchant 必填
	 * @param CompanyCustomer.name 必填
	 * @param CompanyCustomer.bankCode 必填
	 * @param CompanyCustomer.cardName 必填
	 * @param CompanyCustomer.cardNo 必填
	 * @param CompanyCustomer.orgNo 必填
	 * @return
	 * @throws MpCheckedException  
	 * @author feng.li
	 * @date 2014-4-25
	 */
	public CompanyCustomer sinupFromMargin(CompanyCustomer dto) throws MpCheckedException;

	
}