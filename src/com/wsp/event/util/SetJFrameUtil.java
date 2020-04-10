package com.wsp.event.util;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
/*
 * 建立窗口模块
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SetJFrameUtil {
	private  SetJFrameUtil() {}
	/*
	 * 主模块
	 */
	public static JFrame setJFrame(JFrame jf, String title, int weight, int length, boolean change, boolean exitNoAsk){
		jf.setSize(weight, length);
		if(exitNoAsk)
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(change);
		jf.setTitle(title);
		jf.setLayout(new BorderLayout());
		jf.setVisible(true);
		return jf;
	}
	
}
