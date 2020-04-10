package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.GetLoadForUserImpl;
import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.GetLoadUser;
/**
 * 
 * @author WSP
 * @Date 2020Äê4ÔÂ9ÈÕ
 */
public class GetLoadUserImpl implements GetLoadUser {
	
	public LoadUser getLoadUser(int id ,LoadUser loadUser) {
		GetLoadForUserImpl glfui =new GetLoadForUserImpl();
		loadUser = glfui.getLoadUserInSql(id);
		return loadUser;
	}

	public LoadMassager getLoadMassager(int id, LoadMassager loadMassager) {
		GetLoadForUserImpl glfui =new GetLoadForUserImpl();
		loadMassager = glfui.getLoadMassagerInSql(id);
		return loadMassager;
	}
}
