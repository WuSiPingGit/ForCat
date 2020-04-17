package com.wsp.event.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.wsp.event.common.ForMysqlNameCommon;
import com.wsp.event.common.MysqlLanguageCommon;
import com.wsp.event.dao.GetNewCountFromSql;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.util.GetPreparenStatementUtil;
/**
 * 获取新账号
 * @author WSP
 */
public class GetNewCountFromSqlImpl implements GetNewCountFromSql{
	private MysqlLanguageCommon mysqlLanguageCommon = new MysqlLanguageCommon();
	private ForMysqlNameCommon forMysqlNameCommon = new ForMysqlNameCommon();
	private GetPreparenStatementUtil getPs = new GetPreparenStatementUtil();
	private GetPreparenStatementUtil getPsOne = new GetPreparenStatementUtil();
	private PreparedStatement preparedStatement = null;
	private PreparedStatement st = null;
	private ResultSet resultSet = null;
	/**
	 * 输入账户信息
	 * 返回账号
	 */
	public int getNewCountFromSql(LoadUser loadUser) {
			try {
				preparedStatement = getPs.getPreparedStatement(mysqlLanguageCommon.getInsert());
				preparedStatement.setString(forMysqlNameCommon.getOne(), loadUser.getName());
				preparedStatement.setString(forMysqlNameCommon.getTwo(), loadUser.getUserCiper());
				preparedStatement.setDate(forMysqlNameCommon.getThree(), loadUser.getUserDate());
				preparedStatement.setString(forMysqlNameCommon.getFour(), loadUser.getUserQuestion());
				preparedStatement.setString(forMysqlNameCommon.getFiva(), loadUser.getUserAnswer());
				if (preparedStatement.executeUpdate()>0) {
					st = getPsOne.getPreparedStatement(mysqlLanguageCommon.getSelectMax());
					resultSet = st.executeQuery();
					if (resultSet.next()) {
						int id = resultSet.getInt(new ForMysqlNameCommon().getOne());
						if (preparedStatement!=null) {
							preparedStatement.close();
						}
						if (resultSet!=null) {
							resultSet.close();
						}
						return id;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				if (preparedStatement!=null) {
					try {
						preparedStatement.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				if (resultSet!=null) {
					try {
						resultSet.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
			if (getPs!=null) {
				getPs.getLinkMysqlDao().closeConnection(getPs.getConn());
			}
			if (getPsOne.getConn()!=null) {
				getPsOne.getLinkMysqlDao().closeConnection(getPsOne.getConn());
			}
		return 0;
	}
}
