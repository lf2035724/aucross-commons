/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-28
 */

/**
 * AuthMoneyAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-10-28
 */
package com.ylink.ylpay.common.project.account.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.account.dto.AuthMoneyDTO;
import com.ylink.ylpay.common.project.account.exception.AccountCheckedException;
import com.ylink.ylpay.common.project.mp.constant.AuditStatus;

/** 
 * @author feng.li
 * @date 2013-10-28
 * @description：管理平台授信控制接口
 */

/**
 * @author feng.li
 */
public interface AuthMoneyAppService {
	
	/**
	 * 根据客户号查询授信信息
	 * 
	 * @param custId
	 * @return AuthMoneyDTO
	 */
	public AuthMoneyDTO getAuthMoneyByCustId(String custId);
	
	/**
	 * 增加赎回已用额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void addRedeemUsedAuthMoney(String custId,Long money) throws AccountCheckedException;
	
	/**
	 * 减少赎回已用额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void reduceRedeemUsedAuthMoney(String custId,Long money) throws AccountCheckedException;
	
	/**
	 * 增加支付已用额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void addPayUsedAuthMoney(String custId,Long money) throws AccountCheckedException;
	
	/**
	 * 减少支付已用额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void reducePayUsedAuthMoney(String custId,Long money) throws AccountCheckedException;
	
	/**
	 * 查询授信信息列表.
	 * 
	 * @param listPage
	 * @param dto
	 * @return
	 */
	public ListPage<AuthMoneyDTO> findListPage(ListPage<AuthMoneyDTO> listPage,AuthMoneyDTO dto) throws AccountCheckedException;
	
	/**
	 * 冻结支付授信额度
	 * 
	 * @author  feng.li
	 * @param custId
	 */
	public void freezePayUsed(String custId) throws AccountCheckedException;
	
	/**
	 * 冻结赎回授信额度
	 * 
	 * @author  feng.li
	 * @param custId
	 */
	public void freezeRedeemUsed(String custId) throws AccountCheckedException;
	
	/**
	 * 解冻支付授信额度
	 * 
	 * @author  feng.li
	 * @param custId
	 */
	public void unfreezePayUsed(String custId) throws AccountCheckedException;
	
	/**
	 * 解冻赎回授信额度
	 * 
	 * @author  feng.li
	 * @param custId
	 */
	public void unfreezeRedeemUsed(String custId) throws AccountCheckedException;
	
	/**
	 * 新增授信信息
	 * 
	 * @author  feng.li
	 * @param dto
	 */
	public void save(AuthMoneyDTO dto) throws AccountCheckedException;
	
	/**
	 * 更新授信信息
	 * 
	 * @author  feng.li
	 * @param dto
	 */
	public void update(AuthMoneyDTO dto) throws AccountCheckedException;
	
	/**
	 * 更新授信审核状态
	 * 
	 * @author  feng.li
	 * @param dto
	 */
	public void updateAuditStatus(String custId, AuditStatus newAuditStatus) throws AccountCheckedException;
	
	/**
	 * 增加赎回总额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void addRedeemAuthMoney(String custId,Long money) throws AccountCheckedException;
	
	/**
	 * 减少赎回总额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void reduceRedeemAuthMoney(String custId,Long money) throws AccountCheckedException;
	
	/**
	 * 增加支付总额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void addPayAuthMoney(String custId,Long money) throws AccountCheckedException;
	
	/**
	 * 减少支付总额度.
	 * 
	 * @param custId
	 * @param money
	 */
	public void reducePayAuthMoney(String custId,Long money) throws AccountCheckedException;
	
}
