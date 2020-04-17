package com.wsp.event.view;

import com.wsp.event.util.SetJPanelUtil;

public class SetJpanelOfHelloOneView extends SetJPanelUtil{
	public void setJpanelOfHello(HelloWindowComposementView hwc){
		//赛事信息页
		setJPanelLauout(hwc.getjPanelMatchChoose(), false, 0, 0, 1, hwc.getForjPanelMatch(), hwc.getjButtonLast(), true);
		setJPanelLauout(hwc.getjPanelMatchChoose(), false, 0, 1, 1, hwc.getForjPanelMatch(), hwc.getjButtonToUpdate(), true);
		setJPanelLauout(hwc.getjPanelMatchChoose(), false, 0, 1, 1, hwc.getForjPanelMatch(), hwc.getjButtonToUpdateTwo(), true);
		setJPanelLauout(hwc.getjPanelMatchChoose(), true, 0, 2, 1, hwc.getForjPanelMatch(), hwc.getjButtonNext(), true);
		//管理员页
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 0, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellMatchChange(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 0, 1, hwc.getForjPanelMassager(), hwc.getWhichMatch(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 1, 1, hwc.getForjPanelMassager(), hwc.getIsThisMatch(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 2, 1, 1, hwc.getForjPanelMassager(), hwc.getReturnMoneyAndDelectMatch(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 2, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellMatchToAdd(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 11, 1, hwc.getForjPanelMassager(), hwc.getAddMatch(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 3, 3, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeUser(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 3, 4, 1, hwc.getForjPanelMassager(), hwc.getWhichUser(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 3, 5, 1, hwc.getForjPanelMassager(), hwc.getIsThisUser(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 3, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeMoney(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 4, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeTime(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 5, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeArea(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 6, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeTeamOne(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 7, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeTeamTwo(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 8, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeTicke(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 9, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChnageHasTick(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 10, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeIsHot(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 3, 1, hwc.getForjPanelMassager(), hwc.getMatchMoney(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 4, 1, hwc.getForjPanelMassager(), hwc.getMatchTime(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 5, 1, hwc.getForjPanelMassager(), hwc.getMatchArea(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 6, 1, hwc.getForjPanelMassager(), hwc.getMatchTeamOne(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 7, 1, hwc.getForjPanelMassager(), hwc.getMatchTeamTwo(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 8, 1, hwc.getForjPanelMassager(), hwc.getMatchAllTicke(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 9, 1, hwc.getForjPanelMassager(), hwc.getMatchHasTicke(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 10, 1, hwc.getForjPanelMassager(), hwc.getIsHot(), true);
	}
}
