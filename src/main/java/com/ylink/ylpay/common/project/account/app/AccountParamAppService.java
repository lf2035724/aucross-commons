/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2013-1-21
 */

package com.ylink.ylpay.common.project.account.app;

import java.util.List;

import com.ylink.ylpay.common.project.account.dto.AccountParamDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-1-21
 * @description：账户参数查询接口
 */

public interface AccountParamAppService {
	
	/**
	 * @description 查询账务系统参数列表
	 * @return  
	 * @author ZhangDM(Mingly)
	 * @date 2013-1-21
	 */
	public List<AccountParamDTO> findParamList();
}
