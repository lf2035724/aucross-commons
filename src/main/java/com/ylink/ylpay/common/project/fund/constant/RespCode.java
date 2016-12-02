/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-11-19
 */

/**
 * RespCode.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-11-19
 */
package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author Leo
 * @date 2012-11-19
 */
public class RespCode {
	public static final String RespCode_RC00="RC00";           //交易处理成功
	public static final String RespCode_RC00Desc="交易处理成功";           //
	
	public static final String RespCode_RC01="RC01";           //交易代码错误
	public static final String RespCode_RC01Desc="交易代码错误";           //
	
	public static final String RespCode_RC02="RC02";           //机构代码错误
	public static final String RespCode_RC02Desc="机构代码错误";           //
	
	public static final String RespCode_RC03="RC03";           //基金产品代码错误
	public static final String RespCode_RC03Desc="基金产品代码错误";           //
	
	public static final String RespCode_RC04="RC04";           //没有原始交易
	public static final String RespCode_RC04Desc="没有原始交易";           //
	
	public static final String RespCode_RC05="RC05";           //与原始交易不匹配
	public static final String RespCode_RC05Desc="与原始交易不匹配";           //
	
	public static final String RespCode_RC06="RC06";           //交易重复
	public static final String RespCode_RC06Desc="交易重复";           //
	
	public static final String RespCode_RC07="RC07";           //原交易状态不对
	public static final String RespCode_RC07Desc="原交易状态不对";           //
	
	public static final String RespCode_RC08="RC08";           //找不到绑定信息
	public static final String RespCode_RC08Desc="交易处理失败，找不到该银行卡的绑定信息";           //
	
	public static final String RespCode_RC09="RC09";           //撤单，退款对应原始交易结算日期必须大于当前日期
	public static final String RespCode_RC09Desc="撤单，退款对应原始交易结算日期必须大于当前日期";
	
	public static final String RespCode_RC10="RC10";           //交易金额大于原交易金额
	public static final String RespCode_RC10Desc="交易金额与原交易金额不匹配";           //
	
	public static final String RespCode_RC11="RC11";           //用户状态错误
	public static final String RespCode_RC11Desc="用户状态错误";           //
	
	public static final String RespCode_RC12="RC12";           //基金清算日期小于基金交易日期 OR 基金清算日期小于证联融通清算日期
	public static final String RespCode_RC12Desc="基金结算日期小于基金交易日期 OR 基金结算日期小于支付系统结算日期";           //
	
	public static final String RespCode_RC13="RC13";           //交易金额为 0 或格式不正确
	public static final String RespCode_RC13Desc="交易金额为 0 或格式不正确";           //
	
	public static final String RespCode_RC14="RC14";           //用户姓名不匹配
	public static final String RespCode_RC14Desc="用户姓名不匹配";           //
	
	public static final String RespCode_RC15="RC15";           //账号不存在
	public static final String RespCode_RC15Desc="账号不存在";           //
	
	public static final String RespCode_RC16="RC16";           //账户状态不正确
	public static final String RespCode_RC16Desc="账户状态不正确";           //
	
	public static final String RespCode_RC17="RC17";           //用户证件类型或号码不匹配
	public static final String RespCode_RC17Desc="用户证件类型或号码不匹配";           //
	
	public static final String RespCode_RC18="RC18";           //不支持的银行卡
	public static final String RespCode_RC18Desc="不支持的银行卡";           //
	
	public static final String RespCode_RC19="RC19";           //用户已存在
	public static final String RespCode_RC19Desc="用户已存在";           //
	
	public static final String RespCode_RC20="RC20";           //银行卡不匹配
	public static final String RespCode_RC20Desc="银行卡不匹配";           //
	
	public static final String RespCode_RC21="RC21";           //转账银行卡验证中
	public static final String RespCode_RC21Desc="转账银行卡验证中";           //
	
	public static final String RespCode_RC22="RC22";           //账户余额不足
	public static final String RespCode_RC22Desc="账户余额不足";           //
	
	public static final String RespCode_RC23="RC23";           //银行卡验证成功
	public static final String RespCode_RC23Desc="银行卡验证成功";           //
	
	public static final String RespCode_RC24="RC24";           //交易查询错误
	public static final String RespCode_RC24Desc="交易查询错误";           //
	
	public static final String RespCode_RC25="RC25";           //发送监管银行数据重复
	public static final String RespCode_RC25Desc="发送监管银行数据重复";           //
	
	public static final String RespCode_RC26="RC26";           //查询交易不匹配
	public static final String RespCode_RC26Desc="查询交易不匹配";           //
	
	public static final String RespCode_RC27="RC27";           //查询交易金额不匹配
	public static final String RespCode_RC27Desc="查询交易金额不匹配";           //
	
	public static final String RespCode_RC28="RC28";           //交易已处理
	public static final String RespCode_RC28Desc="交易已处理";           //
	
	public static final String RespCode_RC29="RC29";           //交易失败
	public static final String RespCode_RC29Desc="交易失败";           //
	
	public static final String RespCode_RC30="RC30";           //交易处理中
	public static final String RespCode_RC30Desc="交易处理中";           //
	
	public static final String RespCode_RC33="RC33";           //业务处理失败
	public static final String RespCode_RC33Desc="业务处理失败";           //
	
	public static final String RespCode_RC34="RC34";           //证联融通账户对应基金账号不存在
	public static final String RespCode_RC34Desc="证联融通账户对应基金账号不存在";           //
	
	public static final String RespCode_RC35="RC35";           //基金代码对应基金品种不存在
	public static final String RespCode_RC35Desc="基金代码对应基金品种不存在";           //
	
	public static final String RespCode_RC36="RC36";           //业务处理失败
	public static final String RespCode_RC36Desc="业务处理失败"; 
	
	public static final String RespCode_RC37="RC37";           //业务流水号重复
	public static final String RespCode_RC37Desc="业务流水号重复";    
	
	public static final String RespCode_RC38="RC38";           //该卡与商户的关系不存在
	public static final String RespCode_RC38Desc="该卡与商户的关系不存在";        
	
	public static final String RespCode_RC39="RC39";           //该银行卡已存在
	public static final String RespCode_RC39Desc="该银行卡已存在";        

	public static final String RespCode_RC41="RC41";           //商户号不能为空
	public static final String RespCode_RC41Desc="商户号不能为空";  
	
	public static final String RespCode_RC42="RC42";          
	public static final String RespCode_RC42Desc="行别不能为空";  
	
	public static final String RespCode_RC43="RC43";           
	public static final String RespCode_RC43Desc="证件类型不能为空"; 
	
	public static final String RespCode_RC44="RC44";           
	public static final String RespCode_RC44Desc="证件类型错误";
	
	public static final String RespCode_RC45="RC45";           
	public static final String RespCode_RC45Desc="证件号码不能为空";
	
	public static final String RespCode_RC46="RC46";           
	public static final String RespCode_RC46Desc="姓名不能为空";
	
    public static final String RespCode_RC48="RC48";           
    public static final String RespCode_RC48Desc="客户编号不能为空";
    
    public static final String RespCode_RC47="RC47";           
    public static final String RespCode_RC47Desc="行别错误，此行别不能开通快捷";
    
    public static final String RespCode_RC49="RC49";           
    public static final String RespCode_RC49Desc="此银行卡开通快捷失败";
    
	public static final String RespCode_RC50="RC50";           //客户不存在
	public static final String RespCode_RC50Desc="该客户不存在";        
	
	public static final String RespCode_RC51="RC51";           //风险错误，
	public static final String RespCode_RC51Desc="风险错误，金额超出限制或者被列入黑名单";   
	
	public static final String RespCode_RC52="RC52";           //现金易申购不满足条件
	public static final String RespCode_RC52Desc="现金易申购不满足条件";
	
    public static final String RespCode_RC53="RC53";           
    public static final String RespCode_RC53Desc="此银行卡认证失败";
    
    public static final String RespCode_RC54="RC54";           
    public static final String RespCode_RC54Desc="支付流水号不能为空";
    
    public static final String RespCode_RC55="RC55";           
    public static final String RespCode_RC55Desc="基金前置流水号不能为空";
    
    public static final String RespCode_RC56="RC56";           
    public static final String RespCode_RC56Desc="柜台号不能为空";
    
    public static final String RespCode_RC58="RC58";           
    public static final String RespCode_RC58Desc="商户被冻结！";
    
    public static final String RespCode_RC59="RC59";           
    public static final String RespCode_RC59Desc="等待支付";
    
    public static final String RespCode_RC62="RC62";           
    public static final String RespCode_RC62Desc="支付失败";
    
    public static final String RespCode_RC63="RC63";           
    public static final String RespCode_RC63Desc="此银行不能使用该方式绑卡";
    
    public static final String RespCode_RC64="RC64";           
    public static final String RespCode_RC64Desc="交易密码不能为空";
    
    public static final String RespCode_RC65="RC65";           
    public static final String RespCode_RC65Desc="绑卡类型错误";
    
    public static final String RespCode_RC66="RC66";           
    public static final String RespCode_RC66Desc="客户类型错误";
    
    public static final String RespCode_RC67="RC67";           
    public static final String RespCode_RC67Desc="不支持此业务";
    
    public static final String RespCode_RC68="RC68";
    public static final String RespCode_RC68Desc="交易来源错误";
    
    public static final String RespCode_RC69="RC69";
    public static final String RespCode_RC69Desc="绑卡渠道错误";
    
    public static final String RespCode_RC70="RC70";           
    public static final String RespCode_RC70Desc="银行卡开户省市代码不能为空";
    
    public static final String RespCode_RC71="RC71";
    public static final String RespCode_RC71Desc="客户手机号不能为空";
    
    public static final String RespCode_RC72="RC72";           //银行卡未认证
	public static final String RespCode_RC72Desc="交易处理失败，该银行卡未认证"; 
	
	public static final String RespCode_RC73="RC73";
	public static final String RespCode_RC73Desc="商户应答地址不能为空";
	
	public static final String RespCode_RC74="RC74";
	public static final String RespCode_RC74Desc="组织机构代码不能为空";
	
	public static final String RespCode_RC75="RC75";
	public static final String RespCode_RC75Desc="通知Busi000DTO中busiType类型错误";
    
    public static final String RespCode_RC91="RC91";           //收到该文件，后续处理中！
	public static final String RespCode_RC91Desc="收到该文件，后续处理中！";        
	
	public static final String RespCode_RC92="RC92";           //系统异常
	public static final String RespCode_RC92Desc="Ftp服务器上无此文件,请重新推送文件到FTP服务器！";
	
	public static final String RespCode_RC99="RC99";           //系统异常
	public static final String RespCode_RC99Desc="系统异常";  
    
	public static final String RespCode_RC099="RC099";           //撤单，退款对应原始交易结算日期必须大于当前日期
	public static final String RespCode_RC099Desc="该交易已经撤单，不能再次撤单";//
	
	public static final String RespStatus_RS00="RS00";           
	public static final String RespStatus_RS00Desc="无效";
	public static final String RespStatus_RS01="RS01";           
	public static final String RespStatus_RS01Desc="有效";
	public static final String RespStatus_RS02="RS02";           
	public static final String RespStatus_RS02Desc="已认证";
	public static final String RespStatus_RS03="RS03";           
	public static final String RespStatus_RS03Desc="已签约";
	
	//处理成功
    public static final String RespCode_SUPERVISION_0000="0000"; 
    //报文格式不正确
    public static final String RespCode_SUPERVISION_1001="1001";
    //报文长度不正确
    public static final String RespCode_SUPERVISION_1002="1002";   
    //报文MAC值校验错误
    public static final String RespCode_SUPERVISION_1003="1003";   
    //文件名解析失败
    public static final String RespCode_SUPERVISION_1004="1004";   
    //其它异常
    public static final String RespCode_SUPERVISION_9999="9999";     
    
    
	 
	public static Map<String, String> getmap(String key, String value) {
		Map<String, String> RespCodeMap = new HashMap<String, String>();
		RespCodeMap.put("code", key);
		RespCodeMap.put("desc", value);
		return RespCodeMap;
	}
    
    public static final Map<String, Map<String, String>> respMap = new HashMap<String, Map<String, String>>();
	static{
		respMap.put("PAY_006", getmap(RespCode.RespCode_RC50, RespCode.RespCode_RC50Desc));
		respMap.put("PAY_008", getmap(RespCode.RespCode_RC099, RespCode.RespCode_RC099Desc));
		respMap.put("PAY_009", getmap(RespCode.RespCode_RC38, RespCode.RespCode_RC38Desc));
		respMap.put("PAY_011", getmap(RespCode.RespCode_RC51, RespCode.RespCode_RC51Desc));
		respMap.put("PAY_014", getmap(RespCode.RespCode_RC52, RespCode.RespCode_RC52Desc));
		respMap.put("PAY_016", getmap(RespCode.RespCode_RC22, RespCode.RespCode_RC22Desc));
		
		respMap.put("ACCOUNT_004", getmap(RespCode.RespCode_RC11, RespCode.RespCode_RC11Desc));
		respMap.put("ACCOUNT_008", getmap(RespCode.RespCode_RC22, RespCode.RespCode_RC22Desc));
		respMap.put("ACCOUNT_009", getmap(RespCode.RespCode_RC15, RespCode.RespCode_RC15Desc));
		respMap.put("ACCOUNT_010", getmap(RespCode.RespCode_RC13, RespCode.RespCode_RC13Desc));
	}
	
	public static Map<String, String> getDescMap(String Code){
		Map<String, String> RespCodeMap=RespCode.respMap.get(Code);
		if(RespCodeMap==null){
			Map<String, String> codeMap = new HashMap<String, String>();
			codeMap.put("code", RespCode.RespCode_RC99);
			codeMap.put("desc", RespCode.RespCode_RC99Desc);
			return codeMap;
		}
		return RespCodeMap;
	}
	
	
	public static void main(String[] args){
		System.out.println(""+RespCode.getDescMap("PAY_000").get("code"));
		System.out.println(""+RespCode.getDescMap("PAY_000").get("desc"));
	}
			
			
}
