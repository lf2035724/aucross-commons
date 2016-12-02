package com.ylink.ylpay.common.project.mp.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * 计费方法常量.
 * 
 * @author 潘瑞峥
 * @date 2013-3-21
 */
public final class FeeMethodConstant {

	/** 计费方法排序规则. */
	public static List<String[]> comparators = new ArrayList<String[]>();

	/**
	 * 数组的第一个值为排序规则("ASC", "DESC");
	 * 
	 * 第二个值为排序字段, 是FeeMethodDTO里的字段.
	 * 
	 * eg. comparators.add( new String[] { "DESC", "feeLong" } );
	 */
	static {
		comparators.add( new String[] { "ASC", "segMinLong" } );
	}

	private FeeMethodConstant() {
	}

}