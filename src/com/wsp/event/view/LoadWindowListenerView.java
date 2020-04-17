package com.wsp.event.view;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.wsp.event.bean.SetNewUser;
import com.wsp.event.common.ForFinalStructCommon;
import com.wsp.event.controller.CheckAndLoadController;
import com.wsp.event.controller.GetLoadUserController;
import com.wsp.event.controller.GetNewUserCountController;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.util.CheckMassagerUtil;
import com.wsp.event.util.MakeCiperSafeUtil;
/**
 * 
 * @author WSP
 * @Date 2020��4��6��
 */

public class LoadWindowListenerView {
	//��֤�Ƿ�Ϊ����Ա
	private boolean isMassager = false;
	//�˺ż��
	private String checkCount = "^[0-9]+$";
	//����
	private String toCheckName = "^[\u4e00-\u9fa5_0-9a-zA-Z]+$";
	//����
	private String toCheckCiper = "^[0-9a-zA-Z]+$";
	//����ʹ�
	private String toCheckQuestion = "^[\u4e00-\u9fa5_0-9a-zA-Z��������.,!?]+$";
	private String toCheckAnswer = "^[\u4e00-\u9fa5_0-9a-zA-Z��������.,!?]+$";
	private JFrame jf;
	private CardLayout forAllJpanel; 
	private CardLayout forNewUserJpanel;
	private LoadComposementView lc;
	private String loadCiper;
	GetLoadUserController gluls = new GetLoadUserController();
	LoadUser user = new LoadUser();
	private boolean checkCiperLength = false;
	private String loadCount = "";
	private boolean checkCountLength = false;
	//�����ཨ��
	ForFinalStructCommon ffs = new ForFinalStructCommon();
	public LoadWindowListenerView(CardLayout forAllJpanel, CardLayout forNewUserJpanel, LoadComposementView lc, JFrame jf) {
		this.forAllJpanel = forAllJpanel;
 		this.forNewUserJpanel = forNewUserJpanel;
 		this.lc = lc;
 		this.jf = jf;
 	}
 		
 	public void setLoadCiper(String loadCiper) {
		this.loadCiper = loadCiper;
	}
 		
 	public boolean getCheckCiperLength() {
		return this.checkCiperLength;
	}
 		
 	public boolean getCheckCountLength() {
		return this.checkCountLength;
	}
 		
 	public String getLoadCount() {
		return this.loadCount;
	}		
		/*
		 * �˺ų��ȼ��
		 */
 		public class DoActionCountCheck implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				loadCount = lc.youCountInput.getText();
				checkCountLength  = CheckMassagerUtil.doCheckMassager(loadCount, loadCount, ffs.COUNT_LENGTH, ffs.COUNT_LENGTH, true);	
				if (checkCiperLength) {
					
				}
			}	
 		}
 		
 		
 		/*
 		 * �˺š����볤�ȼ��
 		 */
 		
		public void doCheck() {
			loadCount = lc.inputCounter.getText();
			loadCiper = lc.userCiper.getText();
			checkCountLength  = CheckMassagerUtil.doCheckMassager(loadCount, loadCount, ffs.COUNT_LENGTH, ffs.COUNT_LENGTH, true);
			checkCiperLength  = CheckMassagerUtil.doCheckMassager(loadCiper, loadCiper, ffs.CIPER_LENGTH_MIN, ffs.CIPER_LENGTH_MAX, true);
			if (checkCiperLength&&checkCountLength) {
				lc.laod.setEnabled(true);
			} else {
				lc.laod.setEnabled(false);
			}
		}
 	
 		public class DoKeyLaodCountCheck implements KeyListener{
			public void keyTyped(KeyEvent e) {
				doCheck();
			}
			public void keyPressed(KeyEvent e) {
				doCheck();
			}
			public void keyReleased(KeyEvent e) {
				doCheck();
			}		
		}
		public class DoMouseLaodCountCheck extends MouseAdapter{
			public void mouseClicked(MouseEvent e) {
				doCheck();
			}
			public void mousePressed(MouseEvent e) {
				doCheck();
			}
			public void mouseExited(MouseEvent e) {
				doCheck();
			}
		}		
		/*
		 * �����û�ע�����
		 */
		public class NewUserButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				forAllJpanel.next(lc.allJpanel);
			}
		}
		
		
		/*
		 *������������� 
		 */
		public class ForgetCiperButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				lc.youCountInput.setText(loadCount);
				forAllJpanel.first(lc.allJpanel);
			}
		}
		
		/*
		 * �Ż���ҳ�����
		 */
		public class GoToLaodButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				lc.inputCounter.setText(lc.youCountInput.getText());
				forAllJpanel.show(lc.allJpanel, "0");
			}
		}
		/*
		 * �ص�ע�����1
		 */
		public class GoToNewOneListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				forNewUserJpanel.show(lc.newUserJpanel, "0");
			}
		}
		
		/*
		 *��ȡ��֤����
		 */
		public class GetProblem implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				loadCount = lc.youCountInput.getText();
				if(CheckMassagerUtil.doCheckMassager(loadCount, checkCount, ffs.COUNT_LENGTH, ffs.COUNT_LENGTH, false)) {
					user = new LoadUser();
					if(user.getUserAnswer()==null) {
						int id = Integer.valueOf(loadCount);
						user = gluls.getLoadUserToView(id);
						if (user.getUserAnswer()!=null) {
							lc.thisYouFindCiper.setText(new MakeCiperSafeUtil().getTrueCiper(user.getUserCiper()));
							lc.hasOk.setEnabled(true);
						} else {
							lc.hasOk.setEnabled(false);
						}
					} else {
						lc.thisYourQuestion.setText("**WRONG**");
						lc.hasOk.setEnabled(false);
					  }
					lc.thisYourQuestion.setText(user.getUserQuestion());
				} else {
					lc.thisYourQuestion.setText("**WRONG**");
					lc.hasOk.setEnabled(false);
				  }
				lc.thisYourQuestion.setVisible(true);
			}
		}
		/*
		 * ��֤�𰸡���ȡ����
		 */
		class CheckTheAnswerInput implements ActionListener{
			public void actionPerformed(ActionEvent e) {	
				if (user.getUserAnswer()!=null) {
					if(user.getUserAnswer().equals(lc.youAnserS.getText())) {
						lc.thisYouFindCiper.setVisible(true);
						lc.returnLaod.setVisible(true);
						lc.youCount.setVisible(false);
						lc.youAnserS.setVisible(false);
						lc.backOut.setVisible(false);
						lc.hasOk.setVisible(false);
						lc.youCountInput.setEnabled(false);
						lc.checkInputCount.setVisible(false);
						lc.youAnswer.setVisible(false);
						lc.youQuestion.setVisible(false);
					} else {
						lc.thisYouFindCiper.setVisible(false);	
					}
				}
			}
		}
		
		/* 
		 *���һ�������˵ķ�������½ҳ�� 
		 */
		class ForForgetCiperGoBack implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				lc.youCount.setVisible(true);
				lc.youAnserS.setVisible(true);
				lc.backOut.setVisible(true);
				lc.hasOk.setVisible(true);
				lc.youCountInput.setEnabled(true);
				lc.checkInputCount.setVisible(true);
				lc.youAnswer.setVisible(true);
				lc.youQuestion.setVisible(true);
				lc.thisYouFindCiper.setVisible(true);	
				lc.returnLaod.setVisible(false);
				lc.thisYouFindCiper.setVisible(false);
				lc.youAnserS.setText(null);
				lc.thisYourQuestion.setText(null);
				user = new LoadUser();
				forAllJpanel.show(lc.allJpanel, "0");
			}
		}

		/*
		 * ���˺�(��ע�����2)
		 */
		class ForGoOnAtNewUser implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				boolean checkName = false;
				boolean[] checkCiper = new boolean[2];
				checkCiper[0] = checkCiper[1] = false;
				checkName = CheckMassagerUtil.doCheckMassager(lc.userName.getText(), toCheckName, ffs.NAME_LENGTH_MIN, ffs.NAME_LENGTH_MAX, false);
				checkCiper = CheckMassagerUtil.doCheckMassager(lc.userCiperNewUser.getText(), toCheckCiper, lc.reUserCiperNewUser.getText(), ffs.CIPER_LENGTH_MIN, ffs.CIPER_LENGTH_MAX, false);
				if (checkName&&checkCiper[0]&&checkCiper[1]) {
					forNewUserJpanel.show(lc.newUserJpanel, "1");
				}
			}	
		}
		
		/*
		 * ȷ��д���û����������˺�
		 */
		class ForNewUserToGetCount implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				boolean checkQuestion = false;
				boolean[] checkAnswer = new boolean[2];
				checkAnswer[0] = checkAnswer[1] = false;
				checkQuestion = CheckMassagerUtil.doCheckMassager(lc.userQuestion.getText(), toCheckQuestion, ffs.QUESTION_LENGTH_MIN, ffs.QUESTION_LENGTH_MAX, false);
				checkAnswer = CheckMassagerUtil.doCheckMassager(lc.userAnswer.getText(), toCheckAnswer, lc.reUserAnswer.getText(), ffs.ANSWER_LENGTH_MIN, ffs.ANSWER_LENGTH_MAX, false);
				if (checkQuestion&&checkAnswer[0]&&checkAnswer[1]) {
					LoadUser loadUser = new LoadUser();
					loadUser = new SetNewUser(loadUser, lc).setNewUser();
					int youCount =111;
					youCount = new GetNewUserCountController().getNewCount(loadUser); 
					lc.thisYourCount.setText(""+youCount);
					lc.thisYourCount.setVisible(true);
					lc.ciperQuestion.setVisible(false);
					lc.ciperAnswer.setVisible(false);
					lc.reCiperAnswer.setVisible(false);
					lc.tellCiperAnswerRuler.setVisible(false);
					lc.tellCiperQuetionRuler.setVisible(false);
					lc.userQuestion.setVisible(false);
					lc.userAnswer.setVisible(false);
					lc.returnLaodNewUser.setVisible(false);
					lc.finishIt.setVisible(false);
					lc.goOnNewUserOne.setVisible(true);
				}
			}	
		}
		/*
		 * 
		 */
		class GOBackToLoadForNewUser implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				lc.thisYourCount.setVisible(true);
				lc.ciperQuestion.setVisible(false);
				lc.ciperAnswer.setVisible(false);
				lc.reCiperAnswer.setVisible(false);
				lc.tellCiperAnswerRuler.setVisible(false);
				lc.tellCiperQuetionRuler.setVisible(false);
				lc.userQuestion.setVisible(false);
				lc.userAnswer.setVisible(false);
				lc.returnLaodNewUser.setVisible(false);
				lc.finishIt.setVisible(false);
				lc.goOnNewUserOne.setVisible(true);
				lc.userCiperNewUser.setText(null);;
				lc.reUserCiperNewUser.setText(null);
				lc.userQuestion.setText(null);
				lc.userAnswer.setText(null);
				lc.reUserAnswer.setText(null);
				lc.userName.setText(null);
				forAllJpanel.show(lc.allJpanel, "0");
			}
		}
		
		
		/*
		 * ��֤�Ƿ�Ϊ����Ա��½
		 */
		class MassagerListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				if (isMassager) {
					isMassager = false;
				} else {
					isMassager = true;
				}
			}
		}
		/*
		 * ��֤��½��ȷ�Ϻ�ע����½��壬����������
		 */
	class HasLoad implements ActionListener{
			public void actionPerformed(ActionEvent e) {	
				String ciper = lc.userCiper.getText();
				String count = lc.inputCounter.getText();
				boolean hasPass = false;
				boolean load = false;
				if (isMassager) {
					if(CheckMassagerUtil.doCheckMassager(count, checkCount, ffs.MASSAGER_COUNT_LENGTH_MIN, ffs.MASSAGER_COUNT_LENGTH_MAX, false)) {
						if (CheckMassagerUtil.doCheckMassager(ciper, toCheckCiper, ffs.MASSAGER_CIPER_LENGTH_MIN, ffs.MASSAGER_CIPER_LENGTH_MAX,false)) {
							hasPass = true;
						}
					}
				} else {
					if(CheckMassagerUtil.doCheckMassager(count, checkCount, ffs.COUNT_LENGTH, ffs.COUNT_LENGTH, false)) {
						if (CheckMassagerUtil.doCheckMassager(ciper, toCheckCiper, ffs.CIPER_LENGTH_MIN, ffs.CIPER_LENGTH_MAX,false)) {
							hasPass = true;
						}
					}
				}
				if (hasPass) {
					int id = Integer.parseInt(count);
					CheckAndLoadController checkAndLoadController = new CheckAndLoadController();
					load = checkAndLoadController.checkAndLoad(id, ciper, isMassager);
				}
				if (load&&isMassager) {
					jf.dispose();
				} else if (load) {
					jf.dispose();
				}
			}
	}
		
}
