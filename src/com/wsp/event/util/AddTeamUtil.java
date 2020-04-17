package com.wsp.event.util;

import javax.swing.JComboBox;

import com.wsp.event.common.TeamNameCommon;

/**
 * 下拉选择框，加入队伍名
 * @author WSP
 */
public class AddTeamUtil {
	TeamNameCommon teamNameCommon = new TeamNameCommon();
	public JComboBox<String> addTeam(JComboBox<String> jb) {
		for(int i=0;i<17;i++) {
			jb.addItem(teamNameCommon.getTeam()[i]);
		}
		return jb;
	}
}
