package com.anotherexampleforabstractdp;


public class furniturefactory
{

public static newfurniture getfurniturefactory(String type)
{
	if(type.contentEquals("chair"))
	{
		return new chairfactory();
	}
	else if(type.contentEquals("sofa")) {
		return new sofafactory();
	}
	else
	{
		return null;
	}
}

}
