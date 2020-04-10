package com.wsp.event.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
 * 创建数据库连接
 * @author WSP
 * @Date 2020年4月5日
 */
public class CollecteMysqlUtil {
	private CollecteMysqlUtil() {}
	private static Connection conn;
	static{
		 Properties p = new Properties();
		try {
			p.load(new FileInputStream("src/com/wsp/event/collectionsql.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	String driver = p.getProperty("driver");
	String host = p.getProperty("host");
	String user = p.getProperty("user");
	String ciper = p.getProperty("ciper");
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(host,user,ciper);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			if (conn!=null) {
				try {
					conn.close();
					System.exit(0);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	
	public static Connection getConnection() {
		return conn;
	}
}
