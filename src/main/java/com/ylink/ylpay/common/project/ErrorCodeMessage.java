/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-27
 */

package com.ylink.ylpay.common.project;

import java.util.HashMap;
import java.util.Map;


/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-27
 * @description：系统异常代码枚举类
 */

public enum ErrorCodeMessage{
	
	/**支付系统异常定义**/
	PAY_SYSTEM_ERROR("PAY_000", "支付系统发生未知错误"),
	DATA_VALIDATE_ERROR("PAY_001", "数据格式错误"),
	BUSISN_EXISTED("PAY_002", "业务流水号重复"),
	DEALCODE_NOEXISTED("PAY_003", "业务步骤代码不存在"),
	FIND_ACCTRULE_ERROR("PAY_004", "查询记账规则失败"),
	ACCTRULE_ERROR("PAY_005", "记账规则配置错误"),
	VIRTUALCUST_NOEXISTED("PAY_006", "虚拟客户不存在"),
	PAYOPTTYPE_ERROR("PAY_007", "支付接口类型参数错误"),
	ORDER_NOEXISTED("PAY_008", "订单不存在"),
	ORDER_STATUS_ERROR("PAY_009", "订单状态错误"),
	AUTHID_CHECK_ERROR("PAY_010", "授权号验证错误"),
	RISK_CONTROL_CHECK_ERROR("PAY_011", "风控验证验证失败"),
	RECHARGETYPE_ERROR("PAY_012", "充值方式不支持"),
	PRODUCTTYPE_ERROR("PAY_013", "不支持该产品类型"),
	EPAYPURCHASE_ERROR("PAY_014", "现金易申购不满足条件"),
	ACCOUNTRETURN_ERROR("PAY_015", "记账信息返回失败"),
	ACCBALANCE_INSUFFICIENT("PAY_016", "账户余额不足"),
	ORDERHANDLE_ERROR("PAY_017", "部分订单处理失败"),
	CHANNELHANDLE_ERROR("PAY_018", "调用渠道系统失败"),
	ACCBALANCEFIND_ERROR("PAY_019", "账户余额查询失败"),
	CANCEL_APPLY_ERROR("PAY_020", "撤单申请失败"),
	RECHARGE_ERROR("PAY_021", "充值失败"),
	PAYMENT_ERROR("PAY_022", "支付失败"),
	ACCOUNTHANDLE_ERROR("PAY_023", "调用账务系统失败"),
	ORDER_HANDLED("PAY_024", "订单已处理"),
	FIND_ORDERSTATUS_ERROR("PAY_025", "查询订单状态失败"),
	MANAGERHANDLE_ERROR("PAY_026", "调用后台管理系统失败"),
	PAYMENTTYPE_ERROR("PAY_027", "支付方式错误"),
	APPLYREFUND_SUCCESS("PAY_028", "退款申请失败，该交易订单已经退款成功"),
	APPLYREFUND_HANDLING("PAY_029", "退款申请失败，该交易订单正在申请退款"),
	APPLYREFUND_AMTERROR("PAY_030", "退款申请失败，退款金额不能大于交易金额"),
	REFUNDOPER_ERROR("PAY_031", "操作失败，该退款单状态已经发生改变"),
	ADDITIONAL_RECORD_ERROR("PAY_032", "调账充值补录回退失败"),
	CHANNELCONNECT_ERROR("PAY_033", "调用渠道系统失败,结果未知"),
	
	/**账务系统异常定义**/
	ACCOUNT_000_ERROR("ACCOUNT_000", "账务系统发生未知错误"),
	ACCOUNT_001_ERROR("ACCOUNT_001", "该科目不存在"),
	ACCOUNT_002_ERROR("ACCOUNT_002", "该二级科目不正确"),
	ACCOUNT_003_ERROR("ACCOUNT_003", "该客户的这个二级科目账户已存在"),
	ACCOUNT_004_ERROR("ACCOUNT_004", "该账户非正常状态"),
	ACCOUNT_005_ERROR("ACCOUNT_005", "根据客户编号和二级科目无法查询到账户"),
	ACCOUNT_006_ERROR("ACCOUNT_006", "无法查询到对应的记账规则"),
	ACCOUNT_007_ERROR("ACCOUNT_007", "该记账规则配置错误"),
	ACCOUNT_008_ERROR("ACCOUNT_008", "账户余额不足"),
	ACCOUNT_009_ERROR("ACCOUNT_009", "账户不存在"),
	ACCOUNT_010_ERROR("ACCOUNT_010", "记账金额不能小于或等于零"),
	ACCOUNT_011_ERROR("ACCOUNT_011", "记账接口调用错误，AccountBookDTO为空"),
	ACCOUNT_012_ERROR("ACCOUNT_012", "账户信息不正确"),
	ACCOUNT_013_ERROR("ACCOUNT_013", "数据格式错误"),
	ACCOUNT_014_ERROR("ACCOUNT_014", "根据支付订单号找不到对应的记账接口流水"),
	ACCOUNT_015_ERROR("ACCOUNT_015", "冲正金额与原支付金额不符"),
	ACCOUNT_016_ERROR("ACCOUNT_016", "客户类型错误"),
	ACCOUNT_017_ERROR("ACCOUNT_017", "记账类型错误"),
	ACCOUNT_018_ERROR("ACCOUNT_018", "记账来源字段错误"),
	ACCOUNT_019_ERROR("ACCOUNT_019", "该记账流水已冲正"),
	ACCOUNT_020_ERROR("ACCOUNT_020","调用管理系统失败"),
	ACCOUNT_021_ERROR("ACCOUNT_021","根据支付订单号找不到对应的记账流水"),
	ACCOUNT_022_ERROR("ACCOUNT_022","根据支付订单号找不到对应的冲正接口流水"),
	ACCOUNT_023_ERROR("ACCOUNT_023","查询条件不能为空，传入对象为空！"),
	ACCOUNT_024_ERROR("ACCOUNT_024","查询条件不能为空,ruleId为空！"),
	ACCOUNT_025_ERROR("ACCOUNT_025","查询条件不能为空,付款方借贷类型为空！"),
	ACCOUNT_026_ERROR("ACCOUNT_026","查询条件不能为空,收款方借贷类型为空！"),
	ACCOUNT_027_ERROR("ACCOUNT_027","收款方和付款方的借贷类型不能相同！"),
	ACCOUNT_028_ERROR("ACCOUNT_028","获取当前记账日期出错！"),
	ACCOUNT_029_ERROR("ACCOUNT_029","参数不能为空"),
	ACCOUNT_030_ERROR("ACCOUNT_030","授信记录不存在"),
	ACCOUNT_031_ERROR("ACCOUNT_031","授信余额不足"),
	ACCOUNT_032_ERROR("ACCOUNT_032","额度降低为负"),
	
	/**清结算系统异常定义**/
	SETTLE_SYSTEM_ERROR("SETTLE_000", "清结算系统发生未知错误"),
	DAILY_SETTLE_ERROR("SETTLE_001","日切错误"), 
	TRIAL_BALANCE_ERROR("SETTLE_002","试算平衡错误"),
	YEAREND_CLOSING_ERROR("SETTLE_003","年底结转错误"),
	ACCOUNT_CHECKING_ERROR("SETTLE_004","对账错误"),
	CALC_INTEREST_ERROR("SETTLE_005","计算日期不在当前系统日期之前，不能进行计息处理"),
	INTEREST_SETTLE_ERROR("SETTLE_006","结息错误"),
	SETTLE_DATA_VALIDATE_ERROR("SETTLE_007", "数据格式错误"),
	SAVE_BANK_BILL_ERROR("SETTLE_008","银行对账流水传入错误"),
	BANK_BILL_CHECKING_ERROR("SETTLE_009","银行流水对账错误"),
	
	SETTLE_000_ERROR("SETTLE_000", "清结算系统发生未知错误"),
	SETTLE_001_ERROR("SETTLE_001", "日切失败"),
	SETTLE_002_ERROR("SETTLE_002","试算平衡失败"),
	SETTLE_003_ERROR("SETTLE_003","数据格式错误"),
	SETTLE_004_ERROR("SETTLE_004", "支付系统与账务系统对账失败"),
	SETTLE_005_ERROR("SETTLE_005","初始化对账监控表失败"),
	SETTLE_006_ERROR("SETTLE_006","支付系统与账务系统对账失败"),
	SETTLE_007_ERROR("SETTLE_007","渠道银行与账务系统对账失败"),
	SETTLE_008_ERROR("SETTLE_008","基金扎差失败"),
	SETTLE_009_ERROR("SETTLE_009","调用管理系统失败"),
	SETTLE_010_ERROR("SETTLE_010","结算基金公司划拨资金失败"),
	SETTLE_011_ERROR("SETTLE_011","结算投资人划拨资金失败"),
	SETTLE_012_ERROR("SETTLE_012","报表不存在"),
	SETTLE_013_ERROR("SETTLE_013","计息结果转账失败"),
	SETTLE_014_ERROR("SETTLE_014","调用账务系统失败"),
	SETTLE_015_ERROR("SETTLE_015","查询账户信息失败"),
	SETTLE_016_ERROR("SETTLE_016","银行调账失败"),
	SETTLE_017_ERROR("SETTLE_017","该业务不能进行补录"),
	SETTLE_018_ERROR("SETTLE_018","调用支付系统失败"),
	SETTLE_019_ERROR("SETTLE_019","查询记账失败"),
	SETTLE_020_ERROR("SETTLE_020","内部调账失败"),
	SETTLE_021_ERROR("SETTLE_021","渠道银行与账务系统手工对账失败"),
	SETTLE_022_ERROR("SETTLE_022","渠道银行数据未准备成功，不能对账"),
	SETTLE_023_ERROR("SETTLE_023","操作处理中，请勿重复操作"),
	SETTLE_024_ERROR("SETTLE_024","支付系统与账务系统手工对账失败"),
	SETTLE_025_ERROR("SETTLE_025","该账务日期时间段内内部对账未成功，不能查询的未对账科目信息"),
	SETTLE_026_ERROR("SETTLE_026","查询支付平台交易统计数据出错"),
	SETTLE_027_ERROR("SETTLE_027","查询资产负债表月份参数错误"),

	/**申请汇总日期小于上次等于汇总日期，不能进行汇总处理*/
	SETTLE_028_ERROR("SETTLE_028","申请汇总日期小于等于上次汇总日期，不能进行汇总处理"),
	/**更新汇总数据条数为0*/
	SETTLE_029_ERROR("SETTLE_029","更新汇总数据条数为0"),
	/**该科目已转账过或账户结息没有完成，不能转账*/
	SETTLE_030_ERROR("SETTLE_030","该科目已转账过或账户结息没有完成，不能转账"),

	SETTLE_031_ERROR("SETTLE_031","查找商户出错！"),
	SETTLE_032_ERROR("SETTLE_032","获取商户为空！"),
	SETTLE_033_ERROR("SETTLE_033","查找商户对应的计费模板出错！"),
	SETTLE_034_ERROR("SETTLE_034","调用支付接口出错！"),
	SETTLE_035_ERROR("SETTLE_035","有效商户为空！"),
	SETTLE_036_ERROR("SETTLE_036","计费规则为空!"),
	SETTLE_037_ERROR("SETTLE_037","系统参数值为空"),
	SETTLE_038_ERROR("SETTLE_038","计费周期为空！"),
	SETTLE_039_ERROR("SETTLE_039","计费类型出错！"),
	SETTLE_040_ERROR("SETTLE_040","分段计费规则出错!"),
	SETTLE_041_ERROR("SETTLE_041","累进计费规则出错!"),
	SETTLE_042_ERROR("SETTLE_042","不分段计费规则出错!"),
	SETTLE_043_ERROR("SETTLE_043","上一帐务日期为空"),
	SETTLE_044_ERROR("SETTLE_044","时间格式化异常"),
	SETTLE_045_ERROR("SETTLE_045","查询商户计费信息出错"),
	SETTLE_046_ERROR("SETTLE_046","查询开始时间与结束时间不能为空!"),
	SETTLE_047_ERROR("SETTLE_047","渠道系统中对账信息,找不到监控id:对应的监控数据"),
	SETTLE_048_ERROR("SETTLE_048","渠道类型错误"),
	SETTLE_049_ERROR("SETTLE_049","产品类型错误"),
	SETTLE_050_ERROR("SETTLE_050","回退支付订单为空"),
	SETTLE_051_ERROR("SETTLE_051","传入参数错误，监控id不能为空"),
	SETTLE_052_ERROR("SETTLE_052","查询三级科目出错"),
	SETTLE_053_ERROR("SETTLE_053","根据id查询对账监控信息出错"),
	SETTLE_054_ERROR("SETTLE_054","传入参数错误"),

	/**渠道系统异常定义**/
	//已决
	CHANNEL_SYSTEM_ERROR("CHANNEL_000", "渠道系统发生未知错误"),
	CHANNEL_005_ERROR("CHANNEL_005_ERROR", "传入参数不合法"),
	CHANNEL_009_ERROR("CHANNEL_009_ERROR", "银行卡号和用户名不匹配"),
	CHANNEL_010_ERROR("CHANNEL_010_ERROR", "银行卡行别错误"),
	CHANNEL_011_ERROR("CHANNEL_011_ERROR", "不支持的证件类型"),
	
	//未决
	CHANNEL_PENDENCY_ERROR("CHANNEL_PENDENCY", "渠道系统发生未决错误，不可以进行逆向操作"),
	CHANNEL_001_ERROR("CHANNEL_001_ERROR", "实际完成数据数量和预期数量不一致"),
	CHANNEL_002_ERROR("CHANNEL_002_ERROR", "未找到该交易明细"),
	CHANNEL_003_ERROR("CHANNEL_003_ERROR", "未找到该条日志"),
	CHANNEL_004_ERROR("CHANNEL_004_ERROR", "未找到该授权号!"),
	CHANNEL_006_ERROR("CHANNEL_006_ERROR", "连接银行系统失败!"),
	CHANNEL_007_ERROR("CHANNEL_007_ERROR", "连接银行系统超时!"),
	CHANNEL_008_ERROR("CHANNEL_008_ERROR", "渠道解析银行交易回执信息失败"),
	
	/**基金前置系统异常定义**/
	FUND_DATA_VALIDATE_ERROR("FUND_001", "数据格式错误"),
	
	SETTLE_CALL_ERROR("SETTLE_999", "调用清结算系统失败"),
	PAY_CALL_ERROR("PAY_999", "调用支付系统失败"),
	ACCOUNT_CALL_ERROR("ACCOUNT_999", "调用账务系统失败"),
	MP_CALL_ERROR("MP_999", "调用后台管理系统失败"),
	CHANNEL_CALL_ERROR("CHANNEL_999", "调用渠道系统失败"),
	
	
	
	/*OTCBB前置异常*/
	OTCBB_001_ERROR("OTCBB_001", "日切调用失败"),
	OTCBB_002_ERROR("OTCBB_002", "从管理平台获取商户列表出错"),
	OTCBB_003_ERROR("OTCBB_003","业务类型与报文类型不匹配"),
	OTCBB_004_ERROR("OTCBB_004","证件类型与系统证件类型不匹配"),
	OTCBB_005_ERROR("OTCBB_005","备付金余额查询失败"),
	OTCBB_006_ERROR("OTCBB_006","该银行账户已经被绑定"),
	OTCBB_007_ERROR("OTCBB_007","参数不合法"),
	OTCBB_008_ERROR("OTCBB_008","批量成功更新结果和预期结果数量不一致"),
	OTCBB_009_ERROR("OTCBB_009","OTCBB前置系统对账发生异常，对账主表为空"),
	OTCBB_010_ERROR("OTCBB_010","208DTO拼串失败"),
	OTCBB_011_ERROR("OTCBB_011","将数据写入blob对象出错"),
	OTCBB_012_ERROR("OTCBB_012","该客户未绑定该银行账户"),
	OTCBB_013_ERROR("OTCBB_013", "获取账务日期出错"),
	OTCBB_014_ERROR("SETTLE_014","查找商户为空！"),
	OTCBB_015_ERROR("SETTLE_015","商户被冻结！"),
	OTCBB_016_ERROR("OTCBB_016","非交易时间,禁止交易！"),
	OTCBB_017_ERROR("OTCBB_017","入金流水号重复"),
	OTCBB_018_ERROR("OTCBB_018","资金账号不存在"),

	
	/** 实时赎回额度校验异常 **/
	TIMELYREDEMTION_001_ERROR("TIMELYREDEMTION_001", "商户授信额度被冻结"),
	TIMELYREDEMTION_002_ERROR("TIMELYREDEMTION_002", "商户授信额度不足"),
	TIMELYREDEMTION_003_ERROR("TIMELYREDEMTION_003", "增加商户已用授信额度失败"),
	TIMELYREDEMTION_004_ERROR("TIMELYREDEMTION_004", "根据商户code获取商户的客户信息失败"),
	TIMELYREDEMTION_005_ERROR("TIMELYREDEMTION_005", "根据用户ID获取用户信息失败"),
	TIMELYREDEMTION_006_ERROR("TIMELYREDEMTION_006", "获取银行账户信息失败"),
	TIMELYREDEMTION_007_ERROR("TIMELYREDEMTION_007", "根据提现订单获取交易订单信息失败"),
	TIMELYREDEMTION_008_ERROR("TIMELYREDEMTION_008", "商户授信账户不存在"),
	TIMELYREDEMTION_009_ERROR("TIMELYREDEMTION_009", "充值金额加赎回金额不等于购买金额"),
	TIMELYREDEMTION_010_ERROR("TIMELYREDEMTION_010", "获取账户信息失败"),
	TIMELYREDEMTION_011_ERROR("TIMELYREDEMTION_011", "获取的账户状态失效"),
	TIMELYREDEMTION_012_ERROR("TIMELYREDEMTION_012", "获取的账户余额不足"),
	TIMELYREDEMTION_013_ERROR("TIMELYREDEMTION_013", "根据客户号获取用户信息失败"),
	TIMELYREDEMTION_014_ERROR("TIMELYREDEMTION_014", "获取付款行配置信息失败"),
	TIMELYREDEMTION_015_ERROR("TIMELYREDEMTION_015", "获取渠道路由信息失败"),
	TIMELYREDEMTION_016_ERROR("TIMELYREDEMTION_016", "保存提现付款信息失败"),
	TIMELYREDEMTION_017_ERROR("TIMELYREDEMTION_017", "获取提现客户银行卡信息失败"),
	TIMELYREDEMTION_018_ERROR("TIMELYREDEMTION_018", "冲正商户已用授信额度失败"),
	TIMELYREDEMTION_019_ERROR("TIMELYREDEMTION_019", "线上提现成功异步回调通知失败"),
	TIMELYREDEMTION_020_ERROR("TIMELYREDEMTION_020", "没有找到相对应的提现订单"),
	TIMELYREDEMTION_021_ERROR("TIMELYREDEMTION_021", "减少商户已用授信额度失败"),
	
	/** 支付系统调用渠道系统快捷支付异常 **/
	BANKRETURNCODE_0008("0008", "账户状态异常"),
	BANKRETURNCODE_0009("0009", "交易超过单笔网上交易限额"),
	BANKRETURNCODE_0010("0010", "交易超过当日网上交易累计限额"),
	BANKRETURNCODE_0011("0011", "账户密码不正确"),
	BANKRETURNCODE_0012("0012", "户名不符"),
	BANKRETURNCODE_0013("0013", "您所提交的账号尚未申请网上操作功能，不能进入交易。"),
	BANKRETURNCODE_0014("0014", "您的账户尚未签约"),
	BANKRETURNCODE_0015("0015", "交易超过网上交易累计限额"),
	BANKRETURNCODE_0016("0016", "余额不足"),
	BANKRETURNCODE_0017("0017", "银行无此订单"),
	BANKRETURNCODE_0018("0018","金额超限"),
	BANKRETURNCODE_0019("0019", "非法商户"),
	BANKRETURNCODE_0020("0020", "验证签名失败"),
	BANKRETURNCODE_0021("0021", "签名失败"),
	BANKRETURNCODE_0022("0022", "客户信息不存在"),
	BANKRETURNCODE_0023("0023", "客户信息不一致"),
	BANKRETURNCODE_0024("0024", "商户用户不能支付"),
	BANKRETURNCODE_0025("0025", "客户状态不正常"),
	BANKRETURNCODE_0026("0026", "客户无支付权限"),
	BANKRETURNCODE_0027("0027", "密码解密错误"),
	BANKRETURNCODE_0028("0028", "保证金账户客户交易密码错误"),
	BANKRETURNCODE_0029("0029", "保证金账户客户资金密码错误"),
	BANKRETURNCODE_0030("0030", "证券资金可用不足"),
	BANKRETURNCODE_0031("0031", "支付金额超出单笔支付上限"),
	BANKRETURNCODE_0032("0032", "支付金额超出当日累计支付上限"),
	BANKRETURNCODE_0034("0034", "保证金账户资产帐号不存在或者客户未开通网上委托"),
	
	BANKRETURNCODE_0039("0039", "非交易时间"),
	BANKRETURNCODE_0040("0040", "保证金账户资产帐户状态不正常"),
	BANKRETURNCODE_0041("0041", "订单已存在但金额不一致"),
	BANKRETURNCODE_0042("0042", "存在相同已支付订单"),
	BANKRETURNCODE_0043("0043", "系统状态非托管状态，无法受理提现请求"),
	BANKRETURNCODE_0044("0044", "系统状态不是正常状态，不能开通权限"),
	BANKRETURNCODE_0045("0045", "该客户已经有支付权限，无需再次开通"),
	BANKRETURNCODE_0046("0046", "中间业务平台暂停托管"),
	
	/**供应链系统异常定义**/
	SUPPLYCHAIN_SYSTEM_ERROR("SUPPLYCHAIN_000", "供应链系统发生未知错误"),
	
	SUPPLYCHAIN_000_ERROR("SUPPLYCHAIN_000", "供应链系统发生未知错误")
	;
	
	
	
	private String value;
	private String displayName;
	
	public String getValue() {
        return this.value;
    }
	
	public String getDisplayName() {
		return displayName;
	}
	
	private ErrorCodeMessage(String value, String displayName){
		this.value = value;
		this.displayName = displayName ;
	}
	
	private static Map<String, ErrorCodeMessage> valueMap = new HashMap<String, ErrorCodeMessage>();

	static {
		for (ErrorCodeMessage _enum : ErrorCodeMessage.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static ErrorCodeMessage parseOf(String value){
		for(ErrorCodeMessage item : values())
			if(item.getValue().equals(value))
				return item;
		
		throw new IllegalArgumentException("系统异常代码["+value+"]不匹配!");
	}
	
	/**
	 * @description 已决/未决--实时赎回
	 * @param value
	 * @return  true 已决 false 未决
	 * @author LiuQ
	 * @date 2013-11-17
	 */
	public static boolean isPendency(String value) {
		//已决集合
		ErrorCodeMessage[] errorCodes= new ErrorCodeMessage[] { TIMELYREDEMTION_001_ERROR, TIMELYREDEMTION_002_ERROR, TIMELYREDEMTION_003_ERROR, TIMELYREDEMTION_004_ERROR
				, TIMELYREDEMTION_005_ERROR, TIMELYREDEMTION_006_ERROR, TIMELYREDEMTION_007_ERROR, TIMELYREDEMTION_008_ERROR
				, TIMELYREDEMTION_010_ERROR, TIMELYREDEMTION_011_ERROR, TIMELYREDEMTION_012_ERROR, TIMELYREDEMTION_013_ERROR, TIMELYREDEMTION_014_ERROR
				, TIMELYREDEMTION_015_ERROR, TIMELYREDEMTION_016_ERROR, TIMELYREDEMTION_017_ERROR, TIMELYREDEMTION_018_ERROR, BUSISN_EXISTED
				, ACCOUNTHANDLE_ERROR ,DATA_VALIDATE_ERROR,ACCBALANCE_INSUFFICIENT};
		ErrorCodeMessage type=ErrorCodeMessage.parseOf(value);
		for (ErrorCodeMessage errorCode : errorCodes) {
			if(errorCode.equals(type)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @description 已决/未决--申购(快捷支付)
	 * @param value
	 * @return  true 已决 false 未决
	 * @author LiuQ
	 * @date 2013-11-21
	 */
	public static boolean subscribeIsPendency(String value){
		//未决集合
		ErrorCodeMessage[] errorCodes= new ErrorCodeMessage[] { CHANNELCONNECT_ERROR };
		ErrorCodeMessage type=ErrorCodeMessage.parseOf(value);
		for (ErrorCodeMessage errorCode : errorCodes) {
			if(errorCode.equals(type)){
				return false;
			}
		}
		return true;
	}
}
