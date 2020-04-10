package com.wsp.event.service;

import com.wsp.event.dao.impl.GetNewCountFromSqlImpl;
import com.wsp.event.entity.LoadUser;

public class ServiceGetNewUserCountImpl implements ServiceGetNewUserCount{
	public int serviceGetNewUserCount(LoadUser loadUser) {
		return new GetNewCountFromSqlImpl().getNewCountFromSql(loadUser);
	}
}
