package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.CheckMoneyImpl;
/**
 * �ı����
 * @author WSP
 */
public class ChangeMoneyServiceImpl {
	CheckMoneyImpl cm = new CheckMoneyImpl(); 
	/**
	 * �˺�
	 * @param count
	 * �ı����
	 * @param money
	 */
	public void changeMoney(int count, int money) {
		cm.checkMoney(count, money);
	}
}
