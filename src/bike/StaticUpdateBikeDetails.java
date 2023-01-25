package bike;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StaticUpdateBikeDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","root");
			PreparedStatement p=c.prepareStatement("update bikedetails set color=? where id=?");
			p.setString(1, "black");
			p.setInt(2, 3);
			p.execute();
			c.close();
			p.close();
			System.out.println("Data updated successfully..");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
