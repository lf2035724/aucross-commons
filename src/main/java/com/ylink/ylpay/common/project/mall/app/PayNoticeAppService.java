package com.ylink.ylpay.common.project.mall.app;

import java.text.ParseException;

import com.ylink.ylpay.common.project.mall.dto.PayNoticeDTO;

public interface PayNoticeAppService {
	
	public String finishPay(PayNoticeDTO payNoticeDTO) throws ParseException;
	
}
