package com.object;

public class Car
{
    String name;
	int gare=1;
	int speed=0;
	
	public void setName(String newValue)
	{
		name=newValue;
	}
	
	public void changeGare(int newValue)
	{
		gare=newValue;
	}
	
	public void speedUp(int increment)
	{
		speed=speed+increment;
	}
	
	public void applyBreak(int decrement)
	{
		speed=speed-decrement;
	}
	
	public void print()
	{
		System.out.print("name: "+name+ " "+"gare: "+gare+ " "+ "speed: "+ speed);
	}
	
	
}
