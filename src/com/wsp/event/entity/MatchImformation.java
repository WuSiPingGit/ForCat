package com.wsp.event.entity;

import java.sql.Date;

public class MatchImformation {
	private int MatchId;
	private String matchTeamOne;
	private String matchTeamTwo;
	private String detailLocation;
	private Date matchTime;
	private float money;
	private int matchAllTrick;
	private int matchHasTrick;
	private String otherImfortion;
	private boolean matvhTakeHot;
	public int getMatchId() {
		return MatchId;
	}
	public void setMatchId(int matchId) {
		MatchId = matchId;
	}
	public String getMatchTeamOne() {
		return matchTeamOne;
	}
	public void setMatchTeamOne(String matchTeamOne) {
		this.matchTeamOne = matchTeamOne;
	}
	public String getMatchTeamTwo() {
		return matchTeamTwo;
	}
	public void setMatchTeamTwo(String matchTeamTwo) {
		this.matchTeamTwo = matchTeamTwo;
	}
	public String getDetailLocation() {
		return detailLocation;
	}
	public void setDetailLocation(String detailLocation) {
		this.detailLocation = detailLocation;
	}
	public Date getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(Date matchTime) {
		this.matchTime = matchTime;
	}
	public int getMatchAllTrick() {
		return matchAllTrick;
	}
	public void setMatchAllTrick(int matchAllTrick) {
		this.matchAllTrick = matchAllTrick;
	}
	public int getMatchHasTrick() {
		return matchHasTrick;
	}
	public void setMatchHasTrick(int matchHasTrick) {
		this.matchHasTrick = matchHasTrick;
	}
	public String getOtherImfortion() {
		return otherImfortion;
	}
	public void setOtherImfortion(String otherImfortion) {
		this.otherImfortion = otherImfortion;
	}
	public boolean isMatvhTakeHot() {
		return matvhTakeHot;
	}
	public void setMatvhTakeHot(boolean matvhTakeHot) {
		this.matvhTakeHot = matvhTakeHot;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
}
