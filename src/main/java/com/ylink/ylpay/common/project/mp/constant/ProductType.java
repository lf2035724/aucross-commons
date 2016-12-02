/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 */

package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * @author YangXiaojin
 * @date 2012-10-30
 * @description：产品类型
 */
public enum ProductType implements PersistentEnum<ProductType, String> {

	BASE( "0", "基础产品" ),

	CONSUMPTION( "1", "普通消费类产品" ),

	FUND( "2", "基金类产品" ),
	
	OTC( "3", "交易所产品" ),

	OTHER( "9", "其它" );

	private String value;
	private String displayName;

	private static Map<String, ProductType> valueMap = new HashMap<String, ProductType>();
	
	private static Map<String,ProductType> adjustMap = new HashMap<String, ProductType>();
	
	static {
		for ( ProductType _enum : ProductType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}
	
	/**
	 * 枚举转换
	 */
	public static ProductType parseOf( String value ){
		for( ProductType item:values() )
			if( item.getValue().equals(value) )
				return item;
		
		throw new IllegalArgumentException("产品类型["+value+"]不匹配!");
	}

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	ProductType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	@Override
	public ProductType getEnum( String value ) {
		return valueMap.get( value );
	}
	
	public static ProductType[] getBasePositionAllocations(){
		return new ProductType[]{CONSUMPTION,OTC};
	}

	@Override
	public Map<String, ProductType> getAllValueMap() {
		return valueMap;
	}
	
	public static ProductType[] getUsedValues(){
		return new ProductType[]{CONSUMPTION,FUND,OTC};
	}

}