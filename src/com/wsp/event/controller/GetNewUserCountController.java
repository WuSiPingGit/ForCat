package com.wsp.event.controller;

import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.impl.ServiceGetNewUserCountServiceImpl;

/**
 * 获取新账号
 * @author WSP
 * @Date 2020年4月7日
 */
public class GetNewUserCountController {
	public GetNewUserCountController() {}
	/**
	 * 
	 * @param 账户信息
	 * @return 账号
	 */
	public int getNewCount(LoadUser loadUser) {
		return new ServiceGetNewUserCountServiceImpl().serviceGetNewUserCount(loadUser);
	}
}
