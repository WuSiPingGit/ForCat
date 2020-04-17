package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.GetNewCountFromSqlImpl;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.ServiceGetNewUserCountService;
/**
 * ���û���������˺Ż�ȡ
 * @author WSP
 */
public class ServiceGetNewUserCountServiceImpl implements ServiceGetNewUserCountService{
	/**
	 * ���û���Ϣ
	 * @param loadUser
	 * �˺�
	 * @return
	 */
	public int serviceGetNewUserCount(LoadUser loadUser) {
		return new GetNewCountFromSqlImpl().getNewCountFromSql(loadUser);
	}
}
