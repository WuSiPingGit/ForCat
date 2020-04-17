package com.wsp.event.util;

import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 * �Դ��ڽ��л�������
 * @author WSP
 */
public class SetJFrameUtil {
	private  SetJFrameUtil() {}
	/**
	 * ����
	 * @param jf
	 * ����
	 * @param title
	 * ��С
	 * @param weight
	 * @param length
	 * �Ƿ�ɱ�
	 * @param change
	 * �Ƿ����ֱ���˳�
	 * @param exitNoAsk
	 * ����
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
