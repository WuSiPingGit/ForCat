package com.wsp.event.dao;
import com.wsp.event.entity.LoadMassager;
/**
 * ��ȡ�û���Ϣ�ӿ�
 * @author WSP
 */
public interface GetLoadForMassager {
	/**
	 * �û�id
	 * @param id
	 * �û���Ϣ
	 * @return
	 */
	LoadMassager getLoadMassagerInSql(int id);
}
