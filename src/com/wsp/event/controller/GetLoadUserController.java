package com.wsp.event.controller;

import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.GetLoadUserService;
import com.wsp.event.service.impl.GetLoadUserServiceImpl;
/**
 * ��ȡ�û���Ϣ
 * @author WSP
 */
public class GetLoadUserController {
	/**
	 *�û�id
	 * @param id       
	 * @return user
	 */
	public LoadUser getLoadUserToView(int id) {
		GetLoadUserService getLoadUserService = new GetLoadUserServiceImpl();
		return getLoadUserService.getLoadUser(id);
	}
}
