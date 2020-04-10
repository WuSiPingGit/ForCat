package com.wsp.event.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.wsp.event.common.ForMysqlName;
import com.wsp.event.common.MysqlLanguage;
import com.wsp.event.dao.GetNewCountFromSql;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.util.CollecteMysqlUtil;

public class GetNewCountFromSqlImpl implements GetNewCountFromSql{
	public int getNewCountFromSql(LoadUser loadUser) {
		MysqlLanguage mysqlLanguage = new MysqlLanguage();
		ForMysqlName forMysqlName = new ForMysqlName();
		Connection conn = CollecteMysqlUtil.getConnection();
		PreparedStatement preparedStatement = null;
		Statement st = null;
		ResultSet resultSet = null;
		if (conn !=null) {
			try {
				preparedStatement = conn.prepareStatement(mysqlLanguage.getInsert());
				st = conn.createStatement();
				preparedStatement.setString(forMysqlName.getOne(), loadUser.getName());
				preparedStatement.setString(forMysqlName.getTwo(), loadUser.getUserCiper());
				preparedStatement.setDate(forMysqlName.getThree(), loadUser.getUserDate());
				preparedStatement.setString(forMysqlName.getFour(), loadUser.getUserQuestion());
				preparedStatement.setString(forMysqlName.getFiva(), loadUser.getUserAnswer());
				if (preparedStatement.executeUpdate()>0) {
					resultSet = st.executeQuery(mysqlLanguage.getSelectMax());
					if (resultSet.next()) {
						int id = resultSet.getInt(new ForMysqlName().getOne());
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
		}
		return 0;
	}
}
