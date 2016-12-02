/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建: Iquil 2012-10-30
 */

package com.ylink.ylpay.common.project.account.app;

import com.ylink.ylpay.common.project.account.dto.RegAccountReturnDTO;
import com.ylink.ylpay.common.project.account.dto.RegNormalAccountDTO;
import com.ylink.ylpay.common.project.account.dto.RegPayablesAccountDTO;
import com.ylink.ylpay.common.project.account.exception.AccountCheckedException;

/**
 * @author Iquil
 * @date 2012-10-30
 * @description：账户操作服务接口
 */

public interface AccountOptAppService {

	/**
	 * @description 开户接口
	 * @param custId
	 * @param subjectNo2（CustSubject.SHOP消费备付金；CustSubject.FUND基金备付金）
	 * @return RegAccountReturnDTO
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2012-10-30
	 */
	public RegAccountReturnDTO createCustAccount(String custId, String subjectNo2) 
			throws AccountCheckedException;
	
	/**
	 * @description 应付款账户接口
	 * @param custId
	 * @param subjectNo2
	 * @param custType
	 * @throws AccountCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-12-26
	 */
	public void createCustPayablesAccount(
			RegPayablesAccountDTO regPayablesAccountDTO) throws AccountCheckedException;

	/**
	 * @description 冻结账户
	 * @param accountId
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2012-11-14
	 */
	public void freezeAccount(String accountId) throws AccountCheckedException;
	
	/**
	 * @description 激活账户
	 * @param accountId
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2012-11-14
	 */
	public void activeAccount(String accountId) throws AccountCheckedException;
	
	/**
	 * @description 创建普通账户
	 * @param regNormalAccountDTO  
	 * @author Iquil
	 * @date 2013-2-21
	 */
	public void createNormalAccount(RegNormalAccountDTO regNormalAccountDTO);
	
	/**
	 * @description 通过custId和subjectNo2更新accountName
	 */
	public void updateAccountName(String custId,String subjectNo2,String accountName);
}
