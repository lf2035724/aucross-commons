package com.ylink.ylpay.common.project.mp.dto;

import java.util.Calendar;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/**
 * 安保问题.
 * 
 * @author 潘瑞峥
 * @date 2012-11-6
 */
public class SafeQuestion extends BaseDTO {

	private static final long serialVersionUID = -3488368234120831367L;

	private String id;

	/** 创建日期 */
	private Calendar createdTime;

	/** 安全问题 */
	private String question;

	/** 安全问题答案 */
	private String safeAnswer;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public Calendar getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime( Calendar createdTime ) {
		this.createdTime = createdTime;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion( String question ) {
		this.question = question;
	}

	public String getSafeAnswer() {
		return safeAnswer;
	}

	public void setSafeAnswer( String safeAnswer ) {
		this.safeAnswer = safeAnswer;
	}

}