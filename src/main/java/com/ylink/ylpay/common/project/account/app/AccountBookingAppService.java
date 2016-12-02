/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Iquil 2012-10-29
 */

package com.ylink.ylpay.common.project.account.app;

import java.util.List;

import com.ylink.ylpay.common.project.account.dto.AccountBookDTO;
import com.ylink.ylpay.common.project.account.dto.AccountBookReturnDTO;
import com.ylink.ylpay.common.project.account.dto.AccountReverseDTO;
import com.ylink.ylpay.common.project.account.dto.AccountReverseReturnDTO;
import com.ylink.ylpay.common.project.account.dto.PreAccountBookDTO;
import com.ylink.ylpay.common.project.account.dto.PreAccountBookReturnDTO;
import com.ylink.ylpay.common.project.account.dto.PreAccountReverseDTO;
import com.ylink.ylpay.common.project.account.exception.AccountCheckedException;

/** 
 * @author Iquil
 * @date 2012-10-29
 * @description：记账服务接口
 */

public interface AccountBookingAppService {

	/**
	 * @description 记账接口（记账流水为未对账）
	 * @param accountBookDTOList
	 * @return List<AccountBookReturnDTO>
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2012-11-13
	 */
	public List<AccountBookReturnDTO> doAccountBooking(List<AccountBookDTO> accountBookDTOList) throws AccountCheckedException;

	/**
	 * @description 冲正接口（记账流水为未对账）
	 * @param accountReverseDTOList
	 * @return List<AccountReverseReturnDTO>
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2012-11-13
	 */
	public List<AccountReverseReturnDTO> doAccountReverse(List<AccountReverseDTO> accountReverseDTOList) throws AccountCheckedException;
	
	/**
	 * @description 记账接口（记账流水为无需对账）
	 * @param accountBookDTOList
	 * @return List<AccountBookReturnDTO>
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2013-2-26
	 */
	public List<AccountBookReturnDTO> doAccountBookingNoRecon(List<AccountBookDTO> accountBookDTOList) throws AccountCheckedException;

	/**
	 * @description 冲正接口（记账流水为无需对账）
	 * @param accountReverseDTOList
	 * @return List<AccountReverseReturnDTO>
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2013-2-26
	 */
	public List<AccountReverseReturnDTO> doAccountReverseNoRecon(List<AccountReverseDTO> accountReverseDTOList) throws AccountCheckedException;	
	
	/**
	 * @description 年终结转记账
	 * @throws AccountCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2012-12-25
	 */
	public void doYearEndClosing(final String taskId,final String accountDate) throws AccountCheckedException;
	
	/**
	 * @description 查询业务记账科目（做预记账用）
	 * @param preBookDTOList
	 * @return List<PreAccountBookReturnDTO>
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2013-3-3
	 */
	public List<PreAccountBookReturnDTO> findPreAccountBooking(List<PreAccountBookDTO> preBookDTOList) throws AccountCheckedException;
	
	/**
	 * @description 查询业务冲正科目（做预冲正用）
	 * @param preBookDTOList
	 * @return List<PreAccountBookReturnDTO>
	 * @throws AccountCheckedException
	 * @author Iquil
	 * @date 2013-3-3
	 */
	public List<PreAccountBookReturnDTO> findPreAccountReverse(List<PreAccountReverseDTO> preReverseDTOList)
			throws AccountCheckedException;
	
	/**
	 * @description 根据orgPayId查询冲正接口记录
	 * @param payIdList
	 * @return List<AccountReverseDTO>
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2013-3-13
	 */
	public List<AccountReverseDTO> checkAccountReverseByOrgPayId(List<String> payIdList) throws AccountCheckedException;
	/**
	 * 
	 * <p>管理平台记账录入(资金调整)</p>
	 * @param accountBookDTO
	 *        1.drSubjectNo 借方科目不能为空
	 *        2.crSubjectNo 贷方科目不能为空
	 *        3.amount 金额不能为空
	 * @return Boolean 录入成功标志
	 * @throws AccountCheckedException
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-3-28 下午4:41:40
	 */
	public Boolean mpAccountEntry(AccountBookDTO accountBookDTO) throws AccountCheckedException;
}
