package com.wsp.event.service;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
/**
 * ��ȡ�û���Ϣ�ӿ�
 * @author WSP
 */
public interface GetLoadUserService {
	/**
	 * �û�id
	 * @param id
	 * �û���Ϣ
	 * @return �û���Ϣ
	 */
		   LoadUser getLoadUser(int id);
		   /**
		    * �û�id
		    * @param id
		    * �Ƿ��ǹ���Ա
		    * @param loadMassager����
		    * ����Ա��Ϣ
		    * @return
		    */
		   LoadMassager getLoadMassager(int id , LoadMassager loadMassager);
}
