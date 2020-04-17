package com.wsp.event.dao.impl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wsp.event.common.ForMysqlNameCommon;
import com.wsp.event.common.MysqlLanguageCommon;
import com.wsp.event.dao.GetLoadForUser;
import com.wsp.event.entity.LoadMassager;
import com.wsp.event.entity.LoadUser;
import com.wsp.event.util.GetPreparenStatementUtil;
/**
 * 获取用户登录信息
 * @author WSP
 */
public class GetLoadForUserImpl implements GetLoadForUser {
	/**
	 * 用户账号
	 * @param id
	 * 返回用户信息
	 * @return user
	 */
	public LoadUser getLoadUserInSql(int id) {
	 	LoadUser loadUser= new LoadUser();
		ResultSet rs = null;
		GetResultFromMysqlDaoImpl getRs = new GetResultFromMysqlDaoImpl();
	 	ForMysqlNameCommon forMysqlNameCommon = new ForMysqlNameCommon();
	 	try {
			rs = getRs.getResult("load_user", "id", id);
			if (rs.next()) {
				loadUser.setUserAnswer( rs.getString(forMysqlNameCommon.getEight()));
				loadUser.setUserQuestion(rs.getString(forMysqlNameCommon.getSeven()));
				loadUser.setUserChange(rs.getInt(forMysqlNameCommon.getSix()));
				loadUser.setUserDate(rs.getDate(forMysqlNameCommon.getFiva()));
				loadUser.setUserCiper(rs.getString(forMysqlNameCommon.getThree()));
				loadUser.setUserCanLoad(rs.getBoolean(forMysqlNameCommon.getFour()));
				loadUser.setName(rs.getString(forMysqlNameCommon.getTwo()));
				rs.close();
			} else {
				if (rs!=null) {
					rs.close();
				}
				loadUser.setUserQuestion("WRONG OF YOUR INPUT");
				loadUser.setUserAnswer(null);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 	try {
	 		if (getRs.getResultSet()!=null) {
				getRs.getResultSet().close();
			}if (getRs.getGetPreparementStatement()!=null&&getRs.getGetPreparementStatement().getConn()!=null) {
				getRs.getGetPreparementStatement().getLinkMysqlDao().closeConnection(getRs.getGetPreparementStatement().getConn());
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return loadUser;
	}

	
	/**
	 * 
	 * @param id
	 * @return ciper
	 */
	@Override
	public LoadMassager getLoadMassagerInSql(int id) {
		LoadMassager loadMassager = new LoadMassager();
		PreparedStatement ps = null;
		ResultSet rs = null;
		ForMysqlNameCommon forMysqlNameCommon = new ForMysqlNameCommon();
		GetPreparenStatementUtil getPs = new GetPreparenStatementUtil();
		String sql = new MysqlLanguageCommon().getSelect(forMysqlNameCommon.getLoadMassager(),forMysqlNameCommon.getLoadMassagerId());
		try {
			ps =getPs.getPreparedStatement(sql);
			ps.setInt(forMysqlNameCommon.getOne(), id);
			rs = ps.executeQuery();
			if (rs.next()) {
				loadMassager.setMassagerCiper(rs.getString(forMysqlNameCommon.getOne()));
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
			if (getPs.getConn()!=null) {
				getPs.getLinkMysqlDao().closeConnection(getPs.getConn());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loadMassager;
	}
}
