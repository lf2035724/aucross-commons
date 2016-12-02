/**
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-29
 */

/**
 * CapitalReservationDTO.java
 * 版权所有(C) 2013 证联融通电子有限公司
 * 创建:feng.li 2013-9-29
 */
package com.ylink.ylpay.common.project.supplychain.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author feng.li
 * @date 2013-9-29
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public class CapitalReservationDTO extends BaseDTO{

	private static final long serialVersionUID = 4039391050931586326L;
	private String reservationSeq;
	private String reservationType;
	private String reservationMessageSeq;
	private String reservationCustId;
	private Date reservationDate;
	private String reservationCustName;
	
	public String getReservationSeq() {
		return reservationSeq;
	}
	public void setReservationSeq(String reservationSeq) {
		this.reservationSeq = reservationSeq;
	}
	public String getReservationType() {
		return reservationType;
	}
	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}
	public String getReservationCustId() {
		return reservationCustId;
	}
	public void setReservationCustId(String reservationCustId) {
		this.reservationCustId = reservationCustId;
	}
	public String getReservationCustName() {
		return reservationCustName;
	}
	public void setReservationCustName(String reservationCustName) {
		this.reservationCustName = reservationCustName;
	}
	public String getReservationMessageSeq() {
		return reservationMessageSeq;
	}
	public void setReservationMessageSeq(String reservationMessageSeq) {
		this.reservationMessageSeq = reservationMessageSeq;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

}
