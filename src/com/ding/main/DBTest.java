package com.ding.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] arg){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Success loading Mysql Driver!");
		}catch(Exception e) {
			System.out.println("Error loading Mysql Driver");
			e.printStackTrace();
		}
		
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","liaodings");
			System.out.println("Success connect Mysql server!");
		    Statement stmt = connect.createStatement();
		    ResultSet rs = stmt.executeQuery("select * from city");		                                                             
		    while (rs.next()) {
		        System.out.println(rs.getString("Name"));
		    }
		 
		} catch(Exception e) {
			System.out.println("get data error");
			e.printStackTrace();
		}
	}
}
