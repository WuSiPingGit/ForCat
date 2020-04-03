package util;

import java.awt.GridLayout;
/*
 * 建立窗口模块
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SetJFrame {
	private  SetJFrame() {}
	/*
	 * 主模块
	 */
	public static JFrame setJFrame(JFrame jf, String title, int weight, int length, boolean change, boolean exitNoAsk){
		jf.setBounds(200, 200, weight, length);
		if(exitNoAsk)
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(change);
		jf.setTitle(title);
		jf.setLayout(new GridLayout(1, 1));
		jf.setVisible(true);
		return jf;
	}
	
	/*
	 * 给主程序，调用模块时加东西，还未确定要加什么
	 */
	
	public static JFrame setJFrameJPanel(JFrame jf, JPanel jp) {
		jf.add(jp);
		return jf;
	}
	
	public static JFrame setJFrameJButtton(JFrame jf, JButton jb) {
		jf.add(jb);
		return jf;
	}
	
	public static JFrame setJFrameJTextField(JFrame jf, JTextField jtf) {
		jf.add(jtf);
		return jf;
	}
	
	public static JFrame setJFrameJTextArea(JFrame jf, JTextArea jta) {
		jf.add(jta);
		return jf;
	}
	
	public static JFrame setJFrameIron(JFrame jf) {
	//	jf.add(jp);
		return jf;
	}
	
}
