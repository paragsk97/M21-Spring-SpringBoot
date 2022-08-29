package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStarterProjectApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringStarterProjectApplication.class, args);
		/*String str = "Welcome to Spring REST";
		System.out.println(str);
		Employee e = new Employee();
		e.print();*/
		
		//Using Spring IOC
		/*Employee e = context.getBean(Employee.class);
		e.print();*/
		
		HelloController h = context.getBean(HelloController.class);
		System.out.println(h.print());
		
	}

}
