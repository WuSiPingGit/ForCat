package com.wsp.event.util;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
/**
 * ��������
 * @author WSP
 */
public class SetWordUtil {
	public SetWordUtil() {}
	/**
	 * jLabelģ��
	 * @param l
	 * ��ɫ
	 * @param c1
	 * @param c2
	 * ����
	 * @param f
	 * ��jLabel
	 * @return
	 */
	public JLabel setLabel(JLabel l,Color c1, Color c2, Font f){
		l.setForeground(c1);
		l.setBackground(c2);
		l.setFont(f);
		return l;
	}
}
