package bike;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateBikeDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Brand:");
		String brand=s.next();
		System.out.println("Enter ID:");
		int id=s.nextInt();
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","root");
			PreparedStatement p=c.prepareStatement("update bikedetails set brand=? where id=?");
			p.setString(1, brand);
			p.setInt(2, id);
			p.executeUpdate();
			//p.execute();
			c.close();
			p.close();
			System.out.println("Data updated successfully");
			
		} catch ( SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
