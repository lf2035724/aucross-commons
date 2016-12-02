package com.ylink.ylpay.common.project.fund.app;

public interface CreateStatementAppService {
	/**
	 * 提供管理平台日终调用生成实时赎回对账单
	 * @author LiXiPing
	 * @date 2013-10-28
	 * @description：
	 */
	public void CreateStatementFile(String billDateStr);
}
