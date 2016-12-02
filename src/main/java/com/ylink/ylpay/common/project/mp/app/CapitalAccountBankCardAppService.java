/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-21
 */

/**
 * CapitalAccountBankCardAppService.java
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:feng.li 2014-11-21
 */
package com.ylink.ylpay.common.project.mp.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.mp.dto.CapitalAccountBankCardDTO;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/** 
 * @author feng.li
 * @date 2014-11-21
 * @description：TODO
 */

public interface CapitalAccountBankCardAppService {
	/**
	 * 判断是否存在绑定关系
	 * 
	 * @param merchant 商户编码 
	 * @param custId 客户ID
	 * @author feng.li
	 * @date 2014-11-21
	 */
	public boolean isExists( String bankCardId,String capitalAccountNO) throws MpCheckedException;
	
	/** 
	 * 是否第一次绑定
	 * @param bankCardId 银行卡ID
	 * @author feng.li
	 * @date 2014-11-21
	 */
	public boolean isFirstBind( String bankCardId) throws MpCheckedException;
	
	/**
	 * 是否只有一条绑定记录
	 * @param bankCardId 银行卡ID
	 * @author feng.li
	 * @date 2014-11-21
	 */
	public boolean isOnlyOne( String bankCardId) throws MpCheckedException;
	
	
	public ListPage<CapitalAccountBankCardDTO> list(ListPage<CapitalAccountBankCardDTO> page,CapitalAccountBankCardDTO t ) ;

	/**
	 * 查询绑定关系
	 */
	public CapitalAccountBankCardDTO get(String bankCardId,String capitalAccountNO) throws MpCheckedException;
	
	/**
	 * 保存
	 */
	public void save(CapitalAccountBankCardDTO dto) throws MpCheckedException;
	
	/**
	 * 删除绑定关系
	 */
	public void remove(String bankCardId,String capitalAccountNO) throws MpCheckedException;
}
