/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-11-14
 */

/**
 * ObjectToStr.java
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司
 * 创建:Leo 2012-11-14
 */
package com.ylink.ylpay.common.project.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/** 
 * @author Leo
 * @date 2012-11-14
 * @description：TODO
 */

/**
 * @author Leo
 *
 */
public abstract class ObjectToStr {

	private static Logger logger = LoggerFactory.getLogger(ObjectToStr.class);
	
	/**
	 * 拼装字符串
	 * @param object
	 * @return
	 * @throws MsgException
	 */
	public static String ObjectToStrByReflect(Object object) throws Exception{
		StringBuffer sb = new StringBuffer();
		Class<?> oClass = object.getClass();
		Field[] fields = oClass.getDeclaredFields();
		for (Field field : fields) {
			try{
				if(field.getModifiers() == Modifier.PRIVATE){
//					String methodName = "get"+field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
//					Method method = oClass.getMethod(methodName);
//					sb.append(field.getName() + "=" + method.invoke(object) + ContextUtil.URL_FIELD_DELIMITER);
					field.setAccessible(true);
					String name = field.getName();
					sb.append(name + "=" +field.get(object) + ContextUtil.URL_FIELD_DELIMITER);
				}
			}catch (Exception e) {
				logger.info("拼装字符串失败" + e.getMessage());
				throw new Exception("拼装字符串失败" + e.getMessage());
			}
			
		}
		return sb.toString();
	}
	/**
	 * 
	 * @description 
	 * @param clazz
	 * @param str
	 * @return
	 * @throws Exception  
	 * @author yu.han
	 * @date 2014-3-6
	 */
	public static <T> T strToBusiDTO(Class<T> clazz,String str) 
	{
		String[] params=str.split(ContextUtil.URL_FIELD_DELIMITER_TRANS);
		
		T dto = null;
		try {
			dto = clazz.newInstance();
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new RuntimeException("拼装字符串失败" + e.getMessage());
		}
		for(String param:params)
		{
			int index=param.indexOf(ContextUtil.URL_EQUAL_DELIMITER);
			if(index>0)
			{
				String keyValue=param.substring(0,index);
				String val=param.substring(index+1);
				try {
//					Method methodsn =dto.getClass().getMethod("set"+keyValue.substring(0, 1).toUpperCase()+keyValue.substring(1), String.class);
//					methodsn.invoke(dto, val);
					Field f=dto.getClass().getDeclaredField(keyValue);
					f.setAccessible(true);
					if(f.getType().equals(boolean.class)||f.getType().equals(Boolean.class)){
						if(StringUtils.isBlank(val)){
							continue;
						}
						f.set(dto,Boolean.parseBoolean(val) );
					}else{
						f.set(dto, val);
					}
				} catch (Exception e) {
					logger.error(e.getMessage()+",key="+keyValue+",val="+val,e);
					throw new RuntimeException("拼装字符串失败" + e.getMessage()+",key="+keyValue+",val="+val);
				}
				
			}
		}
		return dto;
	}
}
