package com.wsp.event.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wsp.event.common.MysqlLanguageCommon;
import com.wsp.event.entity.MatchImformation;
import com.wsp.event.util.GetPreparenStatementUtil;
/**
 * 加入比晒到数据库
 * @author WSP
 */
public class AddMatchDaoImpl {
	PreparedStatement ps = null;
	/**
	 * 比赛信息
	 * @param match
	 * 获取PrepareStatement对象
	 * @param get
	 * 返回是否成功
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
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				return -1;
			}
		}
}
