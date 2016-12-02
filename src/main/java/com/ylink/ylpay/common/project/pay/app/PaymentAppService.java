/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-1
 */

package com.ylink.ylpay.common.project.pay.app;

import com.ylink.ylpay.common.project.pay.dto.AccountMerchantTransferDTO;
import com.ylink.ylpay.common.project.pay.dto.AccountPaymentDTO;
import com.ylink.ylpay.common.project.pay.dto.AccountTransferDTO;
import com.ylink.ylpay.common.project.pay.dto.AccountTransferPayableDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayChannelInfoDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayFundPaymentDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayFundReturnInfoDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayPaymentDTO;
import com.ylink.ylpay.common.project.pay.dto.GatewayReturnInfoDTO;
import com.ylink.ylpay.common.project.pay.dto.JhbTimelySubscribeDTO;
import com.ylink.ylpay.common.project.pay.dto.PayablesTransferDTO;
import com.ylink.ylpay.common.project.pay.dto.RedemptionAccountTransferDTO;
import com.ylink.ylpay.common.project.pay.dto.ShortcutPaymentDTO;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;

/**
 * @author YG.HU
 * @date 2012-11-1
 * @description：支付对外服务接口
 */

public interface PaymentAppService {

	/**
	 * @description 账户转账
	 * @param accountTransferDTO
	 * @return 交易订单号 交易详情中：paymentMsg为必填项
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-11-1
	 */
	public String accountTransfer(AccountTransferDTO accountTransferDTO)
			throws PayCheckedException;

	/**
	 * @description 应付款转账（业务：赎回）
	 * @param accountTransferDTO
	 * @return 交易订单号 交易详情中：paymentMsg为必填项
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-11-1
	 */
	public String payablesTransfer(PayablesTransferDTO payablesTransferDTO)
			throws PayCheckedException;

	/**
	 * @description 余额支付
	 * @param accountPaymentDTO
	 * @return 交易订单号 交易详情中：paymentMsg为必填项
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-11-1
	 */
	public String accountPayment(AccountPaymentDTO accountPaymentDTO)
			throws PayCheckedException;

	/**
	 * @description 网关支付
	 * @param gatewayPaymentDTO
	 *            交易详情中：paymentMsg、bankType为必填项
	 * @return 网关返回信息 订单编号、银行url
	 * @throws PayCheckedException
	 * @author YG.HU
	 * @date 2012-11-2
	 */
	public GatewayReturnInfoDTO gatewayPayment(
			GatewayPaymentDTO gatewayPaymentDTO,
			GatewayChannelInfoDTO gatewayChannelInfoDTO)
			throws PayCheckedException;

	/**
	 * @description 基金网关支付
	 * @param gatewayPaymentDTO
	 *            交易详情中：paymentMsg、bankType为必填项
	 * @return 网关返回信息 订单编号、银行url
	 * @throws PayCheckedException
	 * @author yu.han
	 * @date 2013-1-30
	 */
	public GatewayFundReturnInfoDTO gatewayFundPayment(
			GatewayFundPaymentDTO gatewayPaymentDTO,
			GatewayChannelInfoDTO gatewayChannelInfoDTO)
			throws PayCheckedException;

	/**
	 * @description 快捷支付
	 * @param shortcutPaymentDTO
	 *            交易详情中：paymentMsg、authId、bankType、bankCardNo为必填项
	 * @return 交易订单号
	 * @throws PayCheckedException
	 * @author ZhangDM(Mingly)
	 * @date 2012-11-3
	 */
	public String shortcutPayment(ShortcutPaymentDTO shortcutPaymentDTO)
			throws PayCheckedException;

	/**
	 * @description 金汇宝支付
	 * @throws PayCheckedException
	 * @author wanglei
	 * @date 2013-11-1
	 */
	public JhbTimelySubscribeDTO jhbTimelySubscribe(
			JhbTimelySubscribeDTO jhbTimelySubscribeDto)
			throws PayCheckedException;
	
	/**
	 * @description 实时赎回资金调拨--实时赎回业务
	 * @param redemptionAccountTransferDTO
	 * @return
	 * @throws PayCheckedException  
	 * @author LiuQ
	 * @date 2013-11-13
	 */
	public String timelyRemedptionTransfer(RedemptionAccountTransferDTO redemptionAccountTransferDTO)
			throws PayCheckedException;
	
	
	/**
	 * 
	 * @description 
	 * @param accountTransferDTO
	 * @return
	 * @throws PayCheckedException  
	 * @author jf.zhao
	 * @date 2014-7-3
	 */
	public String accountMerchantTransfer(AccountMerchantTransferDTO accountMerchantTransferDTO)
			throws PayCheckedException;
	/**
	 * 
	 * @description 
	 * @param accountTransferDTO
	 * @return
	 * @throws PayCheckedException  
	 * @author jf.zhao
	 * @date 2014-7-29
	 */
	public String accountTransferByPayables(AccountTransferPayableDTO accountTransferPayableDTO)
			throws PayCheckedException;
	
}
