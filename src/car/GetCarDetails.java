package car;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetCarDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","root");
			CallableStatement cs=c.prepareCall("select * from cardetails");
			System.out.println("Below are the car details..");
			ResultSet rs=cs.executeQuery();
			while(rs.next()) {
				System.out.println("ID :"+rs.getInt(1));
				System.out.println("Brand :"+rs.getString(2));
				System.out.println("Color :"+rs.getString(3));
				System.out.println("---------------------------");
			}
			c.close();
			cs.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
