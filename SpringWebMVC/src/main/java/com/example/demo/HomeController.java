package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //request and response from web 
public class HomeController 
{
	@RequestMapping("home")
	public String home()
	{
		System.out.println("Hey guys, Welcome to Java Full-Stack Program");
		return "Home.jsp";
	}

}
