package com.ylink.ylpay.common.project.portal.dto;

import java.util.Date;

import com.ylink.ylpay.common.project.portal.constant.ArticleType;
import com.ylink.ylpay.common.project.portal.constant.EntityStatus;
import com.ylink.ylpay.common.project.portal.constant.PublicNoticeStatus;

public class PublicNoticeDTO extends AbstractDTO {
	
	private static final long serialVersionUID = -1955690424416737080L;

	private String id;
	
	private PublicNoticeStatus status;
	
	private ArticleType type;
	
	private String title;
	
	private String content;
	
	private String artcleId;
	
	private String creator;
	
	private Long toUserId;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getArtcleId() {
		return artcleId;
	}

	public void setArtcleId(String artcleId) {
		this.artcleId = artcleId;
	}

	public Long getToUserId() {
		return toUserId;
	}

	public void setToUserId(Long toUserId) {
		this.toUserId = toUserId;
	}

	public ArticleType getType() {
		return type;
	}

	public void setType(ArticleType type) {
		this.type = type;
	}

	public PublicNoticeStatus getStatus() {
		return status;
	}

	public void setStatus(PublicNoticeStatus status) {
		this.status = status;
	}
	
}
