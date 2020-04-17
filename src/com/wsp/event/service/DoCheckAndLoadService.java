package com.wsp.event.service;
/**
 * 登陆接口
 * @author WSP
 */
public interface DoCheckAndLoadService {
	/**
	 * 账号
	 * @param id 
	 * 密码
	 * @param ciper
	 * 是否为管理员
	 * @param isMassager
	 * 是否成功
	 * @return
	 */
		boolean doCheckAndLoad(int id, String ciper, boolean isMassager);
}
