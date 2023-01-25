package bike;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StaticBikeDetails {
	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","root");
			PreparedStatement p=c.prepareStatement("Insert into bikedetails values(?,?,?)");
			p.setInt(1, 2);
			p.setString(2, "KTM");
			p.setString(3, "Black");
			p.execute();
			c.close();
			p.close();
			System.out.println("Data Inserted successfully");
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
