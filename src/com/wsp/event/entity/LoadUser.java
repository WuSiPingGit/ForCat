package com.wsp.event.entity;

import java.sql.Date;
/**
 * 对应用户登陆对应表
 * @author WSP
 * @Date 2020年4月5日
 */
public class LoadUser {
	private String userCiper;
	private String name;
	private int userCount;
	private String userAnswer;
	private String userQuestion;
	private Date userDate;
	private boolean userCanLoad;
	private int userChange;
	
	public void setUserCiper(String userCiper) {
		this.userCiper = userCiper;
	}
	
	public String getUserCiper() {
		return this.userCiper;
	}
	
	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}
	
	public String getUserAnswer() {
		return userAnswer;
	}
	
	public void setUserQuestion(String UserQuestion) {
		this.userQuestion = UserQuestion;
	}
	
	public String getUserQuestion() {
		return this.userQuestion;
	}

	public Date getUserDate() {
		return userDate;
	}
	
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}

	public int getUserChange() {
		return userChange;
	}

	public void setUserChange(int userChange) {
		this.userChange = userChange;
	}

	public int getUserCount() {
		return userCount;
	}

	public boolean getUserCanLoad() {
		return userCanLoad;
	}

	public void setUserCanLoad(boolean userCanLoad) {
		this.userCanLoad = userCanLoad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
