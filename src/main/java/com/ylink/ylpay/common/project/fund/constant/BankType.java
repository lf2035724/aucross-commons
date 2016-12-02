/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-19
 */

package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;


/** 
 * @author YG.HU
 * @date 2012-12-19
 * @description：TODO
 */

public enum BankType {
    
    BANKTYPE_0000("0000","证联融通","000"),
    BANKTYPE_0001("0001","中国人民银行会计营业部门","001"),
    BANKTYPE_0011("0011","中国人民银行国家金库","011"),
    BANKTYPE_0102("0102","中国工商银行","102"),
    BANKTYPE_0103("0103","中国农业银行","103"),
    BANKTYPE_0104("0104","中国银行","104"),
    BANKTYPE_0105("0105","中国建设银行","105"),
    BANKTYPE_0106("0106","中国邮政储蓄银行","106"),
    BANKTYPE_0201("0201","国家开发银行","201"),
    BANKTYPE_0202("0202","中国进出口银行","202"),
    BANKTYPE_0203("0203","中国农业发展银行","203"),
    BANKTYPE_0301("0301","交通银行","301"),
    BANKTYPE_0302("0302","中信实业银行","302"),
    BANKTYPE_0303("0303","中国光大银行","303"),
    BANKTYPE_0304("0304","华夏银行","304"),
    BANKTYPE_0305("0305","中国民生银行","305"),
    BANKTYPE_0306("0306","广东发展银行","306"),
    BANKTYPE_0307("0307","深圳发展银行","307"),
    BANKTYPE_0308("0308","招商银行","308"),
    BANKTYPE_0309("0309","兴业银行","309"),
    BANKTYPE_0310("0310","上海浦东发展银行","310"),
    BANKTYPE_0313("0313","城市商业银行","313"),
    BANKTYPE_0314("0314","农村商业银行","314"),
    BANKTYPE_0401("0401","城市信用社","401"),
    BANKTYPE_0402("0402","农村信用社","402"),
    BANKTYPE_0501("0501","香港上海汇丰银行","501"),
    BANKTYPE_0502("0502","东亚银行","502"),
    BANKTYPE_0503("0503","南洋商业银行","503"),
    BANKTYPE_0504("0504","恒生银行","504"),
    BANKTYPE_0505("0505","中银香港","505"),
    BANKTYPE_0506("0506","集友银行","506"),
    BANKTYPE_0507("0507","廖创兴银行","507"),
    BANKTYPE_0508("0508","亚洲商业银行","508"),
    BANKTYPE_0509("0509","道亨银行","509"),
    BANKTYPE_0510("0510","水亨银行","510"),
    BANKTYPE_0531("0531","花旗银行","531"),
    BANKTYPE_0532("0532","美国银行","532"),
    BANKTYPE_0533("0533","摩根大通银行","533"),
    BANKTYPE_0534("0534","建东银行","534"),
    BANKTYPE_0535("0535","美一银行","535"),
    BANKTYPE_0536("0536","纽约银行","536"),
    BANKTYPE_0561("0561","东京三菱银行","561"),
    BANKTYPE_0562("0562","日联银行","562"),
    BANKTYPE_0563("0563","三井住友银行","563"),
    BANKTYPE_0564("0564","瑞穗实业银行","564"),
    BANKTYPE_0565("0565","山口银行","565"),
    BANKTYPE_0591("0591","韩国外换银行","591"),
    BANKTYPE_0592("0592","朝兴银行","592"),
    BANKTYPE_0593("0593","友利银行","593"),
    BANKTYPE_0594("0594","韩国产业银行","594"),
    BANKTYPE_0595("0595","新韩银行","595"),
    BANKTYPE_0596("0596","韩国中小企业银行","596"),
    BANKTYPE_0597("0597","韩亚银行","597"),
    BANKTYPE_0611("0611","马来亚银行","611"),
    BANKTYPE_0616("0616","首都银行及信托公司","616"),
    BANKTYPE_0621("0621","华侨银行","621"),
    BANKTYPE_0622("0622","大华银行","622"),
    BANKTYPE_0623("0623","新加坡发展银行","623"),
    BANKTYPE_0631("0631","盘古银行","631"),
    BANKTYPE_0632("0632","泰京银行","632"),
    BANKTYPE_0633("0633","泰华农民银行","633"),
    BANKTYPE_0641("0641","奥地利中央合作银行","641"),
    BANKTYPE_0651("0651","比利时联合银行","651"),
    BANKTYPE_0652("0652","比利时富通银行","652"),
    BANKTYPE_0661("0661","荷兰银行","661"),
    BANKTYPE_0662("0662","荷兰商业银行","662"),
    BANKTYPE_0663("0663","荷兰万贝银行","663"),
    BANKTYPE_0671("0671","渣打银行","671"),
    BANKTYPE_0691("0691","法国兴业银行","691"),
    BANKTYPE_0692("0692","法国巴黎银行","692"),
    BANKTYPE_0693("0693","东方汇理银行","693"),
    BANKTYPE_0694("0694","法国里昂信贷银行","694"),
    BANKTYPE_0695("0695","法国外贸银行","695"),
    BANKTYPE_0711("0711","德累斯顿银行","711"),
    BANKTYPE_0712("0712","德意志银行","712"),
    BANKTYPE_0713("0713","德国商业银行","713"),
    BANKTYPE_0714("0714","西德意志银行","714"),
    BANKTYPE_0715("0715","巴伐利亚洲银行","715"),
    BANKTYPE_0731("0731","罗马银行","731"),
    BANKTYPE_0732("0732","意大利联合商业银行","732"),
    BANKTYPE_0741("0741","瑞士信贷第一波士顿银行","741"),
    BANKTYPE_0751("0751","丰业银行","751"),
    BANKTYPE_0752("0752","蒙特利尔银行","752"),
    BANKTYPE_0761("0761","澳新银行","761"),
    BANKTYPE_0766("0766","葡国储蓄信贷银行","766"),
    BANKTYPE_0771("0771","珠海南通银行","771"),
    BANKTYPE_0772("0772","宁波国际银行","772"),
    BANKTYPE_0773("0773","新联商业银行","773"),
    BANKTYPE_0774("0774","协和银行","774"),
    BANKTYPE_0775("0775","德富泰银行有限公司","775"),
    BANKTYPE_0776("0776","荷兰合作银行（中国）有限公司","776"),
    BANKTYPE_0781("0781","厦门国际银行","781"),
    BANKTYPE_0782("0782","上海－巴黎国际银行","782"),
    BANKTYPE_0783("0783","福建亚洲银行","783"),
    BANKTYPE_0784("0784","浙江商业银行","784"),
    BANKTYPE_0785("0785","华商银行","785"),
    BANKTYPE_0786("0786","青岛国际银行","786"),
    BANKTYPE_0787("0787","华一银行","787"),
    BANKTYPE_0901("0901","中国国债登记结算有限责任公司","901"),
    BANKTYPE_0902("0902","中国人民银行公开市场操作室","902"),
    BANKTYPE_0903("0903","中国银行间外汇交易中心","903"),
    BANKTYPE_0904("0904","城市商业银行资金清算中心","904");
    
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
    
    BankType(String value, String displayName ,String superVisionInterFaceCode){
        this.value = value ;
        this.displayName = displayName ;
        this.superVisionInterFaceCode = superVisionInterFaceCode;
    }
    
    private static Map<String, BankType> valueMap = new HashMap<String, BankType>();

    static {
        for (BankType _enum : BankType.values()) {
            valueMap.put(_enum.value, _enum);
        }
    }
    
    /**
     * 枚举转换
     */
    public static BankType parseOf(String value){
        for(BankType item : values())
            if(item.getValue().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
    
    public static BankType parseOfInterFace(String value){
        
        for(BankType item : values())
            if(item.getSuperVisionInterFaceCode().equals(value))
                return item;
        
        throw new IllegalArgumentException("异常错误代码["+value+"]不匹配!");
    }
}
