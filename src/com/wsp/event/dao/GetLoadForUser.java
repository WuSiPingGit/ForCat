package com.wsp.event.dao;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
/**
 * ��½�ӿ�
 * @author WSP
 */
public interface GetLoadForUser {
	/**
	 * �û�id
	 * @param id��
	 * �û���Ϣ
	 * @return
	 */
	LoadUser getLoadUserInSql(int id);
	/**
	 * ����Աid
	 * @param id
	 * ����Ա��Ϣ
	 * @return
	 */
	LoadMassager getLoadMassagerInSql(int id	);
}
