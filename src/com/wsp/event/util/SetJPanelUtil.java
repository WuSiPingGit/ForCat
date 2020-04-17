package com.wsp.event.util;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
/**
 * 排版面板
 */
public class SetJPanelUtil {
	public  SetJPanelUtil() {}
	/**
	 * 面板
	 * @param jp
	 * 是否为最后
	 * @param finalComponent
	 * 位置
	 * @param x
	 * @param y
	 * 空隙
	 * @param insert
	 * 布局器
	 * @param gbl
	 * 组件
	 * @param comment
	 * 加入组件后的JPanel
	 * @return
	 */
	public <T> JPanel setJPanelLauout(JPanel jp, boolean finalComponent, int x, 
			int y, int insert, GridBagLayout gbl, T comment) {
		SetGridBagStandUtil setGridBagStandUtil = new SetGridBagStandUtil();
	GridBagConstraints cons =setGridBagStandUtil.CreateGridBagConstraints(x, y, insert);
	if (finalComponent) {
		cons.gridwidth = GridBagConstraints.REMAINDER;
	}
	gbl.addLayoutComponent( (Component) comment, cons);
	jp.add((Component) comment);
	return jp;
	}	
	/**
	 * 
	 * 面板
	 * @param jp
	 * 是否为最后
	 * @param finalComponent
	 * 位置
	 * @param x
	 * @param y
	 * 空隙
	 * @param insert
	 * 布局器
	 * @param gbl
	 * 组件
	 * @param comment
	 * 可变大小
	 * @param hasAdd
	 * 加入组件后JPanel
	 * @return
	 */
	public <T> JPanel setJPanelLauout(JPanel jp, boolean finalComponent, int x, 
			int y, int insert, GridBagLayout gbl, T comment, boolean hasAdd) {
		SetGridBagStandUtil setGridBagStandUtil = new SetGridBagStandUtil();
	GridBagConstraints cons =setGridBagStandUtil.CreateGridBagConstraints(x, y, insert, hasAdd);
	if (finalComponent) {
		cons.gridwidth = GridBagConstraints.REMAINDER;
	}
	gbl.addLayoutComponent( (Component) comment, cons);
	jp.add((Component) comment);
	return jp;
	}
}
