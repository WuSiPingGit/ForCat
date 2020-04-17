package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.CheckMoneyImpl;
/**
 * 改变余额
 * @author WSP
 */
public class ChangeMoneyServiceImpl {
	CheckMoneyImpl cm = new CheckMoneyImpl(); 
	/**
	 * 账号
	 * @param count
	 * 改变余额
	 * @param money
	 */
	public void changeMoney(int count, int money) {
		cm.checkMoney(count, money);
	}
}
