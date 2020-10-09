package com.anotherexampleforabstractdp;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		newfurniture chair = furniturefactory.getfurniturefactory("chair");
		chair  newchair=chair.getchair("victorian");
		String output=newchair.getchairdetails();
		System.out.println(output);
      //  System.out.println(chair.getchair("victorian").getchairdetails());
       // newfurniture sofa = furniturefactory.getfurniturefactory("sofa");
		 
       // System.out.println(sofa.getsofa("modern").getsofadetails());
 


	}

}
