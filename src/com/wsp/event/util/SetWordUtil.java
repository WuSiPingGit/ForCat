package com.wsp.event.util;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
/**
 * 改造字体
 * @author WSP
 */
public class SetWordUtil {
	public SetWordUtil() {}
	/**
	 * jLabel模块
	 * @param l
	 * 颜色
	 * @param c1
	 * @param c2
	 * 字体
	 * @param f
	 * 新jLabel
	 * @return
	 */
	public JLabel setLabel(JLabel l,Color c1, Color c2, Font f){
		l.setForeground(c1);
		l.setBackground(c2);
		l.setFont(f);
		return l;
	}
}
