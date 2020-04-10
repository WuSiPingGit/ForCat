package com.wsp.event.dao;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
/**
 * 
 * @author WSP
 * @Date 2020Äê4ÔÂ5ÈÕ
 */
public interface GetLoadForUser {
	LoadUser getLoadUserInSql(int id);
	LoadMassager getLoadMassagerInSql(int id	);
}
