package com.wsp.event.view;

import java.awt.GridBagLayout;

import com.wsp.event.util.SetJPanelUtil;

/**
 * 
 * @author WSP
 * @Date 2020��4��6��
 */
public class LoadWindowForgetJpanel extends SetJPanelUtil{
	public LoadWindowForgetJpanel() {}
	
	public void loadWindowForGetJapanel(LoadComposement lc,  GridBagLayout forForgetJpanel) {
	     /*
         * �����������
         */
        setJPanelLauout(lc.fogetCiperJpanel, false, 0, 0, 1, forForgetJpanel, lc.youCount);
        setJPanelLauout(lc.fogetCiperJpanel, false, 0, 1, 0,forForgetJpanel, lc.youQuestion);
        setJPanelLauout(lc.fogetCiperJpanel, false, 0, 2, 0,forForgetJpanel, lc.youAnswer);
        setJPanelLauout(lc.fogetCiperJpanel, false, 2, 3, 0,forForgetJpanel, lc.backOut);
        setJPanelLauout(lc.fogetCiperJpanel, false, 1, 3, 1,forForgetJpanel, lc.hasOk);
        setJPanelLauout(lc.fogetCiperJpanel, false, 1, 2, 1,forForgetJpanel, lc.youAnserS);
        setJPanelLauout(lc.fogetCiperJpanel, false, 1, 1, 1,forForgetJpanel, lc.thisYourQuestion);
        setJPanelLauout(lc.fogetCiperJpanel, false, 1, 0, 1,forForgetJpanel, lc.youCountInput);
        setJPanelLauout(lc.fogetCiperJpanel, false, 2, 0, 0,forForgetJpanel, lc.checkInputCount);
        setJPanelLauout(lc.fogetCiperJpanel, false, 1, 4, 0, forForgetJpanel, lc.thisYouFindCiper);
        setJPanelLauout(lc.fogetCiperJpanel, false, 1, 3, 1, forForgetJpanel, lc.returnLaod);
	}
}
