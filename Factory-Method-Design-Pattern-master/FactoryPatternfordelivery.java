package com.factorydesignpatern;

public class FactoryPatternfordelivery
{
	public deliverymode transportmode(String str)
	{
		if(str.equals("road"))
		{
			return new truckdelivery();
		}
		else if(str.contentEquals("sea"))
		{
			return new shipdelivery();
		}
		else
		{
			return new displayerrormessage();
		}
	}
}
