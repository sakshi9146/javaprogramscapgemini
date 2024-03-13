package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecordBAsedOnId {

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
		
		System.out.println("Enter id");
		 int id = sc.nextInt();
		 System.out.println("Enter the Fees amount ");
		 int fees=sc.nextInt();
	 
		 String sqlsel="select * from student where sid ="+id;
		 
		 rs=stmt.executeQuery(sqlsel);
		 if(rs.next()) {
		 
			 String sql = "UPDATE student SET sfees = " + fees + " WHERE sid = " + id;

		 
		 int i =stmt.executeUpdate(sql);
		 //for delete and update and insert use execute update()
		 //for select use executeQuerey()
		 
		 if(i>0) {
			 System.out.println("Record is updated");
		 }else {
			 System.out.println("Not updated");
		 }}
		 else {
			 System.out.println("Student id not exist");
		 }


	}

}
