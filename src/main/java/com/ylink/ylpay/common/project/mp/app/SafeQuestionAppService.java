package com.ylink.ylpay.common.project.mp.app;

import java.util.List;

import com.ylink.ylpay.common.project.mp.dto.SafeQuestion;
import com.ylink.ylpay.common.project.mp.exception.MpCheckedException;

/**
 * 安全问题接口.
 * 
 * @author 潘瑞峥
 * @date 2012-10-29
 */
public interface SafeQuestionAppService {

	/**
	 * 安全问题模版接口.
	 * 
	 * @author 徐薇
	 */
	public List<String> list() throws MpCheckedException;

	/**
	 * 修改安全问题及密码.
	 * 
	 * <pre>
	 * 接口: <b>2.6.2</b>
	 * 规则: 1.userId: NOT NULL, 2.oldSafeAnswer: NOT NULL, 3.newQuestion: NULL, 4.newSafeAnswer: NULL.
	 * </pre>
	 * 
	 * @param userId
	 * @param oldSafeAnswer
	 * @param newQuestion
	 * @param newSafeAnswer
	 */
	public void update( Long userId, String oldSafeAnswer, String newQuestion, String newSafeAnswer ) throws MpCheckedException;

	/**
	 * 新增安保
	 * 
	 * <pre>
	 * 接口: <b>2.6.3</b>
	 * 规则: ALL NOT NULL.
	 * </pre>
	 * 
	 * @param userId
	 * @return
	 * @throws MpCheckedException
	 */
	public SafeQuestion getSafeQuestion( Long userId ) throws MpCheckedException;
	
	/**
	 * 新增安保问题
	 *
	 * @param userId
	 * @param question
	 * @return
	 * @throws MpCheckedException
	 */
	public void saveQuestion(String userId,SafeQuestion question) throws MpCheckedException;

}