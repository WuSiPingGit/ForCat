package com.wsp.event.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wsp.event.common.MysqlLanguageCommon;
/**
 * �ı�һ������
 * @author WSP
 */
public class ChangeOneDaoImpl {
	private LinkMysqlDaoImpl linkMysqlDaoImpl = new LinkMysqlDaoImpl();
	private MysqlLanguageCommon mysqlLanguageCommon = new MysqlLanguageCommon();
	private Connection conn = null;
	/**
	 * ����
	 * @param table
	 * id��
	 * @param who
	 * �˺�
	 * @param count
	 * Ҫ�����
	 * @param money
	 */
	public void changeOne(String table, String who,int count, int money) {
		conn = linkMysqlDaoImpl.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(mysqlLanguageCommon.getUpdate(table, who));
			ps.setInt(0, money);
			ps.setInt(1, count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		linkMysqlDaoImpl.closeConnection(conn);
	}
}
