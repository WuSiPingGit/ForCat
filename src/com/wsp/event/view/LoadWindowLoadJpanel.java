package com.wsp.event.view;

import java.awt.GridBagLayout;

import com.wsp.event.util.SetJPanelUtil;

public class LoadWindowLoadJpanel extends SetJPanelUtil{
	public LoadWindowLoadJpanel() {}
	
	public void loadWindowLoadJpanel(LoadComposement lc, GridBagLayout forLoadJpanel) {
        /*
         * µÇÂ½½çÃæ
         */
        setJPanelLauout(lc.laodJpanel, false, 1, 0, 0, forLoadJpanel, lc.showLolLaod);
        setJPanelLauout(lc.laodJpanel, false, 0, 1, 0,forLoadJpanel, lc.count);
        setJPanelLauout(lc.laodJpanel, false, 0, 2, 0,forLoadJpanel, lc.ciper);
        setJPanelLauout(lc.laodJpanel, false, 1, 1, 0,forLoadJpanel, lc.inputCounter);
        setJPanelLauout(lc.laodJpanel, false, 1, 2, 0,forLoadJpanel, lc.userCiper);
        setJPanelLauout(lc.laodJpanel, false, 2, 3, 0,forLoadJpanel, lc.laod);
        setJPanelLauout(lc.laodJpanel, false, 1, 4, 0,forLoadJpanel, lc.fgc);
        setJPanelLauout(lc.laodJpanel, false, 0, 3, 1,forLoadJpanel, lc.newUser);
        setJPanelLauout(lc.laodJpanel, false, 4, 3, 1,forLoadJpanel, lc.asMassager);
  
	}
}
