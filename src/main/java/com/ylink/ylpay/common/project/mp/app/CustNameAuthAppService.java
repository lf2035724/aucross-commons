package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.dto.CustNameAuthBean;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 个人客户实名认证接口.
 * 
 * @author 潘瑞峥
 * @date 2013-1-16
 */
public interface CustNameAuthAppService {

	/**
	 * 新增.
	 * 
	 * <pre>
	 * CustNameAuthBean.custId(个人客户id) NOT NULL;
	 * CustNameAuthBean.custCertBean.certFile(个人客户证件文件) NOT NULL;
	 * CustNameAuthBean.custCertBean.certFileType(个人客户证件文件类型) NULL.
	 * </pre>
	 * 
	 * @param dtoBean
	 * @throws MpCheckedException
	 */
	void save( CustNameAuthBean dtoBean ) throws MpCheckedException;

}