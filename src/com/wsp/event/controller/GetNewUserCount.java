package com.wsp.event.controller;

import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.ServiceGetNewUserCountImpl;

/**
 * 
 * @author WSP
 * @Date 2020��4��7��
 */
public class GetNewUserCount {
	public GetNewUserCount() {}
	public int getNewCount(LoadUser loadUser) {
		return new ServiceGetNewUserCountImpl().serviceGetNewUserCount(loadUser);
	}
}
