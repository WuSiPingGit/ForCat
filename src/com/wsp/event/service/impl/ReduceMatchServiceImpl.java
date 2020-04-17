package com.wsp.event.service.impl;

import com.wsp.event.dao.impl.ReduceMatchDaoImpl;
/**
 * 删除比赛信息
 * @author WSP
 */
public class ReduceMatchServiceImpl {
	ReduceMatchDaoImpl reduce = new ReduceMatchDaoImpl();
	/**
	 * 赛事id
	 * @param matchId
	 * 是否成功
	 * @return
	 */
	public boolean reduceMatch(int matchId) {
		if (reduce.reduceMatch(matchId)>0) {
			
			return true;
		}
		return false;
	}
}
