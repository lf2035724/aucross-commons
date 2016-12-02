/**
 * BankSettleNoticeAppService.java
 * 版权所有(C) 2013 证联融通电子有限公司 
 * 创建:YULONG.DU 2013-12-31
 */
package com.ylink.ylpay.common.project.mp.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.mp.dto.BankSettleNoticeDTO;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * @author YULONG.DU
 * @date 2013-12-31
 * @description 银行清算通知对外服务接口
 */
public interface BankSettleNoticeAppService {

	/**
	 * @description 保存银行清算通知信息
	 * @param BankSettleNoticeDTO dto
	 * @return  
	 * @author YULONG.DU
	 * @date 2013-12-31
	 */
	public void save(BankSettleNoticeDTO dto) throws MpCheckedException;

	/**
	 * @description 删除银行清算通知信息
	 * @param String id
	 * @return  
	 * @author YULONG.DU
	 * @date 2013-01-02
	 */
	public void delete(String id) throws MpCheckedException;
	
	/**
	 * @description 修改银行清算通知信息
	 * @param BankSettleNoticeDTO dto
	 * @return  
	 * @author YULONG.DU
	 * @date 2013-01-02
	 */
	
	public void update(BankSettleNoticeDTO dto) throws MpCheckedException;
	
	/**
	 * @description ID查询银行清算通知信息
	 * @param String id
	 * @return BankSettleNoticeDTO dto
	 * @author YULONG.DU
	 * @date 2013-01-02
	 */
	public BankSettleNoticeDTO queryById(String id) throws MpCheckedException;
	
	/**
	 * @description 分页查询银行清算通知信息
	 * @param BankSettleNoticeDTO dto
	 * @param ListPage<BankSettleNoitceDTO> page
	 * @return  ListPage<BankSettleNoitceDTO>
	 * @author YULONG.DU
	 * @date 2013-12-31
	 */
	public ListPage<BankSettleNoticeDTO> findBankSettleNoitceListPage(
			ListPage<BankSettleNoticeDTO> page, BankSettleNoticeDTO dto) throws MpCheckedException;
	
	/**
	 * @description ftp下载银行清算通知文件
	 * @param 
	 * @return  
	 * @author YULONG.DU
	 * @date 2013-12-31
	 */
	public void getMyFile(String id) throws MpCheckedException;
}
