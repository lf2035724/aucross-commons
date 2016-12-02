package com.ylink.ylpay.common.project.mp.dto;

import com.ylink.ylpay.common.core.dto.BaseDTO;



	public class FundsLimitBank extends BaseDTO {

		private static final long serialVersionUID = 2477430845125886336L;
		/**
		 * 关联行别T_BANK_TYPE表
		 */
		private String bankId;
		
		/**
		 * 银行卡类型     1为借记卡  2为贷记卡
		 */
		private String cardType;
		
		/**
		 * 渠道类型(枚举)
		 */
		private String channelType;
		
		/**
		 * 交易类型(枚举)
		 */
		private String businessId;
		
		/**
		 * 单笔限额（单位：分）
		 */
		private Integer singleLimit;
		
		/**
		 * 每天限制（单位：分）
		 */
		private Integer dayLimit;
		
		/**
		 * 每月限制（单位：分）
		 */
		private Integer monthLimit;

		public String getBankId() {
			return bankId;
		}

		public void setBankId(String bankId) {
			this.bankId = bankId;
		}

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public String getChannelType() {
			return channelType;
		}

		public void setChannelType(String channelType) {
			this.channelType = channelType;
		}

		public String getBusinessId() {
			return businessId;
		}

		public void setBusinessId(String businessId) {
			this.businessId = businessId;
		}

		public Integer getSingleLimit() {
			return singleLimit;
		}

		public void setSingleLimit(Integer singleLimit) {
			this.singleLimit = singleLimit;
		}

		public Integer getDayLimit() {
			return dayLimit;
		}

		public void setDayLimit(Integer dayLimit) {
			this.dayLimit = dayLimit;
		}

		public Integer getMonthLimit() {
			return monthLimit;
		}

		public void setMonthLimit(Integer monthLimit) {
			this.monthLimit = monthLimit;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

	}

