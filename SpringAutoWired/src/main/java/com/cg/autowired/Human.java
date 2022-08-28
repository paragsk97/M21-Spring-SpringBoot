package com.cg.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	private Heart heart;
	
	public Human()
	{
		this.heart = heart;
	}
	
	public Human(Heart heart) 
	{
		super();
		this.heart = heart;
	}
	@Autowired
	@Qualifier("heart")
	public void setHeart(Heart heart) 
	{
		this.heart = heart;
	}

	public void startPumping()
	{
		heart.pump();
		System.out.println("The name of your animal is : "+heart.getNameOfAnimal()+" and the no. of heart is : "+heart.getNoOfHeart());
	}

}
