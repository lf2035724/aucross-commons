/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.app;

import java.util.Date;
import java.util.List;

import com.ylink.ylpay.common.project.account.constant.CustSubject;
import com.ylink.ylpay.common.project.channel.constant.BankType;
import com.ylink.ylpay.common.project.channel.constant.ChannelType;
import com.ylink.ylpay.common.project.mp.constant.CustBankCardType;
import com.ylink.ylpay.common.project.mp.dto.BankCard;
import com.ylink.ylpay.common.project.mp.dto.FundsLimitBank;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;


/** 
 * @author YangXiaojin
 * @date 2012-10-30
 * @description：客户银行卡接口
 */

public interface BankCardAppService {
	
	/**
	 * @description 校验客户授权码
	 * @param custId 客户ID
	 * @param bankCardNo 银行卡号
	 * @param bankAuthCode 授权码
	 * @return boolean
	 * @author YangXiaojin
	 * @date 2012-10-30
	 */
	public boolean checkBankAuthCode(String custId,String bankCardNo,String bankAuthCode)
		throws MpCheckedException;
	
	/**
	 * 更新客户银行卡授权码.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param custId
	 * @param cardNo
	 * @param authNo
	 */
	public boolean updateBankAuthCode( String id, String bankAuthCode, String cardNo)throws MpCheckedException;
	
	/**
	 * 新增银行卡.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param custId
	 * @param cardNo
	 * @param authNo
	 */
	public BankCard saveBankcard(String custId, String accountTypeKey,String cardName, 
			String cardNo, String cardType, String bankType ,String createType, String authNo)throws MpCheckedException;
	
	/**
	 * 新增银行卡.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param custId
	 * @param cardNo
	 * @param authNo
	 */
	public BankCard saveBankcard(String custId, String accountTypeKey,String cardName, 
			String cardNo, String cardType, String bankType ,String createType, String authNo, String bindSource, String bindCanal)throws MpCheckedException;
	
	/**
	 * 新增银行卡(基金)
	 * @return 
	 */
	public BankCard saveBankCardByMerchant( BankCard bancard )throws MpCheckedException;
	
	/**
	 * 删除银行卡(门户).
	 * @author 张磊
	 * @date 2012-11-9
	 * @param custId
	 * @param cardNo
	 */
	public void delBankcard(String id , String custId)throws MpCheckedException;
	
	/**
	 * 删除银行卡.(基金)
	 * @author 张磊
	 * @date 2012-11-9
	 * @param custId
	 * @param cardName
	 * @param cardNo
	 * @param bankType
	 * @param merchant
	 */
	public boolean markForDelete(BankCard bancard)throws MpCheckedException;
	
	/**
	 * 查询银行卡.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param id
	 */
	public BankCard getByBankcard(String id )throws MpCheckedException;
	
	/**
	 * 查询银行卡.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param custId
	 * @param accountType
	 */
	public List<BankCard> getListByBankcard(String custId, CustSubject accountType )throws MpCheckedException;
	
	/**
	 * 基金支付查询银行卡.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param custId
	 * @param bankNo
	 * @param bankType   行别                                   lixiping 2013-12-09 新增
	 * @param isProtocol 签代扣协议                       lixiping 2013-12-09 新增
	 * @param isCert     认证状态                           lixiping 2013-12-09 新增
	 * @param createType
	 * @return bankAuthCode,bankType
	 */
	public BankCard getBankCardByFund(String custId, String bankNo,String bankType,String isProtocol, boolean createType, String amount)throws MpCheckedException;
	
	/**
	 * 慧投支付查询银行卡.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param custId
	 * @param bankNo
	 * @param bankType   行别                                   lixiping 2013-12-09 新增
	 * @param isProtocol 签代扣协议                       lixiping 2013-12-09 新增
	 * @param isCert     认证状态                           lixiping 2013-12-09 新增
	 * @param createType
	 * @return bankAuthCode,bankType
	 */
	public BankCard getBankCardByInvest(String custId, String bankNo,String bankType,String isProtocol, boolean createType, String amount)throws MpCheckedException;
	
	/**
	 * 基金支付查询银行卡.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param custId
	 * @param bankNo
	 * @param bankType   行别                                   lixiping 2013-12-09 新增
	 * @param isProtocol 签代扣协议                       lixiping 2013-12-09 新增
	 * @param isCert     认证状态                           lixiping 2013-12-09 新增
	 * @param createType
	 * @return bankAuthCode,bankType
	 */
	public BankCard getBankCardByFund(String custId, String bankNo,String bankType,String isProtocol, boolean createType)throws MpCheckedException;
	/**银行卡查询
	 * 
	 * @description 如要返回唯一一条记录，则至少要传8大要素 
	 * @param bankcard
	 * @return  
	 * @author yu.han
	 * @date 2014-7-7
	 */
	public BankCard getCustBankInfo(BankCard bankcard);
	/**
	 * 银行卡查询
	 */
	public List<BankCard> getCustBankInfoList(BankCard bankcard);
	/**
	 * 银行卡查询
	 */
	public List<BankCard> getCustBankList(BankCard bankcard);
	/**
	 * 基金业务网关绑卡、开户获取银行卡信息
	 * @description：
	 * @param cardNo
	 * @param newCardType
	 * @param isCert
	 * @return  
	 * @author LiXiPing
	 * @date 2013-12-25
	 */
	public List<BankCard> getGatewayBankCard(String cardNo,String newCardType, String isCert);
	
	/**
	 * 快捷绑定.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param bankAuthCode
	 * @param success
	 */
	public boolean bind(String bankAuthCode,boolean success)throws MpCheckedException;
	
	/**
	 * 快捷绑定.
	 * @author feng.li
	 * @date 2013-6-26
	 * @param bankAuthCode
	 * @param success
	 * @param success
	 * @param authNo 授权码
	 */
	public boolean bind(String bankAuthCode,boolean success,String authNo)throws MpCheckedException;
	
	/**
	 * 快捷解绑.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param bankAuthCode
	 * @param success
	 */
	public boolean unbind(String bankAuthCode,boolean success)throws MpCheckedException;
	
	/**
	 * 查询银行卡.(门户)
	 * @author 张磊
	 * @date 2012-11-9
	 * @param bankAuthCode
	 * @return BankCard
	 */
	public BankCard getBankCardByBankAuthCode(String bankAuthCode)throws MpCheckedException;

	/**
	 * 查询银行卡（基金）.
	 * @author 张磊
	 * @date 2012-11-9
	 * @param BankCard
	 */
	@Deprecated
	public boolean isCustBankcard (BankCard bancard)throws MpCheckedException;
	
	/**
	 * 商户关联客户银行卡是否存在（基金）
	 */
	public boolean isExists(BankCard bancard)throws MpCheckedException;
	
	/**
	 * 客户银行卡是否存在(门户)
	 */
	public boolean isExistsPortal(CustSubject accType,String custId,String bankType
			,String cardName,String cardNo)throws MpCheckedException;
	/**
	 * 修改快捷状态
	 */
	public void close(String id , String custId)throws MpCheckedException;
	
	/**
	 * 更新银行卡认证状态
	 * @param type 0 未认证 1 已认证 2 认证中
	 */
	public void updateBankCardCert(String id,String type) throws MpCheckedException;
	 /**
	  * 查询银行卡限额
	  * @param bankType
	  * @param cardType
	  * @param channelType
	  * @return
	  */
	public List<FundsLimitBank> listBankCardLimit (BankType bankType, CustBankCardType cardType,
			ChannelType channelType)throws MpCheckedException;
	/**
	 * 查询指定生效时间的银行卡
	 * @param type 0代表个人客户，1代表企业客户
	 */
	public List<BankCard> getBankcardByTime(Date startTime,Date endTime,String type) throws MpCheckedException;
	/**
	 * 查询银行卡（门户）
	 * @param custId 客户编号
	 * @param cardNo 银行卡卡号
	 * @param bankType 银行行别（枚举 com.ylink.ylpay.common.project.channel.constant.BankType）
	 * @param createType 创建类型（true : 客户自己创建 fasle : 系统自动创建）
	 * @return
	 * @throws MpCheckedException
	 */
	public BankCard getBankCardByPortal(String custId,String cardNo,BankType bankType,boolean createType, CustSubject custSubject) throws MpCheckedException;
	/**
	 * 根据企业编号和账户类型查询银行卡（门户）
	 * @param custId 企业客户编号
	 * @param custSubject 账户类型
	 * @return 客户银行卡
	 * @throws MpCheckedException
	 */
	public BankCard getBankCardByCustIdAtPortal(String custId,CustSubject custSubject) throws MpCheckedException;
	
	/**
	 * 为门户企业客户添加银行卡
	 */
	public BankCard saveByPortalForEnt( BankCard bancard ) throws MpCheckedException;
	
	/**
	 * 企业客户变更银行卡
	 */
	public BankCard changeByPortalForEnt( BankCard bancard ) throws MpCheckedException;
	
	/**
	 * 查询银行卡信息
	 * @description：
	 * @param custId   客户号
	 * @param cardNO   银行卡号
	 * @return
	 * @throws MpCheckedException  
	 * @author LiXiPing
	 * @date 2014-1-20
	 */
	public BankCard getBankCard(String custId,String cardNO) throws MpCheckedException;
	
	/**
	 * 查询银行卡信息
	 * @description：
	 * @param custId   客户号
	 * @param cardNO   银行卡号
	 * @param bankCode 银行行别
	 * @return
	 * @throws MpCheckedException  
	 * @author LiXiPing
	 * @date 2014-1-20
	 */
	public BankCard getBankCard(String custId,String cardNO,String bankCode ) throws MpCheckedException;
	
	/**
	 * 查询银行卡信息
	 * @description：
	 * @param custId   客户号
	 * @param cardNO   银行卡号
	 * @param status	状态
	 * @return
	 * @throws MpCheckedException  
	 * @author feng.li
	 * @date 2014-3-6
	 */
	public BankCard getBankCardWithStatus(String custId,String cardNO,String status) throws MpCheckedException;
	
	/**
	 * 查询银行卡信息
	 * @description：
	 * @param cardNO   银行卡号
	 * @param createType	创建类型
	 * @return
	 * @throws MpCheckedException  
	 * @author duyulong
	 * @date 2014-4-21
	 */
	public BankCard getBankCardByCreateType(String cardNo,String createType,String bankType,String cardName) throws MpCheckedException;
	
	/**
	 * 更新银行卡原始状态
	 * @description：
	 * @param cardId 
	 * @param isProtocol
	 * @param isCert
	 * @return
	 * @throws   
	 * @author duyulong
	 * @date 2014-4-22
	 */
	public void updateOriginalCardStatus(String cardId,String isProtocol,String isCert,String originalProtocol,String originalCert) throws MpCheckedException;
}
