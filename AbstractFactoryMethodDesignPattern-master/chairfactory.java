package com.anotherexampleforabstractdp;

public class chairfactory implements newfurniture{
	public  chair getchair(String chairtype)
	{
		if(chairtype.contentEquals("modern"))
		{
			return new Modern();
		}
		else if(chairtype.contentEquals("victorian"))
		{
			return new Victorianchair();
		}
		else
		{
			return null;
		}
	}

	@Override
	public sofa getsofa(String sofatype) {
		// TODO Auto-generated method stub
		return null;
	}


}
