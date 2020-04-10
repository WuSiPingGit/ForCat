package com.wsp.event.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import com.wsp.event.util.SetComposementSizeUtil;
import com.wsp.event.util.SetWordUtil;

/**
 * 
 * @author WSP
 * @Date 2020��4��9��
 */
public class HelloWindowComposement {
	/*
	 * ������
	 */
	
	private  CardLayout forAlljPanel = new CardLayout();
	private  GridBagLayout forjPanelFirst = new GridBagLayout();
	private  GridBagLayout forjPanelUser = new GridBagLayout();
	private  GridBagLayout forjPanelMatch = new GridBagLayout();
	private  FlowLayout forjPanelChoose = new FlowLayout();
	private  GridBagLayout forjPanelMassager = new GridBagLayout();
	private  GridBagLayout forjPanelFind = new GridBagLayout();
	/*
	 * ����
	 */
	private JPanel jPanelAll = new JPanel();
	private JPanel jPanelFirst = new JPanel();
	private JPanel jPanelUser = new JPanel();
	private JPanel jPanelMatch = new JPanel();
	private JPanel jPanelChoose = new JPanel();
	private JPanel jPanelMassager = new JPanel();
	private JPanel jPanelFind = new JPanel();
	/*
	 * ҳ��ѡ����
	 */
	private JButton First = new JButton("��ҳ");
	private JButton User = new JButton("�û���Ϣҳ��");
	private JButton Match = new JButton("����ҳ��");
	private JButton Massager = new JButton("����Աģʽ");
	/*
	 * �������
	 */
	private JLabel jLabelTellVip = new JLabel("��ֵvip���ܹ���Ż�");
	private JButton beVip = new JButton("����vip");
	/*
	 * 
	 */
	/*
	 * ��ҳ
	 */
	private JLabel jLabelFind = new JLabel("����");
	private JLabel jLabelRecomment = new JLabel("���������Ƽ�");
	private JLabel jLabelTip = new JLabel("��ս�ӡ��ұ���");
	private JLabel jLabelPicture = new JLabel("ͼ");
	private JButton matchOne = new JButton();
	private JButton matchTwo = new JButton();
	private JButton matchThree = new JButton();
	private JButton matchFour = new JButton();
	private JButton jButtonFind = new JButton("����");
	private TextField textField = new TextField(20);
	/*
	 * �û�ҳ��
	 */
	private JLabel jLabelUserPicture = new JLabel("ͼ");
	private JLabel jLabelCount = new JLabel();
	private JLabel jLabelMoney = new JLabel();
	private JButton jButtonUserPicture = new JButton("��ͷ��");
	private JButton jButtonName = new JButton("������");
	private JButton jButtonCiper = new JButton("������");
	private JButton jButtonInMoney = new JButton("��ֵ");
	private JButton jButtonQuestion = new JButton("������");
	private JButton jButtonAnswer = new JButton("�Ĵ�");
	private TextField textFieldName = new TextField(20);
	private TextField textFieldCiper = new TextField(20);
	private TextField textFieldQuestion = new TextField(20);
	private TextField textFieldAnswer = new TextField(20);
	/*
	 * ������Ϣ
	 */
	private JLabel jLabelTellMatchTime= new JLabel("ʱ��");
	private JLabel jLabelTellMatchName = new JLabel("��ս����������");
	private JLabel jLabelTellMatchMoney = new JLabel("Ʊ��");
	private JLabel jLabelTellMatchHasTicke = new JLabel("��Ʊ");
	private JTextArea jTextAreaTime = new JTextArea(10, 20);
	private JTextArea jTextAreaMoney = new JTextArea(10, 20);
	private JTextArea jTextAreaHasTiche = new JTextArea(10, 20);
	private JButton jLabelMatchOne = new JButton();
	private JButton jLabelMatchTwo = new JButton();
	private JButton jLabelMatchThree = new JButton();
	private JButton jLabelMatchFour = new JButton();
	private JButton jLabelMatchFive = new JButton();
	private JButton jLabelMatchSix = new JButton();
	private JButton jLabelMatchSeven = new JButton();
	private JButton jButtonNext = new JButton("NEXT");
	private JButton jButtonLast = new JButton("LAST");
	private JButton jButtonToUpdate = new JButton("����");
//	private JButton  = new JButton();
	/*
	 * �������
	 */
	private JLabel jLabelFindMatchTime= new JLabel();
	private JLabel jLabelFindMatchName = new JLabel();
	private JTextArea jTextAreaFindTime = new JTextArea(8, 20);
	private JButton jLabelFindMatchOne = new JButton();
	private JButton jLabelFindMatchTwo = new JButton();
	private JButton jLabelFindMatchThree = new JButton();
	private JButton jLabelFindMatchFour = new JButton();
	private JButton jLabelFindMatchFive = new JButton();
	private JButton jLabelFindMatchSix = new JButton();
	private JButton jLabelFindMatchSeven = new JButton();
//	private JButton jButtonNext = new JButton("NEXT");
//	private JButton jButtonLast = new JButton("LAST");
	/*
	 * ����ҳ
	 */
	private JLabel jLabelTellMatchChange= new JLabel("ɾ�ı�����Ϣ");
	private JLabel jLabelTellMatchToAdd = new JLabel("���ӱ���");
	private JLabel jLabelTellUserToKill = new JLabel("��ֹ��½");
	private JButton returnMoneyAndDelectMatch = new JButton("ɾ����������Ǯ");
	private JLabel jLabelTellChangeMoney= new JLabel("����");
	private JLabel jLabelTellChangeTime = new JLabel("ʱ��");
	private JLabel jLabelTellChangeArea = new JLabel("ʱ��");
	private JLabel jLabelTellChangeUser = new JLabel("��ֹ��½");
	private JLabel jLabelTellChangeTeamOne= new JLabel("����1");
	private JLabel jLabelTellChangeTeamTwo = new JLabel("����2");
	private JLabel jLabelTellChangeIsHot= new JLabel("����");
	private JTextField matchMoney = new JTextField(20);
	private JTextField matchTime = new JTextField(20);
	private JTextField matchArea = new JTextField(20);
	private JTextField matchTeamOne = new JTextField(20);
	private JTextField matchTeamTwo = new JTextField(20);
	private JRadioButton isHot = new JRadioButton("����");
	private JTextField killUser = new JTextField(20);
	private JTextField whichUser = new JTextField(20);
	private JTextField whichMatch = new JTextField(20);
	private JButton isThisUser = new JButton("OK");
	private JButton isThisMatch = new JButton("OK");
	private JButton addMatch = new JButton("OK");
	/*
	 * ѡ��ҳ
	 */
	private JButton chooseOne = new JButton("��ҳ");
	private JButton chooseTwo = new JButton("�ҵ�");
	private JButton chooseThree = new JButton("����");
	private JButton chooseFour = new JButton("����Ա");
//	private JButton chooseOne = new JButton("");
	/*
	 * ��ʼ��ҳ��
	 */
	{
		jTextAreaTime.setEditable(false);
		jTextAreaMoney.setEditable(false); 
		jTextAreaHasTiche.setEditable(false);
		chooseFour.setVisible(false);
		SetWordUtil setWordUtil = new SetWordUtil();
		jLabelTellVip = setWordUtil.setLabel(jLabelTellVip, Color.blue, Color.blue, new Font("����",Font.PLAIN, 18));
		
		/*
		 * �������
		 */
		jPanelChoose.setLayout(forjPanelChoose);
		jPanelChoose.add(chooseOne);
		jPanelChoose.add(chooseTwo);
		jPanelChoose.add(chooseThree);
		jPanelChoose.add(chooseFour);
	}
	public JPanel getjPanelAll() {
		return jPanelAll;
	}
	public void setjPanelAll(JPanel jPanelAll) {
		this.jPanelAll = jPanelAll;
	}
	public JPanel getjPanelFirst() {
		return jPanelFirst;
	}
	public void setjPanelFirst(JPanel jPanelFirst) {
		this.jPanelFirst = jPanelFirst;
	}
	public JPanel getjPanelUser() {
		return jPanelUser;
	}
	public void setjPanelUser(JPanel jPanelUser) {
		this.jPanelUser = jPanelUser;
	}
	public JPanel getjPanelMatch() {
		return jPanelMatch;
	}
	public void setjPanelMatch(JPanel jPanelMatch) {
		this.jPanelMatch = jPanelMatch;
	}
	public JPanel getjPanelMassager() {
		return jPanelMassager;
	}
	public void setjPanelMassager(JPanel jPanelMassager) {
		this.jPanelMassager = jPanelMassager;
	}
	public JPanel getjPanelChoose() {
		return jPanelChoose;
	}
	public void setjPanelChoose(JPanel jPanelChoose) {
		this.jPanelChoose = jPanelChoose;
	}
	public JButton getFirst() {
		return First;
	}
	public void setFirst(JButton first) {
		First = first;
	}
	public JButton getUser() {
		return User;
	}
	public void setUser(JButton user) {
		User = user;
	}
	public JButton getMatch() {
		return Match;
	}
	public void setMatch(JButton match) {
		Match = match;
	}
	public JButton getMassager() {
		return Massager;
	}
	public void setMassager(JButton massager) {
		Massager = massager;
	}
	public JButton getBeVip() {
		return beVip;
	}
	public void setBeVip(JButton beVip) {
		this.beVip = beVip;
	}
	public JLabel getjLabelTellVip() {
		return jLabelTellVip;
	}
	public void setjLabelTellVip(JLabel jLabelTellVip) {
		this.jLabelTellVip = jLabelTellVip;
	}
	public JLabel getjLabelFind() {
		return jLabelFind;
	}
	public void setjLabelFind(JLabel jLabelFind) {
		this.jLabelFind = jLabelFind;
	}
	public JLabel getjLabelTip() {
		return jLabelTip;
	}
	public void setjLabelTip(JLabel jLabelTip) {
		this.jLabelTip = jLabelTip;
	}
	public JLabel getjLabelPicture() {
		return jLabelPicture;
	}
	public void setjLabelPicture(JLabel jLabelPicture) {
		this.jLabelPicture = jLabelPicture;
	}
	public JButton getMatchOne() {
		return matchOne;
	}
	public void setMatchOne(JButton matchOne) {
		this.matchOne = matchOne;
	}
	public JButton getMatchTwo() {
		return matchTwo;
	}
	public void setMatchTwo(JButton matchTwo) {
		this.matchTwo = matchTwo;
	}
	public JButton getMatchThree() {
		return matchThree;
	}
	public void setMatchThree(JButton matchThree) {
		this.matchThree = matchThree;
	}
	public JButton getMatchFour() {
		return matchFour;
	}
	public void setMatchFour(JButton matchFour) {
		this.matchFour = matchFour;
	}
	public JButton getjButtonFind() {
		return jButtonFind;
	}
	public void setjButtonFind(JButton jButtonFind) {
		this.jButtonFind = jButtonFind;
	}
	public TextField getTextField() {
		return textField;
	}
	public void setTextField(TextField textField) {
		this.textField = textField;
	}
	public TextField getTextFieldAnswer() {
		return textFieldAnswer;
	}
	public void setTextFieldAnswer(TextField textFieldAnswer) {
		this.textFieldAnswer = textFieldAnswer;
	}
	public JLabel getjLabelCount() {
		return jLabelCount;
	}
	public void setjLabelCount(JLabel jLabelCount) {
		this.jLabelCount = jLabelCount;
	}
	public JButton getjButtonName() {
		return jButtonName;
	}
	public void setjButtonName(JButton jButtonName) {
		this.jButtonName = jButtonName;
	}
	public JButton getjButtonCiper() {
		return jButtonCiper;
	}
	public void setjButtonCiper(JButton jButtonCiper) {
		this.jButtonCiper = jButtonCiper;
	}
	public JButton getjButtonInMoney() {
		return jButtonInMoney;
	}
	public void setjButtonInMoney(JButton jButtonInMoney) {
		this.jButtonInMoney = jButtonInMoney;
	}
	public JButton getjButtonQuestion() {
		return jButtonQuestion;
	}
	public void setjButtonQuestion(JButton jButtonQuestion) {
		this.jButtonQuestion = jButtonQuestion;
	}
	public JButton getjButtonAnswer() {
		return jButtonAnswer;
	}
	public void setjButtonAnswer(JButton jButtonAnswer) {
		this.jButtonAnswer = jButtonAnswer;
	}
	public TextField getTextFieldName() {
		return textFieldName;
	}
	public void setTextFieldName(TextField textFieldName) {
		this.textFieldName = textFieldName;
	}
	public TextField getTextFieldCiper() {
		return textFieldCiper;
	}
	public void setTextFieldCiper(TextField textFieldCiper) {
		this.textFieldCiper = textFieldCiper;
	}
	public TextField getTextFieldQuestion() {
		return textFieldQuestion;
	}
	public void setTextFieldQuestion(TextField textFieldQuestion) {
		this.textFieldQuestion = textFieldQuestion;
	}
	public JLabel getjLabelRecomment() {
		return jLabelRecomment;
	}
	public void setjLabelRecomment(JLabel jLabelRecomment) {
		this.jLabelRecomment = jLabelRecomment;
	}
	public JLabel getjLabelMoney() {
		return jLabelMoney;
	}
	public void setjLabelMoney(JLabel jLabelMoney) {
		this.jLabelMoney = jLabelMoney;
	}
	public JLabel getjLabelTellMatchTime() {
		return jLabelTellMatchTime;
	}
	public void setjLabelTellMatchTime(JLabel jLabelTellMatchTime) {
		this.jLabelTellMatchTime = jLabelTellMatchTime;
	}
	public JLabel getjLabelTellMatchName() {
		return jLabelTellMatchName;
	}
	public void setjLabelTellMatchName(JLabel jLabelTellMatchName) {
		this.jLabelTellMatchName = jLabelTellMatchName;
	}
	public JLabel getjLabelTellMatchHasTicke() {
		return jLabelTellMatchHasTicke;
	}
	public void setjLabelTellMatchHasTicke(JLabel jLabelTellMatchHasTicke) {
		this.jLabelTellMatchHasTicke = jLabelTellMatchHasTicke;
	}
	public JLabel getjLabelTellMatchMoney() {
		return jLabelTellMatchMoney;
	}
	public void setjLabelTellMatchMoney(JLabel jLabelTellMatchMoney) {
		this.jLabelTellMatchMoney = jLabelTellMatchMoney;
	}
	public JButton getjButtonToUpdate() {
		return jButtonToUpdate;
	}
	public void setjButtonToUpdate(JButton jButtonToUpdate) {
		this.jButtonToUpdate = jButtonToUpdate;
	}


	public JButton getjLabelMatchSeven() {
		return jLabelMatchSeven;
	}
	public void setjLabelMatchSeven(JButton jLabelMatchSeven) {
		this.jLabelMatchSeven = jLabelMatchSeven;
	}
	public JButton getjLabelMatchSix() {
		return jLabelMatchSix;
	}
	public void setjLabelMatchSix(JButton jLabelMatchSix) {
		this.jLabelMatchSix = jLabelMatchSix;
	}
	public JButton getjLabelMatchFive() {
		return jLabelMatchFive;
	}
	public void setjLabelMatchFive(JButton jLabelMatchFive) {
		this.jLabelMatchFive = jLabelMatchFive;
	}
	public JButton getjLabelMatchFour() {
		return jLabelMatchFour;
	}
	public void setjLabelMatchFour(JButton jLabelMatchFour) {
		this.jLabelMatchFour = jLabelMatchFour;
	}
	public JButton getjLabelMatchThree() {
		return jLabelMatchThree;
	}
	public void setjLabelMatchThree(JButton jLabelMatchThree) {
		this.jLabelMatchThree = jLabelMatchThree;
	}

	public JButton getjLabelMatchOne() {
		return jLabelMatchOne;
	}
	public void setjLabelMatchOne(JButton jLabelMatchOne) {
		this.jLabelMatchOne = jLabelMatchOne;
	}
	public JButton getjLabelMatchTwo() {
		return jLabelMatchTwo;
	}
	public void setjLabelMatchTwo(JButton jLabelMatchTwo) {
		this.jLabelMatchTwo = jLabelMatchTwo;
	}

	public JPanel getjPanelFind() {
		return jPanelFind;
	}
	public void setjPanelFind(JPanel jPanelFind) {
		this.jPanelFind = jPanelFind;
	}
	public CardLayout getForAlljPanel() {
		return forAlljPanel;
	}
	public void setForAlljPanel(CardLayout forAlljPanel) {
		this.forAlljPanel = forAlljPanel;
	}
	public GridBagLayout getForjPanelFirst() {
		return forjPanelFirst;
	}
	public void setForjPanelFirst(GridBagLayout forjPanelFirst) {
		this.forjPanelFirst = forjPanelFirst;
	}
	public GridBagLayout getForjPanelUser() {
		return forjPanelUser;
	}
	public void setForjPanelUser(GridBagLayout forjPanelUser) {
		this.forjPanelUser = forjPanelUser;
	}
	public GridBagLayout getForjPanelMatch() {
		return forjPanelMatch;
	}
	public void setForjPanelMatch(GridBagLayout forjPanelMatch) {
		this.forjPanelMatch = forjPanelMatch;
	}
	public GridBagLayout getForjPanelMassager() {
		return forjPanelMassager;
	}
	public void setForjPanelMassager(GridBagLayout forjPanelMassager) {
		this.forjPanelMassager = forjPanelMassager;
	}
	public GridBagLayout getForjPanelFind() {
		return forjPanelFind;
	}
	public void setForjPanelFind(GridBagLayout forjPanelFind) {
		this.forjPanelFind = forjPanelFind;
	}
	public JLabel getjLabelFindMatchName() {
		return jLabelFindMatchName;
	}
	public void setjLabelFindMatchName(JLabel jLabelFindMatchName) {
		this.jLabelFindMatchName = jLabelFindMatchName;
	}
	public JLabel getjLabelFindMatchTime() {
		return jLabelFindMatchTime;
	}
	public void setjLabelFindMatchTime(JLabel jLabelFindMatchTime) {
		this.jLabelFindMatchTime = jLabelFindMatchTime;
	}
	public JTextArea getjTextAreaFindTime() {
		return jTextAreaFindTime;
	}
	public void setjTextAreaFindTime(JTextArea jTextAreaFindTime) {
		this.jTextAreaFindTime = jTextAreaFindTime;
	}
	public JButton getjLabelFindMatchOne() {
		return jLabelFindMatchOne;
	}
	public void setjLabelFindMatchOne(JButton jLabelFindMatchOne) {
		this.jLabelFindMatchOne = jLabelFindMatchOne;
	}
	public JButton getjLabelFindMatchTwo() {
		return jLabelFindMatchTwo;
	}
	public void setjLabelFindMatchTwo(JButton jLabelFindMatchTwo) {
		this.jLabelFindMatchTwo = jLabelFindMatchTwo;
	}
	public JButton getjLabelFindMatchThree() {
		return jLabelFindMatchThree;
	}
	public void setjLabelFindMatchThree(JButton jLabelFindMatchThree) {
		this.jLabelFindMatchThree = jLabelFindMatchThree;
	}
	public JButton getjLabelFindMatchFour() {
		return jLabelFindMatchFour;
	}
	public void setjLabelFindMatchFour(JButton jLabelFindMatchFour) {
		this.jLabelFindMatchFour = jLabelFindMatchFour;
	}
	public JButton getjLabelFindMatchFive() {
		return jLabelFindMatchFive;
	}
	public void setjLabelFindMatchFive(JButton jLabelFindMatchFive) {
		this.jLabelFindMatchFive = jLabelFindMatchFive;
	}
	public JButton getjLabelFindMatchSix() {
		return jLabelFindMatchSix;
	}
	public void setjLabelFindMatchSix(JButton jLabelFindMatchSix) {
		this.jLabelFindMatchSix = jLabelFindMatchSix;
	}
	public JButton getjLabelFindMatchSeven() {
		return jLabelFindMatchSeven;
	}
	public void setjLabelFindMatchSeven(JButton jLabelFindMatchSeven) {
		this.jLabelFindMatchSeven = jLabelFindMatchSeven;
	}
	public JButton getjButtonNext() {
		return jButtonNext;
	}
	public void setjButtonNext(JButton jButtonNext) {
		this.jButtonNext = jButtonNext;
	}
	public JButton getjButtonLast() {
		return jButtonLast;
	}
	public void setjButtonLast(JButton jButtonLast) {
		this.jButtonLast = jButtonLast;
	}
	public JButton getReturnMoneyAndDelectMatch() {
		return returnMoneyAndDelectMatch;
	}
	public void setReturnMoneyAndDelectMatch(JButton returnMoneyAndDelectMatch) {
		this.returnMoneyAndDelectMatch = returnMoneyAndDelectMatch;
	}
	public JTextField getMatchMoney() {
		return matchMoney;
	}
	public void setMatchMoney(JTextField matchMoney) {
		this.matchMoney = matchMoney;
	}
	public JTextField getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(JTextField matchTime) {
		this.matchTime = matchTime;
	}
	public JTextField getMatchArea() {
		return matchArea;
	}
	public void setMatchArea(JTextField matchArea) {
		this.matchArea = matchArea;
	}
	public JTextField getMatchTeamOne() {
		return matchTeamOne;
	}
	public void setMatchTeamOne(JTextField matchTeamOne) {
		this.matchTeamOne = matchTeamOne;
	}
	public JTextArea getjTextAreaTime() {
		return jTextAreaTime;
	}
	public void setjTextAreaTime(JTextArea jTextAreaTime) {
		this.jTextAreaTime = jTextAreaTime;
	}
	public JTextArea getjTextAreaMoney() {
		return jTextAreaMoney;
	}
	public void setjTextAreaMoney(JTextArea jTextAreaMoney) {
		this.jTextAreaMoney = jTextAreaMoney;
	}
	public JTextArea getjTextAreaHasTiche() {
		return jTextAreaHasTiche;
	}
	public void setjTextAreaHasTiche(JTextArea jTextAreaHasTiche) {
		this.jTextAreaHasTiche = jTextAreaHasTiche;
	}
	public JTextField getMatchTeamTwo() {
		return matchTeamTwo;
	}
	public void setMatchTeamTwo(JTextField matchTeamTwo) {
		this.matchTeamTwo = matchTeamTwo;
	}
	public JTextField getKillUser() {
		return killUser;
	}
	public void setKillUser(JTextField killUser) {
		this.killUser = killUser;
	}
	public JTextField getWhichUser() {
		return whichUser;
	}
	public void setWhichUser(JTextField whichUser) {
		this.whichUser = whichUser;
	}
	public JTextField getWhichMatch() {
		return whichMatch;
	}
	public void setWhichMatch(JTextField whichMatch) {
		this.whichMatch = whichMatch;
	}
	public JButton getIsThisUser() {
		return isThisUser;
	}
	public void setIsThisUser(JButton isThisUser) {
		this.isThisUser = isThisUser;
	}
	public JButton getIsThisMatch() {
		return isThisMatch;
	}
	public void setIsThisMatch(JButton isThisMatch) {
		this.isThisMatch = isThisMatch;
	}
	public JButton getAddMatch() {
		return addMatch;
	}
	public void setAddMatch(JButton addMatch) {
		this.addMatch = addMatch;
	}
	public JLabel getjLabelUserPicture() {
		return jLabelUserPicture;
	}
	public void setjLabelUserPicture(JLabel jLabelUserPicture) {
		this.jLabelUserPicture = jLabelUserPicture;
	}
	public JButton getjButtonUserPicture() {
		return jButtonUserPicture;
	}
	public void setjButtonUserPicture(JButton jButtonUserPicture) {
		this.jButtonUserPicture = jButtonUserPicture;
	}
	public JLabel getjLabelTellMatchChange() {
		return jLabelTellMatchChange;
	}
	public void setjLabelTellMatchChange(JLabel jLabelTellMatchChange) {
		this.jLabelTellMatchChange = jLabelTellMatchChange;
	}
	public JLabel getjLabelTellMatchToAdd() {
		return jLabelTellMatchToAdd;
	}
	public void setjLabelTellMatchToAdd(JLabel jLabelTellMatchToAdd) {
		this.jLabelTellMatchToAdd = jLabelTellMatchToAdd;
	}
	public JLabel getjLabelTellUserToKill() {
		return jLabelTellUserToKill;
	}
	public void setjLabelTellUserToKill(JLabel jLabelTellUserToKill) {
		this.jLabelTellUserToKill = jLabelTellUserToKill;
	}
	public JLabel getjLabelTellChangeMoney() {
		return jLabelTellChangeMoney;
	}
	public void setjLabelTellChangeMoney(JLabel jLabelTellChangeMoney) {
		this.jLabelTellChangeMoney = jLabelTellChangeMoney;
	}
	public JLabel getjLabelTellChangeTime() {
		return jLabelTellChangeTime;
	}
	public void setjLabelTellChangeTime(JLabel jLabelTellChangeTime) {
		this.jLabelTellChangeTime = jLabelTellChangeTime;
	}
	public JLabel getjLabelTellChangeTeamOne() {
		return jLabelTellChangeTeamOne;
	}
	public void setjLabelTellChangeTeamOne(JLabel jLabelTellChangeTeamOne) {
		this.jLabelTellChangeTeamOne = jLabelTellChangeTeamOne;
	}
	public JLabel getjLabelTellChangeTeamTwo() {
		return jLabelTellChangeTeamTwo;
	}
	public void setjLabelTellChangeTeamTwo(JLabel jLabelTellChangeTeamTwo) {
		this.jLabelTellChangeTeamTwo = jLabelTellChangeTeamTwo;
	}
	public JLabel getjLabelTellChangeUser() {
		return jLabelTellChangeUser;
	}
	public void setjLabelTellChangeUser(JLabel jLabelTellChangeUser) {
		this.jLabelTellChangeUser = jLabelTellChangeUser;
	}
	public JRadioButton getIsHot() {
		return isHot;
	}
	public void setIsHot(JRadioButton isHot) {
		this.isHot = isHot;
	}
	public JLabel getjLabelTellChangeArea() {
		return jLabelTellChangeArea;
	}
	public void setjLabelTellChangeArea(JLabel jLabelTellChangeArea) {
		this.jLabelTellChangeArea = jLabelTellChangeArea;
	}
	public JLabel getjLabelTellChangeIsHot() {
		return jLabelTellChangeIsHot;
	}
	public void setjLabelTellChangeIsHot(JLabel jLabelTellChangeIsHot) {
		this.jLabelTellChangeIsHot = jLabelTellChangeIsHot;
	}
}
