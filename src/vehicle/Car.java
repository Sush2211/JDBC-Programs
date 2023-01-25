package vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Car {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle", "root", "root");
			Statement s=c.createStatement();
//			s.execute("Insert into cardetails values(01,'Black','Audi','1cr')");
//			s.execute("Insert into cardetails values(02,'Black','BMW','1cr')");
//			s.execute("Insert into cardetails values(03,'','Audi','4cr')");
     		s.execute("Insert into cardetails values(05,'Red','Rangerover','1cr')");
			c.close();
			s.close();
			System.out.println("Data inserted successfully");
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
