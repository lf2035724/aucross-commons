package com.ylink.ylpay.common.project.fund.constant;

import java.util.HashMap;
import java.util.Map;

public enum ResultType {
	SUCCEED("00", "成功"),
	FAIL_INITBUSINESS("01", "初始化业务状态记录失败"),
	FAIL_MULTITERMBUSINESS("02", "存在多条业务状态记录错误"),
	FAIL_NOTICE("03", "此业务通知不在处理业务之中"),
	FAIL_FILENAME("04", "文件名错误"),
	FAIL_NOBUSINESS("05", "没找到业务状态记录"),
	FAIL_PARAMETER("06", "参数错误"),
	FAIL_UPDATEBUSINESS("07", "更新业务操作状态出错"),
	FAIL_REPEATNOTICE("08", "重复通知"),
	FAIL_DOWNFUND("09", "基金公司结算类文件下载失败"),
	FAIL_UPLOADFILE("10", "上传结算类文件失败"),
	FAIL_CREATFILE("11", "结算类文件生成失败"),
	FAIL_REPEATUPLOAD("12", "重复触发上传文件操作"),
	FAIL_ANALYTICFILE("13", "解析回执文件失败"),
	FAIL_DOWNRECEIPT("14", "下载回执文件失败"),
	FAIL_REPEATDOWNRECEIPT("15", "重复触发下载回执文件操作"),
	FAIL_REPEATDOWNFUND("17", "重复触发下载回执文件操作"),
	FAIL("17", "未知错误");
	private String value;
	private String displayName;

	public String getValue() {
		return this.value;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	ResultType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	private static Map<String, ResultType> valueMap = new HashMap<String, ResultType>();

	static {
		for (ResultType _enum : ResultType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	/**
	 * 枚举转换
	 */
	public static ResultType parseOf(String value) {
		for (ResultType item : values())
			if (item.getValue().equals(value))
				return item;

		throw new IllegalArgumentException("异常错误代码[" + value + "]不匹配!");
	}
}
