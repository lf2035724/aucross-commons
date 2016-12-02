/**
 * GuaranteePaymentAppService.java
 * 版权所有(C) 2013 深圳市雁联计算系统有限公司-证联融通电子有限公司 
 * 创建:LiuQ 2013-3-27
 */
package com.ylink.ylpay.common.project.pay.app;

import java.util.List;

import com.ylink.ylpay.common.project.pay.dto.AccountPaymentDTO;
import com.ylink.ylpay.common.project.pay.dto.ApplyRefundDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayChannelInfoDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayPaymentDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayReturnInfoDTO;
import com.ylink.ylpay.common.project.pay.dto.GuaranteeAccountPaymentMainDTO;
import com.ylink.ylpay.common.project.pay.dto.GuaranteeGatewayPaymentMainDTO;
import com.ylink.ylpay.common.project.pay.dto.GuaranteeShortcutPaymentMainDTO;
import com.ylink.ylpay.common.project.pay.dto.ShortcutPaymentDTO;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

/**
 * @author LiuQ
 * @date 2013-8-16
 * @description 担保交易对外服务接口
 */
public interface GuaranteePaymentAppService {

	/**
     * @description 账户支付(余额支付)
     * @param guaranteeAccountpaymentMainDTO
     * 			交易详情中：paymentMsg为必填项
     * @return 交易订单号
     * @throws PayCheckedException  
     * @author LiuQ
     * @date 2013-8-16
     */
    public List<String> accountPayment(GuaranteeAccountPaymentMainDTO guaranteeAccountpaymentMainDTO)
        throws PayCheckedException;
    
    /**
     * @description 网关支付
     * @param guaranteeGatewaypaymentMainDTO
     *        交易详情中：paymentMsg、bankType为必填项
     * @return 网关返回信息 订单编号、银行url
     * @throws PayCheckedException  
     * @author LiuQ
     * @date 2013-8-16
     */
    public GatewayReturnInfoDTO gatewayPayment(GuaranteeGatewayPaymentMainDTO guaranteeGatewaypaymentMainDTO,
            GatewayChannelInfoDTO gatewayChannelInfoDTO)
        throws PayCheckedException;
    /**
     * @description 快捷支付
     * @param guaranteeShortcutpaymentMainDTO
     * 		     交易详情中：paymentMsg、authId、bankType、bankCardNo为必填项
     * @return 交易订单号
     * @throws PayCheckedException  
     * @author LiuQ
     * @date 2013-8-16
     */
    public List<String> shortcutPayment(GuaranteeShortcutPaymentMainDTO guaranteeShortcutpaymentMainDTO)
		throws PayCheckedException;
    
    /**
     * @description 担保支付--确认支付
     * @param paymentId 交易订单编号
     * @throws PayCheckedException  
     * @author LiuQ
     * @date 2013-8-16
     */
    public void confirmPayment(String paymentId) throws PayCheckedException;
    
    /**
     * @description 担保支付--确认支付(支持批量确认支付)
     * @param paymentIds
     * @throws PayCheckedException  
     * @author LiuQ
     * @date 2013-8-16
     */
    public void batchConfigPayment(List<String> paymentIds) throws PayCheckedException;
    
    /**
     * @description 退款申请
     * @param applyRefundDTO
     * @return
     * @throws PayCheckedException  
     * @author LiuQ
     * @date 2013-8-16
     */
    public String applyRefund(ApplyRefundDTO applyRefundDTO) throws PayCheckedException;
    
    /**
     * @description 取消退款申请
     * @param refundId  
     * @author LiuQ
     * @date 2013-8-16
     */
    public void cancelRefund(String refundId);
    
    /**
     * @description 拒绝退款
     * @param refundId
     * @param refuseReson  
     * @author LiuQ
     * @date 2013-8-16
     */
    public void refuseRefund(String refundId, String refuseReson);
    
    /**
     * @description 同意退款
     * @param refundId  
     * @author LiuQ
     * @date 2013-8-16
     */
    public void acceptRefund(String refundId);
    
    /**
     * @description 单笔账户支付(余额支付)
     * @param accountPaymentDTO
     * @return
     * @throws PayCheckedException  
     * @author LiuQ
     * @date 2013-8-16
     */
    public String accountPaymentSingle(AccountPaymentDTO accountPaymentDTO)
            throws PayCheckedException;
    
    /**
     * @description 单笔网关支付
     * @param gatewayPaymentDTO
     * @param gatewayChannelInfoDTO
     * @return
     * @throws PayCheckedException  
     * @author LiuQ
     * @date 2013-8-16
     */
    public GatewayReturnInfoDTO gatewayPaymentSingle(GatewayPaymentDTO gatewayPaymentDTO,
    		GatewayChannelInfoDTO gatewayChannelInfoDTO)
        throws PayCheckedException;
    
    /**
     * @description 单笔快捷支付
     * @param shortcutPaymentDTO
     * @return
     * @throws PayCheckedException  
     * @author LiuQ
     * @date 2013-8-16
     */
    public String shortcutPaymentSingle(ShortcutPaymentDTO shortcutPaymentDTO)
		throws PayCheckedException;
}
