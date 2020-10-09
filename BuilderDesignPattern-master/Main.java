package Builderdesignpatternforhouseexample;
public class Main {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		//builder p = new housebuilder(2,4); //Here We unable to handle single work that means unable to give only one parameter
		 builder p = new housebuilder().setBuilddoors(5).setBuildwalls(1).gethouse();//Where as Here we have the flexibility to pass only  required fields as parameters
		 System.out.println(p);

	}

}
