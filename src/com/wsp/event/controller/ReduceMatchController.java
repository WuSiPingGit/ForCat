package com.wsp.event.controller;

import com.wsp.event.service.impl.ReduceMatchServiceImpl;
/**
 * ɾ������
 * @author WSP
 */
public class ReduceMatchController {
	ReduceMatchServiceImpl reduce = new ReduceMatchServiceImpl();
	/**
	 * 
	 * @param matchId ������
	 * @return �Ƿ�ɹ�
	 */
	public boolean reduceMatch(int matchId) {
		return reduce.reduceMatch(matchId);
	}
}
