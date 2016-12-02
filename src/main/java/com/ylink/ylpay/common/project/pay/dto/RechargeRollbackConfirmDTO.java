/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-29
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.util.ArrayList;
import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-11-29
 * @description：TODO
 */

public class RechargeRollbackConfirmDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;
    /**
     * 充值回退订单组
     */
    private List<SubRechargeRollbackApply> rechargeRollbackApplys = new ArrayList<SubRechargeRollbackApply>();
    /**
     * 调用方式
     */
    private String invokeMode;
    /**
     * 操作编码
     */
    private String optCode;
//    private String mpStatusFrom;
//    private String mpStatusTo;
    public class SubRechargeRollbackApply extends BaseDTO{
        /**
         * 充值回退订单号
         */
        private String RollbackId;
        /**
         * @return the rollbackId
         */
        public String getRollbackId() {
            return RollbackId;
        }
        /**
         * @param rollbackId the rollbackId to set
         */
        public void setRollbackId(String rollbackId) {
            RollbackId = rollbackId;
        }
    }
    /**
     * @return the rechargeRollbackApplys
     */
    public List<SubRechargeRollbackApply> getRechargeRollbackApplys() {
        return rechargeRollbackApplys;
    }
    /**
     * @param rechargeRollbackApplys the rechargeRollbackApplys to set
     */
    public void setRechargeRollbackApplys(
            List<SubRechargeRollbackApply> rechargeRollbackApplys) {
        this.rechargeRollbackApplys = rechargeRollbackApplys;
    }
    /**
     * @return the invokeMode
     */
    public String getInvokeMode() {
        return invokeMode;
    }
    /**
     * @param invokeMode the invokeMode to set
     */
    public void setInvokeMode(String invokeMode) {
        this.invokeMode = invokeMode;
    }
    /**
     * @return the optCode
     */
    public String getOptCode() {
        return optCode;
    }
    /**
     * @param optCode the optCode to set
     */
    public void setOptCode(String optCode) {
        this.optCode = optCode;
    }
    public void addRechargeRollbackApply(String rollbackId){
        SubRechargeRollbackApply rechargeRollbackApply = new SubRechargeRollbackApply();
        rechargeRollbackApply.setRollbackId(rollbackId);
        this.rechargeRollbackApplys.add(rechargeRollbackApply);
    }
}
