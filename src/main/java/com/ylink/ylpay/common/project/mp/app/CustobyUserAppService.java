package com.ylink.ylpay.common.project.mp.app;

import java.io.Serializable;
import java.util.List;

import com.ylink.ylpay.common.project.mp.dto.CustobyUserDTO;

public interface CustobyUserAppService {
	
	/**
	 * 保存白名单
	 */
	public void save(CustobyUserDTO whiteUserDTO);
	/**
	 * 查询白名单
	 */
	public List<CustobyUserDTO> findList(CustobyUserDTO whiteUserDTO);
	/**
	 * 删除白名单
	 */
	public void delete(Serializable identity);
}
