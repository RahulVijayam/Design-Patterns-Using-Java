package com.anotherexampleforabstractdp;

public class sofafactory  implements newfurniture
{
	public  sofa getsofa(String sofatype)
	{
	if(sofatype.contentEquals("modern"))
	{
		return new modernsofa();
	}
	else if(sofatype.contentEquals("victorian"))
	{
		return new victoriansofa();
	}
	else
	{
		return null;
	}

	}

	@Override
	public chair getchair(String chairtype) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
