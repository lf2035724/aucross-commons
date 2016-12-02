/**
	 * 版权所有(C) 2013 证联融通
	 * 创建:wanglei 2014-3-25
	 */
package com.ylink.ylpay.common.project.mall.app;


public interface CebbAppService {
	public boolean signVerify(String signXml) throws Exception;
	
	public boolean signDataVerify(String plain, String sign) throws Exception;
	
	public String signXmlData(String signXml,String transId) throws Exception;
	
	public String signData(String signStr) throws Exception;
}
