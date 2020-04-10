package com.wsp.event.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import com.wsp.event.util.SetJFrameUtil;

public class HelloWorldOfLol {
	private JFrame jf = new JFrame();
	private HelloWindowComposement helloCompoment = new HelloWindowComposement();
	public HelloWorldOfLol() {
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		jf = SetJFrameUtil.setJFrame(jf, "HelloWorld", screensize.width, screensize.height, true, false);
		/*
		 * 加入布局器
		 */
		helloCompoment.getjPanelAll().setLayout(helloCompoment.getForAlljPanel());
		helloCompoment.getjPanelFirst().setLayout(helloCompoment.getForjPanelFirst());
		helloCompoment.getjPanelUser().setLayout(helloCompoment.getForjPanelUser());
		helloCompoment.getjPanelMatch().setLayout(helloCompoment.getForjPanelMatch());
		helloCompoment.getjPanelMassager().setLayout(helloCompoment.getForjPanelMassager());
		helloCompoment.getjPanelFind().setLayout(helloCompoment.getForjPanelFind());
		/*
		 * 加入面板
		 */
		jf.add(helloCompoment.getjPanelAll());
		jf.add(helloCompoment.getjPanelChoose(),BorderLayout.SOUTH);
		helloCompoment.getjPanelAll().add(helloCompoment.getjPanelFirst(),"0");
		helloCompoment.getjPanelAll().add(helloCompoment.getjPanelFind(),"4");
		helloCompoment.getjPanelAll().add(helloCompoment.getjPanelUser(),"1");
		helloCompoment.getjPanelAll().add(helloCompoment.getjPanelMatch(),"2");
		helloCompoment.getjPanelAll().add(helloCompoment.getjPanelMassager(),"3");
		/*
		 * 加入组件
		 */
		 ToJpanelOfHello toJpanelOfHello = new ToJpanelOfHello(helloCompoment);
		 toJpanelOfHello.setJpanelOfHello();
		 SetJpanelOfHelloOne setJpanelOfHelloOne = new SetJpanelOfHelloOne();
		 setJpanelOfHelloOne.setJpanelOfHello(helloCompoment);
		 //测试
		 helloCompoment.getForAlljPanel().show(helloCompoment.getjPanelAll(), "2");
	}
	
	public static void main(String[] args) {
		new HelloWorldOfLol();
	}
}
