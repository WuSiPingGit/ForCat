package com.wsp.event.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wsp.event.common.MysqlLanguageCommon;
import com.wsp.event.util.GetPreparenStatementUtil;
/**
 * 删除比赛
 * @author WSP
 */
public class ReduceMatchDaoImpl {
	int i;
	GetPreparenStatementUtil get = new GetPreparenStatementUtil();
	MysqlLanguageCommon ml = new MysqlLanguageCommon();
	PreparedStatement ps = null;
	/**
	 * 账号id
	 * @param matchId
	 * 是否成功
	 * @return
	 */
	public int reduceMatch(int matchId) {
		ps = get.getPreparedStatement(ml.isDelect("matches", ""+matchId));
		try {
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		get.getLinkMysqlDao().closeConnection(get.getConn());
		try {
			if (ps!=null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return i;
	}
}
