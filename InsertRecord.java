package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/batch10888db";
		String un="root";
		String pass="root";
		
		
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//load the driver
				Class.forName(driver);
				
				//make the connection
				conn = DriverManager.getConnection(url,un,pass);
				stmt = conn.createStatement();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id ,name,email,fees,age");
		int id = sc.nextInt();

		String name=sc.next();
		String email=sc.next();
		float fees =sc.nextFloat();
		int age =sc.nextInt();
		
		String sql ="insert into student values('" +id+ "', '" +name+ "', '" +email+ "', '" +fees+ "', '"+age+"')";
        
        int i = stmt.executeUpdate(sql);
        if(i>0) {
            System.out.println("Record is inserted");
        }else {
            System.out.println("Record is not inserted");
        }
		}

}
