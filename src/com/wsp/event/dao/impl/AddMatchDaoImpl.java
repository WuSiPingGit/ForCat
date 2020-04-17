package com.wsp.event.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wsp.event.common.MysqlLanguageCommon;
import com.wsp.event.entity.MatchImformation;
import com.wsp.event.util.GetPreparenStatementUtil;
/**
 * �����ɹ�����ݿ�
 * @author WSP
 */
public class AddMatchDaoImpl {
	PreparedStatement ps = null;
	/**
	 * ������Ϣ
	 * @param match
	 * ��ȡPrepareStatement����
	 * @param get
	 * �����Ƿ�ɹ�
	 * @return
	 */
		public int addMatch(MatchImformation match, GetPreparenStatementUtil get) {
			try {
			ps = get.getPreparedStatement(new MysqlLanguageCommon().getInsertMatch());
			ps.setString(1, match.getMatchTeamOne());
			ps.setString(2, match.getMatchTeamTwo());
			ps.setString(3, match.getDetailLocation());
			ps.setFloat(4, match.getMoney());
			ps.setDate(5, match.getMatchTime());
			ps.setInt(6, match.getMatchAllTrick());
			ps.setInt(7, match.getMatchHasTrick());
			int i = ps.executeUpdate();
			ps.close();
			return i;
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
				return -1;
			}
		}
}
