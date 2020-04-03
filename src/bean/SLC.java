package bean;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import util.SetWord;
/*
 * 减少代码长度用SLC代替:SaveLaodComposement;
 * 登陆界面组件
 */
public class SLC{
	private SLC() {}
	/*
	 *公用插件
	 */
	public static JDialog forError = new JDialog();
	/*
	 * laod窗口容器
	 */
	public static JPanel allJpanel = new JPanel();
	public static JPanel laodJpanel = new JPanel();
	public static JPanel fogetCiperJpanel = new JPanel();
	public static JPanel newUserJpanel = new JPanel();
	public static JPanel newUserJpanelOne = new JPanel();
	public static JPanel newUserJpanelTwo = new JPanel();
	/*
	 * laod选择组件
	 */
	public static JRadioButton asMassager  = new JRadioButton("管理员");
	public static JButton fgc = new JButton("忘记密码");
	public static JButton newUser = new JButton("注册");
	public static JButton laod = new JButton("登陆");
	public static JLabel showLOLLaod = new JLabel("欢迎来到英雄客栈");
	public static JLabel count = new JLabel("账号");
	public static JLabel ciper = new JLabel("密码");
	public static JLabel pct = new JLabel();
	/*
	 * laod账号密码输入组件
	 */
	public static JTextField inputCounter = new JTextField(15);
	public static JTextField userCiper = new JTextField(15);
	
	/*
	 * 注册页面1组件
	 */
	public static JButton back = new JButton("返回");
	public static JButton goOn = new JButton("继续");
	public static JLabel showLOLNewUser = new JLabel("欢迎注册英雄客栈");
	public static JLabel ciperNewUser = new JLabel("密码");
	public static JLabel reCiper = new JLabel("确认密码");
	public static JLabel name = new JLabel("名字");
	public static JLabel  tellNameRuler = new JLabel("输入1~8中英文数字及_，且不能用特殊符号");
	public static JLabel  tellRuler = new JLabel("你只可以用英文字母和数字，且只能位8~16位");
	public static JLabel pic = new JLabel();
	public static JLabel pic1 = new JLabel();
	public static JTextField userCiperNewUser = new JTextField(16);
	public static JTextField reUserCiperNewUser = new JTextField(16);
	public static JTextField userName = new JTextField(15);
	public static JPanel jp1 = new JPanel();
	/*
	 * 注册页面二
	 */
	public static JLabel ciperQuestion = new JLabel("密保问题");
	public static JLabel ciperAnswer = new JLabel("密保答案");
	public static JLabel reCiperAnswer = new JLabel("确认密保答案");
	public static JLabel tellCiperQuetionRuler = new JLabel("可以是20个字之类的问题如（A？？）");
	public static JLabel tellCiperAnswerRuler = new JLabel("可以是20个字节之类的答案如（啦！！）");
	public static JLabel tellYourCount = new JLabel("您的账号：（请截屏记下）");
	public static JLabel thisYourCount = new JLabel(""+SMFL.newUserCount);
	public static JButton finishIt = new JButton("完成");
	public static JButton goOnNewUserOne = new JButton("返回");
	public static JButton returnLaodNewUser = new JButton("记住了，现在返回登陆页面");
	public static JTextField userQuestion = new JTextField(22);
	public static JTextField reUserAnswer= new JTextField(22);
	public static JTextField userAnswer = new JTextField(22);
	/*
	 *忘记密码模块 
	 */
	public static JLabel tellYouCanDo = new JLabel("您可试验的机会");
	public static JLabel youAnswer = new JLabel("密保答案：");
	public static JLabel youQuestion  = new JLabel("密保问题：");
	public static JLabel youCount = new JLabel("您的账号：");
	public static JLabel thisYouFindCiper = new JLabel(""+SMFL.hasFindCiper);
	public static JLabel thisYourQuestion = new JLabel(SMFL.forgetCiper);
	public static JTextField youQuestionS = new JTextField(20);          
	public static JTextField youAnserS = new JTextField(20);         
	public static JTextField youCountInput = new JTextField(20);
	public static JButton checkInputCount = new JButton("OK");
	public static JButton backOut = new JButton("返回");
	public static JButton OK = new JButton("确认");
	public static JButton returnLaod = new JButton("记住了，现在返回登陆页面");
	/*
	 * 组件模式初始化
	 */
	static{
		showLOLNewUser = SetWord.setLabel(showLOLNewUser, Color.blue, Color.blue, new Font("宋体",Font.PLAIN,30));
		showLOLLaod = SetWord.setLabel(showLOLLaod, Color.BLUE, Color.blue, new Font("宋体",Font.PLAIN, 30));
		tellRuler = SetWord.setLabel(tellRuler, Color.darkGray, Color.blue, new Font("宋体",Font.PLAIN, 10));
		tellNameRuler = SetWord.setLabel(tellNameRuler, Color.darkGray, Color.blue, new Font("宋体",Font.PLAIN, 10));
		thisYouFindCiper = SetWord.setLabel(thisYouFindCiper, Color.GREEN, Color.green, new Font("宋体",Font.PLAIN,18));
		thisYourCount = SetWord.setLabel(thisYouFindCiper, Color.GREEN, Color.green, new Font("宋体",Font.PLAIN,18));
		thisYouFindCiper.setVisible(false);
		thisYourCount.setVisible(false);
		returnLaod.setVisible(false);
		returnLaodNewUser.setVisible(false);
		thisYourQuestion.setVisible(false);
		goOn.setEnabled(false);
		laod.setEnabled(false);
		OK.setEnabled(false);
		finishIt.setEnabled(false);
	}
}
