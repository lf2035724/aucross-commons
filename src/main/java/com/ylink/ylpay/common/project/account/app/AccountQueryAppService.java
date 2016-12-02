/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建: Iquil 2012-11-02
 */

package com.ylink.ylpay.common.project.account.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.account.dto.AccountBillDTO;
import com.ylink.ylpay.common.project.account.dto.AccountBookDTO;
import com.ylink.ylpay.common.project.account.dto.AccountBookReturnDTO;
import com.ylink.ylpay.common.project.account.dto.AccountInfoDTO;
import com.ylink.ylpay.common.project.account.dto.AccountReverseInfoDTO;
import com.ylink.ylpay.common.project.account.dto.AccountReverseReturnDTO;
import com.ylink.ylpay.common.project.account.dto.SubAccountQueryDTO;
import com.ylink.ylpay.common.project.account.exception.AccountCheckedException;

//import com.ylink.ylpay.account.common.vo.SubAccountQueryVO;
/**
 * @author Iquil
 * @date 2012-11-02
 * @description：账户查询接口
 */

public interface AccountQueryAppService {

	/**
	 * @description 检查用户是否开通基金账户
	 * @param custId
	 * @return boolean（true已开通；false未开通）
	 * @throws AccountCheckedException
	 * @author Iquil
	 * @date 2012-11-2
	 */
	public boolean checkHaveFundAccount(String custId) throws AccountCheckedException;

	/**
	 * @description 根据二级科目（账户类型）查询客户账户信息
	 * @param custId
	 * @param subjectNo2
	 *            取值为CustSubject.FUND.getValue()或CustSubject.SHOP.getValue()
	 * @return AccountInfoDTO（包含字段：accountState账户状态：00生效；01冻结；03禁止借记；04禁止贷记。
	 *         cashAmount账户金额，精确到分）
	 * @throws AccountCheckedException
	 * @author Iquil
	 * @date 2012-11-2
	 */
	public AccountInfoDTO getCustAccountInfo(String custId, String subjectNo2) throws AccountCheckedException;

	/**
	 * @description 子账户分页信息查询
	 * @param page
	 * @param dto
	 * @return
	 * @throws AccountCheckedException
	 * @author HuAJ
	 * @date 2012-11-17
	 */
	public ListPage<SubAccountQueryDTO> findSubAccountListPage(ListPage<SubAccountQueryDTO> page, SubAccountQueryDTO dto)
			throws AccountCheckedException;

	/**
	 * 
	 * @description 记账流水分页信息查询
	 * @param page
	 * @param dto
	 * @return
	 * @throws AccountCheckedException
	 * @author HuAJ
	 * @date 2012-12-5
	 */
	public ListPage<AccountBillDTO> findAccountBillListPage(ListPage<AccountBillDTO> page, AccountBillDTO dto)
			throws AccountCheckedException;

	/**
	 * 
	 * @description 记账接口分页信息查询
	 * @param page
	 * @param dto
	 * @return
	 * @throws AccountCheckedException
	 * @author HuAJ
	 * @date 2012-12-5
	 */
	public ListPage<AccountBookDTO> findAccountBookListPage(ListPage<AccountBookDTO> page, AccountBookDTO dto)
			throws AccountCheckedException;

	/**
	 * 
	 * @description 冲正记录分页信息查询
	 * @param page
	 * @param dto
	 * @return
	 * @throws AccountCheckedException
	 * @author HuAJ
	 * @date 2012-12-5
	 */
	public ListPage<AccountReverseInfoDTO> findAccountReverseListPage(ListPage<AccountReverseInfoDTO> page,
			AccountReverseInfoDTO dto) throws AccountCheckedException;

	/**
	 * @description 查询手工对账的三级科目列表
	 * @return 
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2013-2-28
	 */
	public List<SubAccountQueryDTO> findHandCheckSubjectList() throws AccountCheckedException;
	
	/**
	 * @description 根据payId查询记账信息（记账日期、收付款方余额）
	 * @param payIdList
	 * @return
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2013-3-8
	 */
	public List<AccountBookReturnDTO> findBookingInfoByPayId(List<String> payIdList) throws AccountCheckedException;
	
	/**
	 * @description 根据payId查询是否记账
	 * @param payIdList
	 * @return
	 * @throws AccountCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-4-25
	 */
	public List<AccountBookReturnDTO> findIsAccountByPayId(List<String> payIdList) throws AccountCheckedException;
	
	/**
	 * @description 根据payId查询冲正信息（记账日期、收付款方余额）
	 * @param payIdList
	 * @return
	 * @throws AccountCheckedException  
	 * @author Iquil
	 * @date 2013-3-8
	 */
	public List<AccountReverseReturnDTO> findReverseInfoByPayId(List<String> payIdList) throws AccountCheckedException;
}
