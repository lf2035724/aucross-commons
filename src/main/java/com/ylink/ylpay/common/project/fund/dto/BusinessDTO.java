package com.ylink.ylpay.common.project.fund.dto;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author ZhangLei
 * @date 2013-01-05
 * @description：BusinessDTO
 */
public class BusinessDTO implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	    private String fundcode;

	    private Date settlementdate;

	    private String downloadfundfilestate;

	    private String uploadfiletobankstate;

	    private String downloadbankfilestate;

	    private String resule;

	    private String fundftppath;

	    private String fundftpname;

	    private String fundlocalpath;

	    private String fundlocalname;

	    private String zlrtlocalpath;

	    private String zlrtlocalname;
	    
	    private String resultftpname;
	    
	    private String resultftppath;
	    
	    private String resultlocalpath;
	    
	    private String resultlocalname;

	    private String businesstype;

	    private Date createdate;

	    private Date updatedate;
	    
	    private String transferStatus;
	    
	    private Long transferAMT;
	 
	    private Long transferCount;
	    
	    private String supervisionSuccAccdate;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFundcode() {
			return fundcode;
		}

		public void setFundcode(String fundcode) {
			this.fundcode = fundcode;
		}

		public Date getSettlementdate() {
			return settlementdate;
		}

		public void setSettlementdate(Date settlementdate) {
			this.settlementdate = settlementdate;
		}

		public String getDownloadfundfilestate() {
			return downloadfundfilestate;
		}

		public void setDownloadfundfilestate(String downloadfundfilestate) {
			this.downloadfundfilestate = downloadfundfilestate;
		}

		public String getUploadfiletobankstate() {
			return uploadfiletobankstate;
		}

		public void setUploadfiletobankstate(String uploadfiletobankstate) {
			this.uploadfiletobankstate = uploadfiletobankstate;
		}

		public String getDownloadbankfilestate() {
			return downloadbankfilestate;
		}

		public void setDownloadbankfilestate(String downloadbankfilestate) {
			this.downloadbankfilestate = downloadbankfilestate;
		}

		public String getResule() {
			return resule;
		}

		public void setResule(String resule) {
			this.resule = resule;
		}

		public String getFundftppath() {
			return fundftppath;
		}

		public void setFundftppath(String fundftppath) {
			this.fundftppath = fundftppath;
		}

		public String getFundftpname() {
			return fundftpname;
		}

		public void setFundftpname(String fundftpname) {
			this.fundftpname = fundftpname;
		}

		public String getFundlocalpath() {
			return fundlocalpath;
		}

		public void setFundlocalpath(String fundlocalpath) {
			this.fundlocalpath = fundlocalpath;
		}

		public String getFundlocalname() {
			return fundlocalname;
		}

		public void setFundlocalname(String fundlocalname) {
			this.fundlocalname = fundlocalname;
		}

		public String getZlrtlocalpath() {
			return zlrtlocalpath;
		}

		public void setZlrtlocalpath(String zlrtlocalpath) {
			this.zlrtlocalpath = zlrtlocalpath;
		}

		public String getZlrtlocalname() {
			return zlrtlocalname;
		}

		public void setZlrtlocalname(String zlrtlocalname) {
			this.zlrtlocalname = zlrtlocalname;
		}

		public String getResultftpname() {
			return resultftpname;
		}

		public void setResultftpname(String resultftpname) {
			this.resultftpname = resultftpname;
		}

		public String getResultftppath() {
			return resultftppath;
		}

		public void setResultftppath(String resultftppath) {
			this.resultftppath = resultftppath;
		}

		public String getResultlocalpath() {
			return resultlocalpath;
		}

		public void setResultlocalpath(String resultlocalpath) {
			this.resultlocalpath = resultlocalpath;
		}

		public String getResultlocalname() {
			return resultlocalname;
		}

		public void setResultlocalname(String resultlocalname) {
			this.resultlocalname = resultlocalname;
		}

		public String getBusinesstype() {
			return businesstype;
		}

		public void setBusinesstype(String businesstype) {
			this.businesstype = businesstype;
		}

		public Date getCreatedate() {
			return createdate;
		}

		public void setCreatedate(Date createdate) {
			this.createdate = createdate;
		}

		public Date getUpdatedate() {
			return updatedate;
		}

		public void setUpdatedate(Date updatedate) {
			this.updatedate = updatedate;
		}

		public String getTransferStatus() {
			return transferStatus;
		}

		public void setTransferStatus(String transferStatus) {
			this.transferStatus = transferStatus;
		}

		public Long getTransferAMT() {
			return transferAMT;
		}

		public void setTransferAMT(Long transferAMT) {
			this.transferAMT = transferAMT;
		}

		public Long getTransferCount() {
			return transferCount;
		}

		public void setTransferCount(Long transferCount) {
			this.transferCount = transferCount;
		}

        /**
         * @return the supervisionSuccAccdate
         */
        public String getSupervisionSuccAccdate() {
            return supervisionSuccAccdate;
        }

        /**
         * @param supervisionSuccAccdate the supervisionSuccAccdate to set
         */
        public void setSupervisionSuccAccdate(String supervisionSuccAccdate) {
            this.supervisionSuccAccdate = supervisionSuccAccdate;
        }
		
		
}