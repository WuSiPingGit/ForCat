package com.wsp.event.dao;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
/**
 * 
 * @author WSP
 * @Date 2020��4��5��
 */
public interface GetLoadForUser {
	LoadUser getLoadUserInSql(int id);
	LoadMassager getLoadMassagerInSql(int id	);
}
