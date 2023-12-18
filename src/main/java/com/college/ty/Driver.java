package com.college.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext conf=new ClassPathXmlApplicationContext("conf.xml");
	
		ConfigurableApplicationContext conf1=new ClassPathXmlApplicationContext("conf1.xml");
		
		
		Teacher teacher=(Teacher)conf.getBean("teacher");
		teacher.teacher();
		
		Student student=(Student)conf1.getBean("student");
		student.student();    
		
		
	}
}
