package com.wsp.event.dao.impl;
/**
 * �ı�yue
 * @author WSP
 */
public class CheckMoneyImpl {
	ChangeOneDaoImpl ch = new ChangeOneDaoImpl();
	/**
	 * �˺�
	 * @param count
	 * Ҫ���yue
	 * @param money
	 */
	public void checkMoney(int count, int money) {
		ch.changeOne("user", "money", count, money);
	}
}
