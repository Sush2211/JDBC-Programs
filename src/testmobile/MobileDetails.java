package testmobile;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MobileDetails {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
			//CallableStatement cs=c.prepareCall("Insert into mobiledetails values(01,'vivo','white')");
//			CallableStatement cs=c.prepareCall("Insert into mobiledetails values(02,'oneplus','blue')");
//			CallableStatement cs=c.prepareCall("Insert into mobiledetails values(03,'redmi','black')");
			CallableStatement cs=c.prepareCall("Insert into mobiledetails values(04,'iphone','red')");
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
