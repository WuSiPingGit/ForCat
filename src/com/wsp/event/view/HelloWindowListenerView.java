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
 * 监听器
 * @author WSP
 * @Date 2020年4月10日
 */
public class HelloWindowListenerView {
	//余额
	private String money;
	//搜索战队
	private String checkTeam;
	//比赛战队列表
	private LinkedList<MatchImformation> linkedList = new LinkedList<MatchImformation>(); 
	//是否还有下一页
	private Boolean canNext = true;
	//是否有上一页
	private Boolean canLast = false;
	//读取进度
	private int isStand = 0;
	private int maxStand;
	//写入比赛
	private Vector<Object> vector = null;
	private MatchImformation mf;
	//
	
	//正则表达式
	private InputCheckModelCommon inputCheckModel = new InputCheckModelCommon(); 
	
	GetMatchController getMatch = new GetMatchController();
	
	private HelloWindowComposementView hwc;
	private final int beVipMoney = 30;
	public HelloWindowListenerView(HelloWindowComposementView hwc) {
		this.hwc = hwc; 
	}
	
	
	/*
	 * 返回对战
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
			JOptionPane.showConfirmDialog(null, "未找到，请重新输入", "!",JOptionPane.YES_NO_OPTION); 
		}
	}
	/*
	 * 充值vip
	 */
	public class ToBeVipListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String money = hwc.getjLabelMoney().getText();		
			int n = JOptionPane.showConfirmDialog(null, "确认充值?", "标题",JOptionPane.YES_NO_OPTION); //返回值为0或1
			if (n==1&&Integer.valueOf(money)>beVipMoney) {
				hwc.getjLabelCount().setText(""+(Integer.valueOf(money)-beVipMoney));
				//改变其账户余额
				new ChangeMoneyController().changeMoney(1, (Integer.valueOf(money)-beVipMoney));;
				JOptionPane.showConfirmDialog(null, "成功", "!",JOptionPane.YES_OPTION); 
			} else {
				JOptionPane.showConfirmDialog(null, "失败", "!",JOptionPane.YES_OPTION); 
			}
		}
	}
	/*
	 * 查询战队
	 */
	public class CheckTeam implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			hwc.getjButtonToUpdateTwo().setVisible(false);
			hwc.getjButtonToUpdate().setVisible(true);
			String checkTeam = hwc.getTextField().getText();
			//传入check
			if (!checkTeam.equals("%")) {
				checkMatch(checkTeam);
			} else {
				JOptionPane.showConfirmDialog(null, "错误", "!",JOptionPane.YES_OPTION); 
			}
		}
	}
	/*
	 * 下一页
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
				JOptionPane.showConfirmDialog(null, "最后了", "!",JOptionPane.YES_OPTION); 
			}
		}
	}
	/*
	 * 上一页
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
				JOptionPane.showConfirmDialog(null, "最前了", "!",JOptionPane.YES_OPTION);
			}
		}
	}
	/*
	 * 更新数据1
	 */
	public class UpdateListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String checkTeam = hwc.getTextField().getText();
			//传入check
			checkMatch(checkTeam);
		}
	}
	/*
	 * 更新数据2
	 */
	public class UpdateListenerTwo implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
			//传入check
			checkMatch("");														
		}
	}
	/*
	 * 账户信息更改
	 */
	
	/*
	 * 用户购买票据
	 */
	
	/*
	 * 用户退票
	 */
	
	/*
	 * 管理员加入对战
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
								JOptionPane.showConfirmDialog(null, "完成", "!",JOptionPane.YES_OPTION);
							} else {
								JOptionPane.showConfirmDialog(null, "失败", "!",JOptionPane.YES_OPTION);
							}
						}					
					}
				}
			} 
			if (lookCanInt!=4) {
				JOptionPane.showConfirmDialog(null, "输入有误", "!",JOptionPane.YES_OPTION);
			}
		}
	}
	/*
	 *管理员 删除对战
	 */
	public class ReduceMatchListner implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
			String matchIdString = hwc.getWhichMatch().getText();
			if (matchIdString.matches(inputCheckModel.getTicke())) {
				if (new ReduceMatchController().reduceMatch(Integer.valueOf(matchIdString))) {
					JOptionPane.showConfirmDialog(null, "成功", "!",JOptionPane.YES_OPTION);
				} else {
					JOptionPane.showConfirmDialog(null, "输入有误", "!",JOptionPane.YES_OPTION);
				}
			} else {
				JOptionPane.showConfirmDialog(null, "输入有误", "!",JOptionPane.YES_OPTION);
			}
				
		}
	}
	/*
	 * 管理员更改对战
	 */
	public class ChangeMatchListner implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
			String matchIdString = hwc.getWhichMatch().getText();
			if (matchIdString.matches(inputCheckModel.getTicke())) {
				
			}
		}
	}
	/*
	 * 打开各页面
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
