package com.wsp.event.dao;

import com.wsp.event.entity.UserImfornation;
/**
 * 获取用户信息
 * @author WSP
 */
public interface GetUserImformation {
	/**
	 * 用户id
	 * @param id
	 * 用户信息
	 * @return
	 */
	UserImfornation getUserImformation(int id);
}
