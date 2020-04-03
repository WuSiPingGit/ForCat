package util;

import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * 建立JText模块，计划主程序调用
 */
public class SetJText {
	private SetJText() {}
    
	public JTextField SetJTextJTextField(int x) {
		JTextField  jtf = new JTextField(x);
		return jtf;
	}
	
	public JTextArea setJTextTextArea(int x ,int y) {
		JTextArea jta = new JTextArea(x,y);
		return jta;
	}
}
