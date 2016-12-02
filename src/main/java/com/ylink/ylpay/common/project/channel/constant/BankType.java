package com.ylink.ylpay.common.project.channel.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

public enum BankType implements PersistentEnum<BankType, String> {

	/*
	 * 0102 中国工商银行
	 * 
	 * 0103 中国农业银行
	 * 
	 * 0104 中国银行
	 * 
	 * 0105 中国建设银行
	 * 
	 * 0301 交通银行
	 * 
	 * 0308 招商银行
	 * 
	 * 0310 上海浦东发展银行
	 * 
	 * 0305 中国民生银行
	 * 
	 * 0309 兴业银行
	 * 
	 * 0304 华夏银行
	 * 
	 * 0306 广东发展银行
	 * 
	 * 0307 深圳发展银行//平安银行吗？
	 * 
	 * 0302 中信银行
	 * 
	 * 0303 中国光大银行
	 */
	
	/**
	 * 行别
	 * 00开头的为非银行金融机构 如华创现金易
	 */
	BANKTYPE_EPAY("0001", "华创现金易","000000000001"),
	
	BANKTYPE_NCPS("0002","金融联"),
	
	/**中国工商银行*/
	BANKTYPE_ICBC("0102", "中国工商银行","102100099996"),
	/**中国农业银行*/
	BANKTYPE_ABC("0103", "中国农业银行","103100000026"),
	/**中国银行*/
	BANKTYPE_BC("0104", "中国银行","104100000004"),
	/**中国银行*/
	BANKTYPE_BC_VIR("0114", "虚拟中国银行","104100000004"),
	/**中国建设银行*/
	BANKTYPE_CCB("0105", "中国建设银行","105100000017"),
	/**中国邮政储蓄银行*/
	BANKTYPE_PSBC("0106", "中国邮政储蓄银行","403100000004"),
	/**中国交通银行*/
	BANKTYPE_BCM("0301", "中国交通银行","301290000007"),
	/**中信银行*/
	BANKTYPE_ECITIC("0302", "中信银行","302100011000"), 
	/**中国光大银行*/
	BANKTYPE_CEB("0303", "中国光大银行","303100000006"),
	/**华夏银行*/
	BANKTYPE_HXB("0304", "华夏银行","304100040000"),
	/**中国民生银行*/
	BANKTYPE_CMBC("0305", "中国民生银行","305100000013"),
	/**广东发展银行*/
	BANKTYPE_CGBC("0306", "广东发展银行","306581000003"),
	
	/**广东发展银行*/
	BANKTYPE_CGBC_VIR("0316", "虚拟广东发展银行","306581000003"),
	/**平安银行**/
	BANKTYPE_PA("0307","平安银行","307584007998"),
	/**招商银行*/
	BANKTYPE_CMB("0308", "招商银行","308584000013"), 
	/**兴业银行*/
	BANKTYPE_CIB("0309", "兴业银行","309391000011"),
	/**贵阳银行*/
	BANKTYPE_GYCCB("0313", "贵阳银行","313701098010"),
	/**贵州银行*/
	BANKTYPE_GZB("0314", "贵州银行","3137030099999"),
	/**上海浦东发展银行**/
	BANKTYPE_SPDB("0310", "上海浦东发展银行","310290000013"),
	/**恒丰银行**/
	BANKTYPE_EGB("0315","恒丰银行","315456000105"),
	
	BANKTYPE_ZSCB("0317","浙商银行","316331000018"),

	
	/**渤海银行**/
	BANKTYPE_CBHB("0318","渤海银行","318110000014"),
	/**
	 * 徽商银行
	 */
	BANKTYPE_HSB("0319","徽商银行","319361000013"),
	/**
	 * 重庆三峡银行
	 */
	BANKTYPE_CQTGB("0321","三峡银行",""),
	
	/**
	 * 上海农商行
	 */
	BANKTYPE_SCRB("0322","上海农商行","322290000011"),
	
	/**
	 * 天津银行
	 */
	BANKTYPE_TJCB("0323","天津银行","313110000017"),
//	/**
//	 * 宁波银行
//	 */
//	BANKTYPE_NBCB("0320","宁波银行","313332082914"),
	
	
	
	BANKTYPE_HDCB("0324","邯郸市商业银行","313127000013"),
	BANKTYPE_XTCB("0325","邢台银行","313131000016"),
	BANKTYPE_ZJKCB("0326","张家口商业银行","313138000019"),
	BANKTYPE_CDCB("0327","承德银行","313141052422"),
	BANKTYPE_CZCB("0328","沧州银行","313143005157"),
	BANKTYPE_JSCCB("0329","晋商银行","313161000017"),
	BANKTYPE_JCCB("0330","晋城市商业银行","313168000003"),
	BANKTYPE_NMGCB("0331","内蒙古银行","313191000011"),
	BANKTYPE_BSCB("0332","包商银行","313192000013"),
	BANKTYPE_EEDSCB("0333","鄂尔多斯银行","313205057830"),
	BANKTYPE_DLCB("0334","大连银行","313222080002"),
	BANKTYPE_ASCB("0335","鞍山市商业银行","313223007007"),
	BANKTYPE_JZCB("0336","锦州银行","313227000012"),
	BANKTYPE_HLDCB("0337","葫芦岛银行","313227600018"),
	BANKTYPE_YKCB("0338","营口银行","313228000276"),
	BANKTYPE_FXCB("0339","阜新银行","313229000008"),
	BANKTYPE_JLCB("0340","吉林银行","313241066661"),
	BANKTYPE_HEBCB("0341","哈尔滨银行","313261000018"),
	BANKTYPE_LJCB("0342","龙江银行","313261099913"),
	BANKTYPE_NJCB("0343","南京银行","313301008887"),
	BANKTYPE_JSCB("0344","江苏银行","313301099999"),
	BANKTYPE_HZCB("0345","杭州银行","313331000014"),
	BANKTYPE_NBCB("0346","宁波银行","313332082914"),
	BANKTYPE_WZCB("0347","温州银行","313333007331"),
	BANKTYPE_HZCCB("0348","湖州银行","313336071575"),
	BANKTYPE_SXCB("0349","绍兴银行","313337009004"),
	BANKTYPE_ZJCZCB("0350","浙江稠州商业银行","313338707013"),
	BANKTYPE_TZCB("0351","台州银行","313345001665"),
	BANKTYPE_TLCCB("0352","浙江泰隆商业银行","313345010019"),
	BANKTYPE_MTCCB("0353","浙江民泰商业银行","313345400010"),
	BANKTYPE_HXCB("0354","福建海峡银行","313391080007"),
	BANKTYPE_XMCB("0355","厦门银行","313393080005"),
	BANKTYPE_NCCB("0356","南昌银行","313421087506"),
	BANKTYPE_GZCB("0357","赣州银行","313428076517"),
	BANKTYPE_SRCB("0358","上饶银行","313433076801"),
	BANKTYPE_QDCB("0359","青岛银行","313452060150"),
	BANKTYPE_QSCB("0360","齐商银行","313453001017"),
	BANKTYPE_DYB("0361","东营银行","313455000018"),
	BANKTYPE_YTCB("0362","烟台银行","313456000108"),
	BANKTYPE_LFCB("0363","潍坊银行","313458000013"),
	BANKTYPE_JNCB("0364","济宁银行","313461000012"),
	BANKTYPE_TACB("0365","泰安市商业银行","313463000993"),
	BANKTYPE_LSCB("0366","莱商银行","313463400019"),
	BANKTYPE_WSCB("0367","威海市商业银行","313465000010"),
	BANKTYPE_DZCB("0368","德州银行","313468000015"),
	BANKTYPE_LSCCB("0369","临商银行","313473070018"),
	BANKTYPE_RZCB("0370","日照银行","313473200011"),
	BANKTYPE_ZZCB("0371","郑州银行","313491000232"),
	BANKTYPE_KFCB("0372","开封商业银行","313492070005"),
	BANKTYPE_LYCB("0373","洛阳银行","313493080539"),
	BANKTYPE_LHCB("0374","漯河市商业银行","313504000010"),
	BANKTYPE_SQCB("0375","商丘市商业银行","313506082510"),
	BANKTYPE_NYCB("0376","南阳市商业银行","313513080408"),
	BANKTYPE_HKCB("0377","汉口银行","313521000011"),
	BANKTYPE_CSCB("0378","长沙银行","313551088886"),
	BANKTYPE_GZCCB("0379","广州银行","313581003284"),
	BANKTYPE_DGCB("0380","东莞银行","313602088017"),
	BANKTYPE_BBWCB("0381","广西北部湾银行","313611001018"),
	BANKTYPE_LZCB("0382","柳州银行","313614000012"),
	BANKTYPE_CQCB("0383","重庆银行","313653000013"),
	BANKTYPE_PZHCB("0384","攀枝花市商业银行","313656000019"),
	BANKTYPE_DYCB("0385","德阳银行","313658000014"),
	BANKTYPE_MYCB("0386","绵阳市商业银行","313659000016"),
	BANKTYPE_FDCB("0388","富滇银行","313731010015"),
	BANKTYPE_LZCCB("0389","兰州银行","313821001016"),
	BANKTYPE_QHCB("0390","青海银行","313851000018"),
	BANKTYPE_NXCB("0391","宁夏银行","313871000007"),
	BANKTYPE_WLMQCB("0392","乌鲁木齐市商业银行","313881000002"),
	BANKTYPE_KLCB("0393","昆仑银行","313882000012"),
	BANKTYPE_SZCB("0394","苏州银行","314305006665"),
	BANKTYPE_HBCB("0395","河北银行","313121006888"),
	BANKTYPE_KSNCCB("0404","昆山农村商业银行","314305206650"),
	BANKTYPE_WJNCCB("0405","吴江农村商业银行","314305400015"),
	BANKTYPE_CSNCCB("0406","江苏常熟农村商业银行","314305506621"),
	BANKTYPE_ZJGCB("0407","张家港农村商业银行","314305670002"),
	BANKTYPE_GZNCCB("0408","广州农村商业银行","314581000011"),
	BANKTYPE_FSCB("0409","佛山顺德农村商业银行","314588000016"),
	BANKTYPE_QCNCCB("0410","重庆农村商业银行","314653000011"),
	BANKTYPE_TJCCB("0411","天津农村合作银行","317110010019"),
	BANKTYPE_BJCNCB("0412","北京农村商业银行","402100000018"),
	BANKTYPE_JSNCCB("0413","江苏省农村信用社联合社","402301099998"),
	BANKTYPE_NBJZCB("0414","宁波鄞州农村合作银行","402332010004"),
	BANKTYPE_AHNCCB("0415","安徽省农村信用联社","402361018886"),
	BANKTYPE_FJCNCB("0416","福建省农村信用社联合社","402391000068"),
	BANKTYPE_HBNCCB("0417","湖北省农村信用社联合社","402521000032"),
	BANKTYPE_SZNCCB("0418","深圳农村商业银行","402584009991"),
	BANKTYPE_DGNCCB("0419","东莞农村商业银行","402602000018"),
	BANKTYPE_GXNCCB("0420","广西壮族自治区农村信用社联合社","402611099974"),
	BANKTYPE_HNNCCB("0421","海南省农村信用社联合社","402641000014"),
	BANKTYPE_YNNCCB("0422","云南省农村信用社","402731057238"),
	
	BANKTYPE_HBBCL("0423","湖北银行"),
	BANKTYPE_QLB("0424","齐鲁银行","313451000019"),
	BANKTYPE_JXNCCB("0425","江西省农村信用社"),
	BANKTYPE_HNRCCB("0426","湖南省农村信用社联合社"),
	BANKTYPE_GLB("0427","桂林银行","313617000018"),
	BANKTYPE_GXRCCB("0428","广西农村信用社联合社"),
	BANKTYPE_YXCCB("0429","玉溪市商业银行"),
	BANKTYPE_YNRCCB("0430","云南省农村信用联社","402731057238"),
	
	
	
	
	/**上海银行**/
	BANKTYPE_BS("0401","上海银行","313290000017"),
	/**北京银行**/
	BANKTYPE_BB("0403","北京银行","313100000013"),
	/**盛京银行**/
	BANKTYPE_SJB("0396","盛京银行","313221030008"),
	
	/**中国银联*/
	UNION_PAY("0905","中国银联");
	
	
	
	private String value;
	
	private final String displayName;
	
	/**总行联行号*/
	private String defaulBankNo;
	
	private static Map<String, BankType> valueMap = new HashMap<String, BankType>();

	static {
		for (BankType _enum : BankType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 实现了手工对账的银行
	 */
	public static BankType[] listManualBillBanks() {
		return new BankType[] { 	
				BANKTYPE_CCB,    //中国建设银行
				BANKTYPE_BC,     //中国银行
				BANKTYPE_ABC,    //中国农业银行
				BANKTYPE_ICBC,   //中国工商银行
				BANKTYPE_EPAY,   //华创现金易
				BANKTYPE_PSBC,   //中国邮政储蓄银行
				BANKTYPE_BCM,    //中国交通银行
				BANKTYPE_CEB,     //中国光大银行
				BANKTYPE_ECITIC,  //中信银行
				BANKTYPE_CMB, //招商银行
				UNION_PAY,		//银联
				BANKTYPE_NCPS	//金融联
		};   
	}

	BankType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	BankType(String value, String displayName, boolean hasRefundNo) {
		this.value = value;
		this.displayName = displayName;
	}

	/**
	 * @param value
	 * @param displayName
	 * @param defaulBankNo
	 */
	private BankType(String value, String displayName, String defaulBankNo) {
		this.value = value;
		this.displayName = displayName;
		this.defaulBankNo = defaulBankNo;
	}

	/**
	 * @return the defaulBankNo
	 */
	public String getDefaulBankNo() {
		return defaulBankNo;
	}

	/**
	 * @param defaulBankNo the defaulBankNo to set
	 */
	public void setDefaulBankNo(String defaulBankNo) {
		this.defaulBankNo = defaulBankNo;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	/**
	 * 是否支持退款流水号
	 * @description 
	 * @param bankType
	 * @return  
	 * @author yu.han
	 * @date 2013-6-19
	 */
	public static boolean hasRefundNo(String value) {
		BankType[] bankTypes= new BankType[] { BANKTYPE_CCB,BANKTYPE_BC,BANKTYPE_ABC,BANKTYPE_BCM};
		BankType type=BankType.parseOf(value);
		for (BankType bankType : bankTypes) {
			if(bankType.equals(type)){
				return false;
			}
		}
		return true;
	}
	/**
	 * 是否是后台解除授权
	 * @description 
	 * @param value
	 * @return  true 后台 false 前台
	 * @author yu.han
	 * @date 2013-7-3
	 */
	public static boolean isBackDelSign(String value) {
		BankType[] bankTypes= new BankType[] { BANKTYPE_BCM};
		BankType type=BankType.parseOf(value);
		for (BankType bankType : bankTypes) {
			if(bankType.equals(type)){
				return true;
			}
		}
		return false;
	}
	/**
	 * 是否支持后台授权
	 * @description 
	 * @param value
	 * @return  
	 * @author yu.han
	 * @date 2014-3-13
	 */
	public static boolean isBackSign(String value) {
		BankType[] bankTypes= new BankType[] { BANKTYPE_EPAY};
		BankType type=BankType.parseOf(value);
		for (BankType bankType : bankTypes) {
			if(bankType.equals(type)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 需要转换的银行行别    备案上传汇总文件时所用
	 * @description：
	 * @param value
	 * @return  
	 * @author LiXiPing
	 * @date 2014-5-12
	 */
	public static boolean isTransform(String value){
		BankType[] bankTypes= new BankType[] {BANKTYPE_EPAY};
		BankType type=BankType.parseOf(value);
		for (BankType bankType : bankTypes) {
			if(bankType.equals(type)){
				return true;
			}
		}
		return false;
	}
	
	/** 
	* @Title: convertSignBank 
	* @Description: 签约行别转换
	* @param publishBank 银行卡发卡行
	* @param bindCanal 签约绑卡渠道
	* @return BankType
	* @author yang_chen
	* @date 2014-12-20 下午4:09:14
	*/
	public static BankType convertSignBank(String publishBank,String bindCanal){
		LinkMethod signChannel = LinkMethod.parseOf(bindCanal);
		if(signChannel == null)
			throw new IllegalArgumentException("枚举值[" + bindCanal + "]错误!");
		if(LinkMethod.DIRECT_BANK.equals(signChannel)){
			return BankType.parseOf(publishBank);
		}else if(LinkMethod.INDIRECT_UNIONPAY.equals(signChannel)){
			return BankType.UNION_PAY;
		}else if(LinkMethod.INDIRECT_NCPS.equals(signChannel)){
			return BankType.BANKTYPE_NCPS;
		}else{
			throw new IllegalArgumentException("枚举值[" + bindCanal + "]错误!");
		}
	}
	
	@Override
	public BankType getEnum(String value) {
		return valueMap.get(value);
	}

	@Override
	public Map<String, BankType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 枚举转换
	 */
	public static BankType parseOf(String value) {
		for (BankType item : values())
			if (item.getValue().equals(value))
				return item;
		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}

	/**
	 * 获取枚举
	 */
	public static BankType returnEnum(String value) {
		return valueMap.get(value);
	}

}