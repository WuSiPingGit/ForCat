package controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.SecureClassLoader;

import javax.swing.JTextField;

import bean.SLC;
import bean.SMFL;
import util.CheckMassager;
import util.ForCheckAtLoad;
import view.LaodWindows;
/*
 * �������ݼ��
 */
public class AddNewUserListener {
	private AddNewUserListener(){}
	/*
	 * ����ע��
	 */
	public static class GoToNextPart implements ActionListener{
		public void actionPerformed(ActionEvent e) {
																											//�������������������ʵ�����벻�Գ�
			if (SMFL.saveCiper.equals(SMFL.saveReCiper)) {
				CardLayout cl = LaodWindows.getCardLayout(0);
				cl.next(SLC.fogetCiperJpanel);
			} else {
				//���ó�����ʾ����д
				SLC.goOn.setEnabled(false);
			}
		}
	}
	/*
	 * ��� �������루��꣩
	 */
	public static class MouseCiperCheck extends MouseAdapter{
	    public void mouseEntered(MouseEvent e) {
	    	JTextField jt = (JTextField)e.getSource();
	    	SMFL.saveCiper = jt.getText();
	    	ForCheckAtLoad.forCiperCheck();
	    }
	    public void mouseExited(MouseEvent e) {
	    	JTextField jt = (JTextField)e.getSource();
	    	SMFL.saveCiper = jt.getText();
	    	SMFL.saveCiper = jt.getText();
	    	ForCheckAtLoad.forCiperCheck();
	    }
	    public void mousePressed(MouseEvent e) {
	    	JTextField jt = (JTextField)e.getSource();
	    	SMFL.saveCiper = jt.getText();
	    	SMFL.saveCiper = jt.getText();
	    	ForCheckAtLoad.forCiperCheck();
	    }
	}
	/*
	 * ������ �����̣�
	 */
	public static class KeyCiperCheck extends KeyAdapter{
		public void keyTyped(KeyEvent e) {
		}
		public void keyPressed(KeyEvent e) {
		}
		public void keyReleased(KeyEvent e) {
		}
	}
}
