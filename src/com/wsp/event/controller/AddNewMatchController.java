package com.wsp.event.controller;

import java.sql.Date;

import com.wsp.event.bean.AddMatchBean;
import com.wsp.event.service.impl.AddMatchTeamServiceImpl;
/**
 * ������޸ı���
 * @author WSP
 */
public class AddNewMatchController {
	AddMatchBean addMatchBean = new AddMatchBean();
	/**
	 *                               ����
	 * @param teamOne
	 * @param teamTwo
	 * 
	 * @param area         �ص�
	 * @param money     �۸�
	 * @param allTicke    ��Ʊ��
	 * @param hasTicke  ʣ��Ʊ��
	 * @param date         ʱ��
	 * @return                 �Ƿ�ɹ�
	 */
	public boolean addNewMatch(String teamOne, String teamTwo, String area, float money, int allTicke, int hasTicke,Date date) {
		addMatchBean.addNewMatch(teamOne, teamTwo, area, money, allTicke, hasTicke, date);
		return new AddMatchTeamServiceImpl().addMatch(addMatchBean.getMatch());
	}
}
