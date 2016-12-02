/*******************************************************************************
 * Project   : zlrt-settle
 * Class Name: com.ylink.ylpay.settle.service.busi.TrialBalancingResult
 * Created By: 杜波 159-9965-3650
 * Created on: 2013-3-10 下午4:46:22
 * Copyright © 2010-2012 证联融通
 ******************************************************************************/
package com.ylink.ylpay.common.project.settle.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.settle.dto.AccountBillBalanceDTO;
import com.ylink.ylpay.common.project.settle.dto.FormulaBalanceDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;


/**
 * <P>试算平衡结果接口</P>
 * @author 杜波 159-9965-3650
 * @description：
 */
public interface TrialBalancingResultAppService {
	/**
	 * 
	 * <p>获取余额试算平衡结果</p>
	 * @param page 分页条件
	 * @param searchCondition，如果使用帐务日期作为查询条件，则格式必须为：yyyyMMdd
	 * @return 返回分页查询结果
	 * @author 杜波 159-9965-3650
	 * @throws SettleCheckedException 
	 */
	public ListPage<FormulaBalanceDTO> getBalanceTrialBalancingResult(ListPage<FormulaBalanceDTO> page,FormulaBalanceDTO searchCondition) throws SettleCheckedException;
	/**
	 * 
	 * <p>获取发生额试算平衡结果</p>
	 * @param page 分页条件
	 * @param searchCondition，如果使用帐务日期作为查询条件，则格式必须为：yyyyMMdd
	 * @return 返回分页查询结果
	 * @author 杜波 159-9965-3650
	 * @throws SettleCheckedException 
	 */
	public ListPage<AccountBillBalanceDTO> getAccrualTrialBalancingResult(ListPage<AccountBillBalanceDTO> page,AccountBillBalanceDTO searchCondition) throws SettleCheckedException;
}
