/*******************************************************************************
 * Project   : aucross-common
 * Class Name: com.ylink.ylpay.common.project.settle.app.MerchantTransFeeAppService
 * Created By: 杜波 159-9965-3650
 * Created on: 2013-3-20 上午9:28:24
 * Copyright © 2010-2012 证联融通 All rights reserved.
 ******************************************************************************/
package com.ylink.ylpay.common.project.settle.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.settle.dto.MerchantFeeDTO;
import com.ylink.ylpay.common.project.settle.exception.SettleCheckedException;


/**
 * <P>商户手续费用计算接口类</P>
 * @author 杜波 159-9965-3650
 * @description：
 */
public interface MerchantTransFeeAppService {
	/**
	 * 
	 * <p>计算商户交易费用</p>
	 * @throws SettleCheckedException
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-3-25 下午6:19:07
	 */
	public void calcMerchantTransFee(String acctDate) throws SettleCheckedException;
	/**
	 * 
	 * <p>计算商户交易费用</p>
	 * @param merchantIdList  商户ID list
	 * @throws SettleCheckedException
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-3-25 下午6:19:07
	 */
	public void calcMerchantTransFee(List<String> merchantIdList,String acctDate) throws SettleCheckedException;
    /**
     * 
     * <p>查询商户计费信息</p>
     * @param page
     * @param merchantFeeDTO
     *        如果使用时间作为查询条件,则tradeBeginDate格式为yyyyMMdd 00:00:00,tradeEndDate格式为yyyyMMdd 23:59:59
     * @return
     * @throws SettleCheckedException
     * @author 杜波 159-9965-3650
     * Created on: 2013-3-26 下午3:35:46
     */
	public ListPage<MerchantFeeDTO> getMerchantFeeInfo(ListPage<MerchantFeeDTO> page,MerchantFeeDTO merchantFeeDTO)throws SettleCheckedException;
	/**
	 * 
	 * <p>根据商户计费信息ID更新商户计费信息</p>
	 * @param merchantFeeDTO
	 * @return
	 * @throws SettleCheckedException
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-3-27 下午4:45:11
	 */
	public int updateMerchantFeeInfoById(MerchantFeeDTO merchantFeeDTO) throws SettleCheckedException;
	/**
	 * 
	 * <p>根据商户计费信息ID批量更新商户计费信息</p>
	 * @param merchantFeeDTOList
	 * @return
	 * @throws SettleCheckedException
	 * @author 杜波 159-9965-3650
	 * Created on: 2013-4-13 下午2:07:12
	 */
	public int updateMerchantFeeInfoByIdBatch(List<MerchantFeeDTO> merchantFeeDTOList) throws SettleCheckedException;
}
