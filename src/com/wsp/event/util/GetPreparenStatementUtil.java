package com.wsp.event.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.wsp.event.dao.impl.LinkMysqlDaoImpl;
/**
 * ��ȡPreparedStatement
 * @author WSP
 */
public class GetPreparenStatementUtil {
	private Connection conn;
	private LinkMysqlDaoImpl linkMysqlDaoImpl = new LinkMysqlDaoImpl();
	private PreparedStatement ps = null;
	/**
	 * ����sql���
	 * @param sql
	 * ����PreparedStatement
	 * @return
	 */
	public PreparedStatement getPreparedStatement(String sql) {
		conn = linkMysqlDaoImpl.getConnection();
		try {
			ps = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return ps;
	}

	public Connection getConn() {
		return conn;
	}

	public LinkMysqlDaoImpl getLinkMysqlDao() {
		return linkMysqlDaoImpl;
	}
	
	public PreparedStatement getPreparedStatement(String sql, int id) {
		conn = linkMysqlDaoImpl.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return ps;
	}
}
