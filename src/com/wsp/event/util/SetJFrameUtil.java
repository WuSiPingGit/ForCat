package com.wsp.event.util;

import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 * 对窗口进行基础设置
 * @author WSP
 */
public class SetJFrameUtil {
	private  SetJFrameUtil() {}
	/**
	 * 窗口
	 * @param jf
	 * 标题
	 * @param title
	 * 大小
	 * @param weight
	 * @param length
	 * 是否可变
	 * @param change
	 * 是否可以直接退出
	 * @param exitNoAsk
	 * 窗口
	 * @return
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
