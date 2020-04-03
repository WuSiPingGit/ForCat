package view;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.security.SecureClassLoader;

import javax.swing.JFrame;
import bean.SLC;
import controller.AddLaodListener;
import util.ForLaodWindow;
import util.SetJFrame;
import util.SetJPanel;;

public class LaodWindows {
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
		jf.add(SLC.allJpanel);
		//
		SLC.newUser.addActionListener(new AddLaodListener.NewUserButtonListener());
		SLC.fgc.addActionListener(new AddLaodListener.ForgetCiperButtonListener());
		SLC.back.addActionListener(new AddLaodListener.GoToLaodButtonListener());
		SLC.backOut.addActionListener(new AddLaodListener.GoToLaodButtonListener());
		//
		SLC.laodJpanel.setLayout(forLaodJpanel);
		SLC.fogetCiperJpanel.setLayout(forFogetJpanel);
//		 SLC.laodJpanel =	SetJPanel.setJPanelLauout(SLC.laodJpanel, false, 1, 0, 0, forLaodJpanel, SLC.showLOLLaod);
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
		 * 
		*/
	//	ForLaodWindow.forLaodJpanel(1, 0, 0, 0, SLC.showLOLLaod);
	//	ForLaodWindow.forLaodJpanel(1, 1, 0, 0, SLC.showLOLLaod);
	//	ForLaodWindow.forLaodJpanel(1, 1, 0, 0, SLC.showLOLLaod);
		
    /*    SLC.laodJpanel =	SetJPanel.setJPanelLauout(SLC.laodJpanel, false, 0, 1, 0, forLaodJpanel, SLC.count);
        SLC.laodJpanel = SetJPanel.setJPanelLauout(SLC.laodJpanel, false, 0, 2, 0, forLaodJpanel, SLC.ciper);
        SLC.laodJpanel = SetJPanel.setJPanelLauout(SLC.laodJpanel, false, 1, 1, 0, forLaodJpanel, SLC.inputCounter);
        SLC.laodJpanel = SetJPanel.setJPanelLauout(SLC.laodJpanel, false, 1, 2, 0, forLaodJpanel, SLC.userCiper);
        SLC.laodJpanel = SetJPanel.setJPanelLauout(SLC.laodJpanel, false, 2, 3, 0, forLaodJpanel, SLC.laod);
        SLC.laodJpanel = SetJPanel.setJPanelLauout(SLC.laodJpanel, false, 1, 4, 0, forLaodJpanel, SLC.fgc);
        SLC.laodJpanel = SetJPanel.setJPanelLauout(SLC.laodJpanel, false, 0, 3, 1, forLaodJpanel, SLC.newUser);
        SLC.laodJpanel = SetJPanel.setJPanelLauout(SLC.laodJpanel, false, 4, 3, 1, forLaodJpanel, SLC.asMassager);
      SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel ,false,0, 0, 1, forFogetJpanel, SLC.youCount)
*/        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel ,false,0, 0, 1, forFogetJpanel, SLC.youCount );
        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel ,false,0, 1, 0, forFogetJpanel, SLC.youQuestion );
        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel ,false,0, 2, 0, forFogetJpanel, SLC.youAnswer );
        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel ,false,2, 3, 1, forFogetJpanel, SLC.backOut );
        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel ,false,1, 3, 1, forFogetJpanel, SLC.OK );
        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel ,false,1, 2, 1, forFogetJpanel, SLC.youAnserS );
        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel ,false,1, 1, 1, forFogetJpanel, SLC.thisYourQuestion);
        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel ,false,1, 0, 1, forFogetJpanel, SLC.youCountInput);
        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel, true, 2, 0, 0, forFogetJpanel, SLC.checkInputCount);
        SLC.fogetCiperJpanel = SetJPanel.setJPanelLauout(SLC.fogetCiperJpanel, true, 1, 4, 0, forFogetJpanel, SLC.thisYouFindCiper);
        SLC.newUserJpanel.add(SLC.newUserJpanelOne,"0");
        SLC.newUserJpanel.add(SLC.newUserJpanelTwo,"1");
        forNewUserJpanel.first(SLC.newUserJpanel);
        SLC.newUserJpanelOne.setLayout(forUserJpanelOne);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, false, 0, 0, 0, forUserJpanelOne, SLC.showLOLNewUser);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, false, 0, 1, 0, forUserJpanelOne, SLC.tellRuler);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, false, 0, 2, 0, forUserJpanelOne, SLC.ciperNewUser);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, false, 0, 3, 0, forUserJpanelOne, SLC.reCiper);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, false, 0, 4, 0, forUserJpanelOne, SLC.tellNameRuler);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, false, 0, 5, 0, forUserJpanelOne, SLC.name);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, false, 0, 6, 0, forUserJpanelOne, SLC.back);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, false, 2, 6, 0, forUserJpanelOne, SLC.goOn);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, true, 1, 2, 0, forUserJpanelOne, SLC.userCiperNewUser);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, true, 1, 3, 0, forUserJpanelOne, SLC.reUserCiperNewUser);
        SLC.newUserJpanelOne = SetJPanel.setJPanelLauout(SLC.newUserJpanelOne, true, 1, 5, 0, forUserJpanelOne, SLC.userName);
        /*****
         * 注册页面二
         */
        SLC.newUserJpanelTwo  = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, true, 0, 1, 0, forUserJpanelTwo, SLC.tellCiperQuetionRuler);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, false, 0, 2, 0, forUserJpanelTwo, SLC.ciperQuestion);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, false, 1, 2, 0, forUserJpanelTwo, SLC.userQuestion);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, true, 1, 3, 0, forUserJpanelTwo, SLC.tellCiperAnswerRuler);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, false, 0, 4, 0, forUserJpanelTwo, SLC.ciperAnswer);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, true, 1, 4, 0, forUserJpanelTwo, SLC.userAnswer);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, false, 0, 5, 0, forUserJpanelTwo, SLC.reCiperAnswer);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, true, 1, 5, 0, forUserJpanelTwo, SLC.reUserAnswer);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, false, 0, 6, 0, forUserJpanelTwo, SLC.goOnNewUserOne);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, false, 1, 6, 0, forUserJpanelTwo, SLC.finishIt);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, false, 1, 0, 0, forUserJpanelTwo, SLC.tellYourCount);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, true, 1, 2, 0, forUserJpanelTwo, SLC.thisYourCount);
        SLC.newUserJpanelTwo = SetJPanel.setJPanelLauout(SLC.newUserJpanelTwo, true, 1, 3, 0, forUserJpanelTwo, SLC.returnLaodNewUser);
        SLC.allJpanel.add(SLC.fogetCiperJpanel,"2");
        SLC.allJpanel.add(SLC.laodJpanel,"0");
		SLC.allJpanel.add(SLC.newUserJpanel,"1");
		
	}
/*
 * 测试数据
 */
public static void main(String[] args) {
	//forAllJpanel.next(SLC.allJpanel);
	new LaodWindows();
}	
	
/*
 * 
 */
	public static JFrame getJFrame() {
		return jf;
	}
	
	public static CardLayout getCardLayout() {
		return forAllJpanel;
	}
	
	public static CardLayout getCardLayout(int i) {
		return forNewUserJpanel;
	}
	
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
}
