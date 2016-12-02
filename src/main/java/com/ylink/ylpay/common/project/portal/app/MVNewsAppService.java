/**
 * 版权所有(C) 2015 证联融通电子有限公司
 * 创建:feng.li 2015-2-3
 */

/**
 * ArticleAppService.java
 * 版权所有(C) 2015 证联融通电子有限公司
 * 创建:feng.li 2015-2-3
 */
package com.ylink.ylpay.common.project.portal.app;

import java.util.List;

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.portal.dto.ArticleDTO;
import com.ylink.ylpay.common.project.portal.dto.MVNewDTO;


/** 
 * @author feng.li
 * @date 2015-2-3
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public interface MVNewsAppService {

	/**
	 * @author  feng.li
	 * @param articleDTO
	 * @param user
	 */
	public ListPage<MVNewDTO> findList( MVNewDTO mvNewDTO,ListPage<MVNewDTO> listPage) throws Exception;
	
	/**
	 * @author  feng.li
	 * @param articleDTO
	 * @param user
	 */
	public MVNewDTO get( MVNewDTO mvNewDTO ) throws Exception;
}
