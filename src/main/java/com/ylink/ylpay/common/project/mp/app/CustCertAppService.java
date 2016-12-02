package com.ylink.ylpay.common.project.mp.app;

import com.ylink.ylpay.common.project.mp.constant.CertificationType;
import com.ylink.ylpay.common.project.mp.constant.RecoveryAllowType;
import com.ylink.ylpay.common.project.mp.dto.CustCertBean;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 客户证件接口.
 * 
 * @author 潘瑞峥
 * @date 2013-3-26
 */
public interface CustCertAppService {

	/**
	 * 根据图片id查询图片.
	 * 
	 * @param id
	 * @return
	 * @throws MpCheckedException
	 */
	public CustCertBean findById( String id ) throws MpCheckedException;

	/**
	 * 上传.
	 * 
	 * @param certType
	 *            证件类型
	 * @param certFile
	 *            证件文件
	 * @param certFileType
	 *            文件类型
	 * @return
	 */
	public CustCertBean upload( CertificationType certType, byte[] certFile, RecoveryAllowType certFileType ) throws MpCheckedException;

	/**
	 * 更新证件文件
	 * 
	 * @author YangHan
	 * @param certCustId
	 *            证件ID
	 * @param certFile
	 *            证件文件
	 * @throws MpCheckedException
	 */
	public void updateCertType( String certCustId, byte[] certFile ) throws MpCheckedException;

}