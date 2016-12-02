package com.ylink.ylpay.common.project.mp.constant;

import java.util.HashMap;
import java.util.Map;

import com.ylink.ylpay.common.project.mp.hibernate.type.PersistentEnum;

public class SystemParamType {

	/**
	 * 组类型.
	 * 
	 * @author 潘瑞峥
	 * @date 2012-11-13
	 */
	public enum GroupType implements PersistentEnum<GroupType, String> {

		SYSTEM_LOCAL( "SYSTEM_LOCAL", "证联融通系统组" ),

		BANK_KEY_PUBLIC( "BANK_KEY_PUBLIC", "银行公钥组" );

		private String value;
		private final String displayName;

		private static Map<String, GroupType> valueMap = new HashMap<String, GroupType>();

		static {
			for ( GroupType _enum : GroupType.values() ) {
				valueMap.put( _enum.value, _enum );
			}
		}

		GroupType( String value, String displayName ) {
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
		public GroupType getEnum( String value ) {
			return valueMap.get( value );
		}

		@Override
		public Map<String, GroupType> getAllValueMap() {
			return valueMap;
		}

		@Override
		public String toString() {
			return this.getDisplayName();
		}

		public static GroupType returnEnum( String value ) {
			return valueMap.get( value );
		}

	}

	/**
	 * Key类型.
	 * 
	 * @author 潘瑞峥
	 * @date 2012-11-13
	 */
	public enum KeyType implements PersistentEnum<KeyType, String> {

		SYSTEM_LOCAL_KEY_PUBLIC( "KEY_PUBLIC", "证联融通公钥" ),

		SYSTEM_LOCAL_KEY_PRIVATE( "KEY_PRIVATE", "证联融通私钥" );

		private String value;
		private final String displayName;

		private static Map<String, KeyType> valueMap = new HashMap<String, KeyType>();

		static {
			for ( KeyType _enum : KeyType.values() ) {
				valueMap.put( _enum.value, _enum );
			}
		}

		KeyType( String value, String displayName ) {
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
		public KeyType getEnum( String value ) {
			return valueMap.get( value );
		}

		@Override
		public Map<String, KeyType> getAllValueMap() {
			return valueMap;
		}

		@Override
		public String toString() {
			return this.getDisplayName();
		}

		public static KeyType returnEnum( String value ) {
			return valueMap.get( value );
		}

	}

}