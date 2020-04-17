package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.AddMatchToMysqlDaoImpl;
import com.wsp.event.entity.MatchImformation;
/**
 * 加入和修改比赛信息
 * @author WSP
 */
public class AddMatchTeamServiceImpl {
	AddMatchToMysqlDaoImpl addMatch = new AddMatchToMysqlDaoImpl();
	/**
	 * 比赛信息
	 * @param match
	 * 是否成功加入
	 * @return
	 */
	public boolean addMatch(MatchImformation match) {
		int i = addMatch.addMatch(match);
		if (i>0) {
			return true;
		}
		return false;
	}
}
