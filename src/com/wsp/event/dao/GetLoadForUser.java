package com.wsp.event.dao;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
/**
 * 登陆接口
 * @author WSP
 */
public interface GetLoadForUser {
	/**
	 * 用户id
	 * @param id、
	 * 用户信息
	 * @return
	 */
	LoadUser getLoadUserInSql(int id);
	/**
	 * 管理员id
	 * @param id
	 * 管理员信息
	 * @return
	 */
	LoadMassager getLoadMassagerInSql(int id	);
}
