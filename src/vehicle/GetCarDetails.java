package vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetCarDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","root");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from cardetails");
			System.out.println("Below are the car details..");
			while(rs.next()) {
				System.out.println("ID :"+rs.getInt(1));
				System.out.println("Color:"+rs.getString(2));
				System.out.println("Brand:"+rs.getString(3));
				System.out.println("Cost:"+rs.getString(4));
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
