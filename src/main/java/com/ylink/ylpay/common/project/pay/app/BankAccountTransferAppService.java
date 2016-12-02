/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-13
 */

package com.ylink.ylpay.common.project.pay.app;

import com.ylink.ylpay.common.project.pay.dto.BankAccountCollectionDTO;
import com.ylink.ylpay.common.project.pay.dto.BankAccountPaymentDTO;
import com.ylink.ylpay.common.project.pay.dto.BankAccountPaymentReturnDTO;
import com.ylink.ylpay.common.project.pay.dto.BankAccountTransferDTO;
import com.ylink.ylpay.common.project.pay.dto.PTODTO;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

/** 
 * @author YG.HU
 * @date 2012-11-13
 * @description：银行账户转账对外接口
 */

public interface BankAccountTransferAppService {
    
    /**
     * @description 银行账户转账
     * @param bankAccountTransferDTO
     * @return 交易订单号
     * @throws PayCheckedException  
     * @author YG.HU
     * @date 2012-11-13
     */
    public String bankAccountTransfer(BankAccountTransferDTO bankAccountTransferDTO)
            throws PayCheckedException ;
    
    /**
     * @description 银行账户收款
     * @param bankAccountCollectionDTO
     * @return
     * @throws PayCheckedException  
     * @author ZhangDM(Mingly)
     * @date 2012-12-19
     */
    public String bankAccountCollection(BankAccountCollectionDTO bankAccountCollectionDTO) 
    		throws PayCheckedException ;
    
    /**
     * @description 银行账户付款
     * @param bankAccountPaymentDTO
     * @return
     * @throws PayCheckedException  
     * @author ZhangDM(Mingly)
     * @date 2012-12-19
     */
    public BankAccountPaymentReturnDTO bankAccountPayment(BankAccountPaymentDTO bankAccountPaymentDTO) 
    		throws PayCheckedException ;
    
    
    /**
      * @description 赎回划款（备付金到其它应付款）
      * @param 
      * @return String
      * @author wanglei
      * @date 2014-9-24
     */
    public String provisionsToOtherPayables(PTODTO ptoDTO) 
    		throws PayCheckedException ;
}
