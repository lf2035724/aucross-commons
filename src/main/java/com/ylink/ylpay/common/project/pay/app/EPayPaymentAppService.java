/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-7
 */

package com.ylink.ylpay.common.project.pay.app;

import com.ylink.ylpay.common.project.pay.dto.AccountPurchaseEPayDTO;
import com.ylink.ylpay.common.project.pay.dto.AccountPurchaseEPayReturnDTO;
import com.ylink.ylpay.common.project.pay.dto.EPayPaymentDTO;
import com.ylink.ylpay.common.project.pay.dto.EPayPaymentReturnDTO;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

/** 
 * @author YG.HU
 * @date 2012-12-7
 * @description：现金易申购
 */

public interface EPayPaymentAppService {
    
    /**
     * @description 通过账户余额购买现金易
     * @param accountPurchaseEPayDTO
     * @return
     * @throws PayCheckedException  
     * @author YG.HU
     * @date 2012-12-7
     */
    public AccountPurchaseEPayReturnDTO accountPurchaseEPay(AccountPurchaseEPayDTO accountPurchaseEPayDTO)
            throws PayCheckedException;
    
    /**
     * @description 现金易支付
     * @param ePayPaymentDTO
     * @return
     * @throws PayCheckedException  
     * @author ZhangDM(Mingly)
     * @date 2012-12-14
     */
    public EPayPaymentReturnDTO ePayPayment(EPayPaymentDTO ePayPaymentDTO) throws PayCheckedException;
}
