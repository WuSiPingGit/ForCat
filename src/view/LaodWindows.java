package view;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.security.SecureClassLoader;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bean.SLC;
import controller.AddLaodListener;
import util.ForLaodWindow;
import util.SetJFrame;
import util.SetJPanel;;
/*
 * 建立登陆页面
 */
public class LaodWindows {
	/*
	 * 登陆页面布局及主窗口
	 */
	private static JFrame jf = new JFrame();
	private static GridBagLayout forLaodJpanel = new GridBagLayout();
	private static GridBagLayout forFogetJpanel = new GridBagLayout();
	private static CardLayout forAllJpanel = new CardLayout();
	private static CardLayout forNewUserJpanel = new CardLayout();
	private static GridBagLayout forUserJpanelOne = new GridBagLayout();
	private static GridBagLayout forUserJpanelTwo = new GridBagLayout();
	public LaodWindows() {
		jf = SetJFrame.setJFrame(jf, "LaodingWindow", 500, 300, false, true);
		SLC.newUserJpanelTwo.setLayout(forUserJpanelTwo);
		SLC.newUserJpanel.setLayout(forNewUserJpanel);
		SLC.allJpanel.setLayout(forAllJpanel);
        SLC.newUserJpanelOne.setLayout(forUserJpanelOne);
		jf.add(SLC.allJpanel);
		//加入监听器
		SLC.newUser.addActionListener(new AddLaodListener.NewUserButtonListener());
		SLC.fgc.addActionListener(new AddLaodListener.ForgetCiperButtonListener());
		SLC.back.addActionListener(new AddLaodListener.GoToLaodButtonListener());
		SLC.backOut.addActionListener(new AddLaodListener.GoToLaodButtonListener());
		//
		SLC.laodJpanel.setLayout(forLaodJpanel);
		SLC.fogetCiperJpanel.setLayout(forFogetJpanel);
		/*
		 * 	登陆页面
		 */
		ForLaodWindow.forLaodJpanel(1, 1, 0, 0, SLC.showLOLLaod);
		ForLaodWindow.forLaodJpanel(1, 0, 1, 0, SLC.count);
		ForLaodWindow.forLaodJpanel(1, 0, 2, 0, SLC.ciper);
		ForLaodWindow.forLaodJpanel(1, 1, 1, 0, SLC.inputCounter);
		ForLaodWindow.forLaodJpanel(1, 1, 2, 0, SLC.userCiper);
		ForLaodWindow.forLaodJpanel(1, 2, 3, 0, SLC.laod);
		ForLaodWindow.forLaodJpanel(1, 1, 4, 0, SLC.fgc);
		ForLaodWindow.forLaodJpanel(1, 0, 3, 1, SLC.newUser);
		ForLaodWindow.forLaodJpanel(1, 4, 3, 1, SLC.asMassager);
		/*
		 * 忘记密码页面
		*/
		ForLaodWindow.forLaodJpanel(2, 0, 0, 1, SLC.youCount);
		ForLaodWindow.forLaodJpanel(2, 0, 1, 0, SLC.youQuestion);
		ForLaodWindow.forLaodJpanel(2, 0, 2, 0, SLC.youAnswer );
		ForLaodWindow.forLaodJpanel(2, 2, 3, 1, SLC.backOut);
		ForLaodWindow.forLaodJpanel(2, 1, 3, 1, SLC.OK );
		ForLaodWindow.forLaodJpanel(2, 1, 2, 1, SLC.youAnserS);
		ForLaodWindow.forLaodJpanel(2, 1, 1, 1, SLC.thisYourQuestion);
		ForLaodWindow.forLaodJpanel(2, 1, 0, 1, SLC.youCountInput);
		ForLaodWindow.forLaodJpanel(2, 2, 0, 0, SLC.checkInputCount);
		ForLaodWindow.forLaodJpanel(2, 1, 4, 0, SLC.thisYouFindCiper);
		/*
		 * 注册页面1
		 */
		ForLaodWindow.forLaodJpanel(3, 0, 0, 0, SLC.showLOLNewUser);
		ForLaodWindow.forLaodJpanel(3, 0, 1, 0, SLC.tellRuler);
		ForLaodWindow.forLaodJpanel(3, 0, 2, 0, SLC.ciperNewUser);
		ForLaodWindow.forLaodJpanel(3, 0, 3, 0, SLC.reCiper);
		ForLaodWindow.forLaodJpanel(3, 0, 4, 0, SLC.tellNameRuler);
		ForLaodWindow.forLaodJpanel(3, 0, 5, 0, SLC.name);
		ForLaodWindow.forLaodJpanel(3, 0, 6, 0, SLC.back);
		ForLaodWindow.forLaodJpanel(3, 2, 6, 0, SLC.goOn);
		ForLaodWindow.forLaodJpanel(3, 1, 2, 0, SLC.userCiperNewUser);
		ForLaodWindow.forLaodJpanel(3, 1, 3, 0, SLC.reUserCiperNewUser);
		ForLaodWindow.forLaodJpanel(3, 1, 5, 0, SLC.userName);
        /*
         * 注册页面二
         */
		ForLaodWindow.forLaodJpanel(4, 1, 1, 0, SLC.tellCiperQuetionRuler);
		ForLaodWindow.forLaodJpanel(4, 0, 2, 0, SLC.ciperQuestion);
		ForLaodWindow.forLaodJpanel(4, 1, 2, 0,SLC.userQuestion);
		ForLaodWindow.forLaodJpanel(4, 1, 3, 0, SLC.tellCiperAnswerRuler);
		ForLaodWindow.forLaodJpanel(4, 0, 4, 0, SLC.ciperAnswer);
		ForLaodWindow.forLaodJpanel(4, 1, 4, 0, SLC.userAnswer);
		ForLaodWindow.forLaodJpanel(4, 0, 5, 0, SLC.reCiperAnswer);
		ForLaodWindow.forLaodJpanel(4, 1, 5, 0, SLC.reUserAnswer);
		ForLaodWindow.forLaodJpanel(4, 0, 6, 0, SLC.goOnNewUserOne);
		ForLaodWindow.forLaodJpanel(4, 1, 6, 0, SLC.finishIt);
		ForLaodWindow.forLaodJpanel(4, 1, 0, 0, SLC.tellYourCount);
		ForLaodWindow.forLaodJpanel(4, 1, 2, 0, SLC.thisYourCount);
		ForLaodWindow.forLaodJpanel(4, 1, 3, 0, SLC.returnLaodNewUser);
		/*
		 * 加入面板
		 */
        SLC.allJpanel.add(SLC.fogetCiperJpanel,"2");
        SLC.allJpanel.add(SLC.laodJpanel,"0");
		SLC.allJpanel.add(SLC.newUserJpanel,"1");
        SLC.newUserJpanel.add(SLC.newUserJpanelOne,"0");
        SLC.newUserJpanel.add(SLC.newUserJpanelTwo,"1");
	}
/*
 * 测试数据
 */
public static void main(String[] args) {
	//forAllJpanel.next(SLC.allJpanel);
	new LaodWindows();
}	
	
/*
 * 获取JFrame用来创建和排版面板
 */
	public static JFrame getJFrame() {
		return jf;
	}
/*
 * 获取CardLayout，用来布局
 */
	public static CardLayout getCardLayout() {
		return forAllJpanel;
	}
	
	public static CardLayout getCardLayout(int i) {
		return forNewUserJpanel;
	}
/*
 * 获取GridBagLayout用来布局
 */
	public static GridBagLayout getGridBagLayout(int oneStandForLoadTwoStandForgetThreeStandNewOneThirdStandlast) {
		int i = oneStandForLoadTwoStandForgetThreeStandNewOneThirdStandlast;
		if (i==1)
			return forLaodJpanel;
		if(i==2)
			return forFogetJpanel;
		if(i==3)
			return forUserJpanelOne;
		if(i==4)
			return forUserJpanelTwo;
		 return (new GridBagLayout());
	}
/*
 * 获取JPanel用来布局	
 */
	public static JPanel getJpanel(int oneStandForLoadTwoStandForgetThreeStandNewOneThirdStandlast) {
		int i = oneStandForLoadTwoStandForgetThreeStandNewOneThirdStandlast;
		if (i==1)
			return SLC.laodJpanel;
		if(i==2)
			return SLC.fogetCiperJpanel;
		if(i==3)
			return SLC.newUserJpanelOne;
		if(i==4)
			return SLC.newUserJpanelTwo;
		 return (new JPanel());
	}
}
