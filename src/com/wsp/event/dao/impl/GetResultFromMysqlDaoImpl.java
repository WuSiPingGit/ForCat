package com.wsp.event.dao.impl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 获取resultset
 */
import com.wsp.event.common.MysqlLanguageCommon;
import com.wsp.event.util.GetPreparenStatementUtil;;
public class GetResultFromMysqlDaoImpl {
	private MysqlLanguageCommon mlc = new MysqlLanguageCommon();
	private ResultSet rs = null;
	private GetPreparenStatementUtil get = new GetPreparenStatementUtil();
	public GetResultFromMysqlDaoImpl() {}
	/**
	 * 表名
	 * @param table
	 * id名
	 * @param count
	 * 结果集
	 * @return
	 */
	public ResultSet getResult(String table, String count) {
		try {
			rs = get.getPreparedStatement(mlc.getSelect(table, count)).executeQuery();
			return rs;
		} catch (SQLException e) {
			if (get.getConn()!=null) {
				get.getLinkMysqlDao().closeConnection(get.getConn());
			}
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 表名
	 * @param table
	 * 表名
	 * @param idName
	 * 账号
	 * @param count
	 * 结果集
	 * @return
	 */
	public ResultSet getResult(String table, String idName, int count) {
		try {
			rs = get.getPreparedStatement(mlc.getSelect(table, idName), count).executeQuery();
			return rs;
		} catch (SQLException e) {
			if (get.getConn()!=null) {
				get.getLinkMysqlDao().closeConnection(get.getConn());
			}
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 要查的值
	 * @param check
	 * 表名
	 * @param table
	 * 战队
	 * @param nameOne
	 * @param nameTwo
	 * 结果集
	 * @return
	 */
	public ResultSet getResult(String check, String table, String nameOne, String nameTwo) {
		try {
			PreparedStatement ps;
			ps = get.getPreparedStatement(mlc.getSelect(table, nameOne, nameTwo));
			ps.setString(1, check);
			ps.setString(2, check);
			rs = ps.executeQuery();
			return rs;
		} catch (SQLException e) {
			if (get.getConn()!=null) {
				get.getLinkMysqlDao().closeConnection(get.getConn());
			}
			e.printStackTrace();
		}
		return null;
	}
	
	public GetPreparenStatementUtil getGetPreparementStatement() {
		return get;
	}
	
	public ResultSet getResultSet() {
		return rs;
	}
}
