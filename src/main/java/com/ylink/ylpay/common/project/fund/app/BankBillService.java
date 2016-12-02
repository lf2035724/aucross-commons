/**===========================================
 *        Copyright (C) 2012 YLINK
 *           All rights reserved
 *
 *  项 目 名： zlrt-fund
 *  文 件 名： BankBillService.java
 *  版本信息： V1.0.0 
 *  作    者： hinode
 *  日    期： 2012-12-22-下午03:06:26
 * 
 ============================================*/

package com.ylink.ylpay.common.project.fund.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.fund.dto.BankBillDetailDTO;
import com.ylink.ylpay.common.project.fund.dto.BankBillTotalDTO;
import com.ylink.ylpay.common.project.fund.dto.BusinessDTO;
import com.ylink.ylpay.common.project.fund.dto.BusinessNoticeDTO;
import com.ylink.ylpay.common.project.fund.exception.FundCheckedException;
/**
 * @类名称： BankBillService
 * @类描述：
 * @创建人： hinode
 * @创建时间： 2012-12-22 下午03:06:26
 * 
 * @修改人： hinode
 * @操作时间： 2012-12-24 下午08:34:45
 * @操作原因：
 */
public interface BankBillService {

	/**
	 * @方法描述: 从接到基金公司通知开始重做
	 * @作者： hinode
	 * @日期： 2013-1-4-上午11:21:52
	 * @param checkDate
	 * @param fundCode
	 * @param busiType
	 * @return
	 * @返回类型： String 0;成功 1;结算日期错误 2;此业务通知不在处理业务之中 3;存在多条业务状态记录错误 4;没找到业务状态记录
	 *        5;此前已经提交监管行审核,请不要重复触发审核流 6;基金公司结算类文件下载失败 7;正联融通结算类文件生成失败
	 *        8;结算类文件上传监管行失败
	 */
	public String againFormFundNotice(String checkDate, String fundCode, String busiType);

	/**
	 * @方法描述: 处理基金公司通知入口
	 * @作者： hinode
	 * @日期： 2012-12-26-下午03:20:55
	 * @param busi000DTO
	 * @返回类型： String 0;成功 1;文件名错误 2;此业务通知不在处理业务之中 3;存在多条业务状态记录错误 4;重复通知 5;未知错误
	 */
	public String dealFundNotice(String checkDate, String fundCode, String busiType);
	/**
	 * @方法描述: 处理监管行通知更新业务状态Downloadbankfilestate为1
	 * @作者： hinode
	 * @日期： 2012-12-26-下午08:13:51
	 * @param fileName
	 * @param checkDate
	 * @param fundCode
	 * @param busiType
	 * @返回类型： String 0;成功 1;参数错误 2;此业务通知不在处理业务之中 3;没找到业务状态记录 4;找到多条业务状态记录 5;重复通知
	 */
	public String dealBankNotice(String fileName, String checkDate, String fundCode, String busiType);
	/**
	 * @方法描述: 下载基金公司结算类文件及处理操作
	 * @作者： hinode
	 * @日期： 2012-12-25-下午07:12:02
	 * @param checkDate
	 * @param fundCode
	 * @return
	 * @返回类型： String
	 */
	public String downloadFundFile(String checkDate, String fundCode, String busiType);
	/**
	 * @方法描述: 组装证联融通并上传ftp及通知监管行操作
	 * @作者： hinode
	 * @日期： 2012-12-25-下午07:12:49
	 * @param checkDate
	 * @param fundCode
	 * @return
	 * @返回类型： String
	 */
	public String uploadFileToBank(String checkDate, String fundCode, String busiType);
	/**
	 * @方法描述: 下载回执文件并解析、更新业务流状态操作（业务状态result为待处理0时才处理）
	 * @作者： hinode
	 * @日期： 2012-12-25-下午07:13:54
	 * @param checkDate
	 * @param fundCode
	 * @return
	 * @返回类型： String
	 */
	public String downloadBankFile(String checkDate, String fundCode, String busiType);
	/**
	 * @方法描述: 分页查询监管银行回执汇总信息
	 * @作者： hinode
	 * @日期： 2012-12-29-上午11:16:31
	 * @param page
	 * @param dto
	 * @return
	 * @返回类型： ListPage<BankBillTotalDTO>
	 */
	public ListPage<BankBillTotalDTO> findBankBillTotalListPage(ListPage<BankBillTotalDTO> page, BankBillTotalDTO dto)
			throws FundCheckedException;
	/**
	 * @方法描述: 分页查询监管银行回执详细信息
	 * @作者： hinode
	 * @日期： 2012-12-29-下午02:14:51
	 * @param page
	 * @param dto
	 * @return
	 * @返回类型： ListPage<BankBillDetailDTO>
	 */
	public ListPage<BankBillDetailDTO> findBankBillDetailListPage(ListPage<BankBillDetailDTO> page,
			BankBillDetailDTO dto);

	/**
	 * @方法描述: 分页查询Business状态
	 * @作者： zhanglei
	 * @日期： 2013-01-05-下午02:14:51
	 * @param page
	 * @param dto
	 * @return
	 * @返回类型： ListPage<BusinessDTO>
	 */
	public ListPage<BusinessDTO> findBusinessListPage(ListPage<BusinessDTO> page, BusinessDTO dto)throws FundCheckedException;
	/**
	 * @方法描述:  分页查询日志信息
	 * @作者： hinode
	 * @日期： 2013-1-28-上午10:49:11
	 * @param page
	 * @param dto
	 * @return
	 * @throws FundCheckedException 
	 * @返回类型： ListPage<BusinessNoticeDTO>
	 */
	public ListPage<BusinessNoticeDTO> findListPagte(ListPage<BusinessNoticeDTO> page, BusinessNoticeDTO dto)throws FundCheckedException;
}
