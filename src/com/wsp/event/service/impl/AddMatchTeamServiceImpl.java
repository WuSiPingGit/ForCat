package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.AddMatchToMysqlDaoImpl;
import com.wsp.event.entity.MatchImformation;
/**
 * ������޸ı�����Ϣ
 * @author WSP
 */
public class AddMatchTeamServiceImpl {
	AddMatchToMysqlDaoImpl addMatch = new AddMatchToMysqlDaoImpl();
	/**
	 * ������Ϣ
	 * @param match
	 * �Ƿ�ɹ�����
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
