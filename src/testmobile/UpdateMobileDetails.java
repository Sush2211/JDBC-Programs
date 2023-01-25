package testmobile;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateMobileDetails {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
//			CallableStatement cs=c.prepareCall("update mobiledetails set brand='oppo' where id=3");
			CallableStatement cs=c.prepareCall("update mobiledetails set color=? where id=?");
			cs.setString(1, "yellow");
			cs.setInt(2, 4);
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
