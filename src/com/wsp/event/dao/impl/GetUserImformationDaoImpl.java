package com.wsp.event.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.wsp.event.common.ForMysqlNameCommon;
import com.wsp.event.common.MysqlLanguageCommon;
import com.wsp.event.dao.GetUserImformation;
import com.wsp.event.entity.UserImfornation;
/**
 * 获取账号信息
 * @author WSP
 */
public class GetUserImformationDaoImpl implements GetUserImformation{

	@Override
	/**
	 * 账号id
	 * 返回账号信息
	 */
	public UserImfornation getUserImformation(int id) {
		LinkMysqlDaoImpl linkMysqlDaoImpl = new LinkMysqlDaoImpl();
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		Connection conn = null;
		MysqlLanguageCommon mysqlLanguageCommon = new MysqlLanguageCommon();
		ForMysqlNameCommon forMysqlNameCommon = new ForMysqlNameCommon();
		UserImfornation userImfornation = new UserImfornation();
		try {
			conn = linkMysqlDaoImpl.getConnection();
			preparedStatement = conn.prepareStatement(mysqlLanguageCommon.getSelect(forMysqlNameCommon.getLoadUser(), forMysqlNameCommon.getLoadUserId()));
			preparedStatement.setInt(forMysqlNameCommon.getOne(), id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				userImfornation.setIsVip(resultSet.getBoolean(forMysqlNameCommon.getTwo()));
				userImfornation.setMoney(resultSet.getInt(forMysqlNameCommon.getThree()));
				if (resultSet.getString(forMysqlNameCommon.getFour())!=null) {
					userImfornation.setMyTeam(resultSet.getString(forMysqlNameCommon.getFour()));
				}
				userImfornation.setPic(resultSet.getBinaryStream(forMysqlNameCommon.getFiva()));
			}
			if (resultSet!=null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (preparedStatement!=null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if (conn!=null) {
			linkMysqlDaoImpl.closeConnection(conn);
		}
		return userImfornation;
	}
}
