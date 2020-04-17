package com.wsp.event.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.wsp.event.common.InputCheckModelCommon;
import com.wsp.event.controller.AddNewMatchController;
import com.wsp.event.controller.ChangeMoneyController;
import com.wsp.event.controller.GetMatchController;
import com.wsp.event.controller.ReduceMatchController;
import com.wsp.event.entity.MatchImformation;
import com.wsp.event.entity.TabelEntity;
import com.wsp.event.service.impl.GetMatchServiceImpl;

/**
 * ������
 * @author WSP
 * @Date 2020��4��10��
 */
public class HelloWindowListenerView {
	//���
	private String money;
	//����ս��
	private String checkTeam;
	//����ս���б�
	private LinkedList<MatchImformation> linkedList = new LinkedList<MatchImformation>(); 
	//�Ƿ�����һҳ
	private Boolean canNext = true;
	//�Ƿ�����һҳ
	private Boolean canLast = false;
	//��ȡ����
	private int isStand = 0;
	private int maxStand;
	//д�����
	private Vector<Object> vector = null;
	private MatchImformation mf;
	//
	
	//������ʽ
	private InputCheckModelCommon inputCheckModel = new InputCheckModelCommon(); 
	
	GetMatchController getMatch = new GetMatchController();
	
	private HelloWindowComposementView hwc;
	private final int beVipMoney = 30;
	public HelloWindowListenerView(HelloWindowComposementView hwc) {
		this.hwc = hwc; 
	}
	
	
	/*
	 * ���ض�ս
	 */
	public void checkMatch(String checkTheTeam) {
		linkedList = null;
		hwc.getModel().setRowCount(0);
		linkedList = getMatch.getMatch("%"+checkTheTeam+"%");
		if (linkedList.size()>0) {
			hwc.getForAlljPanel().show(hwc.getjPanelAll(), "2");
			maxStand = linkedList.size();
			if (maxStand>7) {
				canNext = true;
			} else {
				canNext = false;
			}
			System.out.println(maxStand+"\t"+canNext);
			for(isStand = 0;isStand<7&&isStand<maxStand;isStand++) {
				mf = linkedList.get(isStand);
				vector = new Vector<>();
				vector.add(mf.getMatchId());
				vector.add(mf.getMatchTime());
				vector.add(mf.getMatchTeamOne()+"vs"+mf.getMatchTeamTwo());
				vector.add(mf.getMoney());
				vector.add(mf.getMatchHasTrick());
				vector.add(hwc.getBuy());
				hwc.getModel().addRow(vector);
			}
		} else {
			JOptionPane.showConfirmDialog(null, "δ�ҵ�������������", "!",JOptionPane.YES_NO_OPTION); 
		}
	}
	/*
	 * ��ֵvip
	 */
	public class ToBeVipListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String money = hwc.getjLabelMoney().getText();		
			int n = JOptionPane.showConfirmDialog(null, "ȷ�ϳ�ֵ?", "����",JOptionPane.YES_NO_OPTION); //����ֵΪ0��1
			if (n==1&&Integer.valueOf(money)>beVipMoney) {
				hwc.getjLabelCount().setText(""+(Integer.valueOf(money)-beVipMoney));
				//�ı����˻����
				new ChangeMoneyController().changeMoney(1, (Integer.valueOf(money)-beVipMoney));;
				JOptionPane.showConfirmDialog(null, "�ɹ�", "!",JOptionPane.YES_OPTION); 
			} else {
				JOptionPane.showConfirmDialog(null, "ʧ��", "!",JOptionPane.YES_OPTION); 
			}
		}
	}
	/*
	 * ��ѯս��
	 */
	public class CheckTeam implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			hwc.getjButtonToUpdateTwo().setVisible(false);
			hwc.getjButtonToUpdate().setVisible(true);
			String checkTeam = hwc.getTextField().getText();
			//����check
			if (!checkTeam.equals("%")) {
				checkMatch(checkTeam);
			} else {
				JOptionPane.showConfirmDialog(null, "����", "!",JOptionPane.YES_OPTION); 
			}
		}
	}
	/*
	 * ��һҳ
	 */
	public class NextPart implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (canNext) {
				hwc.getModel().setRowCount(0);
				for(int i=0;i<7&&isStand<maxStand;isStand++,i++) {
					vector = new Vector<>();
					mf = linkedList.get(isStand);
					vector.add(mf.getMatchId());
					vector.add(mf.getMatchTime());
					vector.add(mf.getMatchTeamOne()+"vs"+mf.getMatchTeamTwo());
					vector.add(mf.getMoney());
					vector.add(mf.getMatchHasTrick());
					vector.add(hwc.getBuy());
					hwc.getModel().addRow(vector);
				}
				if (maxStand-isStand>=7) {
					canNext = true;
				} else {
					canNext = false;
				}
			} else {
				JOptionPane.showConfirmDialog(null, "�����", "!",JOptionPane.YES_OPTION); 
			}
		}
	}
	/*
	 * ��һҳ
	 */
	public class LastPart implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (isStand>7) {
				canLast = true;
			} else {
				canLast = false;
			}
			if (canLast) {
				isStand = isStand-hwc.getModel().getRowCount();
				hwc.getModel().setRowCount(0);
				for(int i=0;i<7;i++) {
					mf = linkedList.get(isStand-7+i);
					vector = new Vector<>();
					vector.add(mf.getMatchId());
					vector.add(mf.getMatchTime());
					vector.add(mf.getMatchTeamOne()+"vs"+mf.getMatchTeamTwo());
					vector.add(mf.getMoney());
					vector.add(mf.getMatchHasTrick());
					vector.add(hwc.getBuy());
					hwc.getModel().addRow(vector);
				}
				canNext = true;
			} else {
				JOptionPane.showConfirmDialog(null, "��ǰ��", "!",JOptionPane.YES_OPTION);
			}
		}
	}
	/*
	 * ��������1
	 */
	public class UpdateListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String checkTeam = hwc.getTextField().getText();
			//����check
			checkMatch(checkTeam);
		}
	}
	/*
	 * ��������2
	 */
	public class UpdateListenerTwo implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
			//����check
			checkMatch("");														
		}
	}
	/*
	 * �˻���Ϣ����
	 */
	
	/*
	 * �û�����Ʊ��
	 */
	
	/*
	 * �û���Ʊ
	 */
	
	/*
	 * ����Ա�����ս
	 */
	public class AddMatchListner implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
			String money = hwc.getMatchMoney().getText();
			String area = hwc.getMatchArea().getText();
			String teamOne = (String) hwc.getMatchTeamOne().getSelectedItem();
			String teamTwo = (String)hwc.getMatchTeamTwo().getSelectedItem();
			String time = hwc.getMatchTime().getText();
			String allTicke = hwc.getMatchAllTicke().getText();
			String hasTicke = hwc.getMatchHasTicke().getText();
			int lookCanInt = 0;
			if (money.matches(inputCheckModel.getMoney())&&(area==null||area.matches(inputCheckModel.getArea()))) {
				lookCanInt++;
				if (time.matches(inputCheckModel.getDateTime())&&!time.matches(inputCheckModel.getDate())) {
					lookCanInt++;
					if (teamOne!=null&&teamTwo!=null&&!teamOne.equals(teamTwo)&&allTicke.matches(inputCheckModel.getTicke())&&hasTicke.matches(inputCheckModel.getTicke())) {
						lookCanInt++;
						int allTickeNumber = Integer.valueOf(allTicke);
						float moneyNumber = Float.valueOf(money);
						int hasTickeNumber = Integer.valueOf(hasTicke);
						if (hasTickeNumber<=allTickeNumber) {
							lookCanInt++;
							ParsePosition pos = new ParsePosition(0);  
							SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");
							java.util.Date date = formatter.parse(time, pos);
							Date datetime = new java.sql.Date(date.getTime());
							boolean ok = new AddNewMatchController().addNewMatch(teamOne, teamTwo, area, moneyNumber, allTickeNumber, hasTickeNumber, datetime);
							if (ok) {
								JOptionPane.showConfirmDialog(null, "���", "!",JOptionPane.YES_OPTION);
							} else {
								JOptionPane.showConfirmDialog(null, "ʧ��", "!",JOptionPane.YES_OPTION);
							}
						}					
					}
				}
			} 
			if (lookCanInt!=4) {
				JOptionPane.showConfirmDialog(null, "��������", "!",JOptionPane.YES_OPTION);
			}
		}
	}
	/*
	 *����Ա ɾ����ս
	 */
	public class ReduceMatchListner implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
			String matchIdString = hwc.getWhichMatch().getText();
			if (matchIdString.matches(inputCheckModel.getTicke())) {
				if (new ReduceMatchController().reduceMatch(Integer.valueOf(matchIdString))) {
					JOptionPane.showConfirmDialog(null, "�ɹ�", "!",JOptionPane.YES_OPTION);
				} else {
					JOptionPane.showConfirmDialog(null, "��������", "!",JOptionPane.YES_OPTION);
				}
			} else {
				JOptionPane.showConfirmDialog(null, "��������", "!",JOptionPane.YES_OPTION);
			}
				
		}
	}
	/*
	 * ����Ա���Ķ�ս
	 */
	public class ChangeMatchListner implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
			String matchIdString = hwc.getWhichMatch().getText();
			if (matchIdString.matches(inputCheckModel.getTicke())) {
				
			}
		}
	}
	/*
	 * �򿪸�ҳ��
	 */
	public class ChangJpanelFirst implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			hwc.getForAlljPanel().show(hwc.getjPanelAll(), "0");
		}
	} 
	public class ChangJpanelMassager implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			hwc.getForAlljPanel().show(hwc.getjPanelAll(), "3");
		}
	} 
	public class ChangJpanelUser implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			hwc.getForAlljPanel().show(hwc.getjPanelAll(), "1");
		}
	}
	public class ChangJpanelMatch implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			hwc.getModel().setRowCount(0);
			hwc.getjButtonToUpdateTwo().setVisible(true);
			hwc.getjButtonToUpdate().setVisible(false);
			checkMatch("");
		}
	} 
}
