package com.wsp.event.bean;

import java.sql.Date;

import com.wsp.event.entity.MatchImformation;
/**
 * ���������Ϣ
 * @author WSP
 */
public class AddMatchBean {
	private MatchImformation match = new MatchImformation();
	/**
	 * ����
	 * @param teamOne
	 * @param teamTwo
	 * �ص�
	 * @param area
	 * �۸�
	 * @param money
	 * Ʊ����Ʊ
	 * @param allTicke
	 * @param hasTicke
	 * ʱ��
	 * @param date
	 */
	public void addNewMatch(String teamOne, String teamTwo, String area, float money, int allTicke, int hasTicke,Date date) {
		match.setMatchAllTrick(allTicke);
		match.setMatchHasTrick(hasTicke);
		match.setMatchTeamOne(teamOne);
		match.setMatchTeamTwo(teamTwo);
		match.setDetailLocation(area);
		match.setMoney(money);
		match.setMatchTime(date);
	}
	
	public MatchImformation getMatch() {
		return match;
	}
}
