package com.wsp.event.service;

import com.wsp.event.entity.LoadUser;
/**
 * 新用户对象传入和账号获取
 * @author WSP
 */
public interface ServiceGetNewUserCountService {
	/**
	 * 新用户信息
	 * @param loadUser
	 * 账号
	 * @return
	 */
	int serviceGetNewUserCount(LoadUser loadUser);
}
