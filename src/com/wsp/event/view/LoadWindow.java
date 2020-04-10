package com.wsp.event.view;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import com.wsp.event.util.SetJFrameUtil;
import com.wsp.event.util.SetJPanelUtil;

/**
 * @author WSP
 * @Date 2020年4月5日
 */
public class LoadWindow extends SetJPanelUtil{
	private  JFrame jf = new JFrame();
	private  GridBagLayout forLoadJpanel = new GridBagLayout();
	private  GridBagLayout forForgetJpanel = new GridBagLayout();
	private  CardLayout forAllJpanel = new CardLayout();
	private  CardLayout forNewUserJpanel = new CardLayout();
	private  GridBagLayout forUserJpanelOne = new GridBagLayout();
	private  GridBagLayout forUserJpanelTwo = new GridBagLayout();
	
	public LoadWindow() {
		/*
		 * 初始化模块
		 */
		LoadComposement lc = new LoadComposement();
		LoadWindowLoadJpanel lwlj = new LoadWindowLoadJpanel();
		LoadWindowForgetJpanel lwfj = new LoadWindowForgetJpanel();
		LoadWindowNewUserJpanel lwnuj = new LoadWindowNewUserJpanel();
		jf = SetJFrameUtil.setJFrame(jf, "LaodingWindow", 500, 300, false, false);
		/*
		 * 设置布局模式
		 */
		lc.newUserJpanel.setLayout(forNewUserJpanel);
		lc.allJpanel.setLayout(forAllJpanel);
		lc.newUserJpanelOne.setLayout(forUserJpanelOne);
		lc.newUserJpanelTwo.setLayout(forUserJpanelTwo);
		lc.fogetCiperJpanel.setLayout(forForgetJpanel);
        lc.laodJpanel.setLayout(forLoadJpanel);
        /*
         * 布局
         */
		lwlj.loadWindowLoadJpanel(lc, forLoadJpanel);
		lwfj.loadWindowForGetJapanel(lc, forForgetJpanel);
		lwnuj.loadWindowNewUserJpanel(lc, forUserJpanelOne, forUserJpanelTwo);
        /*		 
         * 加入面板
		 */
        lc.allJpanel.add(lc.fogetCiperJpanel,"2");
        lc.allJpanel.add(lc.laodJpanel,"0");
		lc.allJpanel.add(lc.newUserJpanel,"1");
        lc.newUserJpanel.add(lc.newUserJpanelOne,"0");
        lc.newUserJpanel.add(lc.newUserJpanelTwo,"1");
        forAllJpanel.show(lc.allJpanel, "0");
        jf.add(lc.allJpanel);
        /*
         * 加入监听器
         */
        LoadWindowListener lwl = new LoadWindowListener(forAllJpanel, forNewUserJpanel, lc ,jf);
        LoadAddListener lal = new LoadAddListener(lc, lwl);
        lal.loadAddListener();
	}
	/**
	 * 测试数据
	 */
	public static void main(String[] args) {
		//forAllJpanel.next(SLC.allJpanel);
		new LoadWindow();
	}	
	
}
