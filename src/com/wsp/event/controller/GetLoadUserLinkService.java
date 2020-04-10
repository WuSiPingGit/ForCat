package com.wsp.event.controller;

import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.GetLoadUser;
import com.wsp.event.service.impl.GetLoadUserImpl;

public class GetLoadUserLinkService {
	public LoadUser getLoadUserToView(int id, LoadUser loadUser) {
		GetLoadUser getLoadUser = new GetLoadUserImpl();
		loadUser = getLoadUser.getLoadUser(id, loadUser);
		return loadUser;
	}
}
