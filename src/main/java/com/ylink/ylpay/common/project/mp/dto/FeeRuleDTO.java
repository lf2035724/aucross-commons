package com.ylink.ylpay.common.project.mp.dto;

import java.util.ArrayList;
import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.mp.constant.FeeBlockType;
import com.ylink.ylpay.common.project.mp.constant.FeeCycle;
import com.ylink.ylpay.common.project.mp.constant.FeeKind;
import com.ylink.ylpay.common.project.mp.constant.FeeTarget;
import com.ylink.ylpay.common.project.mp.constant.FeeWay;
import com.ylink.ylpay.common.project.mp.constant.OptType;

/**
 * 计费规则DTO.
 * 
 * @author 潘瑞峥
 * @date 2013-3-19
 */
public class FeeRuleDTO extends BaseDTO {

	private static final long serialVersionUID = -7780619424387512174L;

	private String identity;

	/** 名称. */
	private String name;

	/** 备注. */
	private String description;

	/**
	 * 计费对象.
	 * 
	 * 收取付款方或收款方等的手续费.
	 */
	private FeeTarget feeTarget;

	/** 计费方式. */
	private FeeWay feeWay;

	/** 计费周期. */
	private FeeCycle feeCycle;

	/** 计费类型. */
	private FeeKind feeKind;

	/** 分段类型. */
	private FeeBlockType feeBlockType;

	/** 交易类型. */
	private OptType optType;

	/** 计费规则集合. */
	private List<FeeMethodDTO> feeMethods = new ArrayList<FeeMethodDTO>();

	public String getIdentity() {
		return identity;
	}

	public void setIdentity( String identity ) {
		this.identity = identity;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	public FeeTarget getFeeTarget() {
		return feeTarget;
	}

	public void setFeeTarget( FeeTarget feeTarget ) {
		this.feeTarget = feeTarget;
	}

	public FeeWay getFeeWay() {
		return feeWay;
	}

	public void setFeeWay( FeeWay feeWay ) {
		this.feeWay = feeWay;
	}

	public FeeCycle getFeeCycle() {
		return feeCycle;
	}

	public void setFeeCycle( FeeCycle feeCycle ) {
		this.feeCycle = feeCycle;
	}

	public FeeKind getFeeKind() {
		return feeKind;
	}

	public void setFeeKind( FeeKind feeKind ) {
		this.feeKind = feeKind;
	}

	public FeeBlockType getFeeBlockType() {
		return feeBlockType;
	}

	public void setFeeBlockType( FeeBlockType feeBlockType ) {
		this.feeBlockType = feeBlockType;
	}

	public OptType getOptType() {
		return optType;
	}

	public void setOptType( OptType optType ) {
		this.optType = optType;
	}

	public List<FeeMethodDTO> getFeeMethods() {
		return feeMethods;
	}

	public void setFeeMethods( List<FeeMethodDTO> feeMethods ) {
		this.feeMethods = feeMethods;
	}

}