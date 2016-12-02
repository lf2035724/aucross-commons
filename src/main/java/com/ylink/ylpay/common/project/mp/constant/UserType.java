package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.fund.constant.BankType;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;
import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 用户类型.
 * 
 * @author 潘瑞峥
 * @date 2012-11-5
 */
public enum UserType implements PersistentEnum<UserType, String> {

	CP( "CP", "个人客户" ),

	CB( "CB", "企业客户" ),

	CV( "CV", "虚拟客户" ),

	CI( "CI", "证联专业客户" );

	private String value;
	private String displayName;

	private static Map<String, UserType> valueMap = new HashMap<String, UserType>();

	static {
		for ( UserType _enum : UserType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	UserType( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	@Override
	public UserType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, UserType> getAllValueMap() {
		return valueMap;
	}

	public static UserType returnEnum( String value ) {
		return valueMap.get( value );
	}
    /**
     * 枚举转换
     */
    public static UserType parseOf(String value){
        for(UserType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
    
    public static UserType getUserTypeByCustId(String custId) throws MpCheckedException{
    	if(CP.getValue().equals(custId.substring(0, 2))){//个人客户
			return CP;
		}else if(CB.getValue().equals(custId.substring(0, 2))){//企业客户
			return CB;
		}else if(CV.getValue().equals(custId.substring(0, 2))){//虚拟客户
			return CV;
		}else if(CI.getValue().equals(custId.substring(0, 2))){//证联专业客户
			return CI;
		}else{
			throw new MpCheckedException("根据客户编号转换userType出错，custId为空,或没有找到对应userType枚举类型,custID:"+custId);
		}
    }

}