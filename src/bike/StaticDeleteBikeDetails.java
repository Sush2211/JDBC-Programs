package bike;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StaticDeleteBikeDetails {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","root");
			PreparedStatement p=c.prepareStatement("delete from bikedetails where id=?");
			p.setInt(1, 7);
			p.executeUpdate();
			c.close();
			p.close();
			System.out.println("Data deleted successfully..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
