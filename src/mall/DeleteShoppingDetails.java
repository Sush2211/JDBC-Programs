package mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteShoppingDetails {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded and registered");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mall","root","root");
			System.out.println("connection established");
			Statement s=c.createStatement();
			System.out.println("Platform created");
			s.execute("delete from shopping where id=3");
			System.out.println("Data deleted successfully");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
