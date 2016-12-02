package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 地址区域
 * 
 * @author YangXiaojin
 * 
 */
public class Geo extends BaseDTO {

	private static final long serialVersionUID = -5500520494984523999L;

	/**
	 * 编码
	 */
	private String code;

	/**
	 * 名称
	 */
	private String name;

	public Geo() {
		super();
	}

	public Geo( String code, String name ) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode( String code ) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

}
