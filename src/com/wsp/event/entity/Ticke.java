package com.wsp.event.entity;

public class Ticke {
	private int tickeId;
	private int userId;
	private int matchId;
	private boolean tickeCanReturn;
	private boolean  tickeCanUse;
	private int tickeMoney;
	public int getTickeId() {
		return tickeId;
	}
	public void setTickeId(int tickeId) {
		this.tickeId = tickeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public boolean isTickeCanReturn() {
		return tickeCanReturn;
	}
	public void setTickeCanReturn(boolean tickeCanReturn) {
		this.tickeCanReturn = tickeCanReturn;
	}
	public boolean isTickeCanUse() {
		return tickeCanUse;
	}
	public void setTickeCanUse(boolean tickeCanUse) {
		this.tickeCanUse = tickeCanUse;
	}
	public int getTickeMoney() {
		return tickeMoney;
	}
	public void setTickeMoney(int tickeMoney) {
		this.tickeMoney = tickeMoney;
	}
}
