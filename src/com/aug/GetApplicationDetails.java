package com.aug;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetApplicationDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root","root");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from mobile");
			System.out.println("Below are the mobile details..");
			while(rs.next()) {
				System.out.println("ID:"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Color:"+rs.getString(3));
				System.out.println("-------------------------");
			}
			c.close();
			s.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
