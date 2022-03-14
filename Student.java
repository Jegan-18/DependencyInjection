package com.selenium.di;

public class Student {
    private  String studentName;
    private int id;
    private double salary;
    private String dept;
    
    
    
    public Student(int id) {
		
		this.id = id;
	}
   

	public Student(double salary, String dept) {
		super();
		this.salary = salary;
		this.dept = dept;
	}

	//injectionDependency using setter method
	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	



	public void displayinfo() {
  	  System.out.println("Student name " + studentName + " Id is " + id + " salary is " + salary + " dept is "+ dept);
    }

	
}
