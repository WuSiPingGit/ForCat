package com.wsp.event.controller;

import com.wsp.event.service.impl.ChangeMoneyServiceImpl;
/**
 * ∏ƒ±‰’Àªß”‡∂Ó
 * @author WSP
 */
public class ChangeMoneyController {
	ChangeMoneyServiceImpl ch = new ChangeMoneyServiceImpl();
	/**
	 * 
	 * @param count ’À∫≈
	 * @param money ”‡∂Ó
	 */
	public void changeMoney(int count, int money) {
		ch.changeMoney(count, money);
	}
}
