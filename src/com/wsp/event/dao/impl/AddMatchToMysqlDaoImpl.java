package com.wsp.event.dao.impl;

import com.wsp.event.entity.MatchImformation;
import com.wsp.event.util.AddTeamUtil;
import com.wsp.event.util.GetPreparenStatementUtil;
/**
 * 加入比赛到MySQL中
 * @author WSP
 */
public class AddMatchToMysqlDaoImpl {
	private AddMatchDaoImpl addMatch = new AddMatchDaoImpl();
	private GetPreparenStatementUtil get = new GetPreparenStatementUtil();
	/**
	 * 比赛信息
	 * @param match
	 * 返回是否成功
	 * @return
	 */
	public int addMatch(MatchImformation match) {
		int i = addMatch.addMatch(match, get);
		get.getLinkMysqlDao().closeConnection(get.getConn());
		return i;
	}
}
