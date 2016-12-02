/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-10-20
 */

package com.ylink.ylpay.common.project.channel.dto;

import java.io.Serializable;
import java.util.Date;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author ZhangDM(Mingly)
 * @date 2012-10-20
 * @description：数据传输对象抽象类
 */

public abstract class AbstractDTO extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String sysName;      //系统名称     
	private String sysPassword;  //系统调用密码   
	private Date   sysdateTime;  //系统时间     

	
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	public String getSysPassword() {
		return sysPassword;
	}
	public void setSysPassword(String sysPassword) {
		this.sysPassword = sysPassword;
	}
	public Date getSysdateTime() {
		return sysdateTime;
	}
	public void setSysdateTime(Date sysdateTime) {
		this.sysdateTime = sysdateTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
