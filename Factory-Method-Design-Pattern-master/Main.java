package com.factorydesignpatern;
import java.util.*;  
public class Main
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Available Transportation Methods\n1.Road\n2.Sea\nChoose 1 or 2");  
		int a= sc.nextInt();  
		if(a==1)
		{
			FactoryPatternfordelivery deliver=new FactoryPatternfordelivery();
			
			deliverymode newdelivery=deliver.transportmode("road");
			newdelivery.delivery();
		}
		else if(a==2)
		{
			FactoryPatternfordelivery deliver=new FactoryPatternfordelivery();
			
			deliverymode newdelivery=deliver.transportmode("sea");
			newdelivery.delivery();
		}
		
		else
		{
		
			
			System.out.print("Sorry You Selected an Invalid Option");
		}
		
	
		
	}
}
