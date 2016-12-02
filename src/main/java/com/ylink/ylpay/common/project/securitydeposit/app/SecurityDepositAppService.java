package com.ylink.ylpay.common.project.securitydeposit.app;

import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositAccountTransferDTO;
import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositAccountTransferReturnDTO;
import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositPayDTO;
import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositPayReturnDTO;
import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositQueryPayStateDTO;
import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositQueryPayStateReturnDTO;
import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositSignDTO;
import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositSignReturnDTO;
import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositWithdrawDTO;
import com.ylink.ylpay.common.project.securitydeposit.dto.SecurityDepositWithdrawReturnDTO;
import com.ylink.ylpay.common.project.securitydeposit.exception.SecurityDepositCheckedException;

/**
 * @author wanglei
 * @date 2014-4-11
 * @description 保证金对外提供的实名签约的APP
*/
public interface SecurityDepositAppService
{    
	
	/**
	  * @description 保证金对外提供的实名签约口
	  * @param SecurityDepositSignDTO
	  * @return SecurityDepositSignReturnDTO
	  * @author wanglei
	  * @date 2014-4-11
	 */
	SecurityDepositSignReturnDTO sign(SecurityDepositSignDTO sdsDto) throws SecurityDepositCheckedException;
	
	
	/**
	  * @description 保证金对外提供的快捷购买接口
	  * @param SecurityDepositPayDTO
	  * @return SecurityDepositPayReturnDTO
	  * @author wanglei
	  * @date 2014-4-14
	 */
	SecurityDepositPayReturnDTO pay(SecurityDepositPayDTO sdpDto) throws SecurityDepositCheckedException;
	
	/**
	 * @description 保证金对外提供的余额提现到保证金接口
	 * @param SecurityDepositWithdrawDTO
	 * @return SecurityDepositWithdrawReturnDTO
	 * @author wanglei
	 * @date 2014-4-14
	 */
	SecurityDepositWithdrawReturnDTO withdraw(SecurityDepositWithdrawDTO sdwDto) throws SecurityDepositCheckedException;
	
	/**
	 * @description 保证金对外提供的保证金支付查询接口
	 * @param SecurityDepositQueryPayStateDTO
	 * @return SecurityDepositQueryPayStateReturnDTO
	 * @author wanglei
	 * @date 2014-4-14
	 */
	SecurityDepositQueryPayStateReturnDTO queryPayState(SecurityDepositQueryPayStateDTO sdqpsDto) throws SecurityDepositCheckedException;
	
	/**
	 * @description 保证金对外提供的银证转账接口
	 * @param SecurityDepositAccountTransferDTO
	 * @return SecurityDepositAccountTransferReturnDTO
	 * @author wanglei
	 * @date 2014-4-14
	 */
	SecurityDepositAccountTransferReturnDTO accountTransfer(SecurityDepositAccountTransferDTO sdatDto) throws SecurityDepositCheckedException;
}
