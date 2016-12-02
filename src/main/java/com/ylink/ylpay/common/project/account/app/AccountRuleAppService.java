/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-29
 */

package com.ylink.ylpay.common.project.account.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.account.dto.AccountRuleDTO;
import com.ylink.ylpay.common.project.account.exception.AccountCheckedException;

/** 
 * @author Iquil
 * @date 2012-10-29
 * @description：记账规则接口类
 */

public interface AccountRuleAppService {
	
	/**
	 * @description 根据deal_code查询记账规则列表
	 * @param dealCode
	 * @return List<AccountRuleDTO>
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2012-10-29
	 */
	public List<AccountRuleDTO> findAccountRuleByDealCode(String dealCode) throws AccountCheckedException;
	
	/**
	 * @description 根据记账类型查询记账规则列表
	 * @param accountType
	 * @return
	 * @throws AccountCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-12-25
	 */
	public List<AccountRuleDTO> findAccountRuleByAccountType(String accountType) throws AccountCheckedException;
	
	/**
	 * 
	 * @description 记账规则接口分页信息查询
	 * @param page
	 * @param dto
	 * @return
	 * @throws AccountCheckedException  
	 * @author HuAJ
	 * @date 2012-12-5
	 */
	public ListPage<AccountRuleDTO> findAccountRuleListPage(
			ListPage<AccountRuleDTO> page, AccountRuleDTO dto)
			throws AccountCheckedException;

	/**
	 * 
	 * <p>根据记账规则ID更新记账信息</p>
	 * @param accountRuleDTO 
	 *         1.记账规则ruleId一定不能为空
	 *         2.主要更新：付款方科目，付款方借贷类型，收款方科目，收款方借贷类型，备注这五个字段
	 *         3.付款方借贷类型与收款方借贷类型不能相同
	 *         4.付款方科目，付款方借贷类型，收款方科目，收款方借贷类型这四个字段不能为空
	 * @return Boolean 更新是否成功标志
	 * @throws AccountCheckedException
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-3-14 下午6:04:12
	 */
	public Boolean updateAccountRuleByRuleId(AccountRuleDTO accountRuleDTO) throws AccountCheckedException;
	/**
	 * 
	 * <p>根据记账规则ID查找记账规则</p>
	 * @param accountRuleDTO 
	 *         1.记账规则ruleId一定不能为空
	 * @return AccountRuleDTO 记账规则DTO
	 * @throws AccountCheckedException
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-3-14 下午6:04:12
	 */
	public AccountRuleDTO findAccountRuleByRuleId(AccountRuleDTO accountRuleDTO) throws AccountCheckedException;
}
