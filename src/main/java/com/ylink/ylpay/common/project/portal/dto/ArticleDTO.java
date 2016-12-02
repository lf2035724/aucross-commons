package com.ylink.ylpay.common.project.portal.dto;

import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;
import com.ylink.ylpay.common.project.portal.constant.ArticleType;
import com.ylink.ylpay.common.project.portal.constant.EntityStatus;
import com.ylink.ylpay.common.project.portal.constant.PlateType;

/**
 * @author feng.li
 */
public class ArticleDTO extends BaseDTO{

	private static final long serialVersionUID = 8906213899411017616L;
	
	private String id;
	
	private String title;
	
	private String content;
	
	private EntityStatus status;
	
	private ArticleType type;
	
	private PlateType plate;
	
	private String introduction;
	
	private String titleImg;
	
	private String creator;
	
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

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
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

	public ArticleType getType() {
		return type;
	}

	public void setType(ArticleType type) {
		this.type = type;
	}

	public PlateType getPlate() {
		return plate;
	}

	public void setPlate(PlateType plate) {
		this.plate = plate;
	}

	public EntityStatus getStatus() {
		return status;
	}

	public void setStatus(EntityStatus status) {
		this.status = status;
	}

	public String getTitleImg() {
		return titleImg;
	}

	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
