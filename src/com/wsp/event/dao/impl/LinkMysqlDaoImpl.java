package com.wsp.event.dao.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Properties;
/**
 * �������ӳ�
 * @author WSP
 */
public class LinkMysqlDaoImpl {
	public LinkMysqlDaoImpl() {}
	private int maxLink = 12;
	private int minLink = 4;
	private int extend = 2;
	private int count;
	private Connection conn;
	private Properties p = new Properties();
	private String driver;
	private String host;
	private String user;
	private String ciper;
	private LinkedList<Connection> linkedList = new LinkedList<Connection>();
	/*
	 * ��������
	 */
	private boolean createConnection() {
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
		return conn!=null;
	}
	/*
	 * ��ʼ�����ӳ�
	 */
	private void createLinkList() {
		for(int i=0;i<minLink;i++) {
			if (createConnection()) {
				linkedList.add(conn);
				count++;
				conn = null;
			}
		}
	}
	
	/*
	 * ��չ���ӳ�
	 */
	private void extendLinkList() {
		if (count>=maxLink) {
			return;
		}
		for(int i=0;i<extend;i++) {
			if (count==maxLink) {
								System.out.println(count);
				break;
			} else {
				if (createConnection()) {
					linkedList.add(conn);
					conn = null;
					System.out.println(i);
					count ++;
				}
			}
		}
	}
	/*
     * ��������
     */
	private void reduceLink() {
		while(count>minLink) {
			try {
				linkedList.removeLast().close();
				count --;
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	} 
	/*
	 * ʹ������
	 */
	public Connection getConnection() {
		if (count>0) {
			count--;
			return linkedList.removeFirst();
		} else {
			extendLinkList();
			if (count>0) {
				count--;
				return linkedList.removeFirst();
			}
			else
				return null;
		}
	}
	/**
	 * Ҫ���յ�����
	 * @param connection
	 */
	public void closeConnection(Connection connection) {
		if (count<maxLink&&connection!=null) {
			count++;
			linkedList.add(connection);
		} else {
			reduceLink();
		}	
	}
	/*
	 * ��ʼ��
	 */
	{
		try {
			p.load(new FileInputStream("src/com/wsp/event/collectionsql.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	driver = p.getProperty("driver");
	host = p.getProperty("host");
	user = p.getProperty("user");
	ciper = p.getProperty("ciper");
	createLinkList();
	}
}
