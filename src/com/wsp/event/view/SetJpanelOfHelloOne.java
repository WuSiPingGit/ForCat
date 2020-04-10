package com.wsp.event.view;

import com.wsp.event.util.SetJPanelUtil;

public class SetJpanelOfHelloOne extends SetJPanelUtil{
	public void setJpanelOfHello(HelloWindowComposement hwc){
		//赛事信息页
		setJPanelLauout(hwc.getjPanelMatch(), false, 0, 0, 1, hwc.getForjPanelMatch(), hwc.getjLabelTellMatchTime(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 1, 0, 1, hwc.getForjPanelMatch(), hwc.getjLabelTellMatchName(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 2, 0, 1, hwc.getForjPanelMatch(), hwc.getjLabelTellMatchMoney(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 3, 0, 1, hwc.getForjPanelMatch(), hwc.getjLabelTellMatchHasTicke(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 0, 1, 2, hwc.getForjPanelMatch(), hwc.getjTextAreaTime(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 1, 1, 1, hwc.getForjPanelMatch(), hwc.getjLabelMatchOne(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 1, 2, 1, hwc.getForjPanelMatch(), hwc.getjLabelMatchTwo(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 1, 3, 1, hwc.getForjPanelMatch(), hwc.getjLabelMatchThree(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 1, 4, 1, hwc.getForjPanelMatch(), hwc.getjLabelMatchFour(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 1, 5, 1, hwc.getForjPanelMatch(), hwc.getjLabelMatchFive(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 1, 6, 1, hwc.getForjPanelMatch(), hwc.getjLabelMatchSix(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 1, 7, 1, hwc.getForjPanelMatch(), hwc.getjLabelMatchSeven(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 2, 1, 2, hwc.getForjPanelMatch(), hwc.getjTextAreaMoney(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 3, 1, 2, hwc.getForjPanelMatch(), hwc.getjTextAreaHasTiche(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 3, 8, 1, hwc.getForjPanelMatch(), hwc.getjButtonToUpdate(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 0, 9, 1, hwc.getForjPanelMatch(), hwc.getjButtonNext(), true);
		setJPanelLauout(hwc.getjPanelMatch(), false, 3, 9, 1, hwc.getForjPanelMatch(), hwc.getjButtonLast(), true);
		//管理员页
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 0, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellMatchChange(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 0, 1, hwc.getForjPanelMassager(), hwc.getWhichMatch(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 1, 1, hwc.getForjPanelMassager(), hwc.getIsThisMatch(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 2, 1, 1, hwc.getForjPanelMassager(), hwc.getReturnMoneyAndDelectMatch(), true);
//		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 0, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellMatchToAdd(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 2, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellMatchToAdd(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 3, 9, 1, hwc.getForjPanelMassager(), hwc.getAddMatch(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 3, 3, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeUser(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 3, 4, 1, hwc.getForjPanelMassager(), hwc.getWhichUser(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 3, 5, 1, hwc.getForjPanelMassager(), hwc.getIsThisUser(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 3, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeMoney(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 4, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeTime(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 5, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeArea(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 6, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeTeamOne(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 7, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeTeamTwo(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 0, 8, 1, hwc.getForjPanelMassager(), hwc.getjLabelTellChangeIsHot(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 3, 1, hwc.getForjPanelMassager(), hwc.getMatchMoney(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 4, 1, hwc.getForjPanelMassager(), hwc.getMatchTime(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 5, 1, hwc.getForjPanelMassager(), hwc.getMatchArea(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 6, 1, hwc.getForjPanelMassager(), hwc.getMatchTeamOne(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 7, 1, hwc.getForjPanelMassager(), hwc.getMatchTeamTwo(), true);
		setJPanelLauout(hwc.getjPanelMassager(), false, 1, 8, 1, hwc.getForjPanelMassager(), hwc.getIsHot(), true);
		//搜索结果页
/*		
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
		setJPanelLauout(hwc.getjPanelFind(), false, 0, 0, 1, hwc.getForjPanelFind(), , true);
*/
	}
}
