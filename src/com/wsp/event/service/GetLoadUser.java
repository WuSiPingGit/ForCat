package com.wsp.event.service;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
/**
 * 
 * @author WSP
 * @Date 2020��4��5��
 */
public interface GetLoadUser {
		   LoadUser getLoadUser(int id , LoadUser loadUser);
		   LoadMassager getLoadMassager(int id , LoadMassager loadMassager);
}
