package mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateShoppingDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded and registered");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mall","root","root");
			System.out.println("Connection established");
			Statement s=c.createStatement();
			System.out.println("Platform created");
			s.execute("update shopping set foodcourt='Burgerking' where id=1");
			s.execute("update shopping set parking='4wheeler' where id=3");
			c.close();
			s.close();
			System.out.println("Data updated successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
