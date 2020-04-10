package com.wsp.event.util;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

public class SetComposementSizeUtil <T extends Component>{
	public SetComposementSizeUtil() {}
	
	public T setComposementSize(T composement, int smallX, int smallY) {
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		composement.setSize(50,20);
		return composement;
	}
}
