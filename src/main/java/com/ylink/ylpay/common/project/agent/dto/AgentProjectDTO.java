package com.ylink.ylpay.common.project.agent.dto;

import com.ylink.ylpay.common.project.channel.dto.AbstractDTO;

/**
 * @author wanglei
 * @date 2014-7-16
 * @description：缴费项目DTO
 */
public class AgentProjectDTO extends AbstractDTO{

	private static final long serialVersionUID = -7265808197831137265L;
	/**ID*/
	private String id;
	/**城市代码*/
	private String cityCode;
	/**城市名称*/
	private String cityName;
	/**缴费项目代码*/
	private String projectCode;
	/**缴费项目名称*/
	private String projectName;
	/**收费单位标识*/
	private String companyId;
	/**开通标志0：开通；1：未开通*/
	private String flag;
	
	private String strId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getStrId() {
		return strId;
	}
	public void setStrId(String strId) {
		this.strId = strId;
	}
}
