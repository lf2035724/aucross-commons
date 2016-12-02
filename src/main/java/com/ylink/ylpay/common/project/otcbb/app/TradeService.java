/**
 * 版权所有(C) 2013 证联融通
 * 创建:wanglei 2013-05-14
 */
package com.ylink.ylpay.common.project.otcbb.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.mp.constant.WithdrawErrorType;
import com.ylink.ylpay.common.project.otcbb.constant.WithdrawDetailStatus;
import com.ylink.ylpay.common.project.otcbb.dto.DepositDTO;

/**
 * @description otcbbfs交易服务类
 * @author wanglei
 * @date 2013-05-14
*/
public interface TradeService {
	
	/**
	 * @description 充值请求查询服务--分页查询记录
	 * @param depositdto
	 * @param pageSize  第几页
	 * @param number 每页显示条数
	 * @return
	 * @author wanglei
	 * @date 2013-05-14
	 */
	public ListPage<DepositDTO> rechargeSelect(ListPage<DepositDTO> page, DepositDTO dto);
	
	/**
	 * @description 审核通知(管理平台->otcbb前置)
	 * @param depositdto
	 * @return
	 * @author wanglei
	 * @date 2013-05-14
	 */
	public void auditSucess(DepositDTO depositdto);
	
	/**
	 * 批量更新otc提现明细状态
	 * @description 
	 * @param ids 支付系统订单id
	 * @param status 状态
	 * @param string 错误信息编码
	 * @return  
	 * @author yu.han
	 * @date 2013-5-16
	 * @see com.ylink.ylpay.common.project.otcbb.constant.WithdrawDetailStatus
	 * @see com.ylink.ylpay.common.project.mp.constant.WithdrawErrorType
	 */
	int batchUpdateByPayNo(List<String> ids,WithdrawDetailStatus status,String string);
	
	/**
	 * @description 入金请求
	 * @param depositdto
	 * @return
	 * @author hzy
	 * @date 2014-11-28
	 */	
	public String rechargeSave(DepositDTO dto)throws Exception  ;
	
	/**
	 * @description 入金补发回执
	 * @param depositdto
	 * @return
	 * @author hzy
	 * @date 2014-11-28
	 */	
	public boolean rechargeReCallReissue(String depositId);
	
	/**
	 * @description 入金补发回执
	 * @param depositdto
	 * @return
	 * @author hzy
	 * @date 2014-11-28
	 */	
	public boolean withdrawReCallReissue(String withdrawId);
}
