package com.ecommerce.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
//    private static String DB_URL = "jdbc:mysql://localhost:3306/fit_shop?useSSL=false&allowPublicKeyRetrieval=true";
    private static String DB_URL = "jdbc:postgresql://ec2-34-200-94-86.compute-1.amazonaws.com:5432/dbqcbst65b8kpe?useSSL=false";
    private static String USER_NAME = "gtptvpichaxouu";
    private static String PASSWORD = "df1ac50906d404cacf441f5a4f1386101b151bb7e05054f98f638027fe66324a";
	
	public static Connection getConnection()  {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return conn;
	}
	
	public static void main(String[] args) {
		Connection con = getConnection();
		if (con != null) {
			System.out.println("Success");
		}
	}

}
