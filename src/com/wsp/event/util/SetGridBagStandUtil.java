package com.wsp.event.util;
/**
 * 
 * ��ȡ GridBagConstraints��������岼��
 */
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class SetGridBagStandUtil {
	private final int zone = 0;
	private final int one =  1;
	private final int  two = 2;
	private final int six = 6;
    public SetGridBagStandUtil(){}
	public GridBagConstraints CreateGridBagConstraints(int x, int y,int z){
		GridBagConstraints cons = new GridBagConstraints();
		if(z!=zone)
			cons.insets = new Insets(zone, two,  one,  one);
		cons.gridx = x;
		cons.gridy = y;
		return  cons;
	}
	
	public GridBagConstraints CreateGridBagConstraints(int x, int y,int z, boolean hasAdd){
		GridBagConstraints cons = new GridBagConstraints();
		if(z!=zone) {
			cons.insets = new Insets(zone,two, one, one);
		}
		if (z==two) {
			cons.gridheight = six;
			cons.fill = GridBagConstraints.BOTH;
		}
		cons.gridx = x;
		cons.gridy = y;
		if (hasAdd) {
			cons.weightx =  one;
			cons.weighty =  one;
		}
		return  cons;
	}
}
