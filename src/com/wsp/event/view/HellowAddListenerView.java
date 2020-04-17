package com.wsp.event.view;
/**
 * 监听器
 * @author WSP
 */
public class HellowAddListenerView {
	private HelloWindowComposementView hwc;
	private HelloWindowListenerView hwl;
	public HellowAddListenerView(HelloWindowComposementView hwc) {
		this.hwc = hwc;
		this.hwl = new HelloWindowListenerView(hwc);
	}
	public void addListener() {
		//页面切换
		hwc.getChooseOne().addActionListener(hwl.new ChangJpanelFirst());
		hwc.getChooseTwo().addActionListener(hwl.new ChangJpanelUser());
		hwc.getChooseThree().addActionListener(hwl.new ChangJpanelMatch());
		hwc.getChooseFour().addActionListener(hwl.new ChangJpanelMassager());
		//对战
		hwc.getjButtonNext().addActionListener(hwl.new NextPart());
		hwc.getjButtonLast().addActionListener(hwl.new LastPart());
		hwc.getjButtonFind().addActionListener(hwl.new CheckTeam());
		hwc.getjButtonToUpdate().addActionListener(hwl.new UpdateListener());
		hwc.getjButtonToUpdateTwo().addActionListener(hwl.new UpdateListenerTwo());
		//管理员
		hwc.getAddMatch().addActionListener(hwl.new AddMatchListner());
		hwc.getReturnMoneyAndDelectMatch().addActionListener(hwl.new ReduceMatchListner());
	}
}
