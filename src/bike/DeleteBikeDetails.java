package bike;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteBikeDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID:");
		int id=s.nextInt();
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","root");
			PreparedStatement p=c.prepareStatement("delete from bikedetails where id=?");
			p.setInt(1, id);
			//p.execute();
			p.executeUpdate();
			c.close();
			p.close();
			System.out.println("Data deleted successfully");
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
