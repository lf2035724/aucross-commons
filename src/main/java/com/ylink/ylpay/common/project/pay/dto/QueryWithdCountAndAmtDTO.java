/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-6
 */

package com.ylink.ylpay.common.project.pay.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;

/** 
 * @author YG.HU
 * @date 2012-12-6
 * @description：TODO
 */

public class QueryWithdCountAndAmtDTO extends BaseDTO {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 客户编号
     */
    private String custId;
    /**
     * 操作编码
     */
    private String optCode;
    /**
     * 查询日期起始
     */
    private String queryDateBeging;
    /**
     * 查询日期终止
     */
    private String queryDateEnd;
    /**
     * 总次数
     */
    private long sumCount;
    /**
     * 总金额
     */
    private long sumAmt;
    
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
    /**
     * @return the queryDateBeging
     */
    public String getQueryDateBeging() {
        return queryDateBeging;
    }
    /**
     * @param queryDateBeging the queryDateBeging to set
     */
    public void setQueryDateBeging(String queryDateBeging) {
        this.queryDateBeging = queryDateBeging;
    }
    /**
     * @return the queryDateEnd
     */
    public String getQueryDateEnd() {
        return queryDateEnd;
    }
    /**
     * @param queryDateEnd the queryDateEnd to set
     */
    public void setQueryDateEnd(String queryDateEnd) {
        this.queryDateEnd = queryDateEnd;
    }
    /**
     * @return the sumCount
     */
    public long getSumCount() {
        return sumCount;
    }
    /**
     * @param sumCount the sumCount to set
     */
    public void setSumCount(long sumCount) {
        this.sumCount = sumCount;
    }
    /**
     * @return the sumAmt
     */
    public long getSumAmt() {
        return sumAmt;
    }
    /**
     * @param sumAmt the sumAmt to set
     */
    public void setSumAmt(long sumAmt) {
        this.sumAmt = sumAmt;
    }
    
    
}
