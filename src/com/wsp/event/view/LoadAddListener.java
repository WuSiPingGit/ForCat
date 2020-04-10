package com.wsp.event.view;

/**
 * ���������ģ��
 * @author WSP
 * @Date 2020��4��6��
 */
public class LoadAddListener {
	private LoadComposement lc;
	LoadWindowListener lwl;
	public LoadAddListener(LoadComposement lc, LoadWindowListener lwl) {
		this.lc = lc;
		this.lwl = lwl;
	}
	
	public void loadAddListener() {
		//���������������
		lc.back.addActionListener(lwl.new GoToLaodButtonListener());
		lc.backOut.addActionListener(lwl.new GoToLaodButtonListener());
		lc.returnLaod.addActionListener(lwl.new ForForgetCiperGoBack());
		//�������뼰ע��ҳ��
		lc.fgc.addActionListener(lwl.new ForgetCiperButtonListener());
		lc.newUser.addActionListener(lwl.new NewUserButtonListener());
		//ע��ҳ��1
		lc.goOn.addActionListener(lwl.new ForGoOnAtNewUser());
		//ע�����2
		lc.goOnNewUserOne.addActionListener(lwl.new GoToNewOneListener());
		lc.finishIt.addActionListener(lwl.new ForNewUserToGetCount());
		lc.goOnNewUserOne.addActionListener(lwl.new GOBackToLoadForNewUser());
		//��������
		lc.checkInputCount.addActionListener(lwl.new GetProblem());
		lc.inputCounter.addMouseListener(lwl.new DoMouseLaodCountCheck());
		lc.inputCounter.addKeyListener(lwl.new DoKeyLaodCountCheck());
		lc.hasOk.addActionListener(lwl.new CheckTheAnswerInput());
		//��½
		lc.userCiper.addMouseListener(lwl.new DoMouseLaodCountCheck());
		lc.userCiper.addKeyListener(lwl.new DoKeyLaodCountCheck());
		lc.asMassager.addActionListener(lwl.new MassagerListener());
		lc.laod.addActionListener(lwl.new HasLoad());
		//����
	}
}
