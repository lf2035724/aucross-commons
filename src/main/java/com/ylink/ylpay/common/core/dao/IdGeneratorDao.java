/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-8-10
 */

package com.ylink.ylpay.common.core.dao;

import org.apache.ibatis.annotations.Param;
import org.ylinkpay.mybatis.annotation.MybatisMapper;


/** 
 * @author ZhangDM(Mingly)
 * @date 2012-8-10
 * @description：序列数据库接口
 */
@MybatisMapper("idGeneratorDao")
public interface IdGeneratorDao {
	
	/**
	 * @description 查找序列值
	 * @param seqName 序列名称
	 * @return 
	 * @author ZhangDM(Mingly)
	 * @date 2012-8-10
	 */
	public long getSeqenceVal(@Param(value="seqName") String seqName);
}
