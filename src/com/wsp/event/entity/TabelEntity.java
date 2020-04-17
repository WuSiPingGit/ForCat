package com.wsp.event.entity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;

public class TabelEntity {
	private Date date;
	private String team;
	private float money;
	private int hasTicke;
	private JButton buy = new JButton("¹ºÂò");
	class BuyAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}	
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public int getHasTicke() {
		return hasTicke;
	}
	public void setHasTicke(int hasTicke) {
		this.hasTicke = hasTicke;
	}
	public JButton getBuy() {
		return buy;
	}
}
