package com.object;

public class TestCar
{

	public static void main(String[] args) 
	{
		Car c1=new Car();
		Car c2=new Car();
		
		c1.setName("Honda");
		c1.changeGare(5);
		c1.speedUp(50);
		c1.applyBreak(30);
		c1.print();
		
		System.out.println();
		
		c2.setName("Homda");
		c2.changeGare(4);
		c2.speedUp(10);
		c2.speedUp(20);
		c2.print();

	}

}
