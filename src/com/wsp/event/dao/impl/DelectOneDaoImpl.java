package com.wsp.event.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wsp.event.common.MysqlLanguageCommon;
/**
 * ɾ������
 * @author WSP
 */
public class DelectOneDaoImpl {
	LinkMysqlDaoImpl linkMysqlDaoImpl = new LinkMysqlDaoImpl();
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	MysqlLanguageCommon mc = new MysqlLanguageCommon();
	/**
	 * ����
	 * @param tableName
	 * Ҫɾ��id��
	 * @param idName
	 * �˺�
	 * @param count
	 */
	public void delectOneDao(String tableName, String idName, int count) {
		conn = linkMysqlDaoImpl.getConnection();
		try {
			preparedStatement = conn.prepareStatement(mc.isDelect(tableName, idName));
			preparedStatement.setInt(1, count);
			preparedStatement.execute();
			if (conn!=null) {
				linkMysqlDaoImpl.closeConnection(conn);
				conn = null;
			}
		} catch (SQLException e) {
			if (conn!=null) {
				linkMysqlDaoImpl.closeConnection(conn);
				conn = null;
			}
			e.printStackTrace();
		}
	}
}	
