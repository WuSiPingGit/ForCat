package com.wsp.event.service.impl;

import java.util.LinkedList;

import com.wsp.event.dao.impl.GetMatchDaoImpl;
import com.wsp.event.entity.MatchImformation;
/**
 * ��ȡ������Ϣ
 * @author WSP
 */
public class GetMatchServiceImpl {
	GetMatchDaoImpl getMatchDaoImpl = new GetMatchDaoImpl();
	/**
	 * �����ѯ��Ϣ
	 * @param check
	 * ������Ϣ����
	 * @return
	 */
	public LinkedList<MatchImformation> getMatch(String check) {
		return getMatchDaoImpl.getMatch(check);
	}
}
