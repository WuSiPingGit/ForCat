package com.wsp.event.view;

import com.wsp.event.common.ForMysqlName;
import com.wsp.event.util.SetJPanelUtil;
/**
 * 
 * @author WSP
 * @Date  fmm.getTwo()fmm.getZone() fmm.getTwo()fmm.getZone()年 fmm.getFour()月 fmm.getOne()fmm.getZone()日
 */
public class ToJpanelOfHello extends SetJPanelUtil{
	HelloWindowComposement hwc;
	ForMysqlName fmm =new ForMysqlName();
	public ToJpanelOfHello(HelloWindowComposement hwc) {
		this.hwc = hwc;
	}
	public void setJpanelOfHello() {
		//首页
		setJPanelLauout(hwc.getjPanelFirst(), false, fmm.getZone(), fmm.getZone(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getjLabelTellVip(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false, fmm.getZone(),  fmm.getOne(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getBeVip(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false,   fmm.getFiva(), fmm.getZone(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getjLabelRecomment(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false,  fmm.getThree(),  fmm.getTwo(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getjLabelTip(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false, fmm.getZone(),  fmm.getTwo(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getjLabelPicture(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false,   fmm.getFiva(),  fmm.getTwo(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getMatchOne(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false,   fmm.getFiva(),  fmm.getThree(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getMatchTwo(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false,   fmm.getFiva(),  fmm.getFour(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getMatchThree(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false,   fmm.getFiva(),   fmm.getFiva(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getMatchFour(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false,  fmm.getThree(),  fmm.getThree(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getTextField(), true);
		setJPanelLauout(hwc.getjPanelFirst(), false,  fmm.getThree(),  fmm.getFour(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getjButtonFind(), true);
		//我的页面
		setJPanelLauout(hwc.getjPanelUser(), false, fmm.getZone(), fmm.getZone(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjLabelUserPicture(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(), fmm.getZone(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getTextFieldName(), true);
		setJPanelLauout(hwc.getjPanelUser(), false, fmm.getZone(),  fmm.getSix(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonUserPicture(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(), fmm.getZone(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonName(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),  fmm.getOne(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getTextFieldCiper(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(),  fmm.getTwo(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonCiper(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),  fmm.getThree(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getTextFieldQuestion(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(),  fmm.getThree(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonQuestion(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),  fmm.getFour(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getTextFieldAnswer(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(),  fmm.getFour(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonAnswer(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),   fmm.getFiva(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjLabelCount(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(),   fmm.getFiva(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjLabelMoney(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),  fmm.getSix(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonInMoney(), true);
	}
}
