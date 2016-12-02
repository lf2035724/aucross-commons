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

import com.google.code.lightssh.common.model.page.ListPage;
import com.ylink.ylpay.common.project.portal.dto.ArticleDTO;


/** 
 * @author feng.li
 * @date 2015-2-3
 * @description：TODO
 */

/**
 * @author feng.li
 *
 */
public interface ArticleAppService {

	/**
	 * @author  feng.li
	 * @param articleDTO
	 * @param user
	 */
	public ListPage<ArticleDTO> findList( ArticleDTO articleDTO,ListPage<ArticleDTO> listPage) throws Exception;
	
	/**
	 * @author  feng.li
	 * @param articleDTO
	 * @param user
	 */
	public ArticleDTO get( ArticleDTO articleDTO ) throws Exception;
}
