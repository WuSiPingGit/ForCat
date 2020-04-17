package com.wsp.event.dao;

import com.wsp.event.entity.LoadUser;

/**
 * 建立新用户
 * @author WSP
 */
public interface SetNewUserDao {
	/**
	 * 用户信息
	 * @param loadUser
	 * 返回账号
	 * @return
	 */
	int setNewUser(LoadUser loadUser);
}
