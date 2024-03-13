package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectbasedOnId {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
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
		
		System.out.println("Enter id");
		 int id = sc.nextInt();
		 
		 
		 String sql ="select * from student where sid="+id;
		 
		 
		 rs= stmt.executeQuery(sql);
		 System.out.println("Id\tName\tEmail\tfees");
		 if(rs.next()) {
			  id = rs.getInt("sid");
			 String name =rs.getString("sname");
			 String email = rs.getString("semail");
			 float fees = rs.getFloat("sfees");
			 
			 System.out.println(id+"\t"+name+"\t"+email+"\t"+fees);
		 }
		 else {
			 System.out.println("Student ID not exists");
		 }
	}

}
