/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.constant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ylink.ylpay.common.project.fund.constant.SupervisionGrantPurposeType;
import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author YangXiaojin
 * @date 2012-10-31
 * @description： 产品类型取值： 0 :基础产品 1：普通消费类产品 2：基金类产品 9：其它
 * 
 *               <pre>
 * (*注*)支付系统新增业务时，需要在该枚举类最下面的几个相应业务方法里把枚举类型加入进去.
 * </pre>
 * 
 *               <pre>
 * 	1.头寸调拨: (1).线下支付: bankAccountTransferAppService.bankAccountTransfer(...); (2).线下确认: callbackAppService.bankAccountTransferCallback(...).
 * 	2.转出(变为提现申请): (1).支付(不区分线上线下): bankAccountTransferAppService.bankAccountPayment(...).
 * 	3.转入: (1).线下确认: bankAccountTransferAppService.bankAccountCollection(...).
 * </pre>
 * 
 *               <pre>
 * 1.提现交易类: withdraws();
 * 2.充值回退交易类: reversals();
 * 3.提现交易类(但该种类型与其他提现交易不同, 需从总账户出钱): totalAccountWithdraws();
 * 4.转账充值: recharges();
 * </pre>
 */
public enum OptType implements PersistentEnum<OptType, String> {

	OTC_RECHARGE("301", "交易所充值"),

	OTC_WITHDRAW("302", "交易所提现"), 
	
	OTC_FUNDS_TRANSFER("303", "交易所资金调拨"), 
	
	OTC_INTEREST_ACCT("307", "交易所利息入账"), 
	
	OTC_INCOME_OUT("331", "交易所收入汇缴转出"), 
	
	OTC_FEE_OUT("332", "交易所手续费支出"),
	
	OTC_WRITEDOWN_FEE_OUT("333", "交易所冲减手续费支出"),

	BASE_RECHARGE("101", "消费充值"),

	BASE_TRANSFER_RECHARGE("112", "消费线下充值"), // 线下充值

	BASE_RECHARGE_ROLLBACK("105", "消费充值回退"),

	BASE_WITHDRAW("102", "消费提现"),

	BASE_TRNASFER("103", "消费转账"),

	BASE_CONSUMPTION("104", "消费支付"),
	
	BASE_INTEREST("106", "消费计息"),

	BASE_INTEREST_ACCT("107", "消费利息入账"),

	BASE_INCOME_OUT("131", "消费收入汇缴转出"), 
	
	BASE_FEE_OUT("132", "消费手续费支出"), 
	
	BASE_WRITEDOWN_FEE_OUT("133", "消费冲减手续费支出"),

	BASE_ADDITIONAL_RECHARGE("108", "消费补录充值"),

	BASE_ENT_PAY_VALIDATE("109", "企业打款认证"),

	BASE_ENT_PAY_VALIDATE_WITHDRAW("110", "企业打款认证提现"),

	BASE_GUARANTEE_ROLLBACK("111", "消费担保退款"),
	
	BASE_ASSETMANAGEMENT_TRANSFER_FINANCING("117", "资管人将投资款划拨给融资方"),
	
	BASE_FINANCING_RETURN_ASSETMANAGEMENT("118", "融资方还款给资管"),
	
	BASE_FINANCING_RETURN_INVESTOR("119", "资管将还款划拨投资人-赎回"),
	
	BASE_TRANSFER_PAY("120","转让款支付"),
	
	BASE_CLEAR_PAY("121","清偿款支付"),
	
	BASE_LOAN_PAY("122","虚户支付_放款"),
	
	BASE_REPAYMENT_PAY("123","虚户支付_还款"),
	
	BASE_GUARANTEE_RETURN_FINANCING("124", "担保人赔付给资管"),
	
	BASE_GUARANTEE_REFUND_FINANCING("125", "投资退款（项目未成立）"),
	
	FUND_RECHARGE("201", "基金充值"),
	
	FUND_JHB_GATEWAY_RECHARGE("203", "金汇宝网关充值"),
	
	FUND_JHB_SHORTCUT_RECHARGE("204", "金汇宝快捷充值"),

	BASE_MERCHANT_SETTLE("113", "消费商户结算到备付金"),

	BASE_MERCHANT_CHARGE("114", "消费商户计费"), // 线上

	BASE_FUNDS_TRANSFER("115", "消费资金调拨"), // 线上

	FUND_TRANSFER_RECHARGE("209", "基金线下充值"), // 线下充值
	
	FUND_TRANSFER("210","基金转帐"),

	FUND_RECHARGE_ROLLBACK("205", "基金充值回退"),

	FUND_WITHDRAW("202", "基金提现"),
	
	FUND_WITHDRAW_QUICKLY("292", "基金快速提现"),

	FUND_INTEREST("206", "基金计息"),

	FUND_INTEREST_ACCT("207", "基金利息入账"),

	FUND_INCOME_OUT("231", "基金收入汇缴转出"), 
	FUND_FEE_OUT("232", "基金手续费支出"), 
	FUND_WRITEDOWN_FEE_OUT("233", "基金冲减手续费支出"),

	FUND_ADDITIONAL_RECHARGE("208", "基金补录充值"),

	// 申购类
	FUND_SUBSCRIPTION("211", "认购"),
	FUND_PRICE_BUY("241", "定价买入"),
	FUND_DEFINITELY_BUY("242", "确定买入"),
	FUND_PRICE_SELL("243", "定价卖出"),
	FUND_DEFINITELY_SELL("244", "确定卖出"),
	FUND_QUOTE_CANCEL("245", "报价委托撤单"),
	FUND_PURCHASE("212", "申购"),

	FUND_AIP("214", "定投"),

	FUND_CANCEL("216", "撤单"),

	// 赎回类
	FUND_REDEMPTION("213", "赎回 "),

	FUND_REFUND("215", "退款"),

	FUND_DIVIDEND("217", "分红"),

	//FUND_Timely("331", "实时赎回"),		
	
	/* 基金总 -> 分 对应 监管行'联融通总账户划拨款项到分账户'. */
	FUND_GENERAL_TO_SUB_ACCOUNT("218", "总账户划拨给分账户",
			SupervisionGrantPurposeType.PURPOSETYPE_2),

	/* 基金分 -> 总 对应 监管行'联融通分账户划拨款项到总账户'. */
	FUND_SUB_TO_GENERAL_ACCOUNT("219", "分账户划拨给总账户",
			SupervisionGrantPurposeType.PURPOSETYPE_3),

	/* 基金总 -> 基金公司 对应 监管行'联融通总账户划拨款项到基金公司'. */
	FUND_GENERAL_ACCOUNT_TO_FUND_COMPANY("220", "总账户划拨给基金公司",
			SupervisionGrantPurposeType.PURPOSETYPE_1),
			
	FUND_SUB_TO_EPAY_ACCOUNT("235", "分账户到其他货币资金",
					SupervisionGrantPurposeType.PURPOSETYPE_4),		
					
	FUND_EPAY_TO_SUB_ACCOUNT("236", "其他货币资金到分账户",
							SupervisionGrantPurposeType.PURPOSETYPE_5),	
	/* 消费总 -> 慧投资产管理人备付金账户 */
	MALL_GENERAL_ACCOUNT_TO_MALL_COMPANY("300", "总账户划拨给慧投资管人备付金账户",
							SupervisionGrantPurposeType.PURPOSETYPE_6),
	/* 基金总 -> 基金公司 对应 监管行'联融通总账户划拨款项到基金公司提现流程'. */
	FUND_GENERAL_WITHDRAW_TO_FUND_COMPANY("226", "总账户划拨给基金公司提现"),

	FUND_FUND_COMPANY_TO_GENERAL_ACCOUNT("221", "基金公司划拨给基金总账户"),

	EPAY_PURCHASE("222", "现金易申购"),

	EPAY_PAY_REDEEM("223", "现金易支付赎回"),

	EPAY_PAY_PURCHASE("224", "现金易支付申购"),

	FUND_CANCEL_WITHDRAW("225", "基金撤单提现"),

	FUND_REDEMPTION_WITHDRAW("227", "基金赎回提现"),
	
	FUND_TIMELY_REDEMPTION_WITHDRAW("228", "基金实时赎回提现"),
	
	
	FUND_TIMELY_PAY_REDEMPTION("229", "基金支付的赎回"),
	FUND_TIMELY_PAY_PURCHASE("230", "基金支付的申购"),
	
	FUND_TIMELY_REDEMPTION("231", "基金实时赎回"),
	
	FUND_TIMELY_REDEMPTION_TRANSFER("234", "基金实时赎回资金调拨"),

	OTCBB_INTEREST("306", "交易所计息"),
	
	FUND_TIMELY_REDEMPTION_AUTH("310", "基金即时赎回授信"),
	
	FUND_TIMELY_PAY_AUTH("311", "基金即时支付授信"),
	
	STOCK_RECHARGE("401","股交所充值"),
	STOCK_WITHDRAW("402","股交所提现"),

	BASE_CONSUMPTION_HUITOU("403", "慧投购买"),
	
	BASE_FINANCING_RETURN_INVESTOR_REDEM("406", "资管将还款划拨投资人-赎回"),
	
	BASE_FINANCING_RETURN_INVESTOR_REFUND("404", "资管将还款划拨投资人-退款"),
	
	BASE_FINANCING_RETURN_INVESTOR_DIVIDENTS("405", "资管将还款划拨投资人-分红"),
	
	ALL("999", "全部"), ;

	private String value;
	private String displayName;
	private SupervisionGrantPurposeType type;

	private static Map<String, OptType> valueMap = new HashMap<String, OptType>();

	private static Map<String, OptType[]> adjustMap = new HashMap<String, OptType[]>();
	
	private static Map<OptType, ProductType> optTypeToProductMap = new HashMap<OptType, ProductType>();

	static {
		for (OptType _enum : OptType.values()) {
			valueMap.put(_enum.value, _enum);
		}
		adjustMap.put(AdjustProductType.CONSUMPTION.getValue(), new OptType[] {
				BASE_INTEREST_ACCT, BASE_INCOME_OUT, BASE_FEE_OUT,
				BASE_WRITEDOWN_FEE_OUT });
		adjustMap.put(AdjustProductType.FUND.getValue(), new OptType[] {
				FUND_INTEREST_ACCT, FUND_INCOME_OUT, FUND_FEE_OUT,
				FUND_WRITEDOWN_FEE_OUT });
		adjustMap.put(AdjustProductType.OTC.getValue(), new OptType[] {
				OTC_INTEREST_ACCT, OTC_INCOME_OUT, OTC_FEE_OUT,
				OTC_WRITEDOWN_FEE_OUT });
		
		optTypeToProductMap.put(OTC_RECHARGE, ProductType.OTC);
		optTypeToProductMap.put(OTC_WITHDRAW,ProductType.OTC);
		optTypeToProductMap.put(OTC_FUNDS_TRANSFER,ProductType.OTC);
		optTypeToProductMap.put(OTC_INTEREST_ACCT,ProductType.OTC);
		optTypeToProductMap.put(OTC_INCOME_OUT,ProductType.OTC);
		optTypeToProductMap.put(OTC_FEE_OUT,ProductType.OTC);
		optTypeToProductMap.put(OTC_WRITEDOWN_FEE_OUT,ProductType.OTC);
		optTypeToProductMap.put(OTCBB_INTEREST,ProductType.OTC);
		optTypeToProductMap.put(BASE_RECHARGE,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_TRANSFER_RECHARGE,ProductType.CONSUMPTION); 
		optTypeToProductMap.put(BASE_RECHARGE_ROLLBACK,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_WITHDRAW,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_TRNASFER,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_CONSUMPTION,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_INTEREST,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_INTEREST_ACCT,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_INCOME_OUT,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_FEE_OUT,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_WRITEDOWN_FEE_OUT,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_ADDITIONAL_RECHARGE,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_ENT_PAY_VALIDATE,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_ENT_PAY_VALIDATE_WITHDRAW,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_GUARANTEE_ROLLBACK,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_TRANSFER_PAY,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_CLEAR_PAY,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_LOAN_PAY,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_REPAYMENT_PAY,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_MERCHANT_SETTLE,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_MERCHANT_CHARGE,ProductType.CONSUMPTION);
		optTypeToProductMap.put(BASE_FUNDS_TRANSFER,ProductType.CONSUMPTION);
		optTypeToProductMap.put(FUND_RECHARGE,ProductType.FUND);
		optTypeToProductMap.put(FUND_TRANSFER_RECHARGE,ProductType.FUND);
		optTypeToProductMap.put(FUND_RECHARGE_ROLLBACK,ProductType.FUND);
		optTypeToProductMap.put(FUND_WITHDRAW,ProductType.FUND);
		optTypeToProductMap.put(FUND_WITHDRAW_QUICKLY,ProductType.FUND);//20140307新增基金快速提现
		optTypeToProductMap.put(FUND_INTEREST,ProductType.FUND);
		optTypeToProductMap.put(FUND_INTEREST_ACCT,ProductType.FUND);
		optTypeToProductMap.put(FUND_INCOME_OUT,ProductType.FUND);
		optTypeToProductMap.put(FUND_FEE_OUT,ProductType.FUND);
		optTypeToProductMap.put(FUND_WRITEDOWN_FEE_OUT,ProductType.FUND);
		optTypeToProductMap.put(FUND_ADDITIONAL_RECHARGE,ProductType.FUND);
		optTypeToProductMap.put(FUND_SUBSCRIPTION,ProductType.FUND);
		optTypeToProductMap.put(FUND_PURCHASE,ProductType.FUND);
		optTypeToProductMap.put(FUND_AIP,ProductType.FUND);
		optTypeToProductMap.put(FUND_CANCEL,ProductType.FUND);
		optTypeToProductMap.put(FUND_REDEMPTION,ProductType.FUND);
		optTypeToProductMap.put(FUND_REFUND,ProductType.FUND);
		optTypeToProductMap.put(FUND_DIVIDEND,ProductType.FUND);
		optTypeToProductMap.put(FUND_GENERAL_TO_SUB_ACCOUNT,ProductType.FUND);
		optTypeToProductMap.put(FUND_SUB_TO_GENERAL_ACCOUNT,ProductType.FUND);
		optTypeToProductMap.put(FUND_GENERAL_ACCOUNT_TO_FUND_COMPANY,ProductType.FUND);
		optTypeToProductMap.put(FUND_GENERAL_WITHDRAW_TO_FUND_COMPANY,ProductType.FUND);
		optTypeToProductMap.put(FUND_FUND_COMPANY_TO_GENERAL_ACCOUNT,ProductType.FUND);
		optTypeToProductMap.put(FUND_CANCEL_WITHDRAW,ProductType.FUND);
		optTypeToProductMap.put(FUND_REDEMPTION_WITHDRAW,ProductType.FUND);
		optTypeToProductMap.put(FUND_TIMELY_REDEMPTION_WITHDRAW,ProductType.FUND);
		optTypeToProductMap.put(FUND_TIMELY_PAY_REDEMPTION,ProductType.FUND);
		optTypeToProductMap.put(FUND_TIMELY_PAY_PURCHASE,ProductType.FUND);
		optTypeToProductMap.put(FUND_TIMELY_REDEMPTION_TRANSFER,ProductType.CONSUMPTION);
		optTypeToProductMap.put(FUND_TIMELY_REDEMPTION_AUTH,ProductType.FUND);
		optTypeToProductMap.put(FUND_TIMELY_REDEMPTION_AUTH,ProductType.FUND);
		optTypeToProductMap.put(EPAY_PURCHASE,ProductType.FUND);
		optTypeToProductMap.put(EPAY_PAY_REDEEM,ProductType.FUND);
		optTypeToProductMap.put(EPAY_PAY_PURCHASE,ProductType.FUND);
		optTypeToProductMap.put(FUND_TIMELY_PAY_AUTH,ProductType.FUND);
		optTypeToProductMap.put(STOCK_RECHARGE,ProductType.FUND);
		optTypeToProductMap.put(STOCK_WITHDRAW,ProductType.FUND);
		
		
	}

	/**
	 * 枚举转换
	 */
	public static OptType parseOf(String value) {
		for (OptType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

	/**
	 * 基金申购类业务类型
	 */
	public static OptType[] getFundPurchaseTypes() {
		return new OptType[] { FUND_SUBSCRIPTION, FUND_PURCHASE, FUND_AIP,
				FUND_PRICE_BUY,FUND_DEFINITELY_BUY,FUND_CANCEL };
	}

	/**
	 * 基金赎回类业务类型
	 */
	public static OptType[] getFundRedemptionTypes() {
		return new OptType[] { FUND_REDEMPTION, FUND_REFUND, FUND_DIVIDEND,
				FUND_PRICE_SELL,FUND_DEFINITELY_SELL,FUND_QUOTE_CANCEL };
	}

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public SupervisionGrantPurposeType getType() {
		return type;
	}

	OptType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	OptType(String value, String displayName, SupervisionGrantPurposeType type) {
		this.value = value;
		this.displayName = displayName;
		this.type = type;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	@Override
	public OptType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, OptType> getAllValueMap() {
		return valueMap;
	}

	/**
	 * 提现流程出钱
	 * 
	 * @return
	 */
	public static OptType[] withdrawTransfers() {
		OptType[] types = new OptType[] { OptType.BASE_WITHDRAW,
				OptType.FUND_WITHDRAW,
				OptType.FUND_GENERAL_WITHDRAW_TO_FUND_COMPANY,
				OptType.FUND_CANCEL_WITHDRAW, OptType.FUND_REDEMPTION_WITHDRAW };
		return types;
	}

	/**
	 * 头寸调拨 - 基金.
	 * 
	 * @return
	 */
	public static OptType[] fundPositionTransfers() {
		OptType[] types = new OptType[] { OptType.FUND_GENERAL_TO_SUB_ACCOUNT,
				OptType.FUND_SUB_TO_GENERAL_ACCOUNT };
		return types;
	}

	/**
	 * 头寸调拨 - 普通消费.
	 * 
	 * @return
	 */
	public static OptType[] basePositionTransfers() {
		OptType[] types = new OptType[] {};
		return types;
	}

	/**
	 * 转出 - 基金.
	 * 
	 * @return
	 */
	public static OptType[] fundCreditTransfers() {
		OptType[] types = new OptType[] { FUND_GENERAL_WITHDRAW_TO_FUND_COMPANY };
		return types;
	}

	/**
	 * 转出 - 普通消费.
	 * 
	 * @return
	 */
	public static OptType[] baseCreditTransfers() {
		OptType[] types = new OptType[] {};
		return types;
	}

	/**
	 * 转入 - 基金.
	 * 
	 * @return
	 */
	public static OptType[] fundDebitTransfers() {
		OptType[] types = new OptType[] { FUND_FUND_COMPANY_TO_GENERAL_ACCOUNT };
		return types;
	}

	/**
	 * 转入 - 普通消费.
	 * 
	 * @return
	 */
	public static OptType[] baseDebitTransfers() {
		OptType[] types = new OptType[] {};
		return types;
	}

	/**
	 * 头寸调拨.
	 * 
	 * @return
	 */
	public static OptType[] positionTransfers() {
		Set<OptType> set = new HashSet<OptType>();
		// 基金.
		for (OptType optType : fundPositionTransfers()) {
			set.add(optType);
		}
		// 普通消费.
		for (OptType optType : basePositionTransfers()) {
			set.add(optType);
		}
		OptType[] types = (OptType[]) set.toArray(new OptType[set.size()]);
		return types;
	}

	/**
	 * 转出.
	 * 
	 * @return
	 */
	public static OptType[] creditTransfers() {
		Set<OptType> set = new HashSet<OptType>();
		// 基金.
		for (OptType optType : fundCreditTransfers()) {
			set.add(optType);
		}
		// 普通消费.
		for (OptType optType : baseCreditTransfers()) {
			set.add(optType);
		}
		OptType[] types = (OptType[]) set.toArray(new OptType[set.size()]);
		return types;
	}

	/**
	 * 转入.
	 * 
	 * @return
	 */
	public static OptType[] debitTransfers() {
		Set<OptType> set = new HashSet<OptType>();
		// 基金.
		for (OptType optType : fundDebitTransfers()) {
			set.add(optType);
		}
		// 普通消费.
		for (OptType optType : baseDebitTransfers()) {
			set.add(optType);
		}
		OptType[] types = (OptType[]) set.toArray(new OptType[set.size()]);
		return types;
	}

	/*
	 * ##########################################################################
	 * ##########<br> 以下三类都并入提现流程_begin <br>
	 * ####################################
	 * ################################################<br>
	 */
	/**
	 * 提现交易类.
	 * 
	 * @return
	 */
	public static OptType[] withdraws() {
		OptType[] types = new OptType[] { BASE_WITHDRAW, FUND_WITHDRAW,
				FUND_CANCEL_WITHDRAW, FUND_REDEMPTION_WITHDRAW,
				BASE_ENT_PAY_VALIDATE_WITHDRAW, OTC_WITHDRAW, FUND_TIMELY_REDEMPTION_WITHDRAW,FUND_WITHDRAW_QUICKLY,STOCK_WITHDRAW};
		return types;
	}

	/**
	 * 提现交易类.
	 * 
	 * @return
	 */
	public static List<OptType> withdrawsList() {
		return Arrays.asList(OptType.withdraws());
	}

	/**
	 * 充值回退交易类.
	 * 
	 * @return
	 */
	public static OptType[] reversals() {
		OptType[] types = new OptType[] { BASE_RECHARGE_ROLLBACK,
				FUND_RECHARGE_ROLLBACK };
		return types;
	}

	/**
	 * 充值回退交易类.
	 * 
	 * @return
	 */
	public static List<OptType> reversalsList() {
		return Arrays.asList(OptType.reversals());
	}

	/**
	 * 交易所类
	 */
	public static List<OptType> otcbbList() {
		return Arrays.asList(OptType.otcbbValues());
	}

	/**
	 * 提现交易类. 但该种类型与其他提现交易不同, 需从总账户出钱.
	 * 
	 * @return
	 */
	public static OptType[] totalAccountWithdraws() {
		OptType[] types = new OptType[] { FUND_GENERAL_ACCOUNT_TO_FUND_COMPANY,
				FUND_GENERAL_WITHDRAW_TO_FUND_COMPANY };
		return types;
	}

	/**
	 * 提现交易类. 但该种类型与其他提现交易不同, 需从总账户出钱.
	 * 
	 * @return
	 */
	public static List<OptType> totalAccountWithdrawsList() {
		return Arrays.asList(OptType.totalAccountWithdraws());
	}

	/**
	 * 转账充值.
	 * 
	 * @return
	 */
	public static OptType[] recharges() {
		OptType[] types = new OptType[] { BASE_TRANSFER_RECHARGE,
				FUND_TRANSFER_RECHARGE };
		return types;
	}

	/**
	 * 转账充值.
	 * 
	 * @return
	 */
	public static List<OptType> rechargesList() {
		return Arrays.asList(OptType.recharges());
	}

	/*
	 * ##########################################################################
	 * ##########<br> 提现流程_end <br>
	 * #############################################
	 * #######################################<br>
	 */

	/**
	 * 提现交易类和充值回退类.
	 * 
	 * @return
	 */
	public static OptType[] withdrawsAndReversals() {
		Set<OptType> set = new LinkedHashSet<OptType>();
		// 提现交易类.
		set.addAll(withdrawsList());

		// 提现交易类. 但该种类型与其他提现交易不同, 需从总账户出钱.
		// set.addAll( totalAccountWithdrawsList() );
		set.add(FUND_GENERAL_WITHDRAW_TO_FUND_COMPANY);

		// 充值回退交易类.
		set.addAll(reversalsList());
		OptType[] types = (OptType[]) set.toArray(new OptType[set.size()]);
		return types;
	}

	/**
	 * 提现交易类和充值回退类.
	 * 
	 * @return
	 */
	public static List<OptType> withdrawsAndReversalsList() {
		return Arrays.asList(OptType.withdrawsAndReversals());
	}

	/**
	 * @description 银行对外付款，通过付款optType得到对应的提现optType
	 * @param paymentOptType
	 * @return
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-27
	 */
	public static OptType getBankPaymentWithdrawStepOptType(String optType) {
		if (FUND_GENERAL_ACCOUNT_TO_FUND_COMPANY.getValue().equals(optType)) {
			return FUND_GENERAL_WITHDRAW_TO_FUND_COMPANY;
		} else if (BASE_ENT_PAY_VALIDATE.getValue().equals(optType)) {
			return BASE_ENT_PAY_VALIDATE_WITHDRAW;
		}

		return null;
	}

	/*
	 * ##########################################################################
	 * ##########<br> 三张表类型
	 * #####################################################
	 * ###############################<br>
	 */

	public static final String RECHARGE_TYPE = "RECHARGE";

	public static final String WITHDRAW_TYPE = "WITHDRAW";

	public static final String PAY_TYPE = "PAY";

	/**
	 * @description
	 * @param optType
	 * @return
	 * @author ZhangDM(Mingly)
	 * @date 2013-3-21
	 */
	public static String checkTradeTableType(String optType) {
		for (OptType rechargeOptType : getRechargeTypes()) {
			if (rechargeOptType.getValue().equals(optType)) {
				return RECHARGE_TYPE;
			}
		}

		for (OptType withdrawOptType : getWithdrawTypes()) {
			if (withdrawOptType.getValue().equals(optType)) {
				return WITHDRAW_TYPE;
			}
		}

		return PAY_TYPE;
	}

	/**
	 * 充值表类型
	 */
	public static OptType[] getRechargeTypes() {
		return new OptType[] { BASE_RECHARGE, BASE_ADDITIONAL_RECHARGE,
				FUND_RECHARGE, FUND_ADDITIONAL_RECHARGE,STOCK_RECHARGE };
	}

	/**
	 * 提现表类型
	 */
	public static OptType[] getWithdrawTypes() {
		return new OptType[] { BASE_RECHARGE_ROLLBACK, BASE_WITHDRAW,
				FUND_RECHARGE_ROLLBACK, FUND_WITHDRAW,
				FUND_GENERAL_WITHDRAW_TO_FUND_COMPANY, FUND_CANCEL_WITHDRAW,
				FUND_REDEMPTION_WITHDRAW };
	}

	/**
	 * 交易表类型
	 */
	public static OptType[] getPayTypes() {
		return new OptType[] { BASE_TRNASFER, BASE_CONSUMPTION, BASE_INTEREST,
				BASE_INTEREST_ACCT, FUND_INTEREST, FUND_INTEREST_ACCT,
				FUND_SUBSCRIPTION, FUND_PURCHASE, FUND_AIP, FUND_CANCEL,
				FUND_PRICE_BUY, FUND_DEFINITELY_BUY,
				FUND_REDEMPTION, FUND_REFUND, FUND_DIVIDEND,
				FUND_PRICE_SELL,FUND_DEFINITELY_SELL,FUND_QUOTE_CANCEL,
				FUND_GENERAL_TO_SUB_ACCOUNT, FUND_SUB_TO_GENERAL_ACCOUNT,
				FUND_GENERAL_ACCOUNT_TO_FUND_COMPANY,
				FUND_FUND_COMPANY_TO_GENERAL_ACCOUNT, EPAY_PURCHASE,
				EPAY_PAY_REDEEM, EPAY_PAY_PURCHASE};
	}

	/**
	 * 交易所类型
	 */
	public static OptType[] otcbbValues() {
		return new OptType[] { OTC_RECHARGE, OTC_WITHDRAW };
	}

	/**
	 * 商户类型基金的集合.
	 * 
	 * @return
	 */
	public static OptType[] fundValues() {
		OptType[] types = new OptType[] { FUND_SUBSCRIPTION, FUND_PURCHASE,
				FUND_AIP, FUND_CANCEL, FUND_REFUND, FUND_DIVIDEND,
				EPAY_PURCHASE, EPAY_PAY_REDEEM, EPAY_PAY_PURCHASE };
		return types;
	}

	/**
	 * 商户类型商城的集合.
	 * 
	 * @return
	 */
	public static OptType[] mallValues() {
		OptType[] types = new OptType[] { BASE_CONSUMPTION };
		return types;
	}

	/**
	 * 计费规则事前集合
	 */
	public static OptType[] beforeBillingValue() {
		OptType[] types = new OptType[] { BASE_RECHARGE, BASE_WITHDRAW,
				BASE_TRNASFER, FUND_RECHARGE, FUND_WITHDRAW };
		return types;
	}

	/**
	 * 计费规则事后集合
	 */
	public static OptType[] afterBillingValue() {
		OptType[] types = new OptType[] { OTC_RECHARGE, OTC_WITHDRAW,
				BASE_CONSUMPTION, FUND_SUBSCRIPTION, FUND_PURCHASE, FUND_AIP,
				FUND_CANCEL, FUND_REDEMPTION, FUND_REFUND, FUND_DIVIDEND,
				EPAY_PURCHASE, EPAY_PAY_REDEEM, EPAY_PAY_PURCHASE,
				FUND_CANCEL_WITHDRAW, FUND_REDEMPTION_WITHDRAW };
		return types;
	}

	/**
	 * 计费规则集合
	 */
	public static OptType[] allBillingValue() {
		OptType[] result = new OptType[beforeBillingValue().length
				+ afterBillingValue().length];
		System.arraycopy(beforeBillingValue(), 0, result, 0,
				beforeBillingValue().length);
		System.arraycopy(afterBillingValue(), 0, result,
				beforeBillingValue().length, afterBillingValue().length);
		return result;
	}

	/**
	 * 可风控业务类型
	 */
	public static OptType[] riskControl() {
		return new OptType[] { BASE_RECHARGE, BASE_WITHDRAW, BASE_TRNASFER,
				BASE_CONSUMPTION, FUND_RECHARGE, FUND_WITHDRAW,
				FUND_SUBSCRIPTION, FUND_PURCHASE, FUND_AIP, FUND_CANCEL,
				FUND_REDEMPTION, FUND_REFUND, FUND_DIVIDEND, EPAY_PURCHASE,
				EPAY_PAY_REDEEM, EPAY_PAY_PURCHASE, OTC_RECHARGE, OTC_WITHDRAW,
				BASE_RECHARGE_ROLLBACK, FUND_RECHARGE_ROLLBACK };
	}

	public static OptType[] getOptTypeByAdjust(String value) {
		return adjustMap.get(value);
	}

	/** 支付订单所需的类型 */
	public static OptType[] paymentOrder() {
		return new OptType[] { BASE_TRNASFER, BASE_CONSUMPTION, BASE_INTEREST,
				BASE_INTEREST_ACCT, BASE_ENT_PAY_VALIDATE,
				BASE_MERCHANT_SETTLE, BASE_MERCHANT_CHARGE,
				BASE_FUNDS_TRANSFER, FUND_INTEREST, FUND_INTEREST_ACCT,
				FUND_SUBSCRIPTION, FUND_PURCHASE, FUND_REDEMPTION, FUND_AIP,
				FUND_REFUND, FUND_CANCEL, FUND_DIVIDEND,
				FUND_GENERAL_TO_SUB_ACCOUNT, FUND_SUB_TO_GENERAL_ACCOUNT,
				FUND_GENERAL_ACCOUNT_TO_FUND_COMPANY,
				FUND_FUND_COMPANY_TO_GENERAL_ACCOUNT, EPAY_PURCHASE,
				EPAY_PAY_REDEEM, EPAY_PAY_PURCHASE, OTC_FUNDS_TRANSFER, 
				FUND_TIMELY_PAY_REDEMPTION, FUND_TIMELY_PAY_PURCHASE
				};
	}
	
	public static List<OptType> mustNettingOptType(){
		return Arrays.asList(new OptType[] {
				FUND_RECHARGE_ROLLBACK,FUND_WITHDRAW,FUND_REDEMPTION_WITHDRAW,FUND_CANCEL_WITHDRAW,FUND_WITHDRAW_QUICKLY,STOCK_WITHDRAW
				});
	}
	

	/**
	 * 需限制提现时间的提现类型
	 */
	public static OptType[] getWithdrawLimitTypes() {
		return new OptType[] { BASE_WITHDRAW,
				 FUND_WITHDRAW,
				 FUND_TIMELY_REDEMPTION_WITHDRAW,
				FUND_REDEMPTION_WITHDRAW };
	}
	
	public ProductType getProductType(){
		return optTypeToProductMap.get(this);
	}
	
	public static ProductType getProductTypeByOptCode(String optCode){
		return optTypeToProductMap.get(OptType.parseOf(optCode));
	}
}