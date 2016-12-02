/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-6
 */

/**
 * DayCut.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-12-6
 */
package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author Leo
 * @date 2012-12-6
 * @description：TODO
 */

 
public class DayCutDTO  implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;				
	private Date presentDate;
	private Date beforePresentDate;
	private Date updateDate;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getPresentDate() {
		return presentDate;
	}
	public void setPresentDate(Date presentDate) {
		this.presentDate = presentDate;
	}
	public Date getBeforePresentDate() {
		return beforePresentDate;
	}
	public void setBeforePresentDate(Date beforePresentDate) {
		this.beforePresentDate = beforePresentDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	 
	
}
