/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2013-1-25
 */

package com.ylink.ylpay.common.project.settle.app;

import java.util.List;

import com.ylink.ylpay.common.project.settle.dto.PreAccountBookReturnDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-2-25
 * @description：调账接口
 */

public interface AdjustAccountAppService {
	
	/**
	 * @description 补录退款
	 * @param reconId
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-26
	 */
	public void addRecordAndRefund(Long reconId) throws SettleCheckedException;
	
	/**
	 * @description 冲正
	 * @param reconId
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-2-26
	 */
	public void reverse(Long reconId) throws SettleCheckedException;
	
	/**
	 * @description 查询补录退款预记账
	 * @param reconId
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-2
	 */
	public List<PreAccountBookReturnDTO> findAddRecordAndRefundPreAcct(Long reconId) 
			throws SettleCheckedException;
	
	/**
	 * @description 查询冲正预记账
	 * @param reconId
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-2
	 */
	public List<PreAccountBookReturnDTO> findReversePreAcct(Long reconId) 
			throws SettleCheckedException;
	
	/**
	 * @description 查询渠道调账预记账（把补录退款预记账和冲正预记账接口合并为一个）
	 * @param reconId
	 * @return  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-24
	 */
	public List<PreAccountBookReturnDTO> findChannelAdjustPreAcct(Long reconId)
			throws SettleCheckedException;
	
	/**
	 * @description 渠道调账（把补录退款调账和冲正调账接口合并为一个）
	 * @param reconId  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-24
	 */
	public void channelAdjustAccount(Long reconId) throws SettleCheckedException;
	
	/**
	 * @description 内部调账
	 * @param unbalanceId
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-9
	 */
	public void internalAdjustAccount(Long unbalanceId) throws SettleCheckedException;
	
	/**
	 * @description 查询内部调账预处理
	 * @param unbalanceId
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-11
	 */
	public String findInterestAdjustAcctPreHandle(Long unbalanceId) throws SettleCheckedException;
}
