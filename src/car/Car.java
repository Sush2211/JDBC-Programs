package car;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Car {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","root");
			//CallableStatement cs=c.prepareCall("Insert into cardetails values(1,'Renault','white')");
			CallableStatement cs=c.prepareCall("Insert into cardetails values(?,?,?)");
			cs.setInt(1, 3);
			cs.setString(2, "BMW");
			cs.setString(3, "Black");
			cs.execute();
			c.close();
			cs.close();
			System.out.println("Data inserted successfully..");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
