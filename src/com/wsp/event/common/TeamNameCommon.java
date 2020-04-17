package com.wsp.event.common;
/**
 * Õ½¶ÓÃû×Ö
 * @author WSP
 */
public class TeamNameCommon {
	private int AllTeamCount = 17;
	private String[] team = new String[AllTeamCount];
	
	public TeamNameCommon() {
		team[0] = "IG";
		team[1] = "TES";
		team[2] = "RNG";
		team[3] = "FPX";
		team[4] = "EDG";
		team[5] = "LGD";
		team[6] = "JDG";
		team[7] = "OMG";
		team[8] = "WE";
		team[9] = "LNG";
		team[10] = "RW";
		team[11] = "BLG";
		team[12] = "SN";
		team[13] = "DMO";
		team[14] = "VG";
		team[15] = "V5";
		team[16] = "ES";
	}
	public String[] getTeam() {
		return team;
	}
}
