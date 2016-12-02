/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:ZhangDM(Mingly) 2012-11-8
 */

package com.ylink.ylpay.common.project.fund.app;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.fund.dto.RedemptionOrderDTO;
import com.ylink.ylpay.common.project.fund.exception.FundCheckedException;
import com.ylink.ylpay.common.project.pay.exception.PayCheckedException;


/** 
 * @author YG.HU
 * @date 2012-01-04
 * @description：订单查询对外开发接口
 */
public interface OrderQueryAppService {
	
	
	/**
	 * @description 赎回订单查询
	 * @param page
	 * @param searchCondition
	 * 支持查询条件：
     * batchno          //赎回批次号
     * instuId          //商户号
     * transferStatus   //到账状态 参照（TransferStatus枚举）
     * queryBeginTransferDate  //查询到账日期起始
     * queryEndTransferDate    //查询到账日期终止
     * queryBeginLiqDate       //查询结算日期起始
     * queryEndLiqDate         //查询结算日期终止
     * liqDate                 //结算日期
	 * @return 
     * id;           //流水
     * instuId;             //证联融通分配给商户的机构代码
     * fundDate;            //商户的系统日期，YYYYMMDD 
     * fundTime;            //商户的时间戳，HHMMSS
     * fundSeqId;           //商户系统流水号。需要保证一个交易日中流水号的唯一性
     * flag;                //赎回方式： 0 赎回到用户银行卡（银行卡为必填）  1 赎回到用户虚户（银行卡为空）
     * bankType;            //银行类别
     * cardNo;              //19    不可空 银行卡帐号
     * fundType;            //2 不可空 基金类型：00 -- 股票基金 01 -- 货币基金  02 -- 债券基金
     * fundCode;            //基金申购、赎回、分红交易中，基金公司发行的基金代码
     * userId;              //用户在证联融通平台里的客户号
     * userNameText;        //客户的姓名
     * certType;            //证件类型，参考附录
     * certId;              //证件号码
     * transAmt;            //以分为单位，账户充值金额、基金交易金额、基金转换的金额、账户取现金额等业务交易金额的统称
     * liqDate;             //交易结算日期，YYYYMMDD；不小于交易日期
     * orgFundDate;         //原始基金申购交易日期，YYYYMMDD
     * orgFundSeqId;        //原始基金申购交易流水号
     * busiType;            //业务类型: 赎回0004、分红 0005、退款0006
     * batchno;             //赎回批次
     * transferStatus;      //到账状态  空为未到账 1为已到账
     * transferDate;        //到账日期
     * redemPayMentId;      //赎回支付订单号
     * withdrawPayMentId;   //提现支付订单号
     * remark;              //备注
     * refundRemark;        //退款说明 
	 * @throws PayCheckedException  
	 * @author YG.HU
	 * @date 2013-1-4
	 */
	public ListPage<RedemptionOrderDTO> findRedemptionOrderListPage(ListPage<RedemptionOrderDTO> page, 
	        RedemptionOrderDTO searchCondition)throws FundCheckedException;
	
	/**
	 * @description 
	 * @param id 
	 * @return 如上
	 * @throws FundCheckedException  
	 * @author YG.HU
	 * @date 2013-1-8
	 */
	public RedemptionOrderDTO findRedemptionOrderById(String id)throws FundCheckedException;
}
