package com.wsp.event.entity;

import java.io.InputStream;
/**
 * 
 * @author WSP
 * @Date 2020Äê4ÔÂ9ÈÕ
 */
public class UserImfornation {
	private int id;
	private boolean isVip;
	private int money;
	private String myTeam;
	private InputStream pic;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean getIsVip() {
		return isVip;
	}
	public void setIsVip(boolean isVip) {
		this.isVip = isVip;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getMyTeam() {
		return myTeam;
	}
	public void setMyTeam(String myTeam) {
		this.myTeam = myTeam;
	}
	public InputStream getPic() {
		return pic;
	}
	public void setPic(InputStream pic) {
		this.pic = pic;
	}
}
