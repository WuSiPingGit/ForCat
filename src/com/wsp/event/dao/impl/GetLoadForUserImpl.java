package com.wsp.event.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wsp.event.common.ForMysqlName;
import com.wsp.event.common.MysqlLanguage;
import com.wsp.event.dao.GetLoadForUser;
import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.util.CollecteMysqlUtil;
/**
 * 
 * @author WSP
 * @Date 2020Äê4ÔÂ9ÈÕ
 */
public class GetLoadForUserImpl implements GetLoadForUser {
	public LoadUser getLoadUserInSql(int id) {
	 	LoadUser loadUser= new LoadUser();
		PreparedStatement ps = null;
		ResultSet rs = null;
	 	Connection conn =  CollecteMysqlUtil.getConnection();
	 	ForMysqlName forMysqlName = new ForMysqlName();
		String sql = new MysqlLanguage().getSelect(forMysqlName.getLoadUser(),forMysqlName.getLoadUserId());
	 	try {
			ps= conn.prepareStatement(sql);
			ps.setInt(forMysqlName.getOne(), id);
			rs = ps.executeQuery();
			if (rs.next()) {
				String ciper = rs.getString(forMysqlName.getThree());
				boolean canLoad = rs.getBoolean(forMysqlName.getFour());
				Date lastTryTime = rs.getDate(forMysqlName.getFiva());
				int hasTry = rs.getInt(forMysqlName.getSix());
				String question = rs.getString(forMysqlName.getSeven());
				String answer = rs.getString(forMysqlName.getEight());
				String name = rs.getString(forMysqlName.getTwo());
				loadUser.setUserAnswer(answer);
				loadUser.setUserQuestion(question);
				loadUser.setUserChange(hasTry);
				loadUser.setUserDate(lastTryTime);
				loadUser.setUserCiper(ciper);
				loadUser.setUserCanLoad(canLoad);
				loadUser.setName(name);
			} else {
				loadUser.setUserQuestion("WRONG OF YOUR INPUT");
				loadUser.setUserAnswer(null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loadUser;
	}

	@Override
	public LoadMassager getLoadMassagerInSql(int id) {
		LoadMassager loadMassager = new LoadMassager();
		PreparedStatement ps = null;
		ResultSet rs = null;
	 	Connection conn =  CollecteMysqlUtil.getConnection();
	 	ForMysqlName forMysqlName = new ForMysqlName();
		String sql = new MysqlLanguage().getSelect(forMysqlName.getLoadMassager(),forMysqlName.getLoadMassagerId());
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(forMysqlName.getOne(), id);
			rs = ps.executeQuery();
			if (rs.next()) {
				loadMassager.setMassagerCiper(rs.getString(forMysqlName.getOne()));
			}
		} catch (SQLException e) {
			if (rs!=null) {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		}
		try {
			if (rs!=null) {
				rs.close();	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loadMassager;
	}
}
