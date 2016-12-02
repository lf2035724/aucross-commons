/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2013-1-21
 */

package com.ylink.ylpay.common.project.account.app;

import java.util.List;

import com.ylink.ylpay.common.project.account.dto.SubjectDTO;
import com.ylink.ylpay.common.project.account.dto.SubjectHisViewDTO;
import com.ylink.ylpay.common.project.account.dto.SubjectViewDTO;

/**
 * @author ZhangDM(Mingly)
 * @date 2013-1-21
 * @description：账户科目服务接口
 */

public interface AccountSubjectAppService {

	/**
	 * @description 查询科目以树的形式展现
	 * @return
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-21
	 */
	public List<SubjectDTO> findAllListByTree(SubjectDTO subjectDTO);

	/**
	 * @description 查询科目(带金额)以树的形式展现
	 * @return
	 * @author Iquil
	 * @date 2013-02-21
	 */
	public List<SubjectViewDTO> findAllListWithAmountByTree(SubjectViewDTO subjectViewDTO);

	/**
	 * @description 根据账务日期查询科目(带金额)列表
	 * @param accountDate
	 * @return
	 * @author Iquil
	 * @date 2013-3-26
	 */
	public List<SubjectHisViewDTO> findSubjectHisListByAccountDate(String accountDate);
}
