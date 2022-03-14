package com.selenium.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Student stu = (Student)context.getBean("student");
	Student hola = (Student)context.getBean("hola");
	Student vamos = (Student)context.getBean("vamos");

		stu.displayinfo();
		hola.displayinfo();
		vamos.displayinfo();
	}

}
