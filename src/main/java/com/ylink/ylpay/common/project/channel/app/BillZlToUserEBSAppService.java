package com.ylink.ylpay.common.project.channel.app;

import java.util.List;

import com.ylink.ylpay.common.project.channel.dto.PayBillDTO;
import com.ylink.ylpay.common.project.channel.exception.ChannelCheckedException;

/**
 * @description 渠道对外提供的快捷付的批量代付APP
 * @author wl
 * @date 2012-10
*/

public interface BillZlToUserEBSAppService 
{
	/**
	 * @description 批量代付数据到批量表
	 * @param bankType  行别
	 * @param  List<PayBillDTO> 渠道的公共的DTO
	 * @return String “0000”
	 * @author wl
	 * @date 2012-10
	*/
	public String billZLToUserEBS(String bankType ,String payAccNo ,String payOptType, List<PayBillDTO> payBillDTOList)  throws ChannelCheckedException;
}
