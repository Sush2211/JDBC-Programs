package mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class shopping {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded and registered");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mall","root","root");
			System.out.println("Connection established");
			Statement s=c.createStatement();
			System.out.println("Platform created");
//			s.execute("Insert into shopping values(01,'Bowling','KFC','Kantara','2wheeler')");
			s.execute("Insert into shopping values(02,'Archery','Starbucks','KGF','4wheeler')");
			s.execute("Insert into shopping values(03,'Topgolf','Tacobell','RRR','2wheeler')");
			s.execute("Insert into shopping values(04,'','MCDonalds','Vikram','2wheeler')");
			c.close();
			s.close();
			System.out.println("Data inserted successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
