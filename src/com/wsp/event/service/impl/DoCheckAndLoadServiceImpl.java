package com.wsp.event.service.impl;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.service.DoCheckAndLoadService;
import com.wsp.event.util.MakeCiperSafeUtil;
/**
 * 登陆
 * @author WSP
 */
public class DoCheckAndLoadServiceImpl implements DoCheckAndLoadService{
	/**
	 *  传入账号、密码和是否为管理员
	 */
	public boolean doCheckAndLoad(int id, String ciper, boolean isMassager) {
		boolean load = false;
		String check = null;
		MakeCiperSafeUtil makeCiperSafeUtil = new MakeCiperSafeUtil();
		GetLoadUserServiceImpl getLoadUserServiceImpl = new GetLoadUserServiceImpl();
		//非管理员账号密码验证
		if (!isMassager) {
			LoadUser loadUser = new LoadUser();
			loadUser = getLoadUserServiceImpl.getLoadUser(id);
			if (loadUser.getUserCiper()!=null) {
				if (loadUser.getUserCanLoad()) {
					check = loadUser.getUserCiper();
					}
				}
			//管理员账号密码验证
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
