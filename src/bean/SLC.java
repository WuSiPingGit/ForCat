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
 * ���ٴ��볤����SLC����:SaveLaodComposement;
 * ��½�������
 */
public class SLC{
	private SLC() {}
	/*
	 *���ò��
	 */
	public static JDialog forError = new JDialog();
	/*
	 * laod��������
	 */
	public static JPanel allJpanel = new JPanel();
	public static JPanel laodJpanel = new JPanel();
	public static JPanel fogetCiperJpanel = new JPanel();
	public static JPanel newUserJpanel = new JPanel();
	public static JPanel newUserJpanelOne = new JPanel();
	public static JPanel newUserJpanelTwo = new JPanel();
	/*
	 * laodѡ�����
	 */
	public static JRadioButton asMassager  = new JRadioButton("����Ա");
	public static JButton fgc = new JButton("��������");
	public static JButton newUser = new JButton("ע��");
	public static JButton laod = new JButton("��½");
	public static JLabel showLOLLaod = new JLabel("��ӭ����Ӣ�ۿ�ջ");
	public static JLabel count = new JLabel("�˺�");
	public static JLabel ciper = new JLabel("����");
	public static JLabel pct = new JLabel();
	/*
	 * laod�˺������������
	 */
	public static JTextField inputCounter = new JTextField(15);
	public static JTextField userCiper = new JTextField(15);
	
	/*
	 * ע��ҳ��1���
	 */
	public static JButton back = new JButton("����");
	public static JButton goOn = new JButton("����");
	public static JLabel showLOLNewUser = new JLabel("��ӭע��Ӣ�ۿ�ջ");
	public static JLabel ciperNewUser = new JLabel("����");
	public static JLabel reCiper = new JLabel("ȷ������");
	public static JLabel name = new JLabel("����");
	public static JLabel  tellNameRuler = new JLabel("����1~8��Ӣ�����ּ�_���Ҳ������������");
	public static JLabel  tellRuler = new JLabel("��ֻ������Ӣ����ĸ�����֣���ֻ��λ8~16λ");
	public static JLabel pic = new JLabel();
	public static JLabel pic1 = new JLabel();
	public static JTextField userCiperNewUser = new JTextField(16);
	public static JTextField reUserCiperNewUser = new JTextField(16);
	public static JTextField userName = new JTextField(15);
	public static JPanel jp1 = new JPanel();
	/*
	 * ע��ҳ���
	 */
	public static JLabel ciperQuestion = new JLabel("�ܱ�����");
	public static JLabel ciperAnswer = new JLabel("�ܱ���");
	public static JLabel reCiperAnswer = new JLabel("ȷ���ܱ���");
	public static JLabel tellCiperQuetionRuler = new JLabel("������20����֮��������磨A������");
	public static JLabel tellCiperAnswerRuler = new JLabel("������20���ֽ�֮��Ĵ��磨��������");
	public static JLabel tellYourCount = new JLabel("�����˺ţ�����������£�");
	public static JLabel thisYourCount = new JLabel(""+SMFL.newUserCount);
	public static JButton finishIt = new JButton("���");
	public static JButton goOnNewUserOne = new JButton("����");
	public static JButton returnLaodNewUser = new JButton("��ס�ˣ����ڷ��ص�½ҳ��");
	public static JTextField userQuestion = new JTextField(22);
	public static JTextField reUserAnswer= new JTextField(22);
	public static JTextField userAnswer = new JTextField(22);
	/*
	 *��������ģ�� 
	 */
	public static JLabel tellYouCanDo = new JLabel("��������Ļ���");
	public static JLabel youAnswer = new JLabel("�ܱ��𰸣�");
	public static JLabel youQuestion  = new JLabel("�ܱ����⣺");
	public static JLabel youCount = new JLabel("�����˺ţ�");
	public static JLabel thisYouFindCiper = new JLabel(""+SMFL.hasFindCiper);
	public static JLabel thisYourQuestion = new JLabel(SMFL.forgetCiper);
	public static JTextField youQuestionS = new JTextField(20);          
	public static JTextField youAnserS = new JTextField(20);         
	public static JTextField youCountInput = new JTextField(20);
	public static JButton checkInputCount = new JButton("OK");
	public static JButton backOut = new JButton("����");
	public static JButton OK = new JButton("ȷ��");
	public static JButton returnLaod = new JButton("��ס�ˣ����ڷ��ص�½ҳ��");
	/*
	 * ���ģʽ��ʼ��
	 */
	static{
		showLOLNewUser = SetWord.setLabel(showLOLNewUser, Color.blue, Color.blue, new Font("����",Font.PLAIN,30));
		showLOLLaod = SetWord.setLabel(showLOLLaod, Color.BLUE, Color.blue, new Font("����",Font.PLAIN, 30));
		tellRuler = SetWord.setLabel(tellRuler, Color.darkGray, Color.blue, new Font("����",Font.PLAIN, 10));
		tellNameRuler = SetWord.setLabel(tellNameRuler, Color.darkGray, Color.blue, new Font("����",Font.PLAIN, 10));
		thisYouFindCiper = SetWord.setLabel(thisYouFindCiper, Color.GREEN, Color.green, new Font("����",Font.PLAIN,18));
		thisYourCount = SetWord.setLabel(thisYouFindCiper, Color.GREEN, Color.green, new Font("����",Font.PLAIN,18));
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
