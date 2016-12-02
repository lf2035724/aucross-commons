/**===========================================
 *        Copyright (C) 2013 YLINK
 *           All rights reserved
 *
 *  @项目名： aucross-common
 *  @文件名： EFileType.java
 *  @版本信息： V1.0.0 
 *  @作者： hinode
 *  @日期： 2013-1-25-下午05:03:09
 * 
 ============================================*/

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @类名称： EFileType
 * @类描述： 
 * @创建人： hinode
 * @创建时间： 2013-1-25 下午05:03:09
 *
 * @修改人： hinode
 * @操作时间： 2013-1-25 下午05:03:09
 * @操作原因： 
 * 
 */
public enum EFileType {
	INVESTOR( "30", "投资者备案" ),
	
	FUNDSALER( "31", "销售机构备案" ),
    
	RESERVEMONEY( "40", "备付金文件"),
	
	NETBALANCE( "50", "轧差文件" ),
	
	J03( "60", "划款基金销售机构 (J03)" ),
	
	J04( "61", "划款基金投资者(J04)" ),
	
	
	FUNDEPAYREQUEST( "71", "协议申购请求文件" ),
	FUNDEPAYRESPONSE( "72", "协议申购回执文件" ),
	FUNDRECONCILIATION( "73", "基金前置对账文件" ),
	PURCHASESETTLE( "74", "基金公司申购类结算文件" ),
	REDEEMSETTLE( "75", "基金公司赎回类结算文件" ),
	TIMELYREDEMPION( "77", "实时赎回对账文件" ),
	REDEEM("76","基金公司赎回文件");
	 
	
	
    private String value;
    private String displayName;
    
    public String getValue() {
        return this.value;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    EFileType(String value, String displayName){
        this.value = value ;
        this.displayName = displayName ;
    }
    
    private static Map<String, EFileType> valueMap = new HashMap<String, EFileType>();

    static {
        for (EFileType _enum : EFileType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static EFileType parseOf(String value){
        for(EFileType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
