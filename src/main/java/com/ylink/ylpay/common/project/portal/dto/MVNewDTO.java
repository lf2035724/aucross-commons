package com.ylink.ylpay.common.project.portal.dto;

import java.util.Date;

public class MVNewDTO extends AbstractDTO {
	
	private static final long serialVersionUID = -6247362162657889084L;
	
	private String id;

	private String url;
	
	private String creator;
	
	private Date createTime;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
