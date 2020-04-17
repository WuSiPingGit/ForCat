package com.wsp.event.dao;

import com.wsp.event.entity.LoadUser;
/**
 * 获取新账号
 * @author WSP
 */
public interface GetNewCountFromSql {
	/**
	 * 用户信息
	 * @param loadUser
	 * 账号
	 * @return
	 */
	int getNewCountFromSql(LoadUser loadUser);
}
