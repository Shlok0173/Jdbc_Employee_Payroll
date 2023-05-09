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
System.out.println("PRESS 3 DElETE THE DATA");
System.out.println("PRESS 4 EXIST");

int choice=Integer.parseInt(br.readLine());

if(choice == 1) {
	System.out.println("Enter User Name");
	String name=br.readLine();
	
	System.out.println("Enter User Salary");
	double salary=Double.parseDouble(br.readLine());
			
	System.out.println("Enter User StartDate");
	String start_date=br.readLine();
	
	System.out.println("Enter User Gender");
	String gender=br.readLine();
	
	StudentInformation st=new StudentInformation(name,salary,start_date,gender);
	
	  boolean answer=  StudentDao.insertStudentToDb(st);
	if(answer) {
		System.out.println("Student Added SuccessFull");
	}else {
		System.out.println(" Student Added Fail");
	}
	System.out.println(st);
}
}
}
}
