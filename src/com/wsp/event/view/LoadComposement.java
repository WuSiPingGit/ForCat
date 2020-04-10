package com.wsp.event.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.wsp.event.util.SetWordUtil;
/**
 * 窗口主键
 * @author WSP
 * @Date 2020年4月6日
 */

public class LoadComposement {
	public LoadComposement() {}
	/*
	 * 公用插件
	 */
	public JDialog forError = new JDialog();
	/**
	 * load窗口容器
	 */
	public  JPanel allJpanel = new JPanel();
	public  JPanel laodJpanel = new JPanel();
	public  JPanel fogetCiperJpanel = new JPanel();
	public  JPanel newUserJpanel = new JPanel();
	public  JPanel newUserJpanelOne = new JPanel();
	public  JPanel newUserJpanelTwo = new JPanel();
	/**
	 * 登陆组件
	 */
	public  JRadioButton asMassager  = new JRadioButton("管理员");
	public  JButton fgc = new JButton("忘记密码");
	public  JButton newUser = new JButton("注册");
	public  JButton laod = new JButton("登陆");
	public  JLabel showLolLaod = new JLabel("欢迎来到英雄客栈");
	public  JLabel count = new JLabel("账号");
	public  JLabel ciper = new JLabel("密码");
	public  JLabel pct = new JLabel();
	/**
	 * 登陆账号密码输入组件
	 */
	public  JTextField inputCounter = new JTextField(18);
	public  JTextField userCiper = new JTextField(18);
	
	/**
	 * 注册页面1组件
	 */
	public  JButton back = new JButton("返回");
	public  JButton goOn = new JButton("继续");
	public  JLabel showLolNewUser = new JLabel("欢迎注册英雄客栈");
	public  JLabel ciperNewUser = new JLabel("密码");
	public  JLabel reCiper = new JLabel("确认密码");
	public  JLabel name = new JLabel("名字");
	public  JLabel  tellNameRuler = new JLabel("输入1~8中英文数字及_，且不能用特殊符号");
	public  JLabel  tellRuler = new JLabel("你只可以用英文字母和数字，且只能位8~16位");
	public  JLabel pic = new JLabel();
	public  JLabel pic1 = new JLabel();
	public  JTextField userCiperNewUser = new JTextField(16);
	public  JTextField reUserCiperNewUser = new JTextField(16);
	public  JTextField userName = new JTextField(15);
	public  JPanel jp1 = new JPanel();
	/**
	 * 注册页面二
	 */
	public  JLabel ciperQuestion = new JLabel("密保问题");
	public  JLabel ciperAnswer = new JLabel("密保答案");
	public  JLabel reCiperAnswer = new JLabel("确认密保答案");
	public  JLabel tellCiperQuetionRuler = new JLabel("可以是20个中英文数字和_及？、，。的问题如（A？？）");
	public  JLabel tellCiperAnswerRuler = new JLabel("可以是20个中英文数和 _及？、，。的答案如（啦！！）");
	public  JLabel tellYourCount = new JLabel("您的账号：（请截屏记下）");
	public  JLabel thisYourCount = new JLabel();
	public  JButton finishIt = new JButton("完成");
	public  JButton goOnNewUserOne = new JButton("返回");
	public  JButton returnLaodNewUser = new JButton("记住了，现在返回登陆页面");
	public  JTextField userQuestion = new JTextField(22);
	public  JTextField reUserAnswer= new JTextField(22);
	public  JTextField userAnswer = new JTextField(22);
	/**
	 *忘记密码模块 
	 */
	public  JLabel tellYouCanDo = new JLabel("您可试验的机会");
	public  JLabel youAnswer = new JLabel("密保答案：");
	public  JLabel youQuestion  = new JLabel("密保问题：");
	public  JLabel youCount = new JLabel("您的账号：");
	public  JLabel thisYouFindCiper = new JLabel();
	public  JLabel thisYourQuestion = new JLabel("出错");      
	public  JTextField youAnserS = new JTextField(20);         
	public  JTextField youCountInput = new JTextField(20);
	public  JButton checkInputCount = new JButton("OK");
	public  JButton backOut = new JButton("返回");
	public JButton hasOk = new JButton("确认");
	public JButton returnLaod = new JButton("记住了，现在返回登陆页面");
	/**
	 * 组件模式初始化
	 */
	{
		SetWordUtil setWordUtil = new SetWordUtil();
		showLolNewUser = setWordUtil.setLabel(showLolNewUser, Color.blue, Color.blue, new Font("宋体",Font.PLAIN,30));
		showLolLaod = setWordUtil.setLabel(showLolLaod, Color.BLUE, Color.blue, new Font("宋体",Font.PLAIN, 30));
		tellRuler = setWordUtil.setLabel(tellRuler, Color.darkGray, Color.blue, new Font("宋体",Font.PLAIN, 10));
		tellNameRuler = setWordUtil.setLabel(tellNameRuler, Color.darkGray, Color.blue, new Font("宋体",Font.PLAIN, 10));
		thisYouFindCiper = setWordUtil.setLabel(thisYouFindCiper, Color.darkGray, Color.blue, new Font("宋体",Font.PLAIN,20));
		thisYourCount = setWordUtil.setLabel(thisYourCount, Color.GREEN, Color.green, new Font("宋体",Font.PLAIN,10));
		tellYourCount = setWordUtil.setLabel(tellYourCount, Color.RED, Color.green, new Font("宋体",Font.PLAIN,20));
		tellYourCount.setVisible(false);
		thisYouFindCiper.setVisible(false);
		thisYourCount.setVisible(false);
		returnLaod.setVisible(false);
		returnLaodNewUser.setVisible(false);
		thisYourQuestion.setVisible(false);
		laod.setEnabled(false);
		hasOk.setEnabled(false);
	}
}

