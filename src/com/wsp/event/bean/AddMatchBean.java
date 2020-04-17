package com.wsp.event.bean;

import java.sql.Date;

import com.wsp.event.entity.MatchImformation;
/**
 * 加入比赛信息
 * @author WSP
 */
public class AddMatchBean {
	private MatchImformation match = new MatchImformation();
	/**
	 * 队伍
	 * @param teamOne
	 * @param teamTwo
	 * 地点
	 * @param area
	 * 价格
	 * @param money
	 * 票和余票
	 * @param allTicke
	 * @param hasTicke
	 * 时间
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
