package com.ylink.ylpay.common.project.mp.app;

import java.util.Date;
import java.util.List;

import com.ylink.ylpay.common.project.mp.dto.InterstRate;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;
/**
 * 查询活期利率接口
 * @author YangHan
 *
 */
public interface InterstRateAppService {
	/**
	 * 通过传入的时间段参数,查询时间段内的活期利率信息
	 * @param beginDate 时间段开始时间
	 * @param endDate 时间段结束时间
	 * @return 活期利率信息
	 */
	public List<InterstRate> queryInsterstRateByEffDate(Date beginDate,Date endDate) throws MpCheckedException;
}
