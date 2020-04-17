package com.wsp.event.controller;

import java.sql.Date;

import com.wsp.event.bean.AddMatchBean;
import com.wsp.event.service.impl.AddMatchTeamServiceImpl;
/**
 * 加入和修改比赛
 * @author WSP
 */
public class AddNewMatchController {
	AddMatchBean addMatchBean = new AddMatchBean();
	/**
	 *                               队伍
	 * @param teamOne
	 * @param teamTwo
	 * 
	 * @param area         地点
	 * @param money     价格
	 * @param allTicke    总票数
	 * @param hasTicke  剩余票数
	 * @param date         时间
	 * @return                 是否成功
	 */
	public boolean addNewMatch(String teamOne, String teamTwo, String area, float money, int allTicke, int hasTicke,Date date) {
		addMatchBean.addNewMatch(teamOne, teamTwo, area, money, allTicke, hasTicke, date);
		return new AddMatchTeamServiceImpl().addMatch(addMatchBean.getMatch());
	}
}
