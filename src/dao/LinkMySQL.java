package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class LinkMySQL{
	public LinkMySQL(){}
	public static void main(String[] args) throws ClassNotFoundException, SQLException{		
	//加载类
	try{
	Class.forName("com.mysql.jdbc.Driver");
	// 建立连接
	Connection com = DriverManager.getConnection("jdbc:mysql://localhost:3306/first1","root","Wu19991008");
	String sql = "insert into user (name,id) values ('liubai'"+",1234532)";
		} catch (ClassNotFoundException e){
//			st.executeBatch();
//			com.commit();
//			st.close();
//			ps.close();
//			com.close();
		} catch (SQLException e) {
			
		}
	}
}
