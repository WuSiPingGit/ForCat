package com.wsp.event.bean;

import java.sql.Date;

import com.wsp.event.entity.LoadUser;
import com.wsp.event.util.MakeCiperSafeUtil;
import com.wsp.event.view.LoadComposement;
/**
 * 
 * @author WSP
 * @Date 2020Äê4ÔÂ7ÈÕ
 */
public class SetNewUser {
	private LoadUser loadUser;
	LoadComposement lc;
	public SetNewUser(LoadUser loadUser, LoadComposement lc) {
		this.loadUser = loadUser;
		this.lc = lc;
	}
	
	public LoadUser setNewUser() {
		String ciper = lc.userCiperNewUser.getText();
		MakeCiperSafeUtil makeCiperSafeUtil = new MakeCiperSafeUtil();
		String changeCiper =makeCiperSafeUtil.changeCiper(ciper);
		loadUser.setUserCiper(changeCiper);
		loadUser.setUserDate(new Date(System.currentTimeMillis()));
		loadUser.setUserQuestion(lc.userQuestion.getText());
		loadUser.setUserCanLoad(true);
		loadUser.setName(lc.userName.getText());
		loadUser.setUserAnswer(lc.userAnswer.getText());
		return this.loadUser;
	}
}
