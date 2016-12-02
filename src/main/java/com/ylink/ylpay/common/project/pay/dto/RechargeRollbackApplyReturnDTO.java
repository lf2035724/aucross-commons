/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-13
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-12-13
 * @description：TODO
 */

public class RechargeRollbackApplyReturnDTO extends BaseDTO{
    private static final long serialVersionUID = 1L;
    /**
     * 充值回退申请流水号
     */
    private String rollbackId;
    /**
     * 调用方流水号
     */
    private String businessSn;
    /**
     * 回退订单明细
     */
    private List<SubRechargeOrder> rechargeIds= new ArrayList<SubRechargeOrder>();
        public class SubRechargeOrder implements Serializable {
        
        private static final long serialVersionUID = 1L;
        
        /**
         * 充值订单编号
         */
        private String rechargeOrderId;
        /**
         * 充值回退申请号
         */
        private String withdrawOrderId;
        /**
         * 回退金额
         */
        private long rollbackAMT;
        /**
         * 是否成功 
         */
        private String sucessFlag;
        /**
         * 备注
         */
        private String remark;
        /**
         * @return the rechargeOrderId
         */
        public String getRechargeOrderId() {
            return rechargeOrderId;
        }
        /**
         * @param rechargeOrderId the rechargeOrderId to set
         */
        public void setRechargeOrderId(String rechargeOrderId) {
            this.rechargeOrderId = rechargeOrderId;
        }
        /**
         * @return the withdrawOrderId
         */
        public String getWithdrawOrderId() {
            return withdrawOrderId;
        }
        /**
         * @param withdrawOrderId the withdrawOrderId to set
         */
        public void setWithdrawOrderId(String withdrawOrderId) {
            this.withdrawOrderId = withdrawOrderId;
        }
        /**
         * @return the rollbackAMT
         */
        public long getRollbackAMT() {
            return rollbackAMT;
        }
        /**
         * @param rollbackAMT the rollbackAMT to set
         */
        public void setRollbackAMT(long rollbackAMT) {
            this.rollbackAMT = rollbackAMT;
        }
        /**
         * @return the sucessFlag
         */
        public String getSucessFlag() {
            return sucessFlag;
        }
        /**
         * @param sucessFlag the sucessFlag to set
         */
        public void setSucessFlag(String sucessFlag) {
            this.sucessFlag = sucessFlag;
        }
        /**
         * @return the remark
         */
        public String getRemark() {
            return remark;
        }
        /**
         * @param remark the remark to set
         */
        public void setRemark(String remark) {
            this.remark = remark;
        } 
        
    }
        /**
         * @return the rollbackId
         */
        public String getRollbackId() {
            return rollbackId;
        }
        /**
         * @param rollbackId the rollbackId to set
         */
        public void setRollbackId(String rollbackId) {
            this.rollbackId = rollbackId;
        }
        /**
         * @return the businessSn
         */
        public String getBusinessSn() {
            return businessSn;
        }
        /**
         * @param businessSn the businessSn to set
         */
        public void setBusinessSn(String businessSn) {
            this.businessSn = businessSn;
        }
        /**
         * @return the rechargeIds
         */
        public List<SubRechargeOrder> getRechargeIds() {
            return rechargeIds;
        }
        /**
         * @param rechargeIds the rechargeIds to set
         */
        public void setRechargeIds(List<SubRechargeOrder> rechargeIds) {
            this.rechargeIds = rechargeIds;
        }
        
}
