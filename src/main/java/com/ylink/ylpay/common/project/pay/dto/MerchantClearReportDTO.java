/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-27
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2013-04-09
 * @description：商户结算DTO
 */

public class MerchantClearReportDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 商户号
	 */
	private String merchantCode;
	/**
	 * 结算起始日期
	 */
	private String beginSettleDate;
	/**
	 * 结算结束日期
	 */
	private String endSettleDate;
	/**
	 * 产品类型
	 */
	private String productType;
	/**
	 * 总笔数
	 */
	private Long totalCount;
	/**
	 * 总金额
	 */
	private Long totalAmt;
	/**
     * 操作编码
     */
    private String optCode;
	
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getBeginSettleDate() {
		return beginSettleDate;
	}
	public void setBeginSettleDate(String beginSettleDate) {
		this.beginSettleDate = beginSettleDate;
	}
	public String getEndSettleDate() {
		return endSettleDate;
	}
	public void setEndSettleDate(String endSettleDate) {
		this.endSettleDate = endSettleDate;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public String getOptCode() {
		return optCode;
	}
	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}
	public Long getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Long totalAmt) {
		this.totalAmt = totalAmt;
	}
	
}
