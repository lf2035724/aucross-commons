
/**
 * SetInit.java
 * 版权所有(C) 2014 证联支付有限责任公司
 * 创建:yu.han 2014-10-28
 */
package com.ylink.ylpay.common.project.supervision.dto;

/** 
 * @author yu.han
 * @date 2014-10-28
 * @description：TODO
 */

/**
 * @author yu.han 
 * @date 2014-10-28
 */
public class SetInitDTO extends AbstractDTO {
	/**期初客户资金账户余额**/
	private String Acc_BgnPrdBal;
	/**待结算资金期末余额P13 ***/
	private String ToSetlFndsEndOfPrdBal;
	/**待结转手续费期末余额P14***/
	private String ToCrrOvHdCEndOfPrdBal;
	/**待结转利息期末余额P15***/
	private String ToCrrOvIntEndOfPrdBal;
	/**待结转风险金余额P16 ***/
	private String To_CrrOv_RskFnd_Bal;
	/**客户名称***/
	private String Cst_Nm;
	/**备付金账号***/
	private String CshRs_AccNo;
	/**币种代码 ***/
	private String CcyCd;
	/**期初接受的现金形式客户备付金余额H 01 ***/
	private String Buy_Crd_BgnPrdBal;
	/**期初以自有资金先行赎回预付卡的余额I01***/
	private String Rdmptn_BgnPrdBal;
	/**备付金银行账户余额期初值L22***/
	private String Bnk_Bal_Inl_Val;
	/**期初备付金账户中押金余额N1***/
	private String BOP_CPld_Amt ;
	/**支付机构业务系统已增加客户资金
账户余额，备付金银行未增加备付
金银行账户余额J01 ***/
	private String InstAddBnkNot_Add_Amt;
	/**支付机构业务系统已减少客户资金
账户余额，备付金银行未减少备付
金银行账户余额J02 ***/
	private String InstRdcBnkNot_Rdc_Amt;
	/**备付金银行已增加备付金银行账户
余额，支付机构业务系统未增加客
户资金账户余额J03 ***/
	private String BnkAddInstNot_Add_Amt;
	/**备付金银行已减少备付金银行账户
余额，支付机构业务系统未减少客
户资金账户余额J04**/
	private String BnkRdcInstNot_Rdc_Amt;
	/***备付金银行账户中未结转的备付金
银行存款利息余额M 2 **/
	private String Not_CrrOv_Dep_Int_Val;
	/**备付金银行账户中累计申请存放的
自有资金余额M 3***/
	private String Acm_OwnFds_Bal_Val;
	/**未结转的支付业务净收入余额M 4***/
	private String NotCrrOv_Net_Incm_Val;
	/**期末以现金形式持有的客户备付金
余额M 5 ***/
	private String EOP_Cash_Bal;
	/**本期期末仍存在的以自有资金先行
偿付的预付卡赎回金额M 6 ***/
	private String SlfOwnRepyPCRdmptnVal;
	/**0:新增,1修改*/
	private int insertOrUpdate;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return the acc_BgnPrdBal
	 */
	public String getAcc_BgnPrdBal() {
		return Acc_BgnPrdBal;
	}

	/**
	 * @param acc_BgnPrdBal the acc_BgnPrdBal to set
	 */
	public void setAcc_BgnPrdBal(String acc_BgnPrdBal) {
		Acc_BgnPrdBal = acc_BgnPrdBal;
	}

	/**
	 * @return the toSetlFndsEndOfPrdBal
	 */
	public String getToSetlFndsEndOfPrdBal() {
		return ToSetlFndsEndOfPrdBal;
	}

	/**
	 * @param toSetlFndsEndOfPrdBal the toSetlFndsEndOfPrdBal to set
	 */
	public void setToSetlFndsEndOfPrdBal(String toSetlFndsEndOfPrdBal) {
		ToSetlFndsEndOfPrdBal = toSetlFndsEndOfPrdBal;
	}

	/**
	 * @return the toCrrOvHdCEndOfPrdBal
	 */
	public String getToCrrOvHdCEndOfPrdBal() {
		return ToCrrOvHdCEndOfPrdBal;
	}

	/**
	 * @param toCrrOvHdCEndOfPrdBal the toCrrOvHdCEndOfPrdBal to set
	 */
	public void setToCrrOvHdCEndOfPrdBal(String toCrrOvHdCEndOfPrdBal) {
		ToCrrOvHdCEndOfPrdBal = toCrrOvHdCEndOfPrdBal;
	}

	/**
	 * @return the toCrrOvIntEndOfPrdBal
	 */
	public String getToCrrOvIntEndOfPrdBal() {
		return ToCrrOvIntEndOfPrdBal;
	}

	/**
	 * @param toCrrOvIntEndOfPrdBal the toCrrOvIntEndOfPrdBal to set
	 */
	public void setToCrrOvIntEndOfPrdBal(String toCrrOvIntEndOfPrdBal) {
		ToCrrOvIntEndOfPrdBal = toCrrOvIntEndOfPrdBal;
	}

	/**
	 * @return the to_CrrOv_RskFnd_Bal
	 */
	public String getTo_CrrOv_RskFnd_Bal() {
		return To_CrrOv_RskFnd_Bal;
	}

	/**
	 * @param to_CrrOv_RskFnd_Bal the to_CrrOv_RskFnd_Bal to set
	 */
	public void setTo_CrrOv_RskFnd_Bal(String to_CrrOv_RskFnd_Bal) {
		To_CrrOv_RskFnd_Bal = to_CrrOv_RskFnd_Bal;
	}

	/**
	 * @return the cst_Nm
	 */
	public String getCst_Nm() {
		return Cst_Nm;
	}

	/**
	 * @param cst_Nm the cst_Nm to set
	 */
	public void setCst_Nm(String cst_Nm) {
		Cst_Nm = cst_Nm;
	}

	/**
	 * @return the cshRs_AccNo
	 */
	public String getCshRs_AccNo() {
		return CshRs_AccNo;
	}

	/**
	 * @param cshRs_AccNo the cshRs_AccNo to set
	 */
	public void setCshRs_AccNo(String cshRs_AccNo) {
		CshRs_AccNo = cshRs_AccNo;
	}

	/**
	 * @return the ccyCd
	 */
	public String getCcyCd() {
		return CcyCd;
	}

	/**
	 * @param ccyCd the ccyCd to set
	 */
	public void setCcyCd(String ccyCd) {
		CcyCd = ccyCd;
	}

	/**
	 * @return the buy_Crd_BgnPrdBal
	 */
	public String getBuy_Crd_BgnPrdBal() {
		return Buy_Crd_BgnPrdBal;
	}

	/**
	 * @param buy_Crd_BgnPrdBal the buy_Crd_BgnPrdBal to set
	 */
	public void setBuy_Crd_BgnPrdBal(String buy_Crd_BgnPrdBal) {
		Buy_Crd_BgnPrdBal = buy_Crd_BgnPrdBal;
	}

	/**
	 * @return the rdmptn_BgnPrdBal
	 */
	public String getRdmptn_BgnPrdBal() {
		return Rdmptn_BgnPrdBal;
	}

	/**
	 * @param rdmptn_BgnPrdBal the rdmptn_BgnPrdBal to set
	 */
	public void setRdmptn_BgnPrdBal(String rdmptn_BgnPrdBal) {
		Rdmptn_BgnPrdBal = rdmptn_BgnPrdBal;
	}

	/**
	 * @return the bnk_Bal_Inl_Val
	 */
	public String getBnk_Bal_Inl_Val() {
		return Bnk_Bal_Inl_Val;
	}

	/**
	 * @param bnk_Bal_Inl_Val the bnk_Bal_Inl_Val to set
	 */
	public void setBnk_Bal_Inl_Val(String bnk_Bal_Inl_Val) {
		Bnk_Bal_Inl_Val = bnk_Bal_Inl_Val;
	}

	/**
	 * @return the bOP_CPld_Amt
	 */
	public String getBOP_CPld_Amt() {
		return BOP_CPld_Amt;
	}

	/**
	 * @param bOP_CPld_Amt the bOP_CPld_Amt to set
	 */
	public void setBOP_CPld_Amt(String bOP_CPld_Amt) {
		BOP_CPld_Amt = bOP_CPld_Amt;
	}

	/**
	 * @return the instAddBnkNot_Add_Amt
	 */
	public String getInstAddBnkNot_Add_Amt() {
		return InstAddBnkNot_Add_Amt;
	}

	/**
	 * @param instAddBnkNot_Add_Amt the instAddBnkNot_Add_Amt to set
	 */
	public void setInstAddBnkNot_Add_Amt(String instAddBnkNot_Add_Amt) {
		InstAddBnkNot_Add_Amt = instAddBnkNot_Add_Amt;
	}

	/**
	 * @return the instRdcBnkNot_Rdc_Amt
	 */
	public String getInstRdcBnkNot_Rdc_Amt() {
		return InstRdcBnkNot_Rdc_Amt;
	}

	/**
	 * @param instRdcBnkNot_Rdc_Amt the instRdcBnkNot_Rdc_Amt to set
	 */
	public void setInstRdcBnkNot_Rdc_Amt(String instRdcBnkNot_Rdc_Amt) {
		InstRdcBnkNot_Rdc_Amt = instRdcBnkNot_Rdc_Amt;
	}

	/**
	 * @return the bnkAddInstNot_Add_Amt
	 */
	public String getBnkAddInstNot_Add_Amt() {
		return BnkAddInstNot_Add_Amt;
	}

	/**
	 * @param bnkAddInstNot_Add_Amt the bnkAddInstNot_Add_Amt to set
	 */
	public void setBnkAddInstNot_Add_Amt(String bnkAddInstNot_Add_Amt) {
		BnkAddInstNot_Add_Amt = bnkAddInstNot_Add_Amt;
	}

	/**
	 * @return the bnkRdcInstNot_Rdc_Amt
	 */
	public String getBnkRdcInstNot_Rdc_Amt() {
		return BnkRdcInstNot_Rdc_Amt;
	}

	/**
	 * @param bnkRdcInstNot_Rdc_Amt the bnkRdcInstNot_Rdc_Amt to set
	 */
	public void setBnkRdcInstNot_Rdc_Amt(String bnkRdcInstNot_Rdc_Amt) {
		BnkRdcInstNot_Rdc_Amt = bnkRdcInstNot_Rdc_Amt;
	}

	/**
	 * @return the not_CrrOv_Dep_Int_Val
	 */
	public String getNot_CrrOv_Dep_Int_Val() {
		return Not_CrrOv_Dep_Int_Val;
	}

	/**
	 * @param not_CrrOv_Dep_Int_Val the not_CrrOv_Dep_Int_Val to set
	 */
	public void setNot_CrrOv_Dep_Int_Val(String not_CrrOv_Dep_Int_Val) {
		Not_CrrOv_Dep_Int_Val = not_CrrOv_Dep_Int_Val;
	}

	/**
	 * @return the acm_OwnFds_Bal_Val
	 */
	public String getAcm_OwnFds_Bal_Val() {
		return Acm_OwnFds_Bal_Val;
	}

	/**
	 * @param acm_OwnFds_Bal_Val the acm_OwnFds_Bal_Val to set
	 */
	public void setAcm_OwnFds_Bal_Val(String acm_OwnFds_Bal_Val) {
		Acm_OwnFds_Bal_Val = acm_OwnFds_Bal_Val;
	}

	/**
	 * @return the notCrrOv_Net_Incm_Val
	 */
	public String getNotCrrOv_Net_Incm_Val() {
		return NotCrrOv_Net_Incm_Val;
	}

	/**
	 * @param notCrrOv_Net_Incm_Val the notCrrOv_Net_Incm_Val to set
	 */
	public void setNotCrrOv_Net_Incm_Val(String notCrrOv_Net_Incm_Val) {
		NotCrrOv_Net_Incm_Val = notCrrOv_Net_Incm_Val;
	}

	/**
	 * @return the eOP_Cash_Bal
	 */
	public String getEOP_Cash_Bal() {
		return EOP_Cash_Bal;
	}

	/**
	 * @param eOP_Cash_Bal the eOP_Cash_Bal to set
	 */
	public void setEOP_Cash_Bal(String eOP_Cash_Bal) {
		EOP_Cash_Bal = eOP_Cash_Bal;
	}

	/**
	 * @return the slfOwnRepyPCRdmptnVal
	 */
	public String getSlfOwnRepyPCRdmptnVal() {
		return SlfOwnRepyPCRdmptnVal;
	}

	/**
	 * @param slfOwnRepyPCRdmptnVal the slfOwnRepyPCRdmptnVal to set
	 */
	public void setSlfOwnRepyPCRdmptnVal(String slfOwnRepyPCRdmptnVal) {
		SlfOwnRepyPCRdmptnVal = slfOwnRepyPCRdmptnVal;
	}

	/**
	 * @return the insertOrUpdate
	 */
	public int getInsertOrUpdate() {
		return insertOrUpdate;
	}

	/**
	 * @param insertOrUpdate the insertOrUpdate to set
	 */
	public void setInsertOrUpdate(int insertOrUpdate) {
		this.insertOrUpdate = insertOrUpdate;
	}
}
