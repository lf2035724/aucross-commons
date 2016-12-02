package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.dto.TrustRolesDTO;

public interface TrustRolesAppService {
	/**
	 * 保存角色
	 */
	public void save(TrustRolesDTO trustRolesDTO);
	/**
	 * 查询角色列表
	 */
	public List<TrustRolesDTO> findList(TrustRolesDTO trustRolesDTO);
	public TrustRolesDTO getByEmail(String email);
	public TrustRolesDTO getByLoginName(String loginName);
	public boolean checkPayPassword(String id,String custId,String payPassword,String role);
}
