package util;
/*
 * 获取 GridBagConstraints用来给面板布局
 */
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class SetGridBagStand {
    private SetGridBagStand(){}
	public static GridBagConstraints CreateGridBagConstraints(int x, int y,int z){
		GridBagConstraints cons = new GridBagConstraints();
		if(z!=0)
			cons.insets = new Insets(0,2,1,1);
		cons.gridx = x;
		cons.gridy = y;
		return  cons;
	}
}
