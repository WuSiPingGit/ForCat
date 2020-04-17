package com.wsp.event.service.impl;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.DoCheckAndLoadService;
import com.wsp.event.util.MakeCiperSafeUtil;
/**
 * ��½
 * @author WSP
 */
public class DoCheckAndLoadServiceImpl implements DoCheckAndLoadService{
	/**
	 *  �����˺š�������Ƿ�Ϊ����Ա
	 */
	public boolean doCheckAndLoad(int id, String ciper, boolean isMassager) {
		boolean load = false;
		String check = null;
		MakeCiperSafeUtil makeCiperSafeUtil = new MakeCiperSafeUtil();
		GetLoadUserServiceImpl getLoadUserServiceImpl = new GetLoadUserServiceImpl();
		//�ǹ���Ա�˺�������֤
		if (!isMassager) {
			LoadUser loadUser = new LoadUser();
			loadUser = getLoadUserServiceImpl.getLoadUser(id);
			if (loadUser.getUserCiper()!=null) {
				if (loadUser.getUserCanLoad()) {
					check = loadUser.getUserCiper();
					}
				}
			//����Ա�˺�������֤
			} else {
			LoadMassager loadMassager = new LoadMassager();
			loadMassager = getLoadUserServiceImpl.getLoadMassager(id, loadMassager);
			if (loadMassager.getMassagerCiper()!=null) {
				check = loadMassager.getMassagerCiper();
			}
		}
		if (check != null && ciper.equals(makeCiperSafeUtil.getTrueCiper(check))) {
			load = true;
		}
		return load;
	}
}
