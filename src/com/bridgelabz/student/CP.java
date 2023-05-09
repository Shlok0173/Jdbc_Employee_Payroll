package com.bridgelabz.student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

 static	Connection con;
	
	
	public static Connection create() throws IOException{
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String Name="root";
		String Password="Shlok@9202";
		String Url="jdbc:mysql://localhost:3306/payroll_service";
		
		con=DriverManager.getConnection(Url, Name, Password);
		System.out.println("Connected SusscessFull");
		
		}catch(Exception e) {
			e.getMessage();
		}
		return con;
	}
}
