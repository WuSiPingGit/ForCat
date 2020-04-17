package com.wsp.event.bean;

import java.sql.Date;

import com.wsp.event.entity.LoadUser;
import com.wsp.event.util.MakeCiperSafeUtil;
import com.wsp.event.view.LoadComposementView;
/**
 * 写入user信息
 * @author WSP
 */
public class SetNewUser {
	private LoadUser loadUser;
	LoadComposementView lc;
	/**
	 * 存放user信息
	 * @param loadUser 
	 * 读取内容、写入user
	 * @param lc
	 */
	public SetNewUser(LoadUser loadUser, LoadComposementView lc) {
		this.loadUser = loadUser;
		this.lc = lc;
	}
	/**
	 * @return user
	 */
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
