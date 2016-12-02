/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-4
 */
package com.ylink.ylpay.common.project.supplychain.app;

import java.util.List;

import com.ylink.ylpay.common.project.supplychain.dto.TestDTO;


/** 
 * @author feng.li
 * @date 2013-9-4
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public interface TestAppService {
	public void save(TestDTO testDTO);
	public void update(TestDTO testDTO);
	public void delete(TestDTO testDTO);
	public TestDTO findbyId(String id);
	public List<TestDTO> findList();
}
