package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) 
	{
		//Agenda : Spring Inversion of Control (IOC) 
		//1.We should not touch the source code
		//2. This application should be configurable
		//hard coding
		
		//For Airtel class methods
		/*Airtel a = new Airtel();
		a.calling();
		a.data();*/
		
		//For Jio class methods
		/*Jio j = new Jio();
		j.calling();
		j.data();*/
		
		@SuppressWarnings("resource")
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded....");
		/*Airtel ai = (Airtel)a.getBean("Airtel");
		ai.calling();
		ai.data();*/
		
		/*Jio j = (Jio)a.getBean("Jio");
		j.calling();
		j.data();*/
		
		Sim s = a.getBean("sim",Sim.class);
		s.calling();
		s.data();
		
		Sim s1 = a.getBean("sim1",Sim.class);
		s1.calling();
		s1.data();

	}

}
