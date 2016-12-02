/**
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2013-1-16
 */

package com.ylink.ylpay.common.project.fund.app;

import com.ylink.ylpay.common.project.fund.dto.SuperVisionGrantDTO;
import com.ylink.ylpay.common.project.fund.exception.FundCheckedException;

/** 
 * @author YG.HU
 * @date 2013-1-16
 * @description：TODO
 */

public interface SuperVisionGrantAppService {
    /**
     * @description 监管行拨款
     * @return  
     * @author YG.HU
     * @date 2013-01-16
     */                                          
    public boolean superVisionGrant(SuperVisionGrantDTO superVisionGrantDTO)  throws FundCheckedException;
}
