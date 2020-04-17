package com.wsp.event.dao.impl;
/**
 * 改变yue
 * @author WSP
 */
public class CheckMoneyImpl {
	ChangeOneDaoImpl ch = new ChangeOneDaoImpl();
	/**
	 * 账号
	 * @param count
	 * 要变的yue
	 * @param money
	 */
	public void checkMoney(int count, int money) {
		ch.changeOne("user", "money", count, money);
	}
}
