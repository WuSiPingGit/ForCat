package com.wsp.event.view;

/**
 * 加入监听器模块
 * @author WSP
 * @Date 2020年4月6日
 */
public class LoadAddListener {
	private LoadComposement lc;
	LoadWindowListener lwl;
	public LoadAddListener(LoadComposement lc, LoadWindowListener lwl) {
		this.lc = lc;
		this.lwl = lwl;
	}
	
	public void loadAddListener() {
		//返回主界面监听器
		lc.back.addActionListener(lwl.new GoToLaodButtonListener());
		lc.backOut.addActionListener(lwl.new GoToLaodButtonListener());
		lc.returnLaod.addActionListener(lwl.new ForForgetCiperGoBack());
		//忘记密码及注册页面
		lc.fgc.addActionListener(lwl.new ForgetCiperButtonListener());
		lc.newUser.addActionListener(lwl.new NewUserButtonListener());
		//注册页面1
		lc.goOn.addActionListener(lwl.new ForGoOnAtNewUser());
		//注册界面2
		lc.goOnNewUserOne.addActionListener(lwl.new GoToNewOneListener());
		lc.finishIt.addActionListener(lwl.new ForNewUserToGetCount());
		lc.goOnNewUserOne.addActionListener(lwl.new GOBackToLoadForNewUser());
		//忘记密码
		lc.checkInputCount.addActionListener(lwl.new GetProblem());
		lc.inputCounter.addMouseListener(lwl.new DoMouseLaodCountCheck());
		lc.inputCounter.addKeyListener(lwl.new DoKeyLaodCountCheck());
		lc.hasOk.addActionListener(lwl.new CheckTheAnswerInput());
		//登陆
		lc.userCiper.addMouseListener(lwl.new DoMouseLaodCountCheck());
		lc.userCiper.addKeyListener(lwl.new DoKeyLaodCountCheck());
		lc.asMassager.addActionListener(lwl.new MassagerListener());
		lc.laod.addActionListener(lwl.new HasLoad());
		//加入
	}
}
