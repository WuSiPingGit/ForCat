package com.wsp.event.controller;

import com.wsp.event.service.impl.ChangeMoneyServiceImpl;
/**
 * �ı��˻����
 * @author WSP
 */
public class ChangeMoneyController {
	ChangeMoneyServiceImpl ch = new ChangeMoneyServiceImpl();
	/**
	 * 
	 * @param count �˺�
	 * @param money ���
	 */
	public void changeMoney(int count, int money) {
		ch.changeMoney(count, money);
	}
}
