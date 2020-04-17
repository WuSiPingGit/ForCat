package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.GetNewCountFromSqlImpl;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.ServiceGetNewUserCountService;
/**
 * 新用户对象传入和账号获取
 * @author WSP
 */
public class ServiceGetNewUserCountServiceImpl implements ServiceGetNewUserCountService{
	/**
	 * 新用户信息
	 * @param loadUser
	 * 账号
	 * @return
	 */
	public int serviceGetNewUserCount(LoadUser loadUser) {
		return new GetNewCountFromSqlImpl().getNewCountFromSql(loadUser);
	}
}
