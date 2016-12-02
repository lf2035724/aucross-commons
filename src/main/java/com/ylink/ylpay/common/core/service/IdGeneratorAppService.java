/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-8-10
 */

package com.ylink.ylpay.common.core.service;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-8-10
 * @description：id生成器接口
 */

public interface IdGeneratorAppService {
	
	/**
	 * @description 得到序列值
	 * @param seqName
	 * @return 
	 * @author ZhangDM(Mingly)
	 * @date 2012-8-10
	 */
	public long getNextSequence(String seqName);

	/**
	 * @description 得到序列，并以固定的长度“0”左补齐
	 * @param seqName
	 * @param length 序列总长度
	 * @return
	 * @author ZhangDM(Mingly)
	 * @date 2012-8-10
	 */
	public String getNextSequence(String seqName, int length);
}
