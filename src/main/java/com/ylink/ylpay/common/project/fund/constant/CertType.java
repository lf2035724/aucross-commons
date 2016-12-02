/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-19
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.channel.constant.BankType;


/** 
 * @author YG.HU
 * @date 2012-12-19
 * @description：TODO
 */

public enum CertType {
    
    CERTTYPE_00("00", "居民身份证", "P01"),
    CERTTYPE_01("01", "护照", "P31"),
    CERTTYPE_02("02", "军人证", "P04"),
    CERTTYPE_03("03", "军人证", "P04"),
    CERTTYPE_04("04", "回乡证", "P19"),
    CERTTYPE_05("05", "居民户口簿", "P16"),
    CERTTYPE_06("06", "护照", "P31"),
    CERTTYPE_07("07", "其他证明文件", "C99"),
    CERTTYPE_08("08", "暂住证", "P24"),
    CERTTYPE_09("09", "个人其它证件", "P99"),
    CERTTYPE_10("10", "军人证", "P04"),
    CERTTYPE_11("11", "回乡证", "P19"),
    CERTTYPE_61("61", "组织机构代码证", "C09"),
    CERTTYPE_62("62", "营业执照", "C01"),
    CERTTYPE_63("63", "其他证明文件", "C99"),
    CERTTYPE_69("69", "其他证明文件", "C99");
    
    private String value;
    private String displayName;
    private String superVisionInterFaceCode;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    public String getSuperVisionInterFaceCode() {
        return this.superVisionInterFaceCode;
    }
    
    CertType(String value, String displayName ,String superVisionInterFaceCode){
        this.value = value ;
        this.displayName = displayName ;
        this.superVisionInterFaceCode = superVisionInterFaceCode;
    }
    
    private static Map<String, CertType> valueMap = new HashMap<String, CertType>();

    static {
        for (CertType _enum : CertType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static CertType parseOf(String value){
        for(CertType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
    
    public static CertType parseOfInterFace(String value){
        
        for(CertType item : values())
            if(item.getSuperVisionInterFaceCode().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
    /**
	 * 获取枚举
	 */
	public static CertType returnEnum(String value) {
		return valueMap.get(value);
	}
}
