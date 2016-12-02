package com.ylink.ylpay.common.project.portal.dto;

import java.util.Date;

public class AdvisoryMessageDTO extends AbstractDTO {
	
	private static final long serialVersionUID = -6247362162657889084L;
	
	private Long id;
	
	private String title;
	
	private String content;
	
	private String status;
	
	private String type;
	
	private String answererContent;
	
	private String creator;
	
	private String answererId;
	
	private Date createTime;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAnswererContent() {
		return answererContent;
	}

	public void setAnswererContent(String answererContent) {
		this.answererContent = answererContent;
	}

	public String getAnswererId() {
		return answererId;
	}

	public void setAnswererId(String answererId) {
		this.answererId = answererId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
