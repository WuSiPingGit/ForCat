package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.GetLoadForUserImpl;
import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.GetLoadUserService;
/**
 * 获取用户信息
 * @author WSP
 */
public class GetLoadUserServiceImpl implements GetLoadUserService {
	/**
	 * 返回获取用户信息
	 */
	public LoadUser getLoadUser(int id) {
		GetLoadForUserImpl glfui =new GetLoadForUserImpl();
		LoadUser loadUser;
		loadUser = glfui.getLoadUserInSql(id);
		return loadUser;
	}
	/**
	 * 输入id和管理员对象
	 * 返回管理员信息
	 */
	public LoadMassager getLoadMassager(int id, LoadMassager loadMassager) {
		GetLoadForUserImpl glfui =new GetLoadForUserImpl();
		loadMassager = glfui.getLoadMassagerInSql(id);
		return loadMassager;
	}
}
