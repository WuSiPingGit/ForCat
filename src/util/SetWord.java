package util;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
/*
 * 进行字体改造
 */
public class SetWord {
	private SetWord() {}
	public static JLabel setLabel(JLabel l,Color c1, Color c2, Font f){
		l.setForeground(c1);
		l.setBackground(c2);
		l.setFont(f);
		return l;
	}
}
