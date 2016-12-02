/**
 * 版权所有(C) 2013 证联融通
 * 创建:wanglei 2013-05-14
 */
package com.ylink.ylpay.common.project.otcbb.constant;

/**
 * @author wanglei
 * @date 2013-05-14
 * @description：Deposit常量
 */
public class DepositCons {
	
	//状态
	public static final String Deposit_Status_New = "00"; //新建
	public static final String Deposit_Status_Paying = "01"; //支付中
	public static final String Deposit_Status_PaySuccess = "02"; //支付成功
	public static final String Deposit_Status_PayError = "03"; //支付失败
	
	//审核状态
	public static final String Deposit_AuditStatus_NoAudit = "00";//未审核
	public static final String Deposit_AuditStatus_AuditPass = "01"; // 通过审核
	public static final String Deposit_AuditStatus_AuditRefuse = "02";//拒绝
	public static final String Deposit_AuditStatus_AuditIng = "03";//待审核
	
	//是否发送回执
	public static final String Deposit_CallBack_No = "00"; //未回执
	public static final String Deposit_CallBack_Yes = "01";//已回执
	
	//是否补发
	public static final String Deposit_isReissue_No = "00"; //正常
	public static final String Deposit_isReissue_Yes = "01";//补发
}
