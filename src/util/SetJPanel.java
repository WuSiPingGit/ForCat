package util;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SetJPanel {
	private  SetJPanel() {}
	
	public static JPanel setJPanelLauout(JPanel jp) {
			jp.setLayout(new CardLayout());
		return jp;
	}
	/*
	 * 排版面板
	 */
	public static<T> JPanel setJPanelLauout(JPanel jp, boolean finalComponent, int x, int y, int insert, GridBagLayout gbl, T comment) {
	GridBagConstraints cons =SetGridBagStand.CreateGridBagConstraints(x, y, insert);
	if (finalComponent) {
		cons.gridwidth = GridBagConstraints.REMAINDER;
	}
	gbl.addLayoutComponent( (Component) comment, cons);
	jp.add((Component) comment);
	return jp;
}
	
	/*
	 * 创建面板，未用将用在主程序
	 */
	
	public static JPanel addJPaneJButton(JPanel jp, JButton jb) {
		jp.add(jb);
		return jp;
	}
	
	public static JPanel addJPnaneTextField(JPanel jp, JTextField jtf) {
		jp.add(jtf);
		return jp;
	}
	
	public static JPanel addJPaneJTextArea(JPanel jp, JTextArea jta) {
		jp.add(jta);
		return jp;
	}
	
	public static JPanel addJPaneJLabel(JPanel jp, JLabel jl) {
		jp.add(jl);
		return jp;
	}
}
