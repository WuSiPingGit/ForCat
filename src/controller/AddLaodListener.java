package controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

import bean.SLC;
import bean.SMFL;
import util.CheckMassager;
import view.LaodWindows;;

public class AddLaodListener {
	public AddLaodListener() {}
	/*
	 * 密码长度检查
	 */
	class DoFocuLaodCiperCheck implements FocusListener{
		public void focusGained(FocusEvent e) {
			JTextField jtf = (JTextField) e.getSource();
			SMFL.laodCount = jtf.getText();
			SMFL.checkCiperLength = CheckMassager.doCheckMassager("a", "a", 8, 16, true);
		}
		public void focusLost(FocusEvent e) {
			SMFL.checkCiperLength = CheckMassager.doCheckMassager("a", "a", 8, 16, true);
		}
	}
	
	class DoMouseLaodCiperCheck extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			SMFL.checkCiperLength = CheckMassager.doCheckMassager("a", "a", 8, 16, true);;
		}
		public void mousePressed(MouseEvent e) {
			SMFL.checkCiperLength = CheckMassager.doCheckMassager("a", "a", 8, 16, true);
		}
		public void mouseExited(MouseEvent e) {
			SMFL.checkCiperLength = CheckMassager.doCheckMassager("a", "a", 8, 16, true);
		}
	}
	/*
	 * 账号长度检查
	 */
	class DoFocuLaodCountCheck implements FocusListener{
		public void focusGained(FocusEvent e) {
			JTextField jtf = (JTextField) e.getSource();
			SMFL.laodCount = jtf.getText();
			SMFL.checkCountLength  = CheckMassager.doCheckMassager("a", "a", 8, 10, true);
		}
		public void focusLost(FocusEvent e) {
			SMFL.checkCountLength  = CheckMassager.doCheckMassager("a", "a", 8, 10, true);
		}
	}
	
	class DoMouseLaodCountCheck extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			SMFL.checkCountLength  = CheckMassager.doCheckMassager("a", "a", 8, 10, true);;
		}
		public void mousePressed(MouseEvent e) {
			SMFL.checkCountLength  = CheckMassager.doCheckMassager("a", "a", 8, 10, true);
		}
		public void mouseExited(MouseEvent e) {
			SMFL.checkCountLength = CheckMassager.doCheckMassager("a", "a", 8, 10, true);
		}
	}
	/*
	 * 密码账号匹配检查
	 */
	
	
	/*
	 * 打开新用户注册界面
	 */
	public static class NewUserButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = LaodWindows.getCardLayout();
			cl.next(SLC.allJpanel);
		}
	}
	
	
	/*
	 *打开忘记密码界面 
	 */
	public static class ForgetCiperButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = LaodWindows.getCardLayout();
			cl.first(SLC.allJpanel);
		}
	}
	
	/*
	 * 放回主页面面板
	 */
	public static class GoToLaodButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			CardLayout cl = LaodWindows.getCardLayout();
			cl.show(SLC.allJpanel, "0");
		}
	}
	
	/*
	 * 验证登陆及确认后注销登陆面板，并打开软件面板
	 */
	
	
}


