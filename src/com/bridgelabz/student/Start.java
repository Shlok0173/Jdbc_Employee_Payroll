package com.bridgelabz.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

public class Start {
	
public static void main(String args[]) throws IOException{
System.out.println("Welcome To StudentManagementApp");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true) {
System.out.println("PESS 1 ADD THE DATA");
System.out.println("PRESS 2 UPDAE THE DATA");
System.out.println("PRESS 3 DELETE THE DATA");
System.out.println("PRESS 4 EXIST");

int choice=Integer.parseInt(br.readLine());

if(choice == 1) {
	System.out.println("Enter Employee Name");
	String name=br.readLine();
	
	System.out.println("Enter Employee Salary");
	double salary=Double.parseDouble(br.readLine());
			
	System.out.println("Enter Employee StartDate");
	String start_date=br.readLine();
	
	System.out.println("Enter Employee Gender");
	String gender=br.readLine();
	
	EmployeeInformation st=new EmployeeInformation(name,salary,start_date,gender);
	
	  boolean answer=  EmployeeDao.insertEmployeeToDb(st);
	if(answer) {
		System.out.println("Employee Added SuccessFull");
	}else {
		System.out.println(" Employee Added Fail");
	}
	System.out.println(st);
	
}else if(choice==2) {
	System.out.println("Enter Employee name to update");
	String name=br.readLine();
	EmployeeInformation st=new EmployeeInformation(name);
	boolean answer=EmployeeDao.updateEmployeeToDb(st);
	if(answer) {
		System.out.println(" Update SuccessFull");
	}else {
		System.out.println(" Update fail");
	}
}
}
}
}
