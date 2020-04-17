package com.wsp.event.view;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import com.wsp.event.util.SetJFrameUtil;
import com.wsp.event.util.SetJPanelUtil;

/**
 * @author WSP
 * @Date 2020��4��5��
 */
public class LoadWindowView extends SetJPanelUtil{
	private  JFrame jf = new JFrame();
	private  GridBagLayout forLoadJpanel = new GridBagLayout();
	private  GridBagLayout forForgetJpanel = new GridBagLayout();
	private  CardLayout forAllJpanel = new CardLayout();
	private  CardLayout forNewUserJpanel = new CardLayout();
	private  GridBagLayout forUserJpanelOne = new GridBagLayout();
	private  GridBagLayout forUserJpanelTwo = new GridBagLayout();
	
	public LoadWindowView() {
		/*
		 * ��ʼ��ģ��
		 */
		LoadComposementView lc = new LoadComposementView();
		LoadWindowLoadJpanelView lwlj = new LoadWindowLoadJpanelView();
		LoadWindowForgetJpanelView lwfj = new LoadWindowForgetJpanelView();
		LoadWindowNewUserJpanelView lwnuj = new LoadWindowNewUserJpanelView();
		jf = SetJFrameUtil.setJFrame(jf, "LaodingWindow", 550, 400, false, false);
		jf.setLocation(300, 200);
		/*
		 * ���ò���ģʽ
		 */
		lc.newUserJpanel.setLayout(forNewUserJpanel);
		lc.allJpanel.setLayout(forAllJpanel);
		lc.newUserJpanelOne.setLayout(forUserJpanelOne);
		lc.newUserJpanelTwo.setLayout(forUserJpanelTwo);
		lc.fogetCiperJpanel.setLayout(forForgetJpanel);
        lc.laodJpanel.setLayout(forLoadJpanel);
        /*
         * ����
         */
		lwlj.loadWindowLoadJpanel(lc, forLoadJpanel);
		lwfj.loadWindowForGetJapanel(lc, forForgetJpanel);
		lwnuj.loadWindowNewUserJpanel(lc, forUserJpanelOne, forUserJpanelTwo);
        /*		 
         * �������
		 */
        lc.allJpanel.add(lc.fogetCiperJpanel,"2");
        lc.allJpanel.add(lc.laodJpanel,"0");
		lc.allJpanel.add(lc.newUserJpanel,"1");
        lc.newUserJpanel.add(lc.newUserJpanelOne,"0");
        lc.newUserJpanel.add(lc.newUserJpanelTwo,"1");
        forAllJpanel.show(lc.allJpanel, "0");
        jf.add(lc.allJpanel);
        /*
         * ���������
         */
        LoadWindowListenerView lwl = new LoadWindowListenerView(forAllJpanel, forNewUserJpanel, lc ,jf);
        LoadAddListenerView lal = new LoadAddListenerView(lc, lwl);
        lal.loadAddListener();
	}
	/**
	 * ��������
	 */
	public static void main(String[] args) {
		//forAllJpanel.next(SLC.allJpanel);
		new LoadWindowView();
	}	
	
}
