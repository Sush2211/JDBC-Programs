package mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetShoppingDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded and registered");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mall","root","root");
			System.out.println("Connection established");
			Statement s=c.createStatement();
			System.out.println("Platform created");
			ResultSet rs=s.executeQuery("select * from shopping where id=1");
			System.out.println("Below are the shopping details..");
			while(rs.next()) {
				System.out.println("ID:"+rs.getInt(1));
				System.out.println("Game:"+rs.getString(2));
				System.out.println("Foodcourt:"+rs.getString(3));
				System.out.println("PVR:"+rs.getString(4));
				System.out.println("Parking:"+rs.getString(5));
				System.out.println("---------------------------------");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
