/**
 * 版权所有(C) 2014 证联融通电子有限公司
 * 创建:yu.han 2014-10-11
 */

/**
 * DataAppService.java
 * 版权所有(C) 2014 证联支付有限责任公司
 * 创建:yu.han 2014-10-11
 */
package com.ylink.ylpay.common.project.supervision.app;

import com.ylink.ylpay.common.project.supervision.dto.ResultDTO;
import com.ylink.ylpay.common.project.supervision.dto.SetInitDTO;
import com.ylink.ylpay.common.project.supervision.exception.SupervisionCheckedException;

/** 
 * @author yu.han
 * @date 2014-10-11
 * @description：TODO
 */

/**
 * @author yu.han 
 * @date 2014-10-11
 */
public interface TransAppService {
	
	ResultDTO uploadFile(long monitorId,int batchId)throws SupervisionCheckedException;
	ResultDTO noticeUploadedFile(long batchId)throws SupervisionCheckedException;
	ResultDTO downloadNoMatchDetail(long monitorId)throws SupervisionCheckedException;
	ResultDTO setInit(SetInitDTO initDTO)throws SupervisionCheckedException;
	/**
	 * 签到
	 * @description 
	 * @return
	 * @throws SupervisionCheckedException  
	 * @author yu.han
	 * @date 2014-10-29
	 */
	ResultDTO signIn()throws SupervisionCheckedException;
	/**
	 * @description des: 对称密钥; pub: RSA 公钥
	 * @param type
	 * @throws SupervisionCheckedException  
	 * @author yu.han
	 * @return 
	 * @date 2014-10-29
	 */
	ResultDTO downloadPubKey(String type) throws SupervisionCheckedException;
}
