/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-11-28
 */

package com.ylink.ylpay.common.project.pay.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-11-28
 * @description：充值回调DTO
 */

public class RechargeRollbackApplyDTO extends BaseDTO {
    
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

    /**
     * 操作代码
     */
    private String optCode;

    /**
     * 业务类型
     */
    private String productType;

    /**
     * 回退总额
     */
    private long rollbackAmt;

    /**
     * 回退原因
     */
    private String rollbackReason;

    /**
     * 客户编号
     */
    private String custId;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 更新日期
     */
    private Date updateDate;
    
    /**
     * 手续费类型
     */
    private String feeType;
    
    private String merchantId;
    
    
    public class SubRechargeOrder implements Serializable {
		
    	private static final long serialVersionUID = 1L;
		
    	/**
         * 充值订单编号
         */
        private String rechargeOrderId;
        /**
         * 手续费
         */
        private long fee;
        /**
         * 页面展示可回退余额
         */
        private long canRollbackAMT;
        /**
         * 调用方流水
         */
        private String businessSn;
        /**
         * 充值完成日期
         */
        private Date endTime;
        
        /**
         * 原交易订单号
         */
        private String oldTradeId;
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
         * @return the fee
         */
        public long getFee() {
            return fee;
        }
        /**
         * @param fee the fee to set
         */
        public void setFee(long fee) {
            this.fee = fee;
        }
        /**
         * @return the canRollbackAMT
         */
        public long getCanRollbackAMT() {
            return canRollbackAMT;
        }
        /**
         * @param canRollbackAMT the canRollbackAMT to set
         */
        public void setCanRollbackAMT(long canRollbackAMT) {
            this.canRollbackAMT = canRollbackAMT;
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
         * @return the endTime
         */
        public Date getEndTime() {
            return endTime;
        }
        /**
         * @param endTime the endTime to set
         */
        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }
		public String getOldTradeId() {
			return oldTradeId;
		}
		public void setOldTradeId(String oldTradeId) {
			this.oldTradeId = oldTradeId;
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

//    /**
//     * @return the rechargeIds
//     */
//    public List<String> getRechargeIds() {
//        return rechargeIds;
//    }
    public String getRechargeIdsStr(){
        StringBuffer sb = new StringBuffer();
        String rechargeIdsStr = "";
        for(SubRechargeOrder rechargeOrder : this.rechargeIds){
            sb.append(rechargeOrder.getRechargeOrderId()+","
                    +rechargeOrder.getCanRollbackAMT()+","+rechargeOrder.getFee()+","+rechargeOrder.getOldTradeId()+"|");
        }
        if (sb.length()==0){
        }else{
            rechargeIdsStr = sb.subSequence(0, sb.length()-1).toString();
        }
        return rechargeIdsStr;
    }
//    /**
//     * @param rechargeIds the rechargeIds to set
//     */
//    public void setRechargeIds(List<String> rechargeIds) {
//        this.rechargeIds = rechargeIds;
//    }
    public void addRechargeID(String rechargeId,long fee,
            long canRollbackAMT,String businessSn,Date endTime){
        SubRechargeOrder subRechargeOrder = new SubRechargeOrder();
        subRechargeOrder.setRechargeOrderId(rechargeId);
        subRechargeOrder.setFee(fee);
        subRechargeOrder.setCanRollbackAMT(canRollbackAMT);
        subRechargeOrder.setBusinessSn(businessSn);
        subRechargeOrder.setEndTime(endTime);

        this.rechargeIds.add(subRechargeOrder);
    }

    /**
     * @return the optCode
     */
    public String getOptCode() {
        return optCode;
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

    /**
     * @param optCode the optCode to set
     */
    public void setOptCode(String optCode) {
        this.optCode = optCode;
    }

    /**
     * @return the productType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType the productType to set
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * @return the rollbackAmt
     */
    public long getRollbackAmt() {
        return rollbackAmt;
    }

    /**
     * @param rollbackAmt the rollbackAmt to set
     */
    public void setRollbackAmt(long rollbackAmt) {
        this.rollbackAmt = rollbackAmt;
    }

    /**
     * @return the rollbackReason
     */
    public String getRollbackReason() {
        return rollbackReason;
    }

    /**
     * @param rollbackReason the rollbackReason to set
     */
    public void setRollbackReason(String rollbackReason) {
        this.rollbackReason = rollbackReason;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return the updateDate
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return the feeType
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * @param feeType the feeType to set
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
    
    
}
