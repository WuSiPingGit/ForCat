package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.ReduceMatchDaoImpl;
/**
 * ɾ��������Ϣ
 * @author WSP
 */
public class ReduceMatchServiceImpl {
	ReduceMatchDaoImpl reduce = new ReduceMatchDaoImpl();
	/**
	 * ����id
	 * @param matchId
	 * �Ƿ�ɹ�
	 * @return
	 */
	public boolean reduceMatch(int matchId) {
		if (reduce.reduceMatch(matchId)>0) {
			
			return true;
		}
		return false;
	}
}
