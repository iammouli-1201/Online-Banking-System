package com.obs.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection provideConnection() {

		Connection conn = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		String url = "jdbc:mysql://localhost:3306/bank";

		try {
			conn = DriverManager.getConnection(url, "root", "Vasanth08@");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

}
