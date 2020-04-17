package com.wsp.event.controller;

import java.util.LinkedList;

import com.wsp.event.entity.MatchImformation;
import com.wsp.event.service.impl.GetMatchServiceImpl;

public class GetMatchController {
	private GetMatchServiceImpl getMatchServiceImpl = new GetMatchServiceImpl();
	public LinkedList<MatchImformation> getMatch(String check) {
		return getMatchServiceImpl.getMatch(check);
	}
}
