package Builderdesignpatternforhouseexample;

public class housebuilder {
	private int buildwalls;
	private int builddoors;
	private int buildwindows;
	public housebuilder setBuildwalls(int buildwalls) {
		this.buildwalls = buildwalls;
		return this;
	}
	public housebuilder setBuilddoors(int builddoors) {
		this.builddoors = builddoors;
		return this;
	}
	
	public housebuilder setBuildwindows(int buildwindows) {
		this.buildwindows = buildwindows;
		return this;
	}
	
	public builder gethouse()
	{
		return new builder(buildwalls,builddoors,buildwindows);
		
	}
}
