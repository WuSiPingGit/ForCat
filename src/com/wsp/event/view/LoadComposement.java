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
 * ��������
 * @author WSP
 * @Date 2020��4��6��
 */

public class LoadComposement {
	public LoadComposement() {}
	/*
	 * ���ò��
	 */
	public JDialog forError = new JDialog();
	/**
	 * load��������
	 */
	public  JPanel allJpanel = new JPanel();
	public  JPanel laodJpanel = new JPanel();
	public  JPanel fogetCiperJpanel = new JPanel();
	public  JPanel newUserJpanel = new JPanel();
	public  JPanel newUserJpanelOne = new JPanel();
	public  JPanel newUserJpanelTwo = new JPanel();
	/**
	 * ��½���
	 */
	public  JRadioButton asMassager  = new JRadioButton("����Ա");
	public  JButton fgc = new JButton("��������");
	public  JButton newUser = new JButton("ע��");
	public  JButton laod = new JButton("��½");
	public  JLabel showLolLaod = new JLabel("��ӭ����Ӣ�ۿ�ջ");
	public  JLabel count = new JLabel("�˺�");
	public  JLabel ciper = new JLabel("����");
	public  JLabel pct = new JLabel();
	/**
	 * ��½�˺������������
	 */
	public  JTextField inputCounter = new JTextField(18);
	public  JTextField userCiper = new JTextField(18);
	
	/**
	 * ע��ҳ��1���
	 */
	public  JButton back = new JButton("����");
	public  JButton goOn = new JButton("����");
	public  JLabel showLolNewUser = new JLabel("��ӭע��Ӣ�ۿ�ջ");
	public  JLabel ciperNewUser = new JLabel("����");
	public  JLabel reCiper = new JLabel("ȷ������");
	public  JLabel name = new JLabel("����");
	public  JLabel  tellNameRuler = new JLabel("����1~8��Ӣ�����ּ�_���Ҳ������������");
	public  JLabel  tellRuler = new JLabel("��ֻ������Ӣ����ĸ�����֣���ֻ��λ8~16λ");
	public  JLabel pic = new JLabel();
	public  JLabel pic1 = new JLabel();
	public  JTextField userCiperNewUser = new JTextField(16);
	public  JTextField reUserCiperNewUser = new JTextField(16);
	public  JTextField userName = new JTextField(15);
	public  JPanel jp1 = new JPanel();
	/**
	 * ע��ҳ���
	 */
	public  JLabel ciperQuestion = new JLabel("�ܱ�����");
	public  JLabel ciperAnswer = new JLabel("�ܱ���");
	public  JLabel reCiperAnswer = new JLabel("ȷ���ܱ���");
	public  JLabel tellCiperQuetionRuler = new JLabel("������20����Ӣ�����ֺ�_�����������������磨A������");
	public  JLabel tellCiperAnswerRuler = new JLabel("������20����Ӣ������ _�����������Ĵ��磨��������");
	public  JLabel tellYourCount = new JLabel("�����˺ţ�����������£�");
	public  JLabel thisYourCount = new JLabel();
	public  JButton finishIt = new JButton("���");
	public  JButton goOnNewUserOne = new JButton("����");
	public  JButton returnLaodNewUser = new JButton("��ס�ˣ����ڷ��ص�½ҳ��");
	public  JTextField userQuestion = new JTextField(22);
	public  JTextField reUserAnswer= new JTextField(22);
	public  JTextField userAnswer = new JTextField(22);
	/**
	 *��������ģ�� 
	 */
	public  JLabel tellYouCanDo = new JLabel("��������Ļ���");
	public  JLabel youAnswer = new JLabel("�ܱ��𰸣�");
	public  JLabel youQuestion  = new JLabel("�ܱ����⣺");
	public  JLabel youCount = new JLabel("�����˺ţ�");
	public  JLabel thisYouFindCiper = new JLabel();
	public  JLabel thisYourQuestion = new JLabel("����");      
	public  JTextField youAnserS = new JTextField(20);         
	public  JTextField youCountInput = new JTextField(20);
	public  JButton checkInputCount = new JButton("OK");
	public  JButton backOut = new JButton("����");
	public JButton hasOk = new JButton("ȷ��");
	public JButton returnLaod = new JButton("��ס�ˣ����ڷ��ص�½ҳ��");
	/**
	 * ���ģʽ��ʼ��
	 */
	{
		SetWordUtil setWordUtil = new SetWordUtil();
		showLolNewUser = setWordUtil.setLabel(showLolNewUser, Color.blue, Color.blue, new Font("����",Font.PLAIN,30));
		showLolLaod = setWordUtil.setLabel(showLolLaod, Color.BLUE, Color.blue, new Font("����",Font.PLAIN, 30));
		tellRuler = setWordUtil.setLabel(tellRuler, Color.darkGray, Color.blue, new Font("����",Font.PLAIN, 10));
		tellNameRuler = setWordUtil.setLabel(tellNameRuler, Color.darkGray, Color.blue, new Font("����",Font.PLAIN, 10));
		thisYouFindCiper = setWordUtil.setLabel(thisYouFindCiper, Color.darkGray, Color.blue, new Font("����",Font.PLAIN,20));
		thisYourCount = setWordUtil.setLabel(thisYourCount, Color.GREEN, Color.green, new Font("����",Font.PLAIN,10));
		tellYourCount = setWordUtil.setLabel(tellYourCount, Color.RED, Color.green, new Font("����",Font.PLAIN,20));
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

