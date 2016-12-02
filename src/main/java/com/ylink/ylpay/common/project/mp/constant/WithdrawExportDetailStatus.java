package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

/**
 * 提现导出数据状态.
 * 
 * @author 潘瑞峥
 * @date 2012-12-1
 */
public enum WithdrawExportDetailStatus implements PersistentEnum<WithdrawExportDetailStatus, String> {

	NEW( "0", "新建" ),

	BATCHED( "1", "已加入批次" ),

	// 暂时觉得没用, 若继续导出完成记录, 是否会覆盖状态.
	EXPORT( "2", "已导出" ),

	IMPORT( "3", "已导入" ),

	FINISHED( "4", "完成" );

	private String value;
	private final String displayName;

	private static Map<String, WithdrawExportDetailStatus> valueMap = new HashMap<String, WithdrawExportDetailStatus>();

	static {
		for ( WithdrawExportDetailStatus _enum : WithdrawExportDetailStatus.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	WithdrawExportDetailStatus( String value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public WithdrawExportDetailStatus getEnum( String value ) {
		return valueMap.get( value );
	}

	@Override
	public Map<String, WithdrawExportDetailStatus> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	/**
	 * 批次用到的.
	 * 
	 * @return
	 */
	public static WithdrawExportDetailStatus[] batchValues() {
		WithdrawExportDetailStatus[] status = new WithdrawExportDetailStatus[] { NEW, EXPORT, IMPORT };
		return status;

	}

	/**
	 * 明细用到的.
	 * 
	 * @return
	 */
	public static WithdrawExportDetailStatus[] detailValues() {
		WithdrawExportDetailStatus[] status = new WithdrawExportDetailStatus[] { BATCHED, IMPORT, FINISHED };
		return status;

	}

}