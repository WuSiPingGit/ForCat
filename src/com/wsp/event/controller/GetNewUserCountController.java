package com.wsp.event.controller;

import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.impl.ServiceGetNewUserCountServiceImpl;

/**
 * ��ȡ���˺�
 * @author WSP
 * @Date 2020��4��7��
 */
public class GetNewUserCountController {
	public GetNewUserCountController() {}
	/**
	 * 
	 * @param �˻���Ϣ
	 * @return �˺�
	 */
	public int getNewCount(LoadUser loadUser) {
		return new ServiceGetNewUserCountServiceImpl().serviceGetNewUserCount(loadUser);
	}
}
