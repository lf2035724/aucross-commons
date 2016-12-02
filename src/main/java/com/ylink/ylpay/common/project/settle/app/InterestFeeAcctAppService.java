/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2013-1-25
 */

package com.ylink.ylpay.common.project.settle.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.settle.constant.InterestSettleAuditStatus;
import com.ylink.ylpay.common.project.settle.dto.InterestAccountSettleDTO;
import com.ylink.ylpay.common.project.settle.dto.InterestSettleDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/**
 * @author ZhangDM(Mingly)
 * @date 2013-1-25
 * @description：利息和费用处理接口
 */

public interface InterestFeeAcctAppService {

	/**
	 * @description 利息记账
	 * @param settleId
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-25
	 */
	public void acctInterest(Long settleId);

	/**
	 * 
	 * @description 查询科目结息汇总信息
	 * @throws
	 * @author jf.zhao
	 * @date 2013-5-2
	 */
	public ListPage<InterestSettleDTO> findInterestSettleListPage(
			ListPage<InterestSettleDTO> page, InterestSettleDTO searchCondition)
			throws SettleCheckedException;

	/**
	 * 
	 * @description 查询账户结息汇总信息
	 * @throws
	 * @author jf.zhao
	 * @date 2013-5-2
	 */
	public ListPage<InterestAccountSettleDTO> findInterestAccountSettleListPage(
			ListPage<InterestAccountSettleDTO> page,
			InterestAccountSettleDTO searchCondition)
			throws SettleCheckedException;
	/**
	 * 
	 * @description 根据结算id 更新管理平台审核状态
	 * @throws 
	 * @author jf.zhao
	 * @date 2013-5-2
	 */
	public boolean updateInterestSettleAuditStatus(Long settleId, String auditStatus)throws SettleCheckedException;

}
