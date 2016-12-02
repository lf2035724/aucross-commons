/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */

/**
 * ChannelRouteDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-11-7
 */
package com.ylink.ylpay.common.project.mp.constant;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.channel.constant.BankType;

/** 
 * @author feng.li
 * @date 2013-11-7
 * @description：渠道路由DTO
 */

/**
 * @author feng.li
 */
public class ChannelRouteDTO extends BaseDTO{

	private static final long serialVersionUID = -7126400271775955789L;
	
	/** 产品类型. */
	private OptType optType;

	/** 行别. */
	private String bankType;

	/** 跨行类型. */
	private InterBankType interBankType;

	/** 是否为默认. */
	private WhetherStatus isDefault;

	/** 渠道接口. */
	private String channelApi;

	/** 描述. */
	private String description;

	/** 创建日期. */
	private Date createdTime;

	public ChannelRouteDTO() {
	}

	public OptType getOptType() {
		return optType;
	}

	public void setOptType( OptType optType ) {
		this.optType = optType;
	}

	public InterBankType getInterBankType() {
		return interBankType;
	}

	public void setInterBankType( InterBankType interBankType ) {
		this.interBankType = interBankType;
	}

	public WhetherStatus getIsDefault() {
		return isDefault;
	}

	public void setIsDefault( WhetherStatus isDefault ) {
		this.isDefault = isDefault;
	}

	public String getChannelApi() {
		return channelApi;
	}

	public void setChannelApi( String channelApi ) {
		this.channelApi = channelApi;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	public Date getCreatedTime() {
		return createdTime;
	}
	
	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
}
