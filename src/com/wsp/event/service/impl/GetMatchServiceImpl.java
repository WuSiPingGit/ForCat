package com.wsp.event.service.impl;

import java.util.LinkedList;

import com.wsp.event.dao.impl.GetMatchDaoImpl;
import com.wsp.event.entity.MatchImformation;
/**
 * 获取比赛信息
 * @author WSP
 */
public class GetMatchServiceImpl {
	GetMatchDaoImpl getMatchDaoImpl = new GetMatchDaoImpl();
	/**
	 * 输入查询信息
	 * @param check
	 * 比赛信息集合
	 * @return
	 */
	public LinkedList<MatchImformation> getMatch(String check) {
		return getMatchDaoImpl.getMatch(check);
	}
}
