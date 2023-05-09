package com.bridgelabz.student;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {

	public static boolean insertStudentToDb( StudentInformation st) {
		 boolean f=false;
		try {
			
			Connection con=CP.create();
			String q="Insert into Employee_payroll(name,salary,start_date,gender) values(?,?,?,?)";
			
			//PreparedStatement
			
			  PreparedStatement psmt=con.prepareStatement(q);
			  psmt.setString(1,st.getName());
			  psmt.setDouble(2, st.getSalary());
			  psmt.setString(3, st.getStart_date());
			  psmt.setString(4, st.getGender());
			
			  // Excuted
			  
			  psmt.executeUpdate();
			  f=true;
		}catch(Exception e) {
			e.getMessage();
		}
		
		return f;
	}
}
