package com.wsp.event.service;
/**
 * ��½�ӿ�
 * @author WSP
 */
public interface DoCheckAndLoadService {
	/**
	 * �˺�
	 * @param id 
	 * ����
	 * @param ciper
	 * �Ƿ�Ϊ����Ա
	 * @param isMassager
	 * �Ƿ�ɹ�
	 * @return
	 */
		boolean doCheckAndLoad(int id, String ciper, boolean isMassager);
}
