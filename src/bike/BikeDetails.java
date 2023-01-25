package bike;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BikeDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id=s.nextInt();
		System.out.println("Enter Brand: ");
		String brand=s.next();
		System.out.println("Enter Color: ");
		String color=s.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","root");
			PreparedStatement p=c.prepareStatement("Insert into bikedetails values(?,?,?)");
			p.setInt(1, id);
			p.setString(2, brand);
			p.setString(3, color);
			p.execute();
			c.close();
			p.close();
			System.out.println("Data inserted successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
