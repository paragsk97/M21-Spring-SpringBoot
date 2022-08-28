package com.cg.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student1 s = c.getBean("s3",Student1.class);
		s.cheating();
		
		AnotherStudent a = c.getBean("s4",AnotherStudent.class);
		a.startcheating();
	}
}
