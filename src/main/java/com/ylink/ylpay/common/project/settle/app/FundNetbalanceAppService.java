/**
 * 版权所有(C) 2012 证联融通
 * 创建:HuAJ 2012-11-24
 */

package com.ylink.ylpay.common.project.settle.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.settle.dto.FundNetbalanceDTO;
import com.ylink.ylpay.common.project.settle.dto.FundNetbalanceDetailDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;

/**
 * @author ZhangDM(Mingly)
 * @date 2012-12-27
 * @description：基金扎差服务接口
 */

public interface FundNetbalanceAppService {

	/**
	 * @description 查询基金扎差分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-9
	 */
	public ListPage<FundNetbalanceDTO> findInfoListPage(ListPage<FundNetbalanceDTO> page, 
			FundNetbalanceDTO searchCondition) throws SettleCheckedException;
	
	/**
	 * @description 根据条件查询基金扎差信息
	 * @param fundNetbalanceDTO
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-9
	 */
	public List<FundNetbalanceDTO> findList(FundNetbalanceDTO fundNetbalanceDTO) 
			throws SettleCheckedException;
	
	/**
	 * @description 查询扎差明细分页信息
	 * @param page
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-15
	 */
	public ListPage<FundNetbalanceDetailDTO> findDetailInfoListPage(ListPage<FundNetbalanceDetailDTO> page, 
			FundNetbalanceDetailDTO searchCondition) throws SettleCheckedException;
	
	/**
	 * @description 查询扎差明细分页总数
	 * @param searchCondition
	 * @return
	 * @throws SettleCheckedException  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-15
	 */
	public int findDetailInfoListPageCount(FundNetbalanceDetailDTO searchCondition) 
			throws SettleCheckedException;

	/**
	 * 根据结算日期、任务号、轧差场次修改状态
	 * @description：
	 * @param record
	 * @return  
	 * @author LiXiPing
	 * @date 2014-3-7
	 */
	public void updateByAccountDateAndTaskIdAndNetNo(FundNetbalanceDTO fundNetbalanceDTO);
}
