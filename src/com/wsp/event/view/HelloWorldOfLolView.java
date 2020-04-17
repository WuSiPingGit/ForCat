package com.wsp.event.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import com.wsp.event.util.SetJFrameUtil;

public class HelloWorldOfLolView {
	private JFrame jf = new JFrame();
	private HelloWindowComposementView helloCompoment = new HelloWindowComposementView();
	public HelloWorldOfLolView() {
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		jf = SetJFrameUtil.setJFrame(jf, "HelloWorld", screensize.width, screensize.height, true, false);
		/*
		 * 加入布局器
		 */
		helloCompoment.getjPanelAll().setLayout(helloCompoment.getForAlljPanel());
		helloCompoment.getjPanelFirst().setLayout(helloCompoment.getForjPanelFirst());
		helloCompoment.getjPanelUser().setLayout(helloCompoment.getForjPanelUser());
		helloCompoment.getjPanelMassager().setLayout(helloCompoment.getForjPanelMassager());
		/*
		 * 加入面板
		 */
		jf.add(helloCompoment.getjPanelAll());
		jf.add(helloCompoment.getjPanelChoose(),BorderLayout.SOUTH);
		helloCompoment.getjPanelAll().add(helloCompoment.getjPanelFirst(),"0");
		helloCompoment.getjPanelAll().add(helloCompoment.getjPanelUser(),"1");
		helloCompoment.getjPanelAll().add(helloCompoment.getjPanelMatch(),"2");
		helloCompoment.getjPanelAll().add(helloCompoment.getjPanelMassager(),"3");
		/*
		 * 加入组件
		 */
		 ToJpanelOfHelloView toJpanelOfHelloView = new ToJpanelOfHelloView(helloCompoment);
		 toJpanelOfHelloView.setJpanelOfHello();
		 SetJpanelOfHelloOneView setJpanelOfHelloOneView = new SetJpanelOfHelloOneView();
		 setJpanelOfHelloOneView.setJpanelOfHello(helloCompoment);
		 //监听器
		 new HellowAddListenerView(helloCompoment).addListener();
		 //测试
		 helloCompoment.getForAlljPanel().show(helloCompoment.getjPanelAll(), "3");
	}
	
	public static void main(String[] args) {
		new HelloWorldOfLolView();
	}
}
