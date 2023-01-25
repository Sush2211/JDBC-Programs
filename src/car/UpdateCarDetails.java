package car;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateCarDetails {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/car","root","root");
//			CallableStatement cs=c.prepareCall("update cardetails set color='orange' where id=2");
			CallableStatement cs=c.prepareCall("update cardetails set color=? where id=?");
			cs.setString(1, "Grey");
			cs.setInt(2, 3);
			cs.execute();
			c.close();
			cs.close();
			System.out.println("Data updated successfully..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
