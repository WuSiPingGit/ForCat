package com.wsp.event.controller;

import com.wsp.event.service.impl.ReduceMatchServiceImpl;
/**
 * 删除比赛
 * @author WSP
 */
public class ReduceMatchController {
	ReduceMatchServiceImpl reduce = new ReduceMatchServiceImpl();
	/**
	 * 
	 * @param matchId 比赛码
	 * @return 是否成功
	 */
	public boolean reduceMatch(int matchId) {
		return reduce.reduceMatch(matchId);
	}
}
