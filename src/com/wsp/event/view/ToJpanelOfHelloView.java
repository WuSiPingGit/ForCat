package com.wsp.event.view;

import com.wsp.event.common.ForMysqlNameCommon;
import com.wsp.event.util.SetJPanelUtil;
/**
 * 
 * @author WSP
 * @Date  fmm.getTwo()fmm.getZone() fmm.getTwo()fmm.getZone()�� fmm.getFour()�� fmm.getOne()fmm.getZone()��
 */
public class ToJpanelOfHelloView extends SetJPanelUtil{
	HelloWindowComposementView hwc;
	ForMysqlNameCommon fmm =new ForMysqlNameCommon();
	public ToJpanelOfHelloView(HelloWindowComposementView hwc) {
		this.hwc = hwc;
	}
	public void setJpanelOfHello() {
		//��ҳ
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
		setJPanelLauout(hwc.getjPanelFirst(), false,  fmm.getFour(),  fmm.getThree(),  fmm.getOne(), hwc.getForjPanelFirst(), hwc.getjButtonFind(), true);
		//�ҵ�ҳ��
		setJPanelLauout(hwc.getjPanelUser(), false, fmm.getZone(), fmm.getZone(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjLabelUserPicture(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(), fmm.getZone(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getTextFieldName(), true);
		setJPanelLauout(hwc.getjPanelUser(), false, fmm.getZone(),  fmm.getSix(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonUserPicture(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(), fmm.getZone(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonName(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),  fmm.getOne(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getTextFieldCiper(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(),  fmm.getOne(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonCiper(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),  fmm.getThree(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getTextFieldQuestion(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(),  fmm.getThree(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonQuestion(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),  fmm.getFour(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getTextFieldAnswer(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(),  fmm.getFour(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonAnswer(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),   fmm.getFiva(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjLabelCount(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,   fmm.getFiva(),   fmm.getFiva(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjLabelMoney(), true);
		setJPanelLauout(hwc.getjPanelUser(), false,  fmm.getThree(),  fmm.getSix(),  fmm.getOne(), hwc.getForjPanelUser(), hwc.getjButtonInMoney(), true);
	}
}
