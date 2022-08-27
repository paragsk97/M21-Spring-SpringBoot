package com.cg.springioc;

public class Airtel implements Sim 
{
	

	public Airtel() {
		super();
		System.out.println("Constructor-Airtel");
	}

	public void calling() 
	{
		System.out.println("Caliing using Airtel sim");
		
	}

	public void data() 
	{
		System.out.println("Browsing using Airtel sim");
		
	}

}
