package com.demo.util.db;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;
public final class SIngtenJdbc {
	static Properties properties=null;
	private SIngtenJdbc(){}
	private static SIngtenJdbc instance=null;
	public static SIngtenJdbc getInstance(){
		if(null ==instance){
			synchronized(SIngtenJdbc.class){
				if(null == instance){
					instance=new SIngtenJdbc();
				}
			}
		}
		return instance;
	}
	static{
		properties=new Properties();
		InputStream inpStream=SIngtenJdbc.class.
						getResourceAsStream("/com/demo/util/db/jdbc.properties");
		try {
			properties.load(inpStream);
			Class.forName(properties.getProperty("driver"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static  Connection getConnection() throws SQLException{
		return DriverManager.getConnection(properties.getProperty("url"),properties.
						getProperty("userName"),properties.getProperty("pwd"));
	}
	public static void close(ResultSet rs,PreparedStatement pStatement,Connection con){
		try {
			if(null !=rs)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(null !=pStatement)
					pStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}finally{
				try {
					if(null !=con)
						con.close();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		}
	}
	
}
