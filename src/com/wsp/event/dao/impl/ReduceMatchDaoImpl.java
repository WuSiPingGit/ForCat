package com.wsp.event.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wsp.event.common.MysqlLanguageCommon;
import com.wsp.event.util.GetPreparenStatementUtil;
/**
 * ɾ������
 * @author WSP
 */
public class ReduceMatchDaoImpl {
	int i;
	GetPreparenStatementUtil get = new GetPreparenStatementUtil();
	MysqlLanguageCommon ml = new MysqlLanguageCommon();
	PreparedStatement ps = null;
	/**
	 * �˺�id
	 * @param matchId
	 * �Ƿ�ɹ�
	 * @return
	 */
	public int reduceMatch(int matchId) {
		ps = get.getPreparedStatement(ml.isDelect("matches", ""+matchId));
		try {
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		get.getLinkMysqlDao().closeConnection(get.getConn());
		try {
			if (ps!=null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return i;
	}
}
