package com.ylink.ylpay.common.project.portal.dto;

import java.util.Date;

import com.ylink.ylpay.common.project.portal.constant.EntityStatus;

/**
 * @author feng.li
 */
public class WorkOrderDTO extends AbstractDTO{

	private static final long serialVersionUID = 4245572814121984693L;

	/**
	 * id
	 */
	private String id;
	/**
	 * 工单编号
	 */
	private String orderNo;
	
	/**
	 * 用户名称
	 */
	private String userName;
	
	/**
	 * 线路分类
	 */
	private String lineClassification;
	
	/**
	 * 通讯地址
	 */
	private String forwardingAddress;
	
	/**
	 * 接入端地址
	 */
	private String accessTerminalAddress;
	
	/**
	 * 用户联系人
	 */
	private String contactUserName;
	
	/**
	 * 用户联系电话
	 */
	private String contactUserPhone;
	
	/**
	 * 用户移动电话
	 */
	private String contactUserMobile;
	
	/**
	 * 接入速率
	 */
	private String accessRate;
	
	/**
	 * 接入方式
	 */
	private String accessMethod;
	
	/**
	 * 业务类别
	 */
	private String businessType;
	
	/**
	 * 工单类型
	 */
	private String orderType;
	
	/**
	 * 上行节点名称
	 */
	private String ascendingNodeName;
	
	/**
	 * 已有ip地址
	 */
	private String ipAlready;
	
	/**
	 * 申请ip数量
	 */
	private int ipAmount;
	
	/**
	 * 计算机台数
	 */
	private int pcAmount;
	
	/**
	 * 新ip分配
	 */
	private String newIpDistribution;
	
	/**
	 * 分配人签字
	 */
	private String distributionSign;
	
	/**
	 * 分配日期
	 */
	private Date distributioDate;
	
	/**
	 * 线路终端设备
	 */
	private String lineTerminalDevice;
	
	/**
	 * 原设备型号
	 */
	private String originalDeviceModel;
	
	/**
	 * 原设备数量
	 */
	private int originalDeviceAmount;
	
	/**
	 * 部门名称
	 */
	private String department_name;
	
	/**
	 * 业务经办人
	 */
	private String businessAgent;
	
	/**
	 * 销售业务员
	 */
	private String salesClerk;
	
	/**
	 * 客服联系人
	 */
	private String customerServiceContactPerson;
	
	/**
	 * 销售业务员移动电话
	 */
	private String salesClerkPhone;
	
	/**
	 * 客服联系人移动电话
	 */
	private String customerServiceContactPhone;
	
	/**
	 * 业务经办人移动电话
	 */
	private String businessAgentPhone;
	
	/**
	 * 销售业务员联系电话
	 */
	private String salesClerkContactPhone;
	
	/**
	 * 客服联系人联系电话
	 */
	private String customerServiceContactPersonPhone;
	
	/**
	 * 业务经办人联系电话
	 */
	private String businessAgentContactPhone;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 更新时间
	 */
	private Date updatedTime;
	
	private EntityStatus status;
	
	/**
	 * 创建者
	 */
	private String creator;
	
	/**
	 * 备注
	 */
	private String remark;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLineClassification() {
		return lineClassification;
	}

	public void setLineClassification(String lineClassification) {
		this.lineClassification = lineClassification;
	}

	public String getForwardingAddress() {
		return forwardingAddress;
	}

	public void setForwardingAddress(String forwardingAddress) {
		this.forwardingAddress = forwardingAddress;
	}

	public String getAccessTerminalAddress() {
		return accessTerminalAddress;
	}

	public void setAccessTerminalAddress(String accessTerminalAddress) {
		this.accessTerminalAddress = accessTerminalAddress;
	}

	public String getContactUserName() {
		return contactUserName;
	}

	public void setContactUserName(String contactUserName) {
		this.contactUserName = contactUserName;
	}

	public String getContactUserPhone() {
		return contactUserPhone;
	}

	public void setContactUserPhone(String contactUserPhone) {
		this.contactUserPhone = contactUserPhone;
	}

	public String getContactUserMobile() {
		return contactUserMobile;
	}

	public void setContactUserMobile(String contactUserMobile) {
		this.contactUserMobile = contactUserMobile;
	}

	public String getAccessRate() {
		return accessRate;
	}

	public void setAccessRate(String accessRate) {
		this.accessRate = accessRate;
	}

	public String getAccessMethod() {
		return accessMethod;
	}

	public void setAccessMethod(String accessMethod) {
		this.accessMethod = accessMethod;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getAscendingNodeName() {
		return ascendingNodeName;
	}

	public void setAscendingNodeName(String ascendingNodeName) {
		this.ascendingNodeName = ascendingNodeName;
	}

	public String getIpAlready() {
		return ipAlready;
	}

	public void setIpAlready(String ipAlready) {
		this.ipAlready = ipAlready;
	}

	public int getIpAmount() {
		return ipAmount;
	}

	public void setIpAmount(int ipAmount) {
		this.ipAmount = ipAmount;
	}

	public int getPcAmount() {
		return pcAmount;
	}

	public void setPcAmount(int pcAmount) {
		this.pcAmount = pcAmount;
	}

	public String getNewIpDistribution() {
		return newIpDistribution;
	}

	public void setNewIpDistribution(String newIpDistribution) {
		this.newIpDistribution = newIpDistribution;
	}

	public String getDistributionSign() {
		return distributionSign;
	}

	public void setDistributionSign(String distributionSign) {
		this.distributionSign = distributionSign;
	}

	public Date getDistributioDate() {
		return distributioDate;
	}

	public void setDistributioDate(Date distributioDate) {
		this.distributioDate = distributioDate;
	}

	public String getLineTerminalDevice() {
		return lineTerminalDevice;
	}

	public void setLineTerminalDevice(String lineTerminalDevice) {
		this.lineTerminalDevice = lineTerminalDevice;
	}

	public String getOriginalDeviceModel() {
		return originalDeviceModel;
	}

	public void setOriginalDeviceModel(String originalDeviceModel) {
		this.originalDeviceModel = originalDeviceModel;
	}

	public int getOriginalDeviceAmount() {
		return originalDeviceAmount;
	}

	public void setOriginalDeviceAmount(int originalDeviceAmount) {
		this.originalDeviceAmount = originalDeviceAmount;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getBusinessAgent() {
		return businessAgent;
	}

	public void setBusinessAgent(String businessAgent) {
		this.businessAgent = businessAgent;
	}

	public String getSalesClerk() {
		return salesClerk;
	}

	public void setSalesClerk(String salesClerk) {
		this.salesClerk = salesClerk;
	}

	public String getCustomerServiceContactPerson() {
		return customerServiceContactPerson;
	}

	public void setCustomerServiceContactPerson(String customerServiceContactPerson) {
		this.customerServiceContactPerson = customerServiceContactPerson;
	}

	public String getSalesClerkPhone() {
		return salesClerkPhone;
	}

	public void setSalesClerkPhone(String salesClerkPhone) {
		this.salesClerkPhone = salesClerkPhone;
	}

	public String getCustomerServiceContactPhone() {
		return customerServiceContactPhone;
	}

	public void setCustomerServiceContactPhone(String customerServiceContactPhone) {
		this.customerServiceContactPhone = customerServiceContactPhone;
	}

	public String getBusinessAgentPhone() {
		return businessAgentPhone;
	}

	public void setBusinessAgentPhone(String businessAgentPhone) {
		this.businessAgentPhone = businessAgentPhone;
	}

	public String getSalesClerkContactPhone() {
		return salesClerkContactPhone;
	}

	public void setSalesClerkContactPhone(String salesClerkContactPhone) {
		this.salesClerkContactPhone = salesClerkContactPhone;
	}

	public String getCustomerServiceContactPersonPhone() {
		return customerServiceContactPersonPhone;
	}

	public void setCustomerServiceContactPersonPhone(
			String customerServiceContactPersonPhone) {
		this.customerServiceContactPersonPhone = customerServiceContactPersonPhone;
	}

	public String getBusinessAgentContactPhone() {
		return businessAgentContactPhone;
	}

	public void setBusinessAgentContactPhone(String businessAgentContactPhone) {
		this.businessAgentContactPhone = businessAgentContactPhone;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public EntityStatus getStatus() {
		return status;
	}

	public void setStatus(EntityStatus status) {
		this.status = status;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
