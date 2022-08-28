package com.cg.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Human human = c.getBean("human",Human.class);
		human.startPumping();
	}

}
