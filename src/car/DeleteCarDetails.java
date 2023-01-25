package car;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteCarDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","root");
			//CallableStatement cs=c.prepareCall("delete from cardetails where id=2");
			CallableStatement cs=c.prepareCall("delete from cardetails where id=?");
			cs.setInt(1,3);
			cs.executeUpdate();
			c.close();
			cs.close();
			System.out.println("Data deleted successfully..");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
