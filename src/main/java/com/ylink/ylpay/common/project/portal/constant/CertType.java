package com.ylink.ylpay.common.project.portal.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/****
 * 门户证件类型
 * @author lyg
 *
 */
public enum CertType implements PersistentEnum<CertType, String> {

	/****
	 * 基金公司提供的证件类型
	 * 00 身份证
01 护照
02 军官证
03 士兵证
04 回乡证
05 户口本
06 外国护照
07 其他
08 暂住证
09 警官证
10 文职干部证
11 港澳同胞回乡证
61 组织机构代码证
62 营业执照
63 税务登记证
69 其他机构证件类型

	 */
	C00( "00", "身份证","P01" ),

	C01( "01", "护照","P02" ),
	
	X01( "62", "营业执照","C01"),

	C09( "61", "组织机构代码证","C09"),

	;

	private String value;
	private final String displayName;
	//对应管理平台
	private final String mpCode;

	private static Map<String, CertType> valueMap = new HashMap<String, CertType>();

	static {
		for ( CertType _enum : CertType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	CertType( String value, String displayName ,String mpCode) {
		this.value = value;
		this.displayName = displayName;
		this.mpCode=mpCode;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public CertType getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, CertType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static CertType returnEnum( String value ) {
		return valueMap.get( value );
	}

	public String getMpCode() {
		return mpCode;
	}
	

}