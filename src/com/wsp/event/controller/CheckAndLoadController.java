package com.wsp.event.controller;

import com.wsp.event.service.impl.DoCheckAndLoadServiceImpl;
/**
 * 登陆
 * @author WSP
 */
public class CheckAndLoadController {
	public CheckAndLoadController() {}
	/**
	 * 账号、密码、是否为管理员
	 * @param id
	 * @param ciper
	 * @param isMassager
	 * @return
	 */
	public boolean checkAndLoad(int id, String ciper, boolean isMassager) {
		DoCheckAndLoadServiceImpl doCheckAndLoadServiceImpl = new DoCheckAndLoadServiceImpl();
		return doCheckAndLoadServiceImpl.doCheckAndLoad(id, ciper, isMassager);
	}
}
