package com.wsp.event.controller;

import com.wsp.event.service.impl.DoCheckAndLoadServiceImpl;
/**
 * ��½
 * @author WSP
 */
public class CheckAndLoadController {
	public CheckAndLoadController() {}
	/**
	 * �˺š����롢�Ƿ�Ϊ����Ա
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
