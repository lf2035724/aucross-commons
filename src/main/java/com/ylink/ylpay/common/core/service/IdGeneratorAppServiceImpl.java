/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-8-10
 */

package com.ylink.ylpay.common.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ylink.ylpay.common.core.dao.IdGeneratorDao;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-8-10
 * @description：id生成器实现类
 */
@Service("idGeneratorAppService")
public class IdGeneratorAppServiceImpl implements IdGeneratorAppService {
	
	@Autowired
	@Qualifier("idGeneratorDao")
	private IdGeneratorDao idGeneratorDao;
	
	@Override
	public long getNextSequence(String seqName) {
		return idGeneratorDao.getSeqenceVal(seqName);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public String getNextSequence(String seqName, int length) {
		long value = idGeneratorDao.getSeqenceVal(seqName);
		String formatStr = "%0" + length + "d";
		return String.format(formatStr, value);
	}

}
