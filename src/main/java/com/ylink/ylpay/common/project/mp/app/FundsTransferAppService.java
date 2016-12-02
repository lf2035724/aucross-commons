package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.dto.FundsTransferDTO;

public interface FundsTransferAppService {
	/**
	 * 保存划拨记录
	 */
	public void save(FundsTransferDTO fundsTransferDTO);
	/**
	 * 查询划拨记录
	 */
	public List<FundsTransferDTO> findList(FundsTransferDTO fundsTransferDTO);
}
