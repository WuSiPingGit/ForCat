package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.GetLoadForUserImpl;
import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.GetLoadUserService;
/**
 * ��ȡ�û���Ϣ
 * @author WSP
 */
public class GetLoadUserServiceImpl implements GetLoadUserService {
	/**
	 * ���ػ�ȡ�û���Ϣ
	 */
	public LoadUser getLoadUser(int id) {
		GetLoadForUserImpl glfui =new GetLoadForUserImpl();
		LoadUser loadUser;
		loadUser = glfui.getLoadUserInSql(id);
		return loadUser;
	}
	/**
	 * ����id�͹���Ա����
	 * ���ع���Ա��Ϣ
	 */
	public LoadMassager getLoadMassager(int id, LoadMassager loadMassager) {
		GetLoadForUserImpl glfui =new GetLoadForUserImpl();
		loadMassager = glfui.getLoadMassagerInSql(id);
		return loadMassager;
	}
}
