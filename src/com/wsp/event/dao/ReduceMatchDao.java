package com.wsp.event.dao;

import com.wsp.event.dao.impl.DelectOneDaoImpl;
/**
 * É¾³ý±ÈÈü
 * @author WSP
 */
public class ReduceMatchDao {
	Boolean hasReduce = false;
	DelectOneDaoImpl delect = new DelectOneDaoImpl();
	
	public boolean reduceMatch(int Matchid) {
		
		delect.delectOneDao("match", "match_id", Matchid);
	}
}	
