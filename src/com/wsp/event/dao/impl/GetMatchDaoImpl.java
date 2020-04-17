package com.wsp.event.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.wsp.event.entity.MatchImformation;
/**
 * ��ȡ������Ϣ
 * @author WSP
 */
public class GetMatchDaoImpl {
	private GetResultFromMysqlDaoImpl getRs = new GetResultFromMysqlDaoImpl();
	private ResultSet rs = null;
	private MatchImformation[] mc = null;
	private LinkedList<MatchImformation> linkedList =null;
	/**
	 * Ҫ���ֵ
	 * @param check
	 * ���ر�����Ϣ��
	 * @return
	 */
	public LinkedList<MatchImformation> getMatch(String check) {
		rs = getRs.getResult(check,"matches", "match_tream_one", "match_tream_two");
		try {
			linkedList = new LinkedList<>();
			if (rs!=null) {
				rs.last();
				mc = new MatchImformation[rs.getRow()];
				for(int i=0;i<rs.getRow();i++)
					mc[i] = new MatchImformation();
				rs.beforeFirst();
			}
			int i = 0;
			while(rs.next()&&rs!=null){
				mc[i].setMatchId(rs.getInt(1));
				mc[i].setMatchHasTrick(rs.getInt(8));
				mc[i].setMatchTeamOne(rs.getString(2));
				mc[i].setMatchTeamTwo(rs.getString(3));
				mc[i].setMatchTime(rs.getDate(6));
				mc[i].setMoney(rs.getFloat(4));
				linkedList.add(mc[i]);
				i++;
			}
		} catch (SQLException e) {
			if (rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		getRs.getGetPreparementStatement().getLinkMysqlDao().closeConnection(getRs.getGetPreparementStatement().getConn());;
		return linkedList;
	}
}
