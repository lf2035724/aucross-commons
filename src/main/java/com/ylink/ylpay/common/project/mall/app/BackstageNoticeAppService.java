package com.ylink.ylpay.common.project.mall.app;

import com.ylink.ylpay.common.project.mall.dto.PayNoticeDTO;

/** 
* @Description:后台服务器通知AppService
* @author yangchen
* @date 2013-8-15 下午3:44:55 
*/ 
public interface BackstageNoticeAppService {
	
	
	
	/** 
	* @Title: finishSingleRealTimePay 
	* @Description: 单笔即时到账支付完成通知
	* @param 
	* @return String
	* @throws 
	* @author yang_chen
	* @date 2013-8-27 下午5:07:13
	*/
	public String finishSingleRealTimePay(PayNoticeDTO payNoticeDTO) throws Exception;
	
	/**
	 * 
	* @Title: finishPay 
	* @Description: 担保类支付完成通知 
	* @param  
	* @return String
	* @throws 
	* @author yang_chen
	* @date 2013-8-21 下午3:23:41
	 */
	public String finishPay(PayNoticeDTO payNoticeDTO) throws Exception;
	
	
	/** 
	* @Title: confirmPay 
	* @Description: 担保类确认支付 （个人）
	* @param 
	* @return String
	* @throws 
	* @author yang_chen
	* @date 2013-8-21 下午3:24:08
	*/
	public String finishConfirmPay(PayNoticeDTO payNoticeDTO) throws Exception;
	
	/** 
	* @Title: applyRefund 
	* @Description: 担保类申请退款 （个人）
	* @param 
	* @return String
	* @throws 
	* @author yang_chen
	* @date 2013-8-21 下午3:24:26
	*/
	public String finishApplyRefund(PayNoticeDTO payNoticeDTO) throws Exception;
	
	/** 
	* @Title: cancelRefund 
	* @Description: 担保类取消退款（个人）
	* @param 
	* @return String
	* @throws 
	* @author yang_chen
	* @date 2013-8-21 下午3:25:12
	*/
	public String finishCancelRefund(PayNoticeDTO payNoticeDTO) throws Exception;
	
	/** 
	* @Title: agreeRefund 
	* @Description: 担保类同意退款（商户）
	* @param 
	* @return String
	* @throws 
	* @author yang_chen
	* @date 2013-8-21 下午3:26:03
	*/
	public String finishAgreeRefund(PayNoticeDTO payNoticeDTO) throws Exception;
	
	/** 
	* @Title: rejectRefund 
	* @Description: 担保类拒绝退款（商户） 
	* @param 
	* @return String
	* @throws 
	* @author yang_chen
	* @date 2013-8-21 下午3:26:32
	*/
	public String finishRejectRefund(PayNoticeDTO payNoticeDTO) throws Exception;
	
}
