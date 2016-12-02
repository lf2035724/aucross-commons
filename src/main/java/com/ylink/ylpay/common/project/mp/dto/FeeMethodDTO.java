package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 计费方法DTO.
 * 
 * @author 潘瑞峥
 * @date 2013-3-19
 */
public class FeeMethodDTO extends BaseDTO {

	private static final long serialVersionUID = -5023764138094801551L;

	private String identity;

	/** 备注. */
	private String description;

	/** 计费值. */
	private Long feeLong;
	
	/** 计费值分母*/
	private Long feeDenominator;

	/** 手续费上限. */
	private Long feeMaxLong;

	/** 手续费下限. */
	private Long feeMinLong;

	/** 分段上限. */
	private Long segMaxLong;

	/** 分段下限. */
	private Long segMinLong;
	
	public String getIdentity() {
		return identity;
	}

	public void setIdentity( String identity ) {
		this.identity = identity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	public Long getFeeLong() {
		return feeLong;
	}

	public void setFeeLong( Long feeLong ) {
		this.feeLong = feeLong;
	}

	public Long getFeeMaxLong() {
		return feeMaxLong;
	}

	public void setFeeMaxLong( Long feeMaxLong ) {
		this.feeMaxLong = feeMaxLong;
	}

	public Long getFeeMinLong() {
		return feeMinLong;
	}

	public void setFeeMinLong( Long feeMinLong ) {
		this.feeMinLong = feeMinLong;
	}

	public Long getSegMaxLong() {
		return segMaxLong;
	}

	public void setSegMaxLong( Long segMaxLong ) {
		this.segMaxLong = segMaxLong;
	}

	public Long getSegMinLong() {
		return segMinLong;
	}

	public void setSegMinLong( Long segMinLong ) {
		this.segMinLong = segMinLong;
	}

	public Long getFeeDenominator() {
		return feeDenominator;
	}

	public void setFeeDenominator(Long feeDenominator) {
		this.feeDenominator = feeDenominator;
	}

}