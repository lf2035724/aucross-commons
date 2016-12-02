package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 实时赎回对账结果
 * @author LiXiPing
 * @date 2013-11-5
 * @description：
 */
public class TimelyBillReconDTO implements Serializable {
	private static final long serialVersionUID = 7348179091968178637L;
	private String id;//	流水号
	private String instuid;//	证联融通分配给商户的机构代码
	private String liqdate;//	交易结算日期，YYYYMMDD；不小于交易日期
	private String notice_flag;//	通知状态 00：未通知 	01：已通知
	private String file_name;//	文件名称
	private String file_place;//	文件结果
	private Long batch_id;//	批次号
	private Long sum_amt_redem;//	及时赎回总金额
	private Long sum_count_redem;//	及时赎回总比数
	private String redeem_pay_id;//	汇总支付对应订单
	private String redeem_all_status;//	及时赎回汇总交易状态 1：已汇总	2：赎回到账	3：已冲减额度
	private Long buy_sum_amt;//	金汇宝支付总比数
	private Long buy_sum_count;//	金汇宝支付总金额
	private String buy_all_status;//	金汇宝支付赎回状态	1：已汇总	2：赎回到账	3：已冲减额度
	private String buy_pay_id;//	金汇宝支付汇总对应支付订单
	private Date create_time;//	创建日期
	private Date update_time;//	更新日期
	private String gather_id;//	汇总ID
	private String sgather_id;//及时申购汇总ID
	private String payment_id;//冲减额度支付ID
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the update_time
	 */
	public Date getUpdate_time() {
		return update_time;
	}
	/**
	 * @param update_time the update_time to set
	 */
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	/**
	 * @return the sgather_id
	 */
	public String getSgather_id() {
		return sgather_id;
	}
	/**
	 * @param sgather_id the sgather_id to set
	 */
	public void setSgather_id(String sgather_id) {
		this.sgather_id = sgather_id;
	}
	/**
	 * @return the payment_id
	 */
	public String getPayment_id() {
		return payment_id;
	}
	/**
	 * @param payment_id the payment_id to set
	 */
	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}
	/**
	 * @return the instuid
	 */
	public String getInstuid() {
		return instuid;
	}
	/**
	 * @param instuid the instuid to set
	 */
	public void setInstuid(String instuid) {
		this.instuid = instuid;
	}
	/**
	 * @return the liadate
	 */

	/**
	 * @return the notice_flag
	 */
	public String getNotice_flag() {
		return notice_flag;
	}
	/**
	 * @return the liqdate
	 */
	public String getLiqdate() {
		return liqdate;
	}
	/**
	 * @param liqdate the liqdate to set
	 */
	public void setLiqdate(String liqdate) {
		this.liqdate = liqdate;
	}
	/**
	 * @param notice_flag the notice_flag to set
	 */
	public void setNotice_flag(String notice_flag) {
		this.notice_flag = notice_flag;
	}
	/**
	 * @return the file_name
	 */
	public String getFile_name() {
		return file_name;
	}
	/**
	 * @param file_name the file_name to set
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	/**
	 * @return the file_place
	 */
	public String getFile_place() {
		return file_place;
	}
	/**
	 * @param file_place the file_place to set
	 */
	public void setFile_place(String file_place) {
		this.file_place = file_place;
	}
	/**
	 * @return the batch_id
	 */
	public Long getBatch_id() {
		return batch_id;
	}
	/**
	 * @param batch_id the batch_id to set
	 */
	public void setBatch_id(Long batch_id) {
		this.batch_id = batch_id;
	}
	/**
	 * @return the sum_amt_redem
	 */
	public Long getSum_amt_redem() {
		return sum_amt_redem;
	}
	/**
	 * @param sum_amt_redem the sum_amt_redem to set
	 */
	public void setSum_amt_redem(Long sum_amt_redem) {
		this.sum_amt_redem = sum_amt_redem;
	}
	/**
	 * @return the sum_count_redem
	 */
	public Long getSum_count_redem() {
		return sum_count_redem;
	}
	/**
	 * @param sum_count_redem the sum_count_redem to set
	 */
	public void setSum_count_redem(Long sum_count_redem) {
		this.sum_count_redem = sum_count_redem;
	}
	/**
	 * @return the redeem_pay_id
	 */
	public String getRedeem_pay_id() {
		return redeem_pay_id;
	}
	/**
	 * @param redeem_pay_id the redeem_pay_id to set
	 */
	public void setRedeem_pay_id(String redeem_pay_id) {
		this.redeem_pay_id = redeem_pay_id;
	}
	/**
	 * @return the redeem_all_status
	 */
	public String getRedeem_all_status() {
		return redeem_all_status;
	}
	/**
	 * @param redeem_all_status the redeem_all_status to set
	 */
	public void setRedeem_all_status(String redeem_all_status) {
		this.redeem_all_status = redeem_all_status;
	}
	/**
	 * @return the buy_sum_amt
	 */
	public Long getBuy_sum_amt() {
		return buy_sum_amt;
	}
	/**
	 * @param buy_sum_amt the buy_sum_amt to set
	 */
	public void setBuy_sum_amt(Long buy_sum_amt) {
		this.buy_sum_amt = buy_sum_amt;
	}
	/**
	 * @return the buy_sum_count
	 */

	/**
	 * @return the buy_all_status
	 */
	public String getBuy_all_status() {
		return buy_all_status;
	}
	/**
	 * @return the buy_sum_count
	 */
	public Long getBuy_sum_count() {
		return buy_sum_count;
	}
	/**
	 * @param buy_sum_count the buy_sum_count to set
	 */
	public void setBuy_sum_count(Long buy_sum_count) {
		this.buy_sum_count = buy_sum_count;
	}
	/**
	 * @param buy_all_status the buy_all_status to set
	 */
	public void setBuy_all_status(String buy_all_status) {
		this.buy_all_status = buy_all_status;
	}
	/**
	 * @return the buy_pay_id
	 */
	public String getBuy_pay_id() {
		return buy_pay_id;
	}
	/**
	 * @param buy_pay_id the buy_pay_id to set
	 */
	public void setBuy_pay_id(String buy_pay_id) {
		this.buy_pay_id = buy_pay_id;
	}
	/**
	 * @return the create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}
	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	/**
	 * @return the uapde_time
	 */
	public Date getUapde_time() {
		return update_time;
	}
	/**
	 * @param uapde_time the uapde_time to set
	 */
	public void setUapde_time(Date uapde_time) {
		this.update_time = uapde_time;
	}
	/**
	 * @return the gather_id
	 */
	public String getGather_id() {
		return gather_id;
	}
	/**
	 * @param gather_id the gather_id to set
	 */
	public void setGather_id(String gather_id) {
		this.gather_id = gather_id;
	}

}
