package com.aug;

import java.sql.Connection;
 import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver class loaded and registered");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root","root");
			//System.out.println("Connection established");
			Statement s=c.createStatement();
			//System.out.println("Platform Created");
			s.execute("Insert into mobile values(9,'oppo','red')");
			System.out.println("Data inserted successfully");
			c.close();
			s.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception handled");
		}
	}
	

}
                                                             