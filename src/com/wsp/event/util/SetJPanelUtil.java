package com.wsp.event.util;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
/**
 * �Ű����
 */
public class SetJPanelUtil {
	public  SetJPanelUtil() {}
	/**
	 * ���
	 * @param jp
	 * �Ƿ�Ϊ���
	 * @param finalComponent
	 * λ��
	 * @param x
	 * @param y
	 * ��϶
	 * @param insert
	 * ������
	 * @param gbl
	 * ���
	 * @param comment
	 * ����������JPanel
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
	 * ���
	 * @param jp
	 * �Ƿ�Ϊ���
	 * @param finalComponent
	 * λ��
	 * @param x
	 * @param y
	 * ��϶
	 * @param insert
	 * ������
	 * @param gbl
	 * ���
	 * @param comment
	 * �ɱ��С
	 * @param hasAdd
	 * ���������JPanel
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
