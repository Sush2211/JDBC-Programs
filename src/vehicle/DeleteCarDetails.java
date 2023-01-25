package vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteCarDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","root");
			Statement s=c.createStatement();
		//	s.execute("Delete from cardetails where color='black'");
			s.executeUpdate("Delete from cardetails where color='black'");
			System.out.println("Data deleted successfully");
			c.close();
			s.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
