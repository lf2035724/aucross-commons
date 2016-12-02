package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.constant.SubSystem;
import com.ylink.ylpay.common.project.mp.constant.WorkCalendarSystemType;
import com.ylink.ylpay.common.project.mp.dto.Geo;
import com.ylink.ylpay.common.project.mp.dto.Param;

/**
 * 系统参数接口.
 * 
 * @author 潘瑞峥
 * @date 2012-11-13
 */
public interface SystemParamAppService {

	/**
	 * 取系统参数
	 * 
	 * @param system
	 *            子系统
	 * @param group
	 *            组名
	 * @param name
	 *            参数名
	 * @author YangXiaojin
	 * @date 2012-12-10
	 */
	public Param getParam( SubSystem system, String group, String name );

	/**
	 * 取系统参数
	 * 
	 * @param system
	 *            子系统
	 * @param group
	 *            组名
	 * @param name
	 *            参数名
	 * @author YangXiaojin
	 * @date 2012-12-10
	 */
	public List<Param> listParam( SubSystem system, String group );

	/**
	 * 根据银行类型获取该行公钥.
	 * 
	 * <pre>
	 * 接口: <b>2.7.3</b>
	 * 规则: NOT NULL.
	 * </pre>
	 * 
	 * @param bankType
	 * @return
	 */
	public String getPublicKey( String bankType );

	/**
	 * 获取证联融通的公钥.
	 * 
	 * <pre>
	 * 接口: <b>2.7.4</b>
	 * </pre>
	 * 
	 * @return
	 */
	public String getSysPublicKey();

	/**
	 * 获取证联融通的私钥.
	 * 
	 * <pre>
	 * 接口: <b>2.7.4</b>
	 * </pre>
	 * 
	 * @return
	 */
	public String getSysPrivateKey();

	/**
	 * 查询国籍或下级区域.<br>
	 * 
	 * 传入为NULL或""为查询国籍, 否则根据code查询下级区域.
	 * 
	 * <pre>
	 * 接口: <b>2.7.7</b>
	 * 规则: NULL.
	 * </pre>
	 * 
	 * @return
	 */
	public List<Geo> getGeo( String code );

	/**
	 * 根据传入工作日返回下一工作日.<br>
	 * 
	 * 输入输出格式: yyyyMMdd.
	 * 
	 * @param time
	 * @return
	 */
	public String findNextWorkCalendar( String time );

	/**
	 * 根据传入工作日和系统返回下一工作日.<br>
	 * 
	 * 输入输出格式: yyyyMMdd.
	 * 
	 * @param time
	 * @return
	 */
	public String findNextWorkCalendarByDayAndSystem( String time, WorkCalendarSystemType system);

	/**
	 * 返回证联融通商户号.
	 * 
	 * @return
	 */
	public String getZlrtMerchantCode();

}