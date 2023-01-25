package bike;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetBikeDetails {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","root");
			PreparedStatement p=c.prepareStatement("select * from bikedetails");
			ResultSet rs=p.executeQuery();
			System.out.println("Below are the Bike details..");
			while(rs.next()) {
				System.out.println("ID :"+rs.getInt(1));
				System.out.println("Brand :"+rs.getString(2));
				System.out.println("Color :"+ rs.getString(3));
				System.out.println("-------------------------------");
		
			}
			c.close();
			p.close();
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
