/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-27
 */

package com.ylink.ylpay.common.project.fund.app;

import java.util.Date;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.fund.dto.RedemptionTransferConfirmDTO;
import com.ylink.ylpay.common.project.fund.dto.RedemptionTransferQueryDTO;
import com.ylink.ylpay.common.project.fund.exception.FundCheckedException;

/** 
 * @author YG.HU
 * @date 2012-12-27
 * @description：监管行赎回业务对外开放接口类
 */

public interface RedemsettlSuperVisionDealAppService {
    
    
    /**
     * @description 赎回资金入帐标记修改--修改入账标记后才可以到账确认 
     * @param merchantCode
     * @param liqDate
     * @param supervisionBusinessPayFlag
     * @throws FundCheckedException  
     * @author YG.HU
     * @date 2013-1-25
     */
    public void supervisionBusinessPay(String merchantCode,Date liqDate,String supervisionBusinessPayFlag)throws FundCheckedException;
    /**
     * @description 赎回到账确认
     * @return  
     * @author YG.HU
     * @date 2012-12-20
     */                                          
    public void redemptionTransferConfirm(RedemptionTransferConfirmDTO redemptionTransferConfirmDTO)  throws FundCheckedException;
    /**
     * 
     * @description 赎回结算文件上传
     * @return  
     * @author YG.HU
     * @date 2012-12-20
     */
    public void redemptionSettlementFileUpload(String merchantCode,Date liqDate)  throws FundCheckedException;
    /**
     * @description 赎回结算文件上传
     * @return  
     * @author YG.HU
     * @date 2012-12-20
     */
    public void redemptionSettlementFileUpload()  throws FundCheckedException;
    
    /**
     * @description 赎回到账查询
     * @param page
     * @param searchCondition
     * fundcode;                             //基金公司编码
     * settlementdate;                       //结算日期
     * resule;                               //监管行核算结果
     * createdate;                           //创建日期-收到基金公司结算文件日期
     * transferStatus;                       //到账状态
     * resultFinish;                         //结算状态更新结果
     * queryBeginSettlementDate;             //查询结算日期起始
     * queryEndSettlementDate;               //查询结算日期终止
     * queryBeginCreateDate;                 //查询创建日期起始
     * queryEndCreateDate;                   //查询创建日期终止
     * transferDate                          //到账日期
     * @return
     * fundcode;                             //基金公司编码
     * settlementdate;                       //结算日期
     * resule;                               //监管行核算结果
     * createdate;                           //创建日期-收到基金公司结算文件日期
     * transferStatus;                       //到账状态
     * resultFinish;                         //结算状态更新结果
     * transferCount;                        //到账金额赎回笔数 
     * transferAMT;                          //到账金额
     * updatedate;                           //更新日期
     * businesstype;                         //业务类型2002申购、2004赎回
     * transferDate                          //到账日期
     * @throws FundCheckedException  
     * @author YG.HU
     * @date 2013-1-5
     */
    public ListPage<RedemptionTransferQueryDTO> redemptionTransferQuery(ListPage<RedemptionTransferQueryDTO> page, 
            RedemptionTransferQueryDTO searchCondition) throws FundCheckedException;
    
    
    /**
     * @description 
     * @param id
     * @return RedemptionTransferQueryDTO
     * @throws FundCheckedException  
     * @author YG.HU
     * @date 2013-2-27
     */
    public RedemptionTransferQueryDTO redemptionTransferQueryById(long id) throws FundCheckedException;
}
