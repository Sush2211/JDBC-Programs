package com.aug;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) {
		//Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded and registered");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=rootpassword=root");
			System.out.println("Establish a connection");
			Statement stmt=con.createStatement();
			
		}catch(Exception e){
			//System.out.println("Handled");
			
			
		}
	}

}
