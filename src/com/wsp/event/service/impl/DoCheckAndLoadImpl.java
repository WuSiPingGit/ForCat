package com.wsp.event.service.impl;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.DoCheckAndLoad;
import com.wsp.event.util.MakeCiperSafeUtil;
/**
 * 
 * @author WSP
 * @Date 2020Äê4ÔÂ7ÈÕ
 */
public class DoCheckAndLoadImpl implements DoCheckAndLoad{
	public boolean doCheckAndLoad(int id, String ciper, boolean isMassager) {
		boolean load = false;
		String check = null;
		MakeCiperSafeUtil makeCiperSafeUtil = new MakeCiperSafeUtil();
		GetLoadUserImpl getLoadUserImpl = new GetLoadUserImpl();
		if (!isMassager) {
			LoadUser loadUser = new LoadUser();
			loadUser = getLoadUserImpl.getLoadUser(id, loadUser);
			if (loadUser.getUserCiper()!=null) {
				if (loadUser.getUserCanLoad()) {
					check = loadUser.getUserCiper();
					}
				}
			} else {
			LoadMassager loadMassager = new LoadMassager();
			loadMassager = getLoadUserImpl.getLoadMassager(id, loadMassager);
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
