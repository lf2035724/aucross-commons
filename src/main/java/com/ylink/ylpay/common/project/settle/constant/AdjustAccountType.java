/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-30
 */

package com.ylink.ylpay.common.project.settle.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangDM(Mingly)
 * @date 2013-1-9
 * @description：调账类型
 */
public enum AdjustAccountType {

	UPDATE_STATUS("00", ""),
	REVERSE("01", ""),
	UPDATE_ONLY("02", ""),
	REVERSE_ONLY("03", ""),
	UPDATE_REVERSE_STATUS("04", ""),
	ADDRECORD_REFUND("05", ""),
	;
	
	private String value;
	private final String displayName;

	private static Map<String, AdjustAccountType> valueMap = new HashMap<String, AdjustAccountType>();

	static {
		for ( AdjustAccountType _enum : AdjustAccountType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	AdjustAccountType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static AdjustAccountType parseOf( String value ) {
		for ( AdjustAccountType item : values() )
			if ( item.getValue().equals( value ) )
				return item;

		throw new IllegalArgumentException( "基金扎差净额类型[" + value + "]不匹配!" );
	}
	
	public static String getAdjustAccountDesc(AdjustAccountType adjustAccountType, 
			String payId, String tradeId){
		
		if(UPDATE_STATUS.getValue().equals(adjustAccountType.getValue())){
			return "更新支付订单【payId=" + payId + "】和对应的交易订单【tradeId=" + 
					tradeId + "】状态为【成功】";
		}else if(REVERSE.getValue().equals(adjustAccountType.getValue())){
			return "生成该支付订单【payId=" + payId + "】对应的冲正订单，并更新交易订单【tradeId="+
					tradeId + "】和原支付订单状态为【成功】";
		}else if(UPDATE_ONLY.getValue().equals(adjustAccountType.getValue())){
			return "更新该支付订单【payId=" + payId + "】状态为【成功】";
		}else if(REVERSE_ONLY.getValue().equals(adjustAccountType.getValue())){
			return "生成该支付订单【payId=" + payId + "】对应的冲正订单，并更新原支付订单状态为【成功】";
		}else if(UPDATE_REVERSE_STATUS.getValue().equals(adjustAccountType.getValue())){
			return "更新冲正支付订单【payId=" + payId + "】状态为【冲正成功】";
		}
		
		return "";
	}
	
}