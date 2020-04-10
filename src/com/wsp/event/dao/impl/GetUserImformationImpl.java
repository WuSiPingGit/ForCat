package com.wsp.event.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wsp.event.common.ForMysqlName;
import com.wsp.event.common.MysqlLanguage;
import com.wsp.event.dao.GetUserImformation;
import com.wsp.event.entity.UserImfornation;
import com.wsp.event.util.CollecteMysqlUtil;
/**
 * 
 * @author WSP
 * @Date 2020Äê4ÔÂ9ÈÕ
 */
public class GetUserImformationImpl implements GetUserImformation{

	@Override
	public UserImfornation getUserImformation(int id) {
		Connection conn = CollecteMysqlUtil.getConnection();
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		MysqlLanguage mysqlLanguage = new MysqlLanguage();
		ForMysqlName forMysqlName = new ForMysqlName();
		UserImfornation userImfornation = new UserImfornation();
		try {
			preparedStatement = conn.prepareStatement(mysqlLanguage.getSelect(forMysqlName.getLoadUser(), forMysqlName.getLoadUserId()));
			preparedStatement.setInt(forMysqlName.getOne(), id);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				userImfornation.setIsVip(resultSet.getBoolean(forMysqlName.getTwo()));
				userImfornation.setMoney(resultSet.getInt(forMysqlName.getThree()));
				if (resultSet.getString(forMysqlName.getFour())!=null) {
					userImfornation.setMyTeam(resultSet.getString(forMysqlName.getFour()));
				}
				userImfornation.setPic(resultSet.getBinaryStream(forMysqlName.getFiva()));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userImfornation;
	}
}
