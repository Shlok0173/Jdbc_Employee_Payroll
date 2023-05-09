package com.bridgelabz.student;

public class EmployeeInformation {

private int id;
private String Name;
private double salary;
private String start_date;
private String gender;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}


public String getStart_date() {
	return start_date;
}


public void setStart_date(String start_date) {
	this.start_date = start_date;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public EmployeeInformation(int id, String name, double salary, String start_date, String gender) {
	super();
	this.id = id;
	Name = name;
	this.salary = salary;
	this.start_date = start_date;
	this.gender = gender;
}


public EmployeeInformation(String name, double salary, String start_date, String gender) {
	super();
	Name = name;
	this.salary = salary;
	this.start_date = start_date;
	this.gender = gender;
}




public EmployeeInformation(String name) {
	super();
	Name = name;
}


@Override
public String toString() {
	return "StudentInformation [id=" + id + ", Name=" + Name + ", salary=" + salary + ", start_date=" + start_date
			+ ", gender=" + gender + "]";
}


}