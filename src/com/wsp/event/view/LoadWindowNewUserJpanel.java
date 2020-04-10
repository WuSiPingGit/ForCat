package com.wsp.event.view;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import com.wsp.event.util.SetJPanelUtil;

public class LoadWindowNewUserJpanel extends SetJPanelUtil{
	public LoadWindowNewUserJpanel() {}
	
	public void loadWindowNewUserJpanel(LoadComposement lc,  GridBagLayout forUserJpanelOne, GridBagLayout forUserJpanelTwo) {
        /*
         * ×¢²áÒ³Ãæ1
         */
        setJPanelLauout(lc.newUserJpanelOne, false, 0, 0, 0, forUserJpanelOne, lc.showLolNewUser);
        setJPanelLauout(lc.newUserJpanelOne, false, 0, 1, 0,forUserJpanelOne, lc.tellRuler);
        setJPanelLauout(lc.newUserJpanelOne, false, 0, 2, 0,forUserJpanelOne, lc.ciperNewUser);
        setJPanelLauout(lc.newUserJpanelOne, false, 0, 3, 0,forUserJpanelOne, lc.reCiper);
        setJPanelLauout(lc.newUserJpanelOne, false, 0, 4, 0,forUserJpanelOne, lc.tellNameRuler);
        setJPanelLauout(lc.newUserJpanelOne, false, 0, 5, 0,forUserJpanelOne, lc.name);
        setJPanelLauout(lc.newUserJpanelOne, false, 0, 6, 0,forUserJpanelOne, lc.back);
        setJPanelLauout(lc.newUserJpanelOne, false, 2, 6, 1,forUserJpanelOne, lc.goOn);
        setJPanelLauout(lc.newUserJpanelOne, false, 1, 2, 0,forUserJpanelOne, lc.userCiperNewUser);
        setJPanelLauout(lc.newUserJpanelOne, false, 1, 3, 0, forUserJpanelOne, lc.reUserCiperNewUser);
        setJPanelLauout(lc.newUserJpanelOne, false, 1, 5, 0, forUserJpanelOne, lc.userName);
        /*
         * ×¢²áÒ³Ãæ2
         */
        setJPanelLauout(lc.newUserJpanelTwo, false, 1, 1, 0, forUserJpanelTwo, lc.tellCiperQuetionRuler);
        setJPanelLauout(lc.newUserJpanelTwo, false, 0, 2, 0,forUserJpanelTwo, lc.ciperQuestion);
        setJPanelLauout(lc.newUserJpanelTwo, false, 1, 2, 0,forUserJpanelTwo, lc.userQuestion);
        setJPanelLauout(lc.newUserJpanelTwo, false, 1, 3, 0,forUserJpanelTwo, lc.tellCiperAnswerRuler);
        setJPanelLauout(lc.newUserJpanelTwo, false, 0, 4, 0,forUserJpanelTwo, lc.ciperAnswer);
        setJPanelLauout(lc.newUserJpanelTwo, false, 1, 4, 0,forUserJpanelTwo, lc.userAnswer);
        setJPanelLauout(lc.newUserJpanelTwo, false, 0, 5, 0,forUserJpanelTwo, lc.reCiperAnswer);
        setJPanelLauout(lc.newUserJpanelTwo, false, 1, 5, 0,forUserJpanelTwo, lc.reUserAnswer);
        setJPanelLauout(lc.newUserJpanelTwo, false, 0, 6, 1,forUserJpanelTwo, lc.goOnNewUserOne);
        setJPanelLauout(lc.newUserJpanelTwo, false, 1, 6, 0,forUserJpanelTwo, lc.finishIt);
        setJPanelLauout(lc.newUserJpanelTwo, false, 1, 0, 0, forUserJpanelTwo, lc.tellYourCount);
        setJPanelLauout(lc.newUserJpanelTwo, false, 1, 2, 0, forUserJpanelTwo, lc.thisYourCount);
        setJPanelLauout(lc.newUserJpanelTwo, false, 1, 3, 0, forUserJpanelTwo, lc.returnLaodNewUser);
	}
}
