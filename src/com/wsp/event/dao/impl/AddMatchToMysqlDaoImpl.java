package com.wsp.event.dao.impl;

import com.wsp.event.entity.MatchImformation;
import com.wsp.event.util.AddTeamUtil;
import com.wsp.event.util.GetPreparenStatementUtil;
/**
 * ���������MySQL��
 * @author WSP
 */
public class AddMatchToMysqlDaoImpl {
	private AddMatchDaoImpl addMatch = new AddMatchDaoImpl();
	private GetPreparenStatementUtil get = new GetPreparenStatementUtil();
	/**
	 * ������Ϣ
	 * @param match
	 * �����Ƿ�ɹ�
	 * @return
	 */
	public int addMatch(MatchImformation match) {
		int i = addMatch.addMatch(match, get);
		get.getLinkMysqlDao().closeConnection(get.getConn());
		return i;
	}
}
