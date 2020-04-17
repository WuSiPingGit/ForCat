package com.wsp.event.dao;
import com.wsp.event.entity.LoadMassager;
/**
 * 获取用户信息接口
 * @author WSP
 */
public interface GetLoadForMassager {
	/**
	 * 用户id
	 * @param id
	 * 用户信息
	 * @return
	 */
	LoadMassager getLoadMassagerInSql(int id);
}
