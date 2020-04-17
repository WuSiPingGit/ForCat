package com.wsp.event.dao.impl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * ��ȡresultset
 */
import com.wsp.event.common.MysqlLanguageCommon;
import com.wsp.event.util.GetPreparenStatementUtil;;
public class GetResultFromMysqlDaoImpl {
	private MysqlLanguageCommon mlc = new MysqlLanguageCommon();
	private ResultSet rs = null;
	private GetPreparenStatementUtil get = new GetPreparenStatementUtil();
	public GetResultFromMysqlDaoImpl() {}
	/**
	 * ����
	 * @param table
	 * id��
	 * @param count
	 * �����
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
	 * ����
	 * @param table
	 * ����
	 * @param idName
	 * �˺�
	 * @param count
	 * �����
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
	 * Ҫ���ֵ
	 * @param check
	 * ����
	 * @param table
	 * ս��
	 * @param nameOne
	 * @param nameTwo
	 * �����
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
