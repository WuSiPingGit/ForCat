package com.wsp.event.service;

import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
/**
 * 获取用户信息接口
 * @author WSP
 */
public interface GetLoadUserService {
	/**
	 * 用户id
	 * @param id
	 * 用户信息
	 * @return 用户信息
	 */
		   LoadUser getLoadUser(int id);
		   /**
		    * 用户id
		    * @param id
		    * 是否是管理员
		    * @param loadMassager对象
		    * 管理员信息
		    * @return
		    */
		   LoadMassager getLoadMassager(int id , LoadMassager loadMassager);
}
